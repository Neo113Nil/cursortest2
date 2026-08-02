package org.betup.ui.dialogs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.betup.ui.dialogs.PurchaseCompletedNewDialogFragment;

/* compiled from: PurchaseCompletedNewDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PurchaseCompletedNewDialogFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ PurchaseCompletedNewDialogFragment this$0;

    PurchaseCompletedNewDialogFragment$onCreateView$1$1(PurchaseCompletedNewDialogFragment purchaseCompletedNewDialogFragment) {
        this.this$0 = purchaseCompletedNewDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        PurchaseCompletedUiModel purchaseCompletedUiModel;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-933227495, i, -1, "org.betup.ui.dialogs.PurchaseCompletedNewDialogFragment.onCreateView.<anonymous>.<anonymous> (PurchaseCompletedNewDialogFragment.kt:74)");
        }
        purchaseCompletedUiModel = this.this$0.model;
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final PurchaseCompletedNewDialogFragment purchaseCompletedNewDialogFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.PurchaseCompletedNewDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = PurchaseCompletedNewDialogFragment$onCreateView$1$1.invoke$lambda$1$lambda$0(PurchaseCompletedNewDialogFragment.this);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final PurchaseCompletedNewDialogFragment purchaseCompletedNewDialogFragment2 = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.PurchaseCompletedNewDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = PurchaseCompletedNewDialogFragment$onCreateView$1$1.invoke$lambda$3$lambda$2(PurchaseCompletedNewDialogFragment.this);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        PurchaseCompletedNewDialogFragmentKt.PurchaseCompletedContent(purchaseCompletedUiModel, function0, (Function0) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(PurchaseCompletedNewDialogFragment purchaseCompletedNewDialogFragment) {
        PurchaseCompletedNewDialogFragment.OnDismissListener onDismissListener;
        onDismissListener = purchaseCompletedNewDialogFragment.onDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
        purchaseCompletedNewDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(PurchaseCompletedNewDialogFragment purchaseCompletedNewDialogFragment) {
        PurchaseCompletedNewDialogFragment.OnDismissListener onDismissListener;
        onDismissListener = purchaseCompletedNewDialogFragment.onDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
        purchaseCompletedNewDialogFragment.dismiss();
        return Unit.INSTANCE;
    }
}
