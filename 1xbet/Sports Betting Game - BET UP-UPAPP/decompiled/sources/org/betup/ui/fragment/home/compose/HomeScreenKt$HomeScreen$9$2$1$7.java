package org.betup.ui.fragment.home.compose;

import android.graphics.Rect;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.betup.bus.NavigateMessage;
import org.betup.ui.fragment.home.compose.sections.HomeGameModesSectionKt;
import org.betup.ui.tour.compose.TourStep;
import org.greenrobot.eventbus.EventBus;

/* compiled from: HomeScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HomeScreenKt$HomeScreen$9$2$1$7 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ Integer $activeGameModeTourColumn;
    final /* synthetic */ MutableIntState $gameModeTileBottomScreenPx$delegate;
    final /* synthetic */ Function1<Rect, Unit> $onBattlesBoundsReported;
    final /* synthetic */ Function1<Rect, Unit> $onCompetitionsBoundsReported;
    final /* synthetic */ Function1<Rect, Unit> $onRankingsBoundsReported;
    final /* synthetic */ TourStep $tourStep;
    final /* synthetic */ HomeUiState $uiState;

    /* JADX WARN: Multi-variable type inference failed */
    HomeScreenKt$HomeScreen$9$2$1$7(HomeUiState homeUiState, TourStep tourStep, Function1<? super Rect, Unit> function1, Function1<? super Rect, Unit> function12, Function1<? super Rect, Unit> function13, Integer num, MutableIntState mutableIntState) {
        this.$uiState = homeUiState;
        this.$tourStep = tourStep;
        this.$onCompetitionsBoundsReported = function1;
        this.$onBattlesBoundsReported = function12;
        this.$onRankingsBoundsReported = function13;
        this.$activeGameModeTourColumn = num;
        this.$gameModeTileBottomScreenPx$delegate = mutableIntState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(367799507, i, -1, "org.betup.ui.fragment.home.compose.HomeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:366)");
        }
        int battlesBadgeCount = this.$uiState.getBattlesBadgeCount();
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        composer.startReplaceGroup(1849434622);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$HomeScreen$9$2$1$7$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = HomeScreenKt$HomeScreen$9$2$1$7.invoke$lambda$1$lambda$0();
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$HomeScreen$9$2$1$7$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = HomeScreenKt$HomeScreen$9$2$1$7.invoke$lambda$3$lambda$2();
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        Function0 function02 = (Function0) rememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$HomeScreen$9$2$1$7$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$5$lambda$4;
                    invoke$lambda$5$lambda$4 = HomeScreenKt$HomeScreen$9$2$1$7.invoke$lambda$5$lambda$4();
                    return invoke$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        Function0 function03 = (Function0) rememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1746271574);
        TourStep tourStep = this.$tourStep;
        boolean changed = composer.changed(tourStep == null ? -1 : tourStep.ordinal()) | composer.changed(this.$onCompetitionsBoundsReported);
        final Function1<Rect, Unit> function1 = this.$onCompetitionsBoundsReported;
        final TourStep tourStep2 = this.$tourStep;
        final MutableIntState mutableIntState = this.$gameModeTileBottomScreenPx$delegate;
        Object rememberedValue4 = composer.rememberedValue();
        if (changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function1() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$HomeScreen$9$2$1$7$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$7$lambda$6;
                    invoke$lambda$7$lambda$6 = HomeScreenKt$HomeScreen$9$2$1$7.invoke$lambda$7$lambda$6(Function1.this, tourStep2, mutableIntState, (Rect) obj);
                    return invoke$lambda$7$lambda$6;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        Function1 function12 = (Function1) rememberedValue4;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1746271574);
        TourStep tourStep3 = this.$tourStep;
        boolean changed2 = composer.changed(tourStep3 == null ? -1 : tourStep3.ordinal()) | composer.changed(this.$onBattlesBoundsReported);
        final Function1<Rect, Unit> function13 = this.$onBattlesBoundsReported;
        final TourStep tourStep4 = this.$tourStep;
        final MutableIntState mutableIntState2 = this.$gameModeTileBottomScreenPx$delegate;
        Object rememberedValue5 = composer.rememberedValue();
        if (changed2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new Function1() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$HomeScreen$9$2$1$7$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$9$lambda$8;
                    invoke$lambda$9$lambda$8 = HomeScreenKt$HomeScreen$9$2$1$7.invoke$lambda$9$lambda$8(Function1.this, tourStep4, mutableIntState2, (Rect) obj);
                    return invoke$lambda$9$lambda$8;
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        Function1 function14 = (Function1) rememberedValue5;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1746271574);
        TourStep tourStep5 = this.$tourStep;
        boolean changed3 = composer.changed(tourStep5 != null ? tourStep5.ordinal() : -1) | composer.changed(this.$onRankingsBoundsReported);
        final Function1<Rect, Unit> function15 = this.$onRankingsBoundsReported;
        final TourStep tourStep6 = this.$tourStep;
        final MutableIntState mutableIntState3 = this.$gameModeTileBottomScreenPx$delegate;
        Object rememberedValue6 = composer.rememberedValue();
        if (changed3 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = new Function1() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$HomeScreen$9$2$1$7$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$11$lambda$10;
                    invoke$lambda$11$lambda$10 = HomeScreenKt$HomeScreen$9$2$1$7.invoke$lambda$11$lambda$10(Function1.this, tourStep6, mutableIntState3, (Rect) obj);
                    return invoke$lambda$11$lambda$10;
                }
            };
            composer.updateRememberedValue(rememberedValue6);
        }
        composer.endReplaceGroup();
        HomeGameModesSectionKt.HomeGameModesSection(function0, function02, function03, function12, function14, (Function1) rememberedValue6, this.$activeGameModeTourColumn, battlesBadgeCount, fillMaxWidth$default, composer, 100663734, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0() {
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.DAILY_COMPETITIONS, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2() {
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.BATTLES, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4() {
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.RANKINGS, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6(Function1 function1, TourStep tourStep, MutableIntState mutableIntState, Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        HomeScreenKt.HomeScreen$reportGameModeTileBottom(tourStep, mutableIntState, bounds);
        if (function1 != null) {
            function1.invoke(bounds);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8(Function1 function1, TourStep tourStep, MutableIntState mutableIntState, Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        HomeScreenKt.HomeScreen$reportGameModeTileBottom(tourStep, mutableIntState, bounds);
        if (function1 != null) {
            function1.invoke(bounds);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$11$lambda$10(Function1 function1, TourStep tourStep, MutableIntState mutableIntState, Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        HomeScreenKt.HomeScreen$reportGameModeTileBottom(tourStep, mutableIntState, bounds);
        if (function1 != null) {
            function1.invoke(bounds);
        }
        return Unit.INSTANCE;
    }
}
