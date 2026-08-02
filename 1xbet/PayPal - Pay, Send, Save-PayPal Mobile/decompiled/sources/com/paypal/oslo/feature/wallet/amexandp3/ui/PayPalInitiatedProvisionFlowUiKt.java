package com.paypal.oslo.feature.wallet.amexandp3.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest$PayPalInitiated;", "request", "", "PayPalInitiatedProvisionFlowUi", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest$PayPalInitiated;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayPalInitiatedProvisionFlowUiKt {
    public static final void PayPalInitiatedProvisionFlowUi(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PayPalInitiated payPalInitiated, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalInitiated, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-932765461);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(payPalInitiated) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-932765461, i2, -1, "com.paypal.oslo.feature.wallet.amexandp3.ui.PayPalInitiatedProvisionFlowUi (PayPalInitiatedProvisionFlowUi.kt:33)");
            }
            java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
            com.paypal.oslo.core.navigation.result.NavResultRequestId m11587boximpl = com.paypal.oslo.core.navigation.result.NavResultRequestId.m11587boximpl(rememberNavResultRequestId);
            boolean z = (i2 & 14) == 4;
            boolean changedInstance = startRestartGroup.changedInstance(payPalInitiated);
            boolean changed = startRestartGroup.changed(rememberNavResultRequestId);
            com.paypal.oslo.feature.wallet.amexandp3.ui.PayPalInitiatedProvisionFlowUiKt$PayPalInitiatedProvisionFlowUi$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.wallet.amexandp3.ui.PayPalInitiatedProvisionFlowUiKt$PayPalInitiatedProvisionFlowUi$1$1(appNavigator, payPalInitiated, rememberNavResultRequestId, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(m11587boximpl, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.amexandp3.ui.PayPalInitiatedProvisionFlowUiKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.amexandp3.ui.PayPalInitiatedProvisionFlowUiKt.$r8$lambda$P2oMxlGSYDz7AAct0uznECFUJ4o(com.paypal.oslo.core.navigation.AppNavigator.this, payPalInitiated, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$P2oMxlGSYDz7AAct0uznECFUJ4o(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PayPalInitiated payPalInitiated, int i, androidx.compose.runtime.Composer composer, int i2) {
        PayPalInitiatedProvisionFlowUi(appNavigator, payPalInitiated, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
