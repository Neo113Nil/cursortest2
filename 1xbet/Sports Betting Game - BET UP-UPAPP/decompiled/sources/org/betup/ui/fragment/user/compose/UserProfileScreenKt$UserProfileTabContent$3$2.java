package org.betup.ui.fragment.user.compose;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import org.betup.R;
import org.betup.bus.ShareMessage;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;
import org.betup.model.remote.entity.bets.BetState;
import org.betup.model.remote.entity.user.NewUserAchievementsModel;
import org.betup.model.remote.entity.user.NewUserBetStatisticsModel;
import org.betup.model.remote.entity.user.NewUserFavouritesModel;
import org.betup.services.user.UserService;
import org.betup.ui.dialogs.fav.FavouriteTypeK;
import org.betup.ui.fragment.bets.betlist.compose.BetsListScreenKt;
import org.betup.ui.fragment.user.BetHistoryController;
import org.betup.ui.fragment.user.ForeignUserDetailsController;
import org.betup.ui.fragment.user.UserDetailsController;
import org.betup.ui.fragment.user.UserDetailsTab;
import org.greenrobot.eventbus.EventBus;

/* compiled from: UserProfileScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UserProfileScreenKt$UserProfileTabContent$3$2 implements Function4<PagerScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ List<UserDetailsTab> $filteredTabs;
    final /* synthetic */ ForeignUserDetailsController $foreignUserDetailsController;
    final /* synthetic */ boolean $isAnotherUser;
    final /* synthetic */ NewUserFavouritesModel $newUserFavourites;
    final /* synthetic */ Function1<FavouriteTypeK, Unit> $onGoToMatches;
    final /* synthetic */ Function1<Integer, Unit> $onRankingTabSelected;
    final /* synthetic */ Function1<Long, Unit> $onTeamClick;
    final /* synthetic */ Function1<Integer, Unit> $onUserCLick;
    final /* synthetic */ List<RankingTimeType> $rankingTabs;
    final /* synthetic */ int $selectedRankingTabIndex;
    final /* synthetic */ List<NewUserAchievementsModel> $userAchievements;
    final /* synthetic */ UserDetailsController $userDetailsController;
    final /* synthetic */ UserService $userService;
    final /* synthetic */ NewUserBetStatisticsModel $userStats;

    /* JADX WARN: Multi-variable type inference failed */
    UserProfileScreenKt$UserProfileTabContent$3$2(List<? extends UserDetailsTab> list, NewUserBetStatisticsModel newUserBetStatisticsModel, UserDetailsController userDetailsController, UserService userService, boolean z, ForeignUserDetailsController foreignUserDetailsController, List<NewUserAchievementsModel> list2, NewUserFavouritesModel newUserFavouritesModel, Function1<? super FavouriteTypeK, Unit> function1, Function1<? super Long, Unit> function12, List<? extends RankingTimeType> list3, int i, Function1<? super Integer, Unit> function13, Function1<? super Integer, Unit> function14) {
        this.$filteredTabs = list;
        this.$userStats = newUserBetStatisticsModel;
        this.$userDetailsController = userDetailsController;
        this.$userService = userService;
        this.$isAnotherUser = z;
        this.$foreignUserDetailsController = foreignUserDetailsController;
        this.$userAchievements = list2;
        this.$newUserFavourites = newUserFavouritesModel;
        this.$onGoToMatches = function1;
        this.$onTeamClick = function12;
        this.$rankingTabs = list3;
        this.$selectedRankingTabIndex = i;
        this.$onRankingTabSelected = function13;
        this.$onUserCLick = function14;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer, Integer num2) {
        invoke(pagerScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PagerScope HorizontalPager, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1833923828, i2, -1, "org.betup.ui.fragment.user.compose.UserProfileTabContent.<anonymous>.<anonymous> (UserProfileScreen.kt:364)");
        }
        UserDetailsTab userDetailsTab = (UserDetailsTab) CollectionsKt.getOrNull(this.$filteredTabs, i);
        if (userDetailsTab instanceof UserDetailsTab.Stats) {
            composer.startReplaceGroup(-1464202641);
            NewUserBetStatisticsModel newUserBetStatisticsModel = this.$userStats;
            UserDetailsController userDetailsController = this.$userDetailsController;
            OddType oddType = this.$userService.getOddType();
            Intrinsics.checkNotNullExpressionValue(oddType, "getOddType(...)");
            UserProfileComponentsKt.UserStatsContent(newUserBetStatisticsModel, userDetailsController, oddType, composer, 0, 0);
            composer.endReplaceGroup();
        } else if ((userDetailsTab instanceof UserDetailsTab.Bets) && this.$isAnotherUser && this.$foreignUserDetailsController != null) {
            composer.startReplaceGroup(1854717863);
            final BetHistoryController betHistoryController = this.$foreignUserDetailsController.getBetHistoryController();
            final int foreignUserId = this.$foreignUserDetailsController.getForeignUserId();
            StateFlow<List<BetsListModel>> betList = betHistoryController.getBetList();
            StateFlow<BetState> betFilterState = betHistoryController.getBetFilterState();
            StateFlow<Boolean> isLoadingBetsHistory = betHistoryController.isLoadingBetsHistory();
            StateFlow<Boolean> isLoadMoreHistoryBets = betHistoryController.isLoadMoreHistoryBets();
            StateFlow<Boolean> hasMoreHistoryBets = betHistoryController.getHasMoreHistoryBets();
            StateFlow<NewUserBetStatisticsModel> userBetStatistics = this.$foreignUserDetailsController.getUserBetStatistics();
            composer.startReplaceGroup(5004770);
            boolean changedInstance = composer.changedInstance(this.$foreignUserDetailsController);
            final ForeignUserDetailsController foreignUserDetailsController = this.$foreignUserDetailsController;
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserProfileScreenKt$UserProfileTabContent$3$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$1$lambda$0;
                        invoke$lambda$1$lambda$0 = UserProfileScreenKt$UserProfileTabContent$3$2.invoke$lambda$1$lambda$0(ForeignUserDetailsController.this, (BetsListModel) obj);
                        return invoke$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            Function1 function1 = (Function1) rememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1746271574);
            boolean changedInstance2 = composer.changedInstance(betHistoryController) | composer.changed(foreignUserId) | composer.changedInstance(this.$foreignUserDetailsController);
            final ForeignUserDetailsController foreignUserDetailsController2 = this.$foreignUserDetailsController;
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserProfileScreenKt$UserProfileTabContent$3$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$3$lambda$2;
                        invoke$lambda$3$lambda$2 = UserProfileScreenKt$UserProfileTabContent$3$2.invoke$lambda$3$lambda$2(BetHistoryController.this, foreignUserId, foreignUserDetailsController2, (BetState) obj);
                        return invoke$lambda$3$lambda$2;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            Function1 function12 = (Function1) rememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1746271574);
            boolean changedInstance3 = composer.changedInstance(this.$foreignUserDetailsController) | composer.changedInstance(betHistoryController) | composer.changed(foreignUserId);
            final ForeignUserDetailsController foreignUserDetailsController3 = this.$foreignUserDetailsController;
            Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserProfileScreenKt$UserProfileTabContent$3$2$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$5$lambda$4;
                        invoke$lambda$5$lambda$4 = UserProfileScreenKt$UserProfileTabContent$3$2.invoke$lambda$5$lambda$4(ForeignUserDetailsController.this, betHistoryController, foreignUserId);
                        return invoke$lambda$5$lambda$4;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            Function0 function0 = (Function0) rememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1746271574);
            boolean changedInstance4 = composer.changedInstance(betHistoryController) | composer.changed(foreignUserId) | composer.changedInstance(this.$foreignUserDetailsController);
            final ForeignUserDetailsController foreignUserDetailsController4 = this.$foreignUserDetailsController;
            Object rememberedValue4 = composer.rememberedValue();
            if (changedInstance4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserProfileScreenKt$UserProfileTabContent$3$2$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$7$lambda$6;
                        invoke$lambda$7$lambda$6 = UserProfileScreenKt$UserProfileTabContent$3$2.invoke$lambda$7$lambda$6(BetHistoryController.this, foreignUserId, foreignUserDetailsController4);
                        return invoke$lambda$7$lambda$6;
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            composer.endReplaceGroup();
            BetsListScreenKt.BetsListScreen(betList, function1, function12, function0, betFilterState, isLoadingBetsHistory, null, (Function0) rememberedValue4, isLoadMoreHistoryBets, hasMoreHistoryBets, userBetStatistics, true, composer, 0, 48, 64);
            composer.endReplaceGroup();
        } else if (userDetailsTab instanceof UserDetailsTab.About) {
            composer.startReplaceGroup(1856730662);
            String referralCode = this.$userService.getShortProfile().getUserModel().getReferralCode();
            final String stringResource = StringResources_androidKt.stringResource(R.string.share_text, new Object[]{referralCode}, composer, 6);
            Intrinsics.checkNotNull(referralCode);
            composer.startReplaceGroup(5004770);
            boolean changed = composer.changed(stringResource);
            Object rememberedValue5 = composer.rememberedValue();
            if (changed || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserProfileScreenKt$UserProfileTabContent$3$2$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$9$lambda$8;
                        invoke$lambda$9$lambda$8 = UserProfileScreenKt$UserProfileTabContent$3$2.invoke$lambda$9$lambda$8(stringResource);
                        return invoke$lambda$9$lambda$8;
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            Function0 function02 = (Function0) rememberedValue5;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean changed2 = composer.changed(stringResource);
            Object rememberedValue6 = composer.rememberedValue();
            if (changed2 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserProfileScreenKt$UserProfileTabContent$3$2$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$11$lambda$10;
                        invoke$lambda$11$lambda$10 = UserProfileScreenKt$UserProfileTabContent$3$2.invoke$lambda$11$lambda$10(stringResource);
                        return invoke$lambda$11$lambda$10;
                    }
                };
                composer.updateRememberedValue(rememberedValue6);
            }
            Function0 function03 = (Function0) rememberedValue6;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean changed3 = composer.changed(stringResource);
            Object rememberedValue7 = composer.rememberedValue();
            if (changed3 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserProfileScreenKt$UserProfileTabContent$3$2$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$13$lambda$12;
                        invoke$lambda$13$lambda$12 = UserProfileScreenKt$UserProfileTabContent$3$2.invoke$lambda$13$lambda$12(stringResource);
                        return invoke$lambda$13$lambda$12;
                    }
                };
                composer.updateRememberedValue(rememberedValue7);
            }
            composer.endReplaceGroup();
            UserProfileComponentsKt.UserAboutContent(referralCode, function02, function03, (Function0) rememberedValue7, this.$userAchievements, this.$newUserFavourites, this.$onGoToMatches, this.$isAnotherUser, this.$onTeamClick, composer, 0, 0);
            composer.endReplaceGroup();
        } else if (userDetailsTab instanceof UserDetailsTab.Ranking) {
            composer.startReplaceGroup(-1464072941);
            UserProfileComponentsKt.UserRankingContent(this.$rankingTabs, this.$selectedRankingTabIndex, this.$onRankingTabSelected, this.$onUserCLick, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1464064398);
            BoxKt.Box(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 6);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(ForeignUserDetailsController foreignUserDetailsController, BetsListModel betModel) {
        Intrinsics.checkNotNullParameter(betModel, "betModel");
        foreignUserDetailsController.onBetClick(betModel);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(BetHistoryController betHistoryController, int i, ForeignUserDetailsController foreignUserDetailsController, BetState selectedState) {
        Intrinsics.checkNotNullParameter(selectedState, "selectedState");
        betHistoryController.setFilterState(selectedState, i, foreignUserDetailsController.getBetsListInteractor());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(ForeignUserDetailsController foreignUserDetailsController, BetHistoryController betHistoryController, int i) {
        foreignUserDetailsController.refreshBetStatistics();
        betHistoryController.reloadBetsHistory(i, foreignUserDetailsController.getBetsListInteractor());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6(BetHistoryController betHistoryController, int i, ForeignUserDetailsController foreignUserDetailsController) {
        betHistoryController.loadBetsHistory(i, foreignUserDetailsController.getBetsListInteractor());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8(String str) {
        EventBus.getDefault().post(new ShareMessage(ShareMessage.Target.VK).setMsg(str));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$11$lambda$10(String str) {
        EventBus.getDefault().post(new ShareMessage(ShareMessage.Target.FACEBOOK).setMsg(str));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$12(String str) {
        EventBus.getDefault().post(new ShareMessage(ShareMessage.Target.OTHER).setMsg(str));
        return Unit.INSTANCE;
    }
}
