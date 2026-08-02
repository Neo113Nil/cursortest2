package org.betup.ui.dialogs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: PurchaseUnlockDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PurchaseUnlockDialogFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ PurchaseUnlockDialogFragment this$0;

    PurchaseUnlockDialogFragment$onCreateView$1$1(PurchaseUnlockDialogFragment purchaseUnlockDialogFragment) {
        this.this$0 = purchaseUnlockDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        int i2;
        String str;
        long j;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1162772935, i, -1, "org.betup.ui.dialogs.PurchaseUnlockDialogFragment.onCreateView.<anonymous>.<anonymous> (PurchaseUnlockDialogFragment.kt:75)");
        }
        i2 = this.this$0.titleResId;
        str = this.this$0.whatDesc;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        j = this.this$0.bonus;
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final PurchaseUnlockDialogFragment purchaseUnlockDialogFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.PurchaseUnlockDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = PurchaseUnlockDialogFragment$onCreateView$1$1.invoke$lambda$1$lambda$0(PurchaseUnlockDialogFragment.this);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        PurchaseUnlockDialogFragmentKt.PurchaseUnlockContent(i2, str2, j, (Function0) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(PurchaseUnlockDialogFragment purchaseUnlockDialogFragment) {
        boolean z;
        z = purchaseUnlockDialogFragment.dismissed;
        if (!z) {
            purchaseUnlockDialogFragment.dismissed = true;
            purchaseUnlockDialogFragment.dismiss();
        }
        return Unit.INSTANCE;
    }
}
