package org.betup.ui.fragment.user;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.BetUpApp;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.betup.model.remote.api.rest.user.V7UserFollowersInteractor;
import org.betup.model.remote.api.rest.user.V7UserFollowingInteractor;
import org.betup.model.remote.entity.country.CountryModel;
import org.betup.model.remote.entity.followers.UserFollower;
import org.betup.model.remote.entity.user.NewFollowerItem;
import org.betup.model.remote.entity.user.NewUserFollowersModel;
import org.betup.model.remote.entity.user.NewUserFollowingModel;
import org.betup.services.user.UserService;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: FollowersDialogController.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u00105\u001a\u00020%J \u00106\u001a\u0002072\u0006\u00102\u001a\u00020%2\u0006\u00103\u001a\u0002042\b\b\u0002\u00108\u001a\u00020%J\u000e\u00109\u001a\u0002072\u0006\u0010:\u001a\u00020%J\u0006\u0010;\u001a\u000207J\u0006\u0010<\u001a\u000207J\u0006\u0010'\u001a\u00020%J\u000e\u0010=\u001a\u0002072\u0006\u0010>\u001a\u00020)J\u000e\u0010?\u001a\u0002072\u0006\u0010@\u001a\u00020)J\u0006\u0010A\u001a\u000207J\b\u0010B\u001a\u000207H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001bR\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001a¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u001a\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001a¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001a¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u001a¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u001a\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001a¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001bR\u001a\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001a¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001bR\u000e\u00102\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u000104X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010C\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020%0DX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010F\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0\u001d\u0012\u0004\u0012\u00020%0DX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lorg/betup/ui/fragment/user/FollowersDialogController;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "v7UserFollowersInteractor", "Lorg/betup/model/remote/api/rest/user/V7UserFollowersInteractor;", "getV7UserFollowersInteractor", "()Lorg/betup/model/remote/api/rest/user/V7UserFollowersInteractor;", "setV7UserFollowersInteractor", "(Lorg/betup/model/remote/api/rest/user/V7UserFollowersInteractor;)V", "v7UserFollowingInteractor", "Lorg/betup/model/remote/api/rest/user/V7UserFollowingInteractor;", "getV7UserFollowingInteractor", "()Lorg/betup/model/remote/api/rest/user/V7UserFollowingInteractor;", "setV7UserFollowingInteractor", "(Lorg/betup/model/remote/api/rest/user/V7UserFollowingInteractor;)V", "userService", "Lorg/betup/services/user/UserService;", "getUserService", "()Lorg/betup/services/user/UserService;", "setUserService", "(Lorg/betup/services/user/UserService;)V", "_isLoading", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isLoading", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "_followers", "", "Lorg/betup/model/remote/entity/followers/UserFollower;", "followers", "getFollowers", "_following", "following", "getFollowing", "_selectedTabIndex", "", "selectedTabIndex", "getSelectedTabIndex", "_query", "", "query", "getQuery", "_filteredFollowers", "filteredFollowers", "getFilteredFollowers", "_filteredFollowing", "filteredFollowing", "getFilteredFollowing", "userId", "context", "Landroid/content/Context;", "getCurrentUserId", "initialize", "", "lastSelectedTabIndex", "setSelectedTab", "index", "loadFollowers", "loadFollowing", "onQueryChanged", "newQuery", "performSearch", "searchQuery", "resetSearchState", "filterResults", "newFollowersListener", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/entity/user/NewUserFollowersModel;", "newFollowingListener", "Lorg/betup/model/remote/entity/user/NewUserFollowingModel;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FollowersDialogController {
    public static final int $stable = 8;
    private final MutableStateFlow<List<UserFollower>> _filteredFollowers;
    private final MutableStateFlow<List<UserFollower>> _filteredFollowing;
    private final MutableStateFlow<List<UserFollower>> _followers;
    private final MutableStateFlow<List<UserFollower>> _following;
    private final MutableStateFlow<Boolean> _isLoading;
    private final MutableStateFlow<String> _query;
    private final MutableStateFlow<Integer> _selectedTabIndex;
    private Context context;
    private final StateFlow<List<UserFollower>> filteredFollowers;
    private final StateFlow<List<UserFollower>> filteredFollowing;
    private final StateFlow<List<UserFollower>> followers;
    private final StateFlow<List<UserFollower>> following;
    private final StateFlow<Boolean> isLoading;
    private final BaseCachedSharedInteractor.OnFetchedListener<NewUserFollowersModel, Integer> newFollowersListener;
    private final BaseCachedSharedInteractor.OnFetchedListener<List<NewUserFollowingModel>, Integer> newFollowingListener;
    private final StateFlow<String> query;
    private final StateFlow<Integer> selectedTabIndex;
    private int userId;

    @Inject
    public UserService userService;

    @Inject
    public V7UserFollowersInteractor v7UserFollowersInteractor;

    @Inject
    public V7UserFollowingInteractor v7UserFollowingInteractor;

    public FollowersDialogController() {
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(false);
        this._isLoading = MutableStateFlow;
        this.isLoading = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<List<UserFollower>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._followers = MutableStateFlow2;
        this.followers = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<List<UserFollower>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._following = MutableStateFlow3;
        this.following = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<Integer> MutableStateFlow4 = StateFlowKt.MutableStateFlow(0);
        this._selectedTabIndex = MutableStateFlow4;
        this.selectedTabIndex = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<String> MutableStateFlow5 = StateFlowKt.MutableStateFlow("");
        this._query = MutableStateFlow5;
        this.query = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<List<UserFollower>> MutableStateFlow6 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._filteredFollowers = MutableStateFlow6;
        this.filteredFollowers = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow<List<UserFollower>> MutableStateFlow7 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._filteredFollowing = MutableStateFlow7;
        this.filteredFollowing = FlowKt.asStateFlow(MutableStateFlow7);
        this.newFollowersListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.user.FollowersDialogController$$ExternalSyntheticLambda0
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                FollowersDialogController.newFollowersListener$lambda$8(FollowersDialogController.this, fetchedResponseMessage);
            }
        };
        this.newFollowingListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.user.FollowersDialogController$$ExternalSyntheticLambda1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                FollowersDialogController.newFollowingListener$lambda$12(FollowersDialogController.this, fetchedResponseMessage);
            }
        };
    }

    public final V7UserFollowersInteractor getV7UserFollowersInteractor() {
        V7UserFollowersInteractor v7UserFollowersInteractor = this.v7UserFollowersInteractor;
        if (v7UserFollowersInteractor != null) {
            return v7UserFollowersInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("v7UserFollowersInteractor");
        return null;
    }

    public final void setV7UserFollowersInteractor(V7UserFollowersInteractor v7UserFollowersInteractor) {
        Intrinsics.checkNotNullParameter(v7UserFollowersInteractor, "<set-?>");
        this.v7UserFollowersInteractor = v7UserFollowersInteractor;
    }

    public final V7UserFollowingInteractor getV7UserFollowingInteractor() {
        V7UserFollowingInteractor v7UserFollowingInteractor = this.v7UserFollowingInteractor;
        if (v7UserFollowingInteractor != null) {
            return v7UserFollowingInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("v7UserFollowingInteractor");
        return null;
    }

    public final void setV7UserFollowingInteractor(V7UserFollowingInteractor v7UserFollowingInteractor) {
        Intrinsics.checkNotNullParameter(v7UserFollowingInteractor, "<set-?>");
        this.v7UserFollowingInteractor = v7UserFollowingInteractor;
    }

    public final UserService getUserService() {
        UserService userService = this.userService;
        if (userService != null) {
            return userService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userService");
        return null;
    }

    public final void setUserService(UserService userService) {
        Intrinsics.checkNotNullParameter(userService, "<set-?>");
        this.userService = userService;
    }

    public final StateFlow<Boolean> isLoading() {
        return this.isLoading;
    }

    public final StateFlow<List<UserFollower>> getFollowers() {
        return this.followers;
    }

    public final StateFlow<List<UserFollower>> getFollowing() {
        return this.following;
    }

    /* renamed from: getSelectedTabIndex, reason: collision with other method in class */
    public final StateFlow<Integer> m14178getSelectedTabIndex() {
        return this.selectedTabIndex;
    }

    public final StateFlow<String> getQuery() {
        return this.query;
    }

    public final StateFlow<List<UserFollower>> getFilteredFollowers() {
        return this.filteredFollowers;
    }

    public final StateFlow<List<UserFollower>> getFilteredFollowing() {
        return this.filteredFollowing;
    }

    public final int getCurrentUserId() {
        Integer id = getUserService().getShortProfile().getUserModel().getId();
        Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
        return id.intValue();
    }

    public static /* synthetic */ void initialize$default(FollowersDialogController followersDialogController, int i, Context context, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        followersDialogController.initialize(i, context, i2);
    }

    public final void initialize(int userId, Context context, int lastSelectedTabIndex) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.userId = userId;
        this.context = context;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        this._isLoading.setValue(true);
        loadFollowers();
    }

    public final void setSelectedTab(int index) {
        if (index < 0 || index >= 2) {
            return;
        }
        this._selectedTabIndex.setValue(Integer.valueOf(index));
        if (index == 0 && this._followers.getValue().isEmpty()) {
            loadFollowers();
        } else if (index == 1 && this._following.getValue().isEmpty()) {
            loadFollowing();
        }
    }

    public final void loadFollowers() {
        this._isLoading.setValue(true);
        Bundle bundle = new Bundle();
        bundle.putInt("offset", 0);
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, 10);
        getV7UserFollowersInteractor().load(this.newFollowersListener, Integer.valueOf(this.userId), bundle);
    }

    public final void loadFollowing() {
        this._isLoading.setValue(true);
        Bundle bundle = new Bundle();
        bundle.putInt("offset", 0);
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, 10);
        getV7UserFollowingInteractor().load(this.newFollowingListener, Integer.valueOf(this.userId), bundle);
    }

    public final int getSelectedTabIndex() {
        return this._selectedTabIndex.getValue().intValue();
    }

    public final void onQueryChanged(String newQuery) {
        Intrinsics.checkNotNullParameter(newQuery, "newQuery");
        this._query.setValue(newQuery);
        filterResults();
    }

    public final void performSearch(String searchQuery) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this._query.setValue(searchQuery);
        filterResults();
    }

    public final void resetSearchState() {
        this._query.setValue("");
        filterResults();
    }

    private final void filterResults() {
        String lowerCase = this._query.getValue().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String obj = StringsKt.trim((CharSequence) lowerCase).toString();
        if (obj.length() == 0) {
            this._filteredFollowers.setValue(this._followers.getValue());
            this._filteredFollowing.setValue(this._following.getValue());
            return;
        }
        MutableStateFlow<List<UserFollower>> mutableStateFlow = this._filteredFollowers;
        List<UserFollower> value = this._followers.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : value) {
            String name = ((UserFollower) obj2).getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            String lowerCase2 = name.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            if (StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) obj, false, 2, (Object) null)) {
                arrayList.add(obj2);
            }
        }
        mutableStateFlow.setValue(arrayList);
        MutableStateFlow<List<UserFollower>> mutableStateFlow2 = this._filteredFollowing;
        List<UserFollower> value2 = this._following.getValue();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : value2) {
            String name2 = ((UserFollower) obj3).getName();
            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
            String lowerCase3 = name2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
            if (StringsKt.contains$default((CharSequence) lowerCase3, (CharSequence) obj, false, 2, (Object) null)) {
                arrayList2.add(obj3);
            }
        }
        mutableStateFlow2.setValue(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void newFollowersListener$lambda$8(FollowersDialogController followersDialogController, FetchedResponseMessage fetchedResponseMessage) {
        NewUserFollowersModel newUserFollowersModel;
        followersDialogController._isLoading.setValue(false);
        if (fetchedResponseMessage.getStat() != FetchStat.SUCCESS || (newUserFollowersModel = (NewUserFollowersModel) fetchedResponseMessage.getModel()) == null) {
            return;
        }
        List<NewFollowerItem> items = newUserFollowersModel.getItems();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
        for (NewFollowerItem newFollowerItem : items) {
            UserFollower userFollower = new UserFollower();
            userFollower.setId(newFollowerItem.getUserId());
            userFollower.setName(newFollowerItem.getUsername());
            userFollower.setPhotoUrl(newFollowerItem.getPhotoUrl());
            userFollower.setLevel(1);
            CountryModel countryModel = new CountryModel();
            countryModel.setPhoto("");
            countryModel.setName("");
            userFollower.setCountry(countryModel);
            arrayList.add(userFollower);
        }
        followersDialogController._followers.setValue(arrayList);
        followersDialogController.filterResults();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void newFollowingListener$lambda$12(FollowersDialogController followersDialogController, FetchedResponseMessage fetchedResponseMessage) {
        List list;
        followersDialogController._isLoading.setValue(false);
        if (fetchedResponseMessage.getStat() != FetchStat.SUCCESS || (list = (List) fetchedResponseMessage.getModel()) == null) {
            return;
        }
        List<NewUserFollowingModel> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (NewUserFollowingModel newUserFollowingModel : list2) {
            UserFollower userFollower = new UserFollower();
            userFollower.setId(newUserFollowingModel.getId());
            userFollower.setName(newUserFollowingModel.getName());
            userFollower.setPhotoUrl(newUserFollowingModel.getPhotoUrl());
            userFollower.setLevel(newUserFollowingModel.getLevel());
            userFollower.setCountry(newUserFollowingModel.getCountry());
            arrayList.add(userFollower);
        }
        followersDialogController._following.setValue(arrayList);
        followersDialogController.filterResults();
    }
}
