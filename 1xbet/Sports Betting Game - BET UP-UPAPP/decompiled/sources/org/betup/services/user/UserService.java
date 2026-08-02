package org.betup.services.user;

import android.util.Log;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.bus.UserBetStatisticsInvalidatedMessage;
import org.betup.model.domain.RemoteConfigConstants;
import org.betup.model.local.entity.BetPresentation;
import org.betup.model.local.entity.FullUserProfileModel;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.user.GetV7MyInfoInteractor;
import org.betup.model.remote.api.rest.user.MyProgressInteractor;
import org.betup.model.remote.api.rest.user.V7UserBetStatisticsInteractor;
import org.betup.model.remote.api.rest.user.V7UserFavouritesInteractor;
import org.betup.model.remote.api.rest.user.V7UserRanksInteractor;
import org.betup.model.remote.entity.ResponseModel;
import org.betup.model.remote.entity.challenge.ChallengeInfoModel;
import org.betup.model.remote.entity.user.BaseUserModel;
import org.betup.model.remote.entity.user.NewUserBetStatisticsModel;
import org.betup.model.remote.entity.user.NewUserFavouritesModel;
import org.betup.model.remote.entity.user.NewUserRanksModel;
import org.betup.model.remote.entity.user.ShortUserProfileModel;
import org.betup.model.remote.entity.user.UserFavouritesInfoModel;
import org.betup.model.remote.entity.user.UserProgressModel;
import org.betup.model.remote.entity.user.UserRankInfoModel;
import org.betup.model.remote.entity.user.converters.UserBetStatsConverter;
import org.betup.model.remote.entity.user.converters.UserFavouritesConverter;
import org.betup.model.remote.entity.user.converters.UserRanksConverter;
import org.betup.model.remote.entity.user.details.UserBetStatsModel;
import org.betup.services.storage.LocalPreferencesService;
import org.greenrobot.eventbus.EventBus;

