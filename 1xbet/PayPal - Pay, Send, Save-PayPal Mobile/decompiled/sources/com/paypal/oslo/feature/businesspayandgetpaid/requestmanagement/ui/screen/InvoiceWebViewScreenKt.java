package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/screen/InvoiceWebViewUrl;", "url", "Lkotlin/Function0;", "", "onBackClick", "InvoiceWebViewScreen", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/screen/InvoiceWebViewUrl;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "buildInvoiceWebViewConfig", "(Ljava/lang/String;)Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "string", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/screen/InvoiceWebViewUrl;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InvoiceWebViewScreenKt {
    public static final void InvoiceWebViewScreen(final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.InvoiceWebViewUrl invoiceWebViewUrl, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceWebViewUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(109704207);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(invoiceWebViewUrl) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(109704207, i2, -1, "com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.InvoiceWebViewScreen (InvoiceWebViewScreen.kt:28)");
            }
            int i3 = i2 & 14;
            java.lang.String string = string(invoiceWebViewUrl, startRestartGroup, i3);
            boolean z = i3 == 4;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = buildInvoiceWebViewConfig(string);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.core.webview.ui.compose.SecureWebViewKt.SecureWebView((com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration) rememberedValue, function0, null, null, startRestartGroup, com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable | (i2 & 112), 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.InvoiceWebViewScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.InvoiceWebViewScreenKt.$r8$lambda$D5rXA2h0Gp80Cqi73jC0zGVkLJs(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.InvoiceWebViewUrl.this, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration buildInvoiceWebViewConfig(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration(new com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url(str, "invoice-details-webview", true, false, null, 16, null), null, null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewUiConfig(null, null, true, true, false, 19, null), new com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings(null, true, 1, null), null, null, 102, null);
    }

    public static final java.lang.String string(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.InvoiceWebViewUrl invoiceWebViewUrl, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceWebViewUrl, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-746025325, i, -1, "com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.string (InvoiceWebViewScreen.kt:54)");
        }
        if (invoiceWebViewUrl instanceof com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.InvoiceWebViewUrl.EditInvoiceUrl) {
            composer.startReplaceGroup(329204843);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_invoice_edit_url, new java.lang.Object[]{invoiceWebViewUrl.getInvoiceId()}, composer, 0);
            composer.endReplaceGroup();
        } else if (invoiceWebViewUrl instanceof com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.InvoiceWebViewUrl.CopyInvoiceUrl) {
            composer.startReplaceGroup(329210219);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_invoice_copy_url, new java.lang.Object[]{invoiceWebViewUrl.getInvoiceId()}, composer, 0);
            composer.endReplaceGroup();
        } else if (invoiceWebViewUrl instanceof com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.InvoiceWebViewUrl.InvoiceDetailsUrl) {
            composer.startReplaceGroup(329215686);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_invoice_url, new java.lang.Object[]{invoiceWebViewUrl.getInvoiceId()}, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(329203292);
            composer.endReplaceGroup();
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$D5rXA2h0Gp80Cqi73jC0zGVkLJs(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen.InvoiceWebViewUrl invoiceWebViewUrl, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        InvoiceWebViewScreen(invoiceWebViewUrl, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
