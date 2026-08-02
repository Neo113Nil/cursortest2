package org.betup.ui.fragment.user.controller;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.user.V7RanksByTypeInteractor;
import org.betup.model.remote.entity.country.NewCountryModel;
import org.betup.model.remote.entity.user.NewUserRankingItemModel;
import org.betup.model.remote.entity.user.NewUserRankingStatisticsModel;
import org.betup.ui.fragment.user.compose.RankingCupBaseItemKt;
import org.betup.ui.fragment.user.compose.RankingCupType;
import org.betup.ui.fragment.user.compose.RankingTimeType;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: UserRankingsController.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010%\u001a\u00020&2\u0006\u0010\u001d\u001a\u00020\u0013J\u0006\u0010'\u001a\u00020&J\u0006\u0010(\u001a\u00020&J\b\u0010)\u001a\u00020&H\u0002J\u0010\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u000200H\u0002J\u000e\u00101\u001a\u00020&2\u0006\u00102\u001a\u00020\u0013J\u0006\u00103\u001a\u00020&R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0016\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011R\u000e\u0010\u001d\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010$\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010*\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\f\u0012\u0004\u0012\u00020\u001a0+X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010,\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\f\u0012\u0004\u0012\u00020\u001a0+X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010-\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\f\u0012\u0004\u0012\u00020\u001a0+X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lorg/betup/ui/fragment/user/controller/UserRankingsController;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "v7RanksByTypeInteractor", "Lorg/betup/model/remote/api/rest/user/V7RanksByTypeInteractor;", "getV7RanksByTypeInteractor", "()Lorg/betup/model/remote/api/rest/user/V7RanksByTypeInteractor;", "setV7RanksByTypeInteractor", "(Lorg/betup/model/remote/api/rest/user/V7RanksByTypeInteractor;)V", "_rankingTabs", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lorg/betup/ui/fragment/user/compose/RankingTimeType;", "rankingTabs", "Lkotlinx/coroutines/flow/StateFlow;", "getRankingTabs", "()Lkotlinx/coroutines/flow/StateFlow;", "_selectedRankingTabIndex", "", "selectedRankingTabIndex", "getSelectedRankingTabIndex", "_isLoading", "", "isLoading", "_error", "", "error", "getError", "userId", "dayLoaded", "weekLoaded", "monthLoaded", "dayData", "Lorg/betup/model/remote/entity/user/NewUserRankingItemModel;", "weekData", "monthData", "initialize", "", "loadRankingStatistics", "refreshRankingStatistics", "checkAndAggregateRankings", "dayRankingListener", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "weekRankingListener", "monthRankingListener", "initializeRankingTabs", "rankingStatistics", "Lorg/betup/model/remote/entity/user/NewUserRankingStatisticsModel;", "setSelectedRankingTab", "index", "clearError", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UserRankingsController {
    public static final int $stable = 8;
    private final MutableStateFlow<String> _error;
    private final MutableStateFlow<Boolean> _isLoading;
    private final MutableStateFlow<List<RankingTimeType>> _rankingTabs;
    private final MutableStateFlow<Integer> _selectedRankingTabIndex;
    private List<NewUserRankingItemModel> dayData;
    private boolean dayLoaded;
    private final BaseCachedSharedInteractor.OnFetchedListener<List<NewUserRankingItemModel>, String> dayRankingListener;
    private final StateFlow<String> error;
    private final StateFlow<Boolean> isLoading;
    private List<NewUserRankingItemModel> monthData;
    private boolean monthLoaded;
    private final BaseCachedSharedInteractor.OnFetchedListener<List<NewUserRankingItemModel>, String> monthRankingListener;
    private final StateFlow<List<RankingTimeType>> rankingTabs;
    private final StateFlow<Integer> selectedRankingTabIndex;
    private int userId;

    @Inject
    public V7RanksByTypeInteractor v7RanksByTypeInteractor;
    private List<NewUserRankingItemModel> weekData;
    private boolean weekLoaded;
    private final BaseCachedSharedInteractor.OnFetchedListener<List<NewUserRankingItemModel>, String> weekRankingListener;

    @Inject
    public UserRankingsController() {
        MutableStateFlow<List<RankingTimeType>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._rankingTabs = MutableStateFlow;
        this.rankingTabs = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Integer> MutableStateFlow2 = StateFlowKt.MutableStateFlow(0);
        this._selectedRankingTabIndex = MutableStateFlow2;
        this.selectedRankingTabIndex = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(false);
        this._isLoading = MutableStateFlow3;
        this.isLoading = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<String> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this._error = MutableStateFlow4;
        this.error = FlowKt.asStateFlow(MutableStateFlow4);
        this.dayRankingListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.user.controller.UserRankingsController$$ExternalSyntheticLambda0
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                UserRankingsController.dayRankingListener$lambda$0(UserRankingsController.this, fetchedResponseMessage);
            }
        };
        this.weekRankingListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.user.controller.UserRankingsController$$ExternalSyntheticLambda1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                UserRankingsController.weekRankingListener$lambda$1(UserRankingsController.this, fetchedResponseMessage);
            }
        };
        this.monthRankingListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.user.controller.UserRankingsController$$ExternalSyntheticLambda2
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                UserRankingsController.monthRankingListener$lambda$2(UserRankingsController.this, fetchedResponseMessage);
            }
        };
    }

    public final V7RanksByTypeInteractor getV7RanksByTypeInteractor() {
        V7RanksByTypeInteractor v7RanksByTypeInteractor = this.v7RanksByTypeInteractor;
        if (v7RanksByTypeInteractor != null) {
            return v7RanksByTypeInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("v7RanksByTypeInteractor");
        return null;
    }

    public final void setV7RanksByTypeInteractor(V7RanksByTypeInteractor v7RanksByTypeInteractor) {
        Intrinsics.checkNotNullParameter(v7RanksByTypeInteractor, "<set-?>");
        this.v7RanksByTypeInteractor = v7RanksByTypeInteractor;
    }

    public final StateFlow<List<RankingTimeType>> getRankingTabs() {
        return this.rankingTabs;
    }

    public final StateFlow<Integer> getSelectedRankingTabIndex() {
        return this.selectedRankingTabIndex;
    }

    public final StateFlow<Boolean> isLoading() {
        return this.isLoading;
    }

    public final StateFlow<String> getError() {
        return this.error;
    }

    public final void initialize(int userId) {
        Log.d("UserRankingsController", "Initializing with userId: " + userId);
        this.userId = userId;
        loadRankingStatistics();
    }

    public final void loadRankingStatistics() {
        if (this._isLoading.getValue().booleanValue()) {
            Log.d("UserRankingsController", "Already loading, skipping");
            return;
        }
        Log.d("UserRankingsController", "Loading ranking statistics from /api/v7/ranks/{type}");
        this._isLoading.setValue(true);
        this._error.setValue(null);
        this.dayLoaded = false;
        this.weekLoaded = false;
        this.monthLoaded = false;
        this.dayData = null;
        this.weekData = null;
        this.monthData = null;
        getV7RanksByTypeInteractor().load(this.dayRankingListener, "day", null);
        getV7RanksByTypeInteractor().load(this.weekRankingListener, "week", null);
        getV7RanksByTypeInteractor().load(this.monthRankingListener, "month", null);
    }

    public final void refreshRankingStatistics() {
        Log.d("UserRankingsController", "Refreshing ranking statistics");
        getV7RanksByTypeInteractor().invalidate("day");
        getV7RanksByTypeInteractor().invalidate("week");
        getV7RanksByTypeInteractor().invalidate("month");
        loadRankingStatistics();
    }

    private final void checkAndAggregateRankings() {
        if (this.dayLoaded && this.weekLoaded && this.monthLoaded) {
            this._isLoading.setValue(false);
            NewUserRankingStatisticsModel newUserRankingStatisticsModel = new NewUserRankingStatisticsModel(this.dayData, this.weekData, this.monthData);
            Log.d("UserRankingsController", "All ranking statistics loaded successfully");
            initializeRankingTabs(newUserRankingStatisticsModel);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dayRankingListener$lambda$0(UserRankingsController userRankingsController, FetchedResponseMessage fetchedResponseMessage) {
        String str;
        if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS) {
            userRankingsController.dayData = (List) fetchedResponseMessage.getModel();
            userRankingsController.dayLoaded = true;
            List list = (List) fetchedResponseMessage.getModel();
            Log.d("UserRankingsController", "Day rankings loaded: " + (list != null ? list.size() : 0) + " items");
            userRankingsController.checkAndAggregateRankings();
            return;
        }
        FetchStat stat = fetchedResponseMessage.getStat();
        if (stat == null || (str = stat.name()) == null) {
            str = "Unknown error";
        }
        Log.e("UserRankingsController", "Failed to load day rankings: " + str);
        userRankingsController.dayLoaded = true;
        userRankingsController.dayData = CollectionsKt.emptyList();
        userRankingsController.checkAndAggregateRankings();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void weekRankingListener$lambda$1(UserRankingsController userRankingsController, FetchedResponseMessage fetchedResponseMessage) {
        String str;
        if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS) {
            userRankingsController.weekData = (List) fetchedResponseMessage.getModel();
            userRankingsController.weekLoaded = true;
            List list = (List) fetchedResponseMessage.getModel();
            Log.d("UserRankingsController", "Week rankings loaded: " + (list != null ? list.size() : 0) + " items");
            userRankingsController.checkAndAggregateRankings();
            return;
        }
        FetchStat stat = fetchedResponseMessage.getStat();
        if (stat == null || (str = stat.name()) == null) {
            str = "Unknown error";
        }
        Log.e("UserRankingsController", "Failed to load week rankings: " + str);
        userRankingsController.weekLoaded = true;
        userRankingsController.weekData = CollectionsKt.emptyList();
        userRankingsController.checkAndAggregateRankings();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void monthRankingListener$lambda$2(UserRankingsController userRankingsController, FetchedResponseMessage fetchedResponseMessage) {
        String str;
        if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS) {
            userRankingsController.monthData = (List) fetchedResponseMessage.getModel();
            userRankingsController.monthLoaded = true;
            List list = (List) fetchedResponseMessage.getModel();
            Log.d("UserRankingsController", "Month rankings loaded: " + (list != null ? list.size() : 0) + " items");
            userRankingsController.checkAndAggregateRankings();
            return;
        }
        FetchStat stat = fetchedResponseMessage.getStat();
        if (stat == null || (str = stat.name()) == null) {
            str = "Unknown error";
        }
        Log.e("UserRankingsController", "Failed to load month rankings: " + str);
        userRankingsController.monthLoaded = true;
        userRankingsController.monthData = CollectionsKt.emptyList();
        userRankingsController.checkAndAggregateRankings();
    }

    private final void initializeRankingTabs(NewUserRankingStatisticsModel rankingStatistics) {
        String str;
        RankingCupType.Bronze placeholderRankingBronze;
        RankingCupType.Silver placeholderRankingSilver;
        RankingCupType.Gold placeholderRankingGold;
        String photoUrl;
        String photoUrl2;
        String photoUrl3;
        RankingCupType.Bronze placeholderRankingBronze2;
        RankingCupType.Silver placeholderRankingSilver2;
        RankingCupType.Gold placeholderRankingGold2;
        String photoUrl4;
        String photoUrl5;
        String str2;
        String photoUrl6;
        RankingCupType.Bronze placeholderRankingBronze3;
        RankingCupType.Silver placeholderRankingSilver3;
        RankingCupType.Gold placeholderRankingGold3;
        String photoUrl7;
        String photoUrl8;
        String photoUrl9;
        List<NewUserRankingItemModel> day = rankingStatistics.getDay();
        if (day == null) {
            day = CollectionsKt.emptyList();
        }
        List<NewUserRankingItemModel> week = rankingStatistics.getWeek();
        if (week == null) {
            week = CollectionsKt.emptyList();
        }
        List<NewUserRankingItemModel> month = rankingStatistics.getMonth();
        if (month == null) {
            month = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        if (!day.isEmpty()) {
            NewUserRankingItemModel newUserRankingItemModel = (NewUserRankingItemModel) CollectionsKt.getOrNull(day, 0);
            NewUserRankingItemModel newUserRankingItemModel2 = (NewUserRankingItemModel) CollectionsKt.getOrNull(day, 1);
            NewUserRankingItemModel newUserRankingItemModel3 = (NewUserRankingItemModel) CollectionsKt.getOrNull(day, 2);
            ArrayList arrayList2 = arrayList;
            if (newUserRankingItemModel != null) {
                String name = newUserRankingItemModel.getName();
                String photoUrl10 = newUserRankingItemModel.getPhotoUrl();
                String str3 = photoUrl10 == null ? "" : photoUrl10;
                String valueOf = String.valueOf(newUserRankingItemModel.getLevel());
                NewCountryModel country = newUserRankingItemModel.getCountry();
                placeholderRankingBronze3 = new RankingCupType.Bronze(name, str3, valueOf, (country == null || (photoUrl9 = country.getPhotoUrl()) == null) ? "" : photoUrl9, (int) newUserRankingItemModel.getId());
            } else {
                placeholderRankingBronze3 = RankingCupBaseItemKt.placeholderRankingBronze();
            }
            RankingCupType.Bronze bronze = placeholderRankingBronze3;
            if (newUserRankingItemModel2 != null) {
                String name2 = newUserRankingItemModel2.getName();
                String photoUrl11 = newUserRankingItemModel2.getPhotoUrl();
                String str4 = photoUrl11 == null ? "" : photoUrl11;
                String valueOf2 = String.valueOf(newUserRankingItemModel2.getLevel());
                NewCountryModel country2 = newUserRankingItemModel2.getCountry();
                placeholderRankingSilver3 = new RankingCupType.Silver(name2, str4, valueOf2, (country2 == null || (photoUrl8 = country2.getPhotoUrl()) == null) ? "" : photoUrl8, (int) newUserRankingItemModel2.getId());
            } else {
                placeholderRankingSilver3 = RankingCupBaseItemKt.placeholderRankingSilver();
            }
            RankingCupType.Silver silver = placeholderRankingSilver3;
            if (newUserRankingItemModel3 != null) {
                String name3 = newUserRankingItemModel3.getName();
                String photoUrl12 = newUserRankingItemModel3.getPhotoUrl();
                String str5 = photoUrl12 == null ? "" : photoUrl12;
                String valueOf3 = String.valueOf(newUserRankingItemModel3.getLevel());
                NewCountryModel country3 = newUserRankingItemModel3.getCountry();
                placeholderRankingGold3 = new RankingCupType.Gold(name3, str5, valueOf3, (country3 == null || (photoUrl7 = country3.getPhotoUrl()) == null) ? "" : photoUrl7, (int) newUserRankingItemModel3.getId());
            } else {
                placeholderRankingGold3 = RankingCupBaseItemKt.placeholderRankingGold();
            }
            arrayList2.add(new RankingTimeType.Day(bronze, silver, placeholderRankingGold3, (NewUserRankingItemModel) CollectionsKt.getOrNull(day, 3), (NewUserRankingItemModel) CollectionsKt.getOrNull(day, 4), CollectionsKt.drop(day, 5)));
        }
        if (week.isEmpty()) {
            str = "";
        } else {
            NewUserRankingItemModel newUserRankingItemModel4 = (NewUserRankingItemModel) CollectionsKt.getOrNull(week, 0);
            NewUserRankingItemModel newUserRankingItemModel5 = (NewUserRankingItemModel) CollectionsKt.getOrNull(week, 1);
            NewUserRankingItemModel newUserRankingItemModel6 = (NewUserRankingItemModel) CollectionsKt.getOrNull(week, 2);
            ArrayList arrayList3 = arrayList;
            if (newUserRankingItemModel4 != null) {
                String name4 = newUserRankingItemModel4.getName();
                String photoUrl13 = newUserRankingItemModel4.getPhotoUrl();
                String str6 = photoUrl13 == null ? "" : photoUrl13;
                String valueOf4 = String.valueOf(newUserRankingItemModel4.getLevel());
                NewCountryModel country4 = newUserRankingItemModel4.getCountry();
                if (country4 == null || (photoUrl6 = country4.getPhotoUrl()) == null) {
                    str2 = "";
                    str = str2;
                } else {
                    str = "";
                    str2 = photoUrl6;
                }
                placeholderRankingBronze2 = new RankingCupType.Bronze(name4, str6, valueOf4, str2, (int) newUserRankingItemModel4.getId());
            } else {
                str = "";
                placeholderRankingBronze2 = RankingCupBaseItemKt.placeholderRankingBronze();
            }
            RankingCupType.Bronze bronze2 = placeholderRankingBronze2;
            if (newUserRankingItemModel5 != null) {
                String name5 = newUserRankingItemModel5.getName();
                String photoUrl14 = newUserRankingItemModel5.getPhotoUrl();
                String str7 = photoUrl14 == null ? str : photoUrl14;
                String valueOf5 = String.valueOf(newUserRankingItemModel5.getLevel());
                NewCountryModel country5 = newUserRankingItemModel5.getCountry();
                placeholderRankingSilver2 = new RankingCupType.Silver(name5, str7, valueOf5, (country5 == null || (photoUrl5 = country5.getPhotoUrl()) == null) ? str : photoUrl5, (int) newUserRankingItemModel5.getId());
            } else {
                placeholderRankingSilver2 = RankingCupBaseItemKt.placeholderRankingSilver();
            }
            if (newUserRankingItemModel6 != null) {
                String name6 = newUserRankingItemModel6.getName();
                String photoUrl15 = newUserRankingItemModel6.getPhotoUrl();
                String str8 = photoUrl15 == null ? str : photoUrl15;
                String valueOf6 = String.valueOf(newUserRankingItemModel6.getLevel());
                NewCountryModel country6 = newUserRankingItemModel6.getCountry();
                placeholderRankingGold2 = new RankingCupType.Gold(name6, str8, valueOf6, (country6 == null || (photoUrl4 = country6.getPhotoUrl()) == null) ? str : photoUrl4, (int) newUserRankingItemModel6.getId());
            } else {
                placeholderRankingGold2 = RankingCupBaseItemKt.placeholderRankingGold();
            }
            arrayList3.add(new RankingTimeType.Week(bronze2, placeholderRankingSilver2, placeholderRankingGold2, (NewUserRankingItemModel) CollectionsKt.getOrNull(week, 3), (NewUserRankingItemModel) CollectionsKt.getOrNull(week, 4), CollectionsKt.drop(week, 5)));
        }
        if (!month.isEmpty()) {
            NewUserRankingItemModel newUserRankingItemModel7 = (NewUserRankingItemModel) CollectionsKt.getOrNull(month, 0);
            NewUserRankingItemModel newUserRankingItemModel8 = (NewUserRankingItemModel) CollectionsKt.getOrNull(month, 1);
            NewUserRankingItemModel newUserRankingItemModel9 = (NewUserRankingItemModel) CollectionsKt.getOrNull(month, 2);
            ArrayList arrayList4 = arrayList;
            if (newUserRankingItemModel7 != null) {
                String name7 = newUserRankingItemModel7.getName();
                String photoUrl16 = newUserRankingItemModel7.getPhotoUrl();
                String str9 = photoUrl16 == null ? str : photoUrl16;
                String valueOf7 = String.valueOf(newUserRankingItemModel7.getLevel());
                NewCountryModel country7 = newUserRankingItemModel7.getCountry();
                placeholderRankingBronze = new RankingCupType.Bronze(name7, str9, valueOf7, (country7 == null || (photoUrl3 = country7.getPhotoUrl()) == null) ? str : photoUrl3, (int) newUserRankingItemModel7.getId());
            } else {
                placeholderRankingBronze = RankingCupBaseItemKt.placeholderRankingBronze();
            }
            RankingCupType.Bronze bronze3 = placeholderRankingBronze;
            if (newUserRankingItemModel8 != null) {
                String name8 = newUserRankingItemModel8.getName();
                String photoUrl17 = newUserRankingItemModel8.getPhotoUrl();
                String str10 = photoUrl17 == null ? str : photoUrl17;
                String valueOf8 = String.valueOf(newUserRankingItemModel8.getLevel());
                NewCountryModel country8 = newUserRankingItemModel8.getCountry();
                placeholderRankingSilver = new RankingCupType.Silver(name8, str10, valueOf8, (country8 == null || (photoUrl2 = country8.getPhotoUrl()) == null) ? str : photoUrl2, (int) newUserRankingItemModel8.getId());
            } else {
                placeholderRankingSilver = RankingCupBaseItemKt.placeholderRankingSilver();
            }
            if (newUserRankingItemModel9 != null) {
                String name9 = newUserRankingItemModel9.getName();
                String photoUrl18 = newUserRankingItemModel9.getPhotoUrl();
                String str11 = photoUrl18 == null ? str : photoUrl18;
                String valueOf9 = String.valueOf(newUserRankingItemModel9.getLevel());
                NewCountryModel country9 = newUserRankingItemModel9.getCountry();
                placeholderRankingGold = new RankingCupType.Gold(name9, str11, valueOf9, (country9 == null || (photoUrl = country9.getPhotoUrl()) == null) ? str : photoUrl, (int) newUserRankingItemModel9.getId());
            } else {
                placeholderRankingGold = RankingCupBaseItemKt.placeholderRankingGold();
            }
            arrayList4.add(new RankingTimeType.Month(bronze3, placeholderRankingSilver, placeholderRankingGold, (NewUserRankingItemModel) CollectionsKt.getOrNull(month, 3), (NewUserRankingItemModel) CollectionsKt.getOrNull(month, 4), CollectionsKt.drop(month, 5)));
        }
        this._rankingTabs.setValue(arrayList);
        Log.d("UserRankingsController", "Initialized " + arrayList.size() + " ranking tabs");
    }

    public final void setSelectedRankingTab(int index) {
        if (index < 0 || index >= this.rankingTabs.getValue().size()) {
            return;
        }
        this._selectedRankingTabIndex.setValue(Integer.valueOf(index));
        Log.d("UserRankingsController", "Selected ranking tab: " + index);
    }

    public final void clearError() {
        this._error.setValue(null);
    }
}