@Singleton
/* loaded from: classes2.dex */
public class UserService {
    private static final Object syncRoot = new Object();
    private final FirebaseAuth firebaseAuth;
    private final FirebaseRemoteConfig firebaseRemoteConfig;
    private final GetV7MyInfoInteractor getV7MyInfoInteractor;
    private final LocalPreferencesService localPreferencesService;
    private final MyProgressInteractor myProgressInteractor;
    private FullUserProfileModel userModel;
    private final V7UserBetStatisticsInteractor v7UserBetStatisticsInteractor;
    private final V7UserFavouritesInteractor v7UserFavouritesInteractor;
    private final V7UserRanksInteractor v7UserRanksInteractor;
    private Map<InfoKind, Boolean> requests = new HashMap();
    private Set<UserProfileRequestListener> listeners = new HashSet();
    private Set<InfoKind> pendingInfoKinds = new HashSet();
    private final BaseCachedSharedInteractor.OnFetchedListener<ResponseModel<UserRankInfoModel>, Void> onRanksFetched = new BaseCachedSharedInteractor.OnFetchedListener<ResponseModel<UserRankInfoModel>, Void>() { // from class: org.betup.services.user.UserService.1
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public void onFetched(FetchedResponseMessage<ResponseModel<UserRankInfoModel>, Void> responseMessage) {
            if (responseMessage.getStat() != FetchStat.SUCCESS) {
                UserService.this.notifyResponseFetched(InfoKind.RANKS, responseMessage.getStat());
            } else {
                UserService.this.getUserModelToFill().setUserRankInfoModel(responseMessage.getModel().getResponse());
                UserService.this.notifyResponseFetched(InfoKind.RANKS, FetchStat.SUCCESS);
            }
        }
    };
    private final BaseCachedSharedInteractor.OnFetchedListener<NewUserRanksModel, Integer> onV7RanksFetched = new BaseCachedSharedInteractor.OnFetchedListener<NewUserRanksModel, Integer>() { // from class: org.betup.services.user.UserService.2
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public void onFetched(FetchedResponseMessage<NewUserRanksModel, Integer> responseMessage) {
            if (responseMessage.getStat() != FetchStat.SUCCESS) {
                UserService.this.notifyResponseFetched(InfoKind.RANKS, responseMessage.getStat());
                return;
            }
            UserService.this.getUserModelToFill().setUserRankInfoModel(UserRanksConverter.fromNewModel(responseMessage.getModel()));
            UserService.this.notifyResponseFetched(InfoKind.RANKS, FetchStat.SUCCESS);
        }
    };
    private final BaseCachedSharedInteractor.OnFetchedListener<ResponseModel<UserBetStatsModel>, Void> onBetStatsFetched = new BaseCachedSharedInteractor.OnFetchedListener<ResponseModel<UserBetStatsModel>, Void>() { // from class: org.betup.services.user.UserService.3
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public void onFetched(FetchedResponseMessage<ResponseModel<UserBetStatsModel>, Void> responseMessage) {
            if (responseMessage.getStat() != FetchStat.SUCCESS) {
                UserService.this.notifyResponseFetched(InfoKind.STATS, responseMessage.getStat());
            } else {
                UserService.this.getUserModelToFill().setUserBetStatsModel(responseMessage.getModel().getResponse());
                UserService.this.notifyResponseFetched(InfoKind.STATS, FetchStat.SUCCESS);
            }
        }
    };
    private final BaseCachedSharedInteractor.OnFetchedListener<NewUserBetStatisticsModel, Integer> onV7BetStatsFetched = new BaseCachedSharedInteractor.OnFetchedListener<NewUserBetStatisticsModel, Integer>() { // from class: org.betup.services.user.UserService.4
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public void onFetched(FetchedResponseMessage<NewUserBetStatisticsModel, Integer> responseMessage) {
            if (responseMessage.getStat() != FetchStat.SUCCESS) {
                UserService.this.notifyResponseFetched(InfoKind.STATS, responseMessage.getStat());
                return;
            }
            UserService.this.getUserModelToFill().setUserBetStatsModel(UserBetStatsConverter.fromNewModel(responseMessage.getModel()));
            UserService.this.notifyResponseFetched(InfoKind.STATS, FetchStat.SUCCESS);
        }
    };
    private final BaseCachedSharedInteractor.OnFetchedListener<ResponseModel<ChallengeInfoModel>, Void> onChallengeStatsFetched = new BaseCachedSharedInteractor.OnFetchedListener<ResponseModel<ChallengeInfoModel>, Void>() { // from class: org.betup.services.user.UserService.5
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public void onFetched(FetchedResponseMessage<ResponseModel<ChallengeInfoModel>, Void> responseMessage) {
            if (responseMessage.getStat() != FetchStat.SUCCESS) {
                UserService.this.notifyResponseFetched(InfoKind.CHALLENGES, responseMessage.getStat());
            } else {
                UserService.this.getUserModelToFill().setChallengeInfoModel(responseMessage.getModel().getResponse());
                UserService.this.notifyResponseFetched(InfoKind.CHALLENGES, FetchStat.SUCCESS);
            }
        }
    };
    private final BaseCachedSharedInteractor.OnFetchedListener<ResponseModel<UserFavouritesInfoModel>, Void> onFavouritesFetched = new BaseCachedSharedInteractor.OnFetchedListener<ResponseModel<UserFavouritesInfoModel>, Void>() { // from class: org.betup.services.user.UserService.6
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public void onFetched(FetchedResponseMessage<ResponseModel<UserFavouritesInfoModel>, Void> responseMessage) {
            if (responseMessage.getStat() != FetchStat.SUCCESS) {
                UserService.this.notifyResponseFetched(InfoKind.FAVOURITES, responseMessage.getStat());
            } else {
                UserService.this.getUserModelToFill().setUserFavouritesInfoModel(responseMessage.getModel().getResponse());
                UserService.this.notifyResponseFetched(InfoKind.FAVOURITES, FetchStat.SUCCESS);
            }
        }
    };
    private final BaseCachedSharedInteractor.OnFetchedListener<NewUserFavouritesModel, Integer> onV7FavouritesFetched = new BaseCachedSharedInteractor.OnFetchedListener<NewUserFavouritesModel, Integer>() { // from class: org.betup.services.user.UserService.7
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public void onFetched(FetchedResponseMessage<NewUserFavouritesModel, Integer> responseMessage) {
            if (responseMessage.getStat() != FetchStat.SUCCESS) {
                UserService.this.notifyResponseFetched(InfoKind.FAVOURITES, responseMessage.getStat());
                return;
            }
            UserService.this.getUserModelToFill().setUserFavouritesInfoModel(UserFavouritesConverter.fromNewModel(responseMessage.getModel()));
            UserService.this.notifyResponseFetched(InfoKind.FAVOURITES, FetchStat.SUCCESS);
        }
    };
    private final BaseCachedSharedInteractor.OnFetchedListener<UserProgressModel, Void> onProgressInfoFetched = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.services.user.UserService$$ExternalSyntheticLambda0
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
            UserService.this.m12847lambda$new$0$orgbetupservicesuserUserService(fetchedResponseMessage);
        }
    };
    private final BaseCachedSharedInteractor.OnFetchedListener<BaseUserModel, Void> onBaseInfoFetchedV7 = new BaseCachedSharedInteractor.OnFetchedListener<BaseUserModel, Void>() { // from class: org.betup.services.user.UserService.8
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public void onFetched(FetchedResponseMessage<BaseUserModel, Void> responseMessage) {
            if (responseMessage.getStat() != FetchStat.SUCCESS) {
                UserService.this.notifyResponseFetched(InfoKind.GENERAL, responseMessage.getStat());
                return;
            }
            UserService.this.getUserModelToFill().setUserModel(responseMessage.getModel());
            UserService.this.notifyResponseFetched(InfoKind.GENERAL, FetchStat.SUCCESS);
            if (UserService.this.pendingInfoKinds.isEmpty() || UserService.this.userModel == null || UserService.this.userModel.getUserModel() == null) {
                return;
            }
            HashSet hashSet = new HashSet(UserService.this.pendingInfoKinds);
            UserService.this.pendingInfoKinds.clear();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int i = AnonymousClass9.$SwitchMap$org$betup$services$user$UserService$InfoKind[((InfoKind) it.next()).ordinal()];
                if (i == 1) {
                    UserService.this.v7UserRanksInteractor.load(UserService.this.onV7RanksFetched, UserService.this.userModel.getUserModel().getId());
                } else if (i == 2) {
                    UserService.this.v7UserBetStatisticsInteractor.load(UserService.this.onV7BetStatsFetched, UserService.this.userModel.getUserModel().getId());
                } else if (i == 5) {
                    UserService.this.v7UserFavouritesInteractor.load(UserService.this.onV7FavouritesFetched, UserService.this.userModel.getUserModel().getId());
                }
            }
        }
    };
    private FetchStat fetchStat = FetchStat.SUCCESS;

    public enum InfoKind {
        GENERAL,
        PROGRESS,
        RANKS,
        CHALLENGES,
        STATS,
        FAVOURITES
    }

    public interface UserInfoListener {
        void onProfileFetched(FullUserProfileModel fullUserProfileModel, Set<InfoKind> updated, FetchStat stat);
    }

    @Inject
    public UserService(FirebaseAuth firebaseAuth, FirebaseRemoteConfig firebaseRemoteConfig, LocalPreferencesService localPreferencesService, GetV7MyInfoInteractor getV7MyInfoInteractor, MyProgressInteractor myProgressInteractor, V7UserBetStatisticsInteractor v7UserBetStatisticsInteractor, V7UserRanksInteractor v7UserRanksInteractor, V7UserFavouritesInteractor v7UserFavouritesInteractor) {
        this.firebaseAuth = firebaseAuth;
        this.firebaseRemoteConfig = firebaseRemoteConfig;
        this.localPreferencesService = localPreferencesService;
        this.userModel = localPreferencesService.getLocalProfile();
        this.getV7MyInfoInteractor = getV7MyInfoInteractor;
        this.myProgressInteractor = myProgressInteractor;
        this.v7UserBetStatisticsInteractor = v7UserBetStatisticsInteractor;
        this.v7UserRanksInteractor = v7UserRanksInteractor;
        this.v7UserFavouritesInteractor = v7UserFavouritesInteractor;
    }

    public void subscribe(UserInfoListener listener, InfoKind... kinds) {
        this.listeners.add(new UserProfileRequestListener(listener, kinds, true));
    }

    public void unsubscribe(UserInfoListener listener) {
        Iterator<UserProfileRequestListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            UserProfileRequestListener next = it.next();
            if (next.getListener() == null || next.getListener() == listener) {
                it.remove();
            }
        }
    }

    public boolean isSubscriber() {
        FullUserProfileModel fullUserProfileModel;
        return (this.firebaseAuth.getCurrentUser() == null || (fullUserProfileModel = this.userModel) == null || fullUserProfileModel.getUserModel() == null || !this.userModel.getUserModel().isSubscriber()) ? false : true;
    }

    public boolean isExpert() {
        FullUserProfileModel fullUserProfileModel;
        return (this.firebaseAuth.getCurrentUser() == null || (fullUserProfileModel = this.userModel) == null || fullUserProfileModel.getUserModel() == null || !this.userModel.getUserModel().isExpert()) ? false : true;
    }

    public OddType getOddType() {
        return this.localPreferencesService.getOddType();
    }

    public void saveOddType(OddType oddType) {
        this.localPreferencesService.saveOddType(oddType);
    }

    public BetPresentation getBetPresentation() {
        return this.localPreferencesService.getBetPresentation();
    }

    public void saveBetPresentation(BetPresentation betPresentation) {
        this.localPreferencesService.saveBetPresentation(betPresentation);
    }

    public boolean isRegistered() {
        FullUserProfileModel fullUserProfileModel;
        return (this.firebaseAuth.getCurrentUser() == null || (fullUserProfileModel = this.userModel) == null || fullUserProfileModel.getUserProgressModel() == null || this.userModel.getUserModel() == null) ? false : true;
    }

    public boolean isAnonymous() {
        return this.firebaseAuth.getCurrentUser() != null && this.firebaseAuth.getCurrentUser().isAnonymous();
    }

    public boolean isVideoAvailable() {
        return this.userModel.getUserModel().isVideoEnabled() && this.firebaseRemoteConfig.getLong(RemoteConfigConstants.LIVE_VIDEO_MINIMAL_APP_VERSION) <= 3606;
    }

    public ShortUserProfileModel getShortProfile() {
        if (this.userModel == null) {
            return new ShortUserProfileModel();
        }
        return new ShortUserProfileModel(this.userModel);
    }

    public long getBetupUserIdOrZero() {
        try {
            FullUserProfileModel fullUserProfileModel = this.userModel;
            if (fullUserProfileModel != null && fullUserProfileModel.getUserModel() != null && this.userModel.getUserModel().getId() != null) {
                return this.userModel.getUserModel().getId().longValue();
            }
            return 0L;
        } catch (Exception unused) {
            return 0L;
        }
    }

    public void applyUserProgress(UserProgressModel model) {
        FullUserProfileModel fullUserProfileModel = this.userModel;
        if (fullUserProfileModel != null && model != null) {
            fullUserProfileModel.setUserProgressModel(model);
        }
        this.myProgressInteractor.invalidate(null);
    }

    public void syncProfile(InfoKind... kinds) {
        getProfile(null, kinds);
    }

    public void getProfile(UserInfoListener userInfoListener, InfoKind... kinds) {
        Set<InfoKind> infoKindsDiff;
        synchronized (syncRoot) {
            Log.d("NOTIFY", "GETTING PROFILE " + userInfoListener + " Thread = " + Thread.currentThread().getId());
            if (userInfoListener != null) {
                if (!this.listeners.contains(new UserProfileRequestListener(userInfoListener, kinds, false))) {
                    this.listeners.add(new UserProfileRequestListener(userInfoListener, kinds, false));
                }
            }
            infoKindsDiff = getInfoKindsDiff(new HashSet(Arrays.asList(kinds)), this.requests.keySet());
            Iterator<InfoKind> it = infoKindsDiff.iterator();
            while (it.hasNext()) {
                this.requests.put(it.next(), true);
            }
        }
        Iterator<InfoKind> it2 = infoKindsDiff.iterator();
        while (it2.hasNext()) {
            int i = AnonymousClass9.$SwitchMap$org$betup$services$user$UserService$InfoKind[it2.next().ordinal()];
            if (i == 1) {
                FullUserProfileModel fullUserProfileModel = this.userModel;
                if (fullUserProfileModel != null && fullUserProfileModel.getUserModel() != null) {
                    this.v7UserRanksInteractor.load(this.onV7RanksFetched, this.userModel.getUserModel().getId());
                } else if (infoKindsDiff.contains(InfoKind.GENERAL)) {
                    this.pendingInfoKinds.add(InfoKind.RANKS);
                } else {
                    Log.w("UserService", "Cannot load RANKS: userModel is null and GENERAL is not being loaded");
                }
            } else if (i == 2) {
                FullUserProfileModel fullUserProfileModel2 = this.userModel;
                if (fullUserProfileModel2 != null && fullUserProfileModel2.getUserModel() != null) {
                    this.v7UserBetStatisticsInteractor.load(this.onV7BetStatsFetched, this.userModel.getUserModel().getId());
                } else if (infoKindsDiff.contains(InfoKind.GENERAL)) {
                    this.pendingInfoKinds.add(InfoKind.STATS);
                } else {
                    Log.w("UserService", "Cannot load STATS: userModel is null and GENERAL is not being loaded");
                }
            } else if (i == 3) {
                this.getV7MyInfoInteractor.load(this.onBaseInfoFetchedV7, null);
            } else if (i == 4) {
                this.myProgressInteractor.load(this.onProgressInfoFetched, null);
            } else if (i == 5) {
                FullUserProfileModel fullUserProfileModel3 = this.userModel;
                if (fullUserProfileModel3 != null && fullUserProfileModel3.getUserModel() != null) {
                    this.v7UserFavouritesInteractor.load(this.onV7FavouritesFetched, this.userModel.getUserModel().getId());
                } else if (infoKindsDiff.contains(InfoKind.GENERAL)) {
                    this.pendingInfoKinds.add(InfoKind.FAVOURITES);
                } else {
                    Log.w("UserService", "Cannot load FAVOURITES: userModel is null and GENERAL is not being loaded");
                }
            }
        }
    }

    /* renamed from: org.betup.services.user.UserService$9, reason: invalid class name */
    static /* synthetic */ class AnonymousClass9 {
        static final /* synthetic */ int[] $SwitchMap$org$betup$services$user$UserService$InfoKind;

        static {
            int[] iArr = new int[InfoKind.values().length];
            $SwitchMap$org$betup$services$user$UserService$InfoKind = iArr;
            try {
                iArr[InfoKind.RANKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$betup$services$user$UserService$InfoKind[InfoKind.STATS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$betup$services$user$UserService$InfoKind[InfoKind.GENERAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$betup$services$user$UserService$InfoKind[InfoKind.PROGRESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$betup$services$user$UserService$InfoKind[InfoKind.FAVOURITES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public void invalidate(InfoKind... kinds) {
        FullUserProfileModel fullUserProfileModel;
        boolean z = false;
        for (InfoKind infoKind : kinds) {
            int i = AnonymousClass9.$SwitchMap$org$betup$services$user$UserService$InfoKind[infoKind.ordinal()];
            if (i == 1) {
                FullUserProfileModel fullUserProfileModel2 = this.userModel;
                if (fullUserProfileModel2 != null && fullUserProfileModel2.getUserModel() != null) {
                    this.v7UserRanksInteractor.invalidate(this.userModel.getUserModel().getId());
                }
            } else if (i == 2) {
                FullUserProfileModel fullUserProfileModel3 = this.userModel;
                if (fullUserProfileModel3 != null && fullUserProfileModel3.getUserModel() != null) {
                    this.v7UserBetStatisticsInteractor.invalidate(this.userModel.getUserModel().getId());
                    z = true;
                }
            } else if (i == 3) {
                this.getV7MyInfoInteractor.invalidate();
            } else if (i == 4) {
                this.myProgressInteractor.invalidate();
            } else if (i == 5 && (fullUserProfileModel = this.userModel) != null && fullUserProfileModel.getUserModel() != null) {
                this.v7UserFavouritesInteractor.invalidate(this.userModel.getUserModel().getId());
            }
        }
        if (z) {
            EventBus.getDefault().post(new UserBetStatisticsInvalidatedMessage());
        }
    }

    public void clearUserInfo() {
        long betupUserIdOrZero = getBetupUserIdOrZero();
        this.localPreferencesService.deleteLocalProfile();
        this.localPreferencesService.removeOneClickBetPrefsForUser(betupUserIdOrZero);
        this.localPreferencesService.removePlayerStatsBetEverPlacedForUser(betupUserIdOrZero);
        invalidate(InfoKind.PROGRESS, InfoKind.GENERAL, InfoKind.RANKS, InfoKind.STATS, InfoKind.FAVOURITES, InfoKind.CHALLENGES);
    }

    private List<Integer> getVideoSports() {
        ArrayList arrayList = new ArrayList();
        try {
            for (String str : this.firebaseRemoteConfig.getString(RemoteConfigConstants.VIDEO_SPORTS).split(",")) {
                System.out.println("ITEM = " + str);
                arrayList.add(Integer.valueOf(Integer.parseInt(str)));
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyResponseFetched(InfoKind infoKind, FetchStat stat) {
        HashSet hashSet;
        ArrayList arrayList;
        Object obj = syncRoot;
        synchronized (obj) {
            this.requests.put(infoKind, false);
            if (stat != FetchStat.SUCCESS) {
                this.fetchStat = stat;
            }
            if (this.requests.containsValue(true)) {
                return;
            }
            FetchStat fetchStat = this.fetchStat;
            this.fetchStat = FetchStat.SUCCESS;
            if (stat == FetchStat.SUCCESS) {
                this.localPreferencesService.saveLocalProfile(this.userModel);
                long betupUserIdOrZero = getBetupUserIdOrZero();
                this.localPreferencesService.migrateLegacyOneClickPrefsToUserIfPresent(betupUserIdOrZero);
                this.localPreferencesService.migrateLegacyPlayerStatsBetEverPlacedToUserIfPresent(betupUserIdOrZero);
            }
            synchronized (obj) {
                hashSet = new HashSet(this.requests.keySet());
                arrayList = new ArrayList(this.listeners);
                this.requests.clear();
                Iterator<UserProfileRequestListener> it = this.listeners.iterator();
                while (it.hasNext()) {
                    UserProfileRequestListener next = it.next();
                    if (!next.isPermanent() || next.getListener() == null) {
                        it.remove();
                    }
                }
            }
            notifyListeners(arrayList, hashSet, fetchStat, this.userModel);
        }
    }

    private void notifyListeners(List<UserProfileRequestListener> listeners, Set<InfoKind> kinds, FetchStat stat, FullUserProfileModel fullUserProfileModel) {
        for (UserProfileRequestListener userProfileRequestListener : listeners) {
            UserInfoListener listener = userProfileRequestListener.getListener();
            if (listener != null) {
                if (userProfileRequestListener.isPermanent()) {
                    if (userProfileRequestListener.isSubscribedForAny(kinds)) {
                        if (stat == FetchStat.SUCCESS) {
                            listener.onProfileFetched(fullUserProfileModel, kinds, stat);
                        } else {
                            listener.onProfileFetched(fullUserProfileModel, kinds, stat);
                        }
                    }
                } else {
                    listener.onProfileFetched(fullUserProfileModel, kinds, stat);
                }
            }
        }
    }

    public class UserProfileRequestListener {
        private InfoKind[] infoKinds;
        private boolean isPermanent;
        private WeakReference<UserInfoListener> listenerWeakReference;

        public UserProfileRequestListener(UserInfoListener listener, InfoKind[] infoKinds, boolean isPermanent) {
            this.listenerWeakReference = new WeakReference<>(listener);
            this.infoKinds = infoKinds;
            this.isPermanent = isPermanent;
        }

        public boolean isPermanent() {
            return this.isPermanent;
        }

        public void setPermanent(boolean permanent) {
            this.isPermanent = permanent;
        }

        public UserInfoListener getListener() {
            return this.listenerWeakReference.get();
        }

        public boolean isSubscribedForAny(Set<InfoKind> kinds) {
            for (InfoKind infoKind : this.infoKinds) {
                if (kinds.contains(infoKind)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.listenerWeakReference.get() != null ? this.listenerWeakReference.get().hashCode() : super.hashCode();
        }
    }

    public Set<InfoKind> getInfoKindsDiff(Set<InfoKind> source, Set<InfoKind> dest) {
        HashSet hashSet = new HashSet();
        for (InfoKind infoKind : source) {
            if (!dest.contains(infoKind)) {
                hashSet.add(infoKind);
            }
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FullUserProfileModel getUserModelToFill() {
        FullUserProfileModel fullUserProfileModel = this.userModel;
        if (fullUserProfileModel != null) {
            return fullUserProfileModel;
        }
        FullUserProfileModel fullUserProfileModel2 = new FullUserProfileModel();
        this.userModel = fullUserProfileModel2;
        return fullUserProfileModel2;
    }

    /* renamed from: lambda$new$0$org-betup-services-user-UserService, reason: not valid java name */
    /* synthetic */ void m12847lambda$new$0$orgbetupservicesuserUserService(FetchedResponseMessage fetchedResponseMessage) {
        if (fetchedResponseMessage.getStat() != FetchStat.SUCCESS) {
            notifyResponseFetched(InfoKind.PROGRESS, fetchedResponseMessage.getStat());
        } else {
            getUserModelToFill().setUserProgressModel((UserProgressModel) fetchedResponseMessage.getModel());
            notifyResponseFetched(InfoKind.PROGRESS, FetchStat.SUCCESS);
        }
    }
}
