package org.betup.ui.fragment.flashbet;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: FlashBetLeaveConfirmDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FlashBetLeaveConfirmDialogFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ FlashBetLeaveConfirmDialogFragment this$0;

    FlashBetLeaveConfirmDialogFragment$onCreateView$1$1(FlashBetLeaveConfirmDialogFragment flashBetLeaveConfirmDialogFragment) {
        this.this$0 = flashBetLeaveConfirmDialogFragment;
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
            ComposerKt.traceEventStart(-1874474107, i, -1, "org.betup.ui.fragment.flashbet.FlashBetLeaveConfirmDialogFragment.onCreateView.<anonymous>.<anonymous> (FlashBetLeaveConfirmDialogFragment.kt:62)");
        }
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final FlashBetLeaveConfirmDialogFragment flashBetLeaveConfirmDialogFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.flashbet.FlashBetLeaveConfirmDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = FlashBetLeaveConfirmDialogFragment$onCreateView$1$1.invoke$lambda$1$lambda$0(FlashBetLeaveConfirmDialogFragment.this);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final FlashBetLeaveConfirmDialogFragment flashBetLeaveConfirmDialogFragment2 = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.flashbet.FlashBetLeaveConfirmDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = FlashBetLeaveConfirmDialogFragment$onCreateView$1$1.invoke$lambda$3$lambda$2(FlashBetLeaveConfirmDialogFragment.this);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        Function0 function02 = (Function0) rememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance3 = composer.changedInstance(this.this$0);
        final FlashBetLeaveConfirmDialogFragment flashBetLeaveConfirmDialogFragment3 = this.this$0;
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.flashbet.FlashBetLeaveConfirmDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$5$lambda$4;
                    invoke$lambda$5$lambda$4 = FlashBetLeaveConfirmDialogFragment$onCreateView$1$1.invoke$lambda$5$lambda$4(FlashBetLeaveConfirmDialogFragment.this);
                    return invoke$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        FlashBetLeaveConfirmDialogFragmentKt.FlashBetLeaveConfirmContent(function0, function02, (Function0) rememberedValue3, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(FlashBetLeaveConfirmDialogFragment flashBetLeaveConfirmDialogFragment) {
        flashBetLeaveConfirmDialogFragment.dismissSafely();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(FlashBetLeaveConfirmDialogFragment flashBetLeaveConfirmDialogFragment) {
        flashBetLeaveConfirmDialogFragment.dismissSafely();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(FlashBetLeaveConfirmDialogFragment flashBetLeaveConfirmDialogFragment) {
        flashBetLeaveConfirmDialogFragment.notifyServerSessionLeft();
        FragmentActivity activity = flashBetLeaveConfirmDialogFragment.getActivity();
        flashBetLeaveConfirmDialogFragment.dismissSafely();
        FlashBetFragmentNavigation.INSTANCE.popFlashBetGameScreen(activity);
        return Unit.INSTANCE;
    }
}
