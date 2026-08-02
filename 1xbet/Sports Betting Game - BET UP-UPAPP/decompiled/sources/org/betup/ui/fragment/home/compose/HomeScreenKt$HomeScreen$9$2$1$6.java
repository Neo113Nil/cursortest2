package org.betup.ui.fragment.home.compose;

import android.graphics.Rect;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.local.entity.OddType;
import org.betup.ui.fragment.home.compose.sections.HomeMoreMatchesSectionKt;

/* compiled from: HomeScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HomeScreenKt$HomeScreen$9$2$1$6 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ Function1<HomeMatchOddUi, Boolean> $isBetLocked;
    final /* synthetic */ Function1<Long, Boolean> $isBetSelected;
    final /* synthetic */ Function1<Long, Boolean> $isBetValidating;
    final /* synthetic */ boolean $moreMatchesVisible;
    final /* synthetic */ OddType $oddType;
    final /* synthetic */ Function2<Long, HomeMatchOddUi, Unit> $onBetClick;
    final /* synthetic */ Function0<Unit> $onLoadMoreMoreMatches;
    final /* synthetic */ Function1<Rect, Unit> $onMoreMatchesSectionBoundsReported;
    final /* synthetic */ HomeUiState $uiState;

    /* JADX WARN: Multi-variable type inference failed */
    HomeScreenKt$HomeScreen$9$2$1$6(HomeUiState homeUiState, boolean z, Function1<? super Rect, Unit> function1, Function0<Unit> function0, OddType oddType, Function1<? super Long, Boolean> function12, Function1<? super Long, Boolean> function13, Function1<? super HomeMatchOddUi, Boolean> function14, Function2<? super Long, ? super HomeMatchOddUi, Unit> function2) {
        this.$uiState = homeUiState;
        this.$moreMatchesVisible = z;
        this.$onMoreMatchesSectionBoundsReported = function1;
        this.$onLoadMoreMoreMatches = function0;
        this.$oddType = oddType;
        this.$isBetSelected = function12;
        this.$isBetValidating = function13;
        this.$isBetLocked = function14;
        this.$onBetClick = function2;
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
            ComposerKt.traceEventStart(-1949169041, i, -1, "org.betup.ui.fragment.home.compose.HomeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:345)");
        }
        HomeMoreMatchesUiState moreMatches = this.$uiState.getMoreMatches();
        composer.startReplaceGroup(1849434622);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$HomeScreen$9$2$1$6$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = HomeScreenKt$HomeScreen$9$2$1$6.invoke$lambda$1$lambda$0();
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        Function1<Rect, Unit> function1 = this.$moreMatchesVisible ? this.$onMoreMatchesSectionBoundsReported : null;
        composer.startReplaceGroup(1849434622);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$HomeScreen$9$2$1$6$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = HomeScreenKt$HomeScreen$9$2$1$6.invoke$lambda$3$lambda$2(((Long) obj).longValue());
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        HomeMoreMatchesSectionKt.HomeMoreMatchesSection(moreMatches, function0, function1, null, (Function1) rememberedValue2, this.$onLoadMoreMoreMatches, this.$oddType, this.$isBetSelected, this.$isBetValidating, this.$isBetLocked, this.$onBetClick, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 24624, 48, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0() {
        HomeMatchNavigation.INSTANCE.navigateToTopMatches(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(long j) {
        HomeMatchNavigation.INSTANCE.navigateToMatchDetails(j, false);
        return Unit.INSTANCE;
    }
}
