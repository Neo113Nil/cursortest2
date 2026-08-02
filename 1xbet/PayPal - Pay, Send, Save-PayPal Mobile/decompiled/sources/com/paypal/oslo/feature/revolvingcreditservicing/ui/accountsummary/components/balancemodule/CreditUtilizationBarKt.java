package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "utilization", "", "CreditUtilizationBar", "(FLandroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CreditUtilizationBarKt {
    public static final void CreditUtilizationBar(final float f, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(942889023);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(942889023, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.CreditUtilizationBar (CreditUtilizationBar.kt:20)");
            }
            com.paypal.pds.components.ProgressBarKt.ProgressBar(100.0f, f, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.components.ProgressBarStyle.Info.INSTANCE, 0, 0, 0L, null, startRestartGroup, ((i2 << 3) & 112) | 3462, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.CreditUtilizationBarKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.CreditUtilizationBarKt.m18233$r8$lambda$X_kEFr0tAB1UTNvDh2C4IdZPc(f, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$X_kEFr0t-AB-1UTNvDh2C4IdZPc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18233$r8$lambda$X_kEFr0tAB1UTNvDh2C4IdZPc(float f, int i, androidx.compose.runtime.Composer composer, int i2) {
        CreditUtilizationBar(f, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
