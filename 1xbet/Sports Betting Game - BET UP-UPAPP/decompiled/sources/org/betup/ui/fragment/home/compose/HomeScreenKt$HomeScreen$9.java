package org.betup.ui.fragment.home.compose;

import android.graphics.Rect;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import nl.dionsegijn.konfetti.core.Spread;
import org.betup.domain.quest.DailyQuestTask;
import org.betup.model.local.entity.OddType;
import org.betup.ui.fragment.dailybonus.model.DailyBonusData;
import org.betup.ui.fragment.home.compose.HomeLiveMatchesUiState;
import org.betup.ui.fragment.home.compose.HomeMoreMatchesUiState;
import org.betup.ui.fragment.home.compose.HomeStatsUiState;
import org.betup.ui.fragment.home.compose.sections.HomeDailyQuestsSectionKt;
import org.betup.ui.fragment.home.compose.sections.HomePromoSectionKt;
import org.betup.ui.fragment.home.compose.sections.HomeStatsSectionKt;
import org.betup.ui.fragment.home.controller.HomeDailyQuestUiState;
import org.betup.ui.tour.compose.TourStep;

/* compiled from: HomeScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HomeScreenKt$HomeScreen$9 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Integer $activeGameModeTourColumn;
    final /* synthetic */ DailyBonusData $dailyBonusData;
    final /* synthetic */ MutableIntState $gameModeTileBottomScreenPx$delegate;
    final /* synthetic */ Function1<HomeMatchOddUi, Boolean> $isBetLocked;
    final /* synthetic */ Function1<Long, Boolean> $isBetSelected;
    final /* synthetic */ Function1<Long, Boolean> $isBetValidating;
    final /* synthetic */ MutableState<Boolean> $isTourProgrammaticScroll$delegate;
    final /* synthetic */ MutableIntState $lazyListViewportBottomScreenPx$delegate;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ boolean $liveArenaVisible;
    final /* synthetic */ boolean $moreMatchesVisible;
    final /* synthetic */ OddType $oddType;
    final /* synthetic */ Function1<Rect, Unit> $onBattlesBoundsReported;
    final /* synthetic */ Function1<Rect, Unit> $onBestStreakBoundsReported;
    final /* synthetic */ Function0<Unit> $onBestStreakClick;
    final /* synthetic */ Function2<Long, HomeMatchOddUi, Unit> $onBetClick;
    final /* synthetic */ Function1<String, Unit> $onClaimDailyQuest;
    final /* synthetic */ Function1<Rect, Unit> $onCompetitionsBoundsReported;
    final /* synthetic */ Function1<DailyQuestTask, Unit> $onDailyQuestTaskClick;
    final /* synthetic */ Function1<Rect, Unit> $onDailyQuestsBoundsReported;
    final /* synthetic */ Function1<Rect, Unit> $onFlashBetBoundsReported;
    final /* synthetic */ Function1<Rect, Unit> $onGlobalRankBoundsReported;
    final /* synthetic */ Function0<Unit> $onGlobalRankClick;
    final /* synthetic */ Function1<Rect, Unit> $onLiveArenaSectionBoundsReported;
    final /* synthetic */ Function0<Unit> $onLoadMoreLiveMatches;
    final /* synthetic */ Function0<Unit> $onLoadMoreMoreMatches;
    final /* synthetic */ Function1<Rect, Unit> $onMinigamesBoundsReported;
    final /* synthetic */ Function1<Rect, Unit> $onMoreMatchesSectionBoundsReported;
    final /* synthetic */ Function1<Rect, Unit> $onRankingsBoundsReported;
    final /* synthetic */ Function1<Rect, Unit> $onSpecialOfferBoundsReported;
    final /* synthetic */ Function0<Unit> $onSpecialOfferClick;
    final /* synthetic */ Function1<Rect, Unit> $onTvBetBoundsReported;
    final /* synthetic */ Function1<Rect, Unit> $onVideoRewardBoundsReported;
    final /* synthetic */ Function0<Unit> $onVideoRewardClick;
    final /* synthetic */ Function0<Unit> $onVideoRewardLongClick;
    final /* synthetic */ Function1<Rect, Unit> $onWinRateBoundsReported;
    final /* synthetic */ Function0<Unit> $onWinRateClick;
    final /* synthetic */ TourStep $tourStep;
    final /* synthetic */ HomeUiState $uiState;

    /* JADX WARN: Multi-variable type inference failed */
    HomeScreenKt$HomeScreen$9(LazyListState lazyListState, HomeUiState homeUiState, Function0<Unit> function0, Function1<? super Rect, Unit> function1, Function1<? super Rect, Unit> function12, Function1<? super Rect, Unit> function13, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function1<? super Rect, Unit> function14, Function1<? super Rect, Unit> function15, Function1<? super String, Unit> function16, Function1<? super DailyQuestTask, Unit> function17, DailyBonusData dailyBonusData, Function1<? super Rect, Unit> function18, Function1<? super Rect, Unit> function19, Function1<? super Rect, Unit> function110, Function1<? super Rect, Unit> function111, boolean z, Function1<? super Rect, Unit> function112, Function0<Unit> function05, OddType oddType, Function1<? super Long, Boolean> function113, Function1<? super Long, Boolean> function114, Function1<? super HomeMatchOddUi, Boolean> function115, Function2<? super Long, ? super HomeMatchOddUi, Unit> function2, boolean z2, Function1<? super Rect, Unit> function116, Function0<Unit> function06, TourStep tourStep, Function1<? super Rect, Unit> function117, Function1<? super Rect, Unit> function118, Function1<? super Rect, Unit> function119, Integer num, MutableState<Boolean> mutableState, MutableIntState mutableIntState, Function0<Unit> function07, Function0<Unit> function08, MutableIntState mutableIntState2) {
        this.$listState = lazyListState;
        this.$uiState = homeUiState;
        this.$onBestStreakClick = function0;
        this.$onWinRateBoundsReported = function1;
        this.$onGlobalRankBoundsReported = function12;
        this.$onBestStreakBoundsReported = function13;
        this.$onSpecialOfferClick = function02;
        this.$onVideoRewardClick = function03;
        this.$onVideoRewardLongClick = function04;
        this.$onSpecialOfferBoundsReported = function14;
        this.$onVideoRewardBoundsReported = function15;
        this.$onClaimDailyQuest = function16;
        this.$onDailyQuestTaskClick = function17;
        this.$dailyBonusData = dailyBonusData;
        this.$onDailyQuestsBoundsReported = function18;
        this.$onFlashBetBoundsReported = function19;
        this.$onMinigamesBoundsReported = function110;
        this.$onTvBetBoundsReported = function111;
        this.$liveArenaVisible = z;
        this.$onLiveArenaSectionBoundsReported = function112;
        this.$onLoadMoreLiveMatches = function05;
        this.$oddType = oddType;
        this.$isBetSelected = function113;
        this.$isBetValidating = function114;
        this.$isBetLocked = function115;
        this.$onBetClick = function2;
        this.$moreMatchesVisible = z2;
        this.$onMoreMatchesSectionBoundsReported = function116;
        this.$onLoadMoreMoreMatches = function06;
        this.$tourStep = tourStep;
        this.$onCompetitionsBoundsReported = function117;
        this.$onBattlesBoundsReported = function118;
        this.$onRankingsBoundsReported = function119;
        this.$activeGameModeTourColumn = num;
        this.$isTourProgrammaticScroll$delegate = mutableState;
        this.$lazyListViewportBottomScreenPx$delegate = mutableIntState;
        this.$onWinRateClick = function07;
        this.$onGlobalRankClick = function08;
        this.$gameModeTileBottomScreenPx$delegate = mutableIntState2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        boolean HomeScreen$lambda$18;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1051473286, i, -1, "org.betup.ui.fragment.home.compose.HomeScreen.<anonymous> (HomeScreen.kt:237)");
        }
        HomeScreen$lambda$18 = HomeScreenKt.HomeScreen$lambda$18(this.$isTourProgrammaticScroll$delegate);
        boolean z = !HomeScreen$lambda$18;
        Modifier m1025backgroundbw27NRU$default = BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m5203getTransparent0d7_KjU(), null, 2, null);
        composer.startReplaceGroup(5004770);
        final MutableIntState mutableIntState = this.$lazyListViewportBottomScreenPx$delegate;
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$HomeScreen$9$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = HomeScreenKt$HomeScreen$9.invoke$lambda$1$lambda$0(MutableIntState.this, ((Integer) obj).intValue());
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        Modifier reportHomeTourBottomScreenPx = HomeTourBoundsKt.reportHomeTourBottomScreenPx(m1025backgroundbw27NRU$default, (Function1) rememberedValue, composer, 54);
        float f = 12;
        PaddingValues m1510PaddingValuesYgX7TsA = PaddingKt.m1510PaddingValuesYgX7TsA(Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f));
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f));
        LazyListState lazyListState = this.$listState;
        Arrangement.HorizontalOrVertical horizontalOrVertical = m1397spacedBy0680j_4;
        composer.startReplaceGroup(-1224400529);
        boolean changedInstance = composer.changedInstance(this.$uiState) | composer.changed(this.$onBestStreakClick) | composer.changed(this.$onWinRateBoundsReported) | composer.changed(this.$onGlobalRankBoundsReported) | composer.changed(this.$onBestStreakBoundsReported) | composer.changed(this.$onSpecialOfferClick) | composer.changed(this.$onVideoRewardClick) | composer.changed(this.$onVideoRewardLongClick) | composer.changed(this.$onSpecialOfferBoundsReported) | composer.changed(this.$onVideoRewardBoundsReported) | composer.changed(this.$onClaimDailyQuest) | composer.changed(this.$onDailyQuestTaskClick) | composer.changedInstance(this.$dailyBonusData) | composer.changed(this.$onDailyQuestsBoundsReported) | composer.changed(this.$onFlashBetBoundsReported) | composer.changed(this.$onMinigamesBoundsReported) | composer.changed(this.$onTvBetBoundsReported) | composer.changed(this.$liveArenaVisible) | composer.changed(this.$onLiveArenaSectionBoundsReported) | composer.changed(this.$onLoadMoreLiveMatches) | composer.changed(this.$oddType.ordinal()) | composer.changed(this.$isBetSelected) | composer.changed(this.$isBetValidating) | composer.changed(this.$isBetLocked) | composer.changed(this.$onBetClick) | composer.changed(this.$moreMatchesVisible) | composer.changed(this.$onMoreMatchesSectionBoundsReported) | composer.changed(this.$onLoadMoreMoreMatches);
        TourStep tourStep = this.$tourStep;
        boolean changed = changedInstance | composer.changed(tourStep != null ? tourStep.ordinal() : -1) | composer.changed(this.$onCompetitionsBoundsReported) | composer.changed(this.$onBattlesBoundsReported) | composer.changed(this.$onRankingsBoundsReported) | composer.changed(this.$activeGameModeTourColumn);
        final HomeUiState homeUiState = this.$uiState;
        final Function0<Unit> function0 = this.$onWinRateClick;
        final Function0<Unit> function02 = this.$onGlobalRankClick;
        final Function0<Unit> function03 = this.$onBestStreakClick;
        final Function1<Rect, Unit> function1 = this.$onWinRateBoundsReported;
        final Function1<Rect, Unit> function12 = this.$onGlobalRankBoundsReported;
        final Function1<Rect, Unit> function13 = this.$onBestStreakBoundsReported;
        final Function0<Unit> function04 = this.$onSpecialOfferClick;
        final Function0<Unit> function05 = this.$onVideoRewardClick;
        final Function0<Unit> function06 = this.$onVideoRewardLongClick;
        final Function1<Rect, Unit> function14 = this.$onSpecialOfferBoundsReported;
        final Function1<Rect, Unit> function15 = this.$onVideoRewardBoundsReported;
        final Function1<String, Unit> function16 = this.$onClaimDailyQuest;
        final Function1<DailyQuestTask, Unit> function17 = this.$onDailyQuestTaskClick;
        final DailyBonusData dailyBonusData = this.$dailyBonusData;
        final Function1<Rect, Unit> function18 = this.$onDailyQuestsBoundsReported;
        final Function1<Rect, Unit> function19 = this.$onFlashBetBoundsReported;
        final Function1<Rect, Unit> function110 = this.$onMinigamesBoundsReported;
        final Function1<Rect, Unit> function111 = this.$onTvBetBoundsReported;
        final boolean z2 = this.$liveArenaVisible;
        final Function1<Rect, Unit> function112 = this.$onLiveArenaSectionBoundsReported;
        final Function0<Unit> function07 = this.$onLoadMoreLiveMatches;
        final OddType oddType = this.$oddType;
        final Function1<Long, Boolean> function113 = this.$isBetSelected;
        final Function1<Long, Boolean> function114 = this.$isBetValidating;
        final Function1<HomeMatchOddUi, Boolean> function115 = this.$isBetLocked;
        final Function2<Long, HomeMatchOddUi, Unit> function2 = this.$onBetClick;
        final boolean z3 = this.$moreMatchesVisible;
        final Function1<Rect, Unit> function116 = this.$onMoreMatchesSectionBoundsReported;
        final Function0<Unit> function08 = this.$onLoadMoreMoreMatches;
        final TourStep tourStep2 = this.$tourStep;
        final Function1<Rect, Unit> function117 = this.$onCompetitionsBoundsReported;
        final Function1<Rect, Unit> function118 = this.$onBattlesBoundsReported;
        final Function1<Rect, Unit> function119 = this.$onRankingsBoundsReported;
        final Integer num = this.$activeGameModeTourColumn;
        final MutableIntState mutableIntState2 = this.$gameModeTileBottomScreenPx$delegate;
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$HomeScreen$9$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = HomeScreenKt$HomeScreen$9.invoke$lambda$3$lambda$2(HomeUiState.this, function0, function02, function03, function1, function12, function13, function04, function05, function06, function14, function15, function16, function17, dailyBonusData, function18, function19, function110, function111, z2, function112, function07, oddType, function113, function114, function115, function2, z3, function116, function08, tourStep2, function117, function118, function119, num, mutableIntState2, (LazyListScope) obj);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        LazyDslKt.LazyColumn(reportHomeTourBottomScreenPx, lazyListState, m1510PaddingValuesYgX7TsA, false, horizontalOrVertical, null, null, z, null, (Function1) rememberedValue2, composer, 24960, Spread.ROUND);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(final HomeUiState homeUiState, final Function0 function0, final Function0 function02, final Function0 function03, final Function1 function1, final Function1 function12, final Function1 function13, final Function0 function04, final Function0 function05, final Function0 function06, final Function1 function14, final Function1 function15, final Function1 function16, final Function1 function17, final DailyBonusData dailyBonusData, final Function1 function18, Function1 function19, Function1 function110, Function1 function111, boolean z, Function1 function112, Function0 function07, OddType oddType, Function1 function113, Function1 function114, Function1 function115, Function2 function2, boolean z2, Function1 function116, Function0 function08, TourStep tourStep, Function1 function117, Function1 function118, Function1 function119, Integer num, MutableIntState mutableIntState, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        if ((homeUiState.getStats() instanceof HomeStatsUiState.Loading) || (homeUiState.getStats() instanceof HomeStatsUiState.Visible)) {
            LazyListScope.item$default(LazyColumn, "stats", null, ComposableLambdaKt.composableLambdaInstance(-676564298, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$HomeScreen$9$2$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num2) {
                    invoke(lazyItemScope, composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-676564298, i, -1, "org.betup.ui.fragment.home.compose.HomeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:253)");
                    }
                    HomeStatsSectionKt.HomeStatsSection(HomeUiState.this.getStats(), function0, function02, function03, function1, function12, function13, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 12583344, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 2, null);
        }
        LazyListScope.item$default(LazyColumn, "promo", null, ComposableLambdaKt.composableLambdaInstance(-1854141541, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$HomeScreen$9$2$1$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num2) {
                invoke(lazyItemScope, composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1854141541, i, -1, "org.betup.ui.fragment.home.compose.HomeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:267)");
                }
                HomePromoSectionKt.HomePromoSection(HomeUiState.this.getPromo(), HomeUiState.this.getBonusOfferActive(), HomeUiState.this.getActiveOffer(), HomeUiState.this.getOfferExpirationMs(), HomeUiState.this.getVideoBonus(), function04, function05, function06, function14, function15, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 0, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 2, null);
        if ((homeUiState.getDailyQuests() instanceof HomeDailyQuestUiState.Loading) || !(homeUiState.getDailyQuests() instanceof HomeDailyQuestUiState.Hidden)) {
            LazyListScope.item$default(LazyColumn, HomeTourLazyKey.DAILY_QUESTS, null, ComposableLambdaKt.composableLambdaInstance(-1754503187, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$HomeScreen$9$2$1$3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num2) {
                    invoke(lazyItemScope, composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1754503187, i, -1, "org.betup.ui.fragment.home.compose.HomeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:286)");
                    }
                    HomeDailyQuestsSectionKt.HomeDailyQuestsSection(HomeUiState.this.getDailyQuests(), function16, function17, dailyBonusData, function18, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 2, null);
        }
        LazyListScope.item$default(LazyColumn, HomeTourLazyKey.QUICK_PLAY, null, ComposableLambdaKt.composableLambdaInstance(465132434, true, new HomeScreenKt$HomeScreen$9$2$1$4(function19, function110, function111)), 2, null);
        if ((homeUiState.getLiveMatches() instanceof HomeLiveMatchesUiState.Loading) || (homeUiState.getLiveMatches() instanceof HomeLiveMatchesUiState.Visible)) {
            LazyListScope.item$default(LazyColumn, HomeTourLazyKey.LIVE_ARENA, null, ComposableLambdaKt.composableLambdaInstance(-1851836114, true, new HomeScreenKt$HomeScreen$9$2$1$5(homeUiState, z, function112, function07, oddType, function113, function114, function115, function2)), 2, null);
        }
        if ((homeUiState.getMoreMatches() instanceof HomeMoreMatchesUiState.Loading) || (homeUiState.getMoreMatches() instanceof HomeMoreMatchesUiState.Visible)) {
            LazyListScope.item$default(LazyColumn, HomeTourLazyKey.MORE_MATCHES, null, ComposableLambdaKt.composableLambdaInstance(-1949169041, true, new HomeScreenKt$HomeScreen$9$2$1$6(homeUiState, z2, function116, function08, oddType, function113, function114, function115, function2)), 2, null);
        }
        LazyListScope.item$default(LazyColumn, HomeTourLazyKey.GAME_MODES, null, ComposableLambdaKt.composableLambdaInstance(367799507, true, new HomeScreenKt$HomeScreen$9$2$1$7(homeUiState, tourStep, function117, function118, function119, num, mutableIntState)), 2, null);
        LazyListScope.item$default(LazyColumn, HomeTourLazyKey.BOTTOM_SPACER, null, ComposableSingletons$HomeScreenKt.INSTANCE.getLambda$270466580$app_release(), 2, null);
        return Unit.INSTANCE;
    }
}
