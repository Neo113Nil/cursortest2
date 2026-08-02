package org.betup.ui.fragment.flashbet;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: FlashBetSessionExpiredDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FlashBetSessionExpiredDialogFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ FlashBetSessionExpiredDialogFragment this$0;

    FlashBetSessionExpiredDialogFragment$onCreateView$1$1(FlashBetSessionExpiredDialogFragment flashBetSessionExpiredDialogFragment) {
        this.this$0 = flashBetSessionExpiredDialogFragment;
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
            ComposerKt.traceEventStart(1569395077, i, -1, "org.betup.ui.fragment.flashbet.FlashBetSessionExpiredDialogFragment.onCreateView.<anonymous>.<anonymous> (FlashBetSessionExpiredDialogFragment.kt:40)");
        }
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final FlashBetSessionExpiredDialogFragment flashBetSessionExpiredDialogFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.flashbet.FlashBetSessionExpiredDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = FlashBetSessionExpiredDialogFragment$onCreateView$1$1.invoke$lambda$1$lambda$0(FlashBetSessionExpiredDialogFragment.this);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        FlashBetSessionExpiredDialogFragmentKt.FlashBetSessionExpiredContent((Function0) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(FlashBetSessionExpiredDialogFragment flashBetSessionExpiredDialogFragment) {
        if (flashBetSessionExpiredDialogFragment.isAdded()) {
            flashBetSessionExpiredDialogFragment.dismissAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }
}
