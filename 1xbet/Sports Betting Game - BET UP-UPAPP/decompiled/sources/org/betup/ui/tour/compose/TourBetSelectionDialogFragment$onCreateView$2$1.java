package org.betup.ui.tour.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.betup.ui.fragment.matches.details.MatchDetailsController;

/* compiled from: TourBetSelectionDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TourBetSelectionDialogFragment$onCreateView$2$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MatchDetailsController $currentController;
    final /* synthetic */ TourState $tourState;
    final /* synthetic */ TourBetSelectionDialogFragment this$0;

    TourBetSelectionDialogFragment$onCreateView$2$1(MatchDetailsController matchDetailsController, TourBetSelectionDialogFragment tourBetSelectionDialogFragment, TourState tourState) {
        this.$currentController = matchDetailsController;
        this.this$0 = tourBetSelectionDialogFragment;
        this.$tourState = tourState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(726791828, i, -1, "org.betup.ui.tour.compose.TourBetSelectionDialogFragment.onCreateView.<anonymous>.<anonymous> (TourBetSelectionDialogFragment.kt:59)");
        }
        MatchDetailsController matchDetailsController = this.$currentController;
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final TourBetSelectionDialogFragment tourBetSelectionDialogFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function2() { // from class: org.betup.ui.tour.compose.TourBetSelectionDialogFragment$onCreateView$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = TourBetSelectionDialogFragment$onCreateView$2$1.invoke$lambda$1$lambda$0(TourBetSelectionDialogFragment.this, ((Long) obj).longValue(), ((Integer) obj2).intValue());
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function2 function2 = (Function2) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final TourBetSelectionDialogFragment tourBetSelectionDialogFragment2 = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.tour.compose.TourBetSelectionDialogFragment$onCreateView$2$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = TourBetSelectionDialogFragment$onCreateView$2$1.invoke$lambda$3$lambda$2(TourBetSelectionDialogFragment.this);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        TourBetSelectionDialogKt.TourBetSelectionDialogContent(matchDetailsController, function2, (Function0) rememberedValue2, this.$tourState, null, composer, 0, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(TourBetSelectionDialogFragment tourBetSelectionDialogFragment, long j, int i) {
        Function2 function2;
        function2 = tourBetSelectionDialogFragment.onBetClick;
        if (function2 != null) {
            function2.invoke(Long.valueOf(j), Integer.valueOf(i));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(TourBetSelectionDialogFragment tourBetSelectionDialogFragment) {
        Function0 function0;
        function0 = tourBetSelectionDialogFragment.onDismiss;
        if (function0 != null) {
            function0.invoke();
        }
        tourBetSelectionDialogFragment.dismiss();
        return Unit.INSTANCE;
    }
}
