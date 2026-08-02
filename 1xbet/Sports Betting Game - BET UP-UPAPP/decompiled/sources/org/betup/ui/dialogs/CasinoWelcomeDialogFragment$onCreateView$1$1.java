package org.betup.ui.dialogs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.betup.ui.dialogs.compose.CasinoWelcomeDialogScreenKt;

/* compiled from: CasinoWelcomeDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CasinoWelcomeDialogFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ CasinoWelcomeDialogFragment this$0;

    CasinoWelcomeDialogFragment$onCreateView$1$1(CasinoWelcomeDialogFragment casinoWelcomeDialogFragment) {
        this.this$0 = casinoWelcomeDialogFragment;
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
            ComposerKt.traceEventStart(-542077235, i, -1, "org.betup.ui.dialogs.CasinoWelcomeDialogFragment.onCreateView.<anonymous>.<anonymous> (CasinoWelcomeDialogFragment.kt:38)");
        }
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final CasinoWelcomeDialogFragment casinoWelcomeDialogFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.CasinoWelcomeDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = CasinoWelcomeDialogFragment$onCreateView$1$1.invoke$lambda$1$lambda$0(CasinoWelcomeDialogFragment.this);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final CasinoWelcomeDialogFragment casinoWelcomeDialogFragment2 = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.CasinoWelcomeDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = CasinoWelcomeDialogFragment$onCreateView$1$1.invoke$lambda$3$lambda$2(CasinoWelcomeDialogFragment.this);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        CasinoWelcomeDialogScreenKt.CasinoWelcomeDialogScreen(function0, (Function0) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(CasinoWelcomeDialogFragment casinoWelcomeDialogFragment) {
        casinoWelcomeDialogFragment.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(CasinoWelcomeDialogFragment casinoWelcomeDialogFragment) {
        casinoWelcomeDialogFragment.accepted = true;
        casinoWelcomeDialogFragment.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }
}
