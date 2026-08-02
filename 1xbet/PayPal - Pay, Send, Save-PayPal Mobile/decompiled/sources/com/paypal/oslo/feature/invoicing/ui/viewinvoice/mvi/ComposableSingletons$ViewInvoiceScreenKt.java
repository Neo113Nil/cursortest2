package com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComposableSingletons$ViewInvoiceScreenKt {
    public static final com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ComposableSingletons$ViewInvoiceScreenKt INSTANCE = new com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ComposableSingletons$ViewInvoiceScreenKt();
    private static kotlin.jvm.functions.Function5<com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-618514130, false, new kotlin.jvm.functions.Function5() { // from class: com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ComposableSingletons$ViewInvoiceScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function5
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
            return com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ComposableSingletons$ViewInvoiceScreenKt.$r8$lambda$AFcKDmBe6Frv6S431c_BkRRbjaQ((com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration) obj, (kotlin.jvm.functions.Function0) obj2, (androidx.compose.ui.Modifier) obj3, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$AFcKDmBe6Frv6S431c_BkRRbjaQ(com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composer.changed(secureWebViewConfiguration) : composer.changedInstance(secureWebViewConfiguration) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composer.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composer.changed(modifier) ? 256 : 128;
        }
        if (composer.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-618514130, i2, -1, "com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ComposableSingletons$ViewInvoiceScreenKt.lambda$-618514130.<anonymous> (ViewInvoiceScreen.kt:76)");
            }
            com.paypal.oslo.core.webview.ui.compose.SecureWebViewKt.SecureWebView(secureWebViewConfiguration, function0, modifier, null, composer, com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable | (i2 & 14) | (i2 & 112) | (i2 & 896), 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-618514130$invoicing_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function5<com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m15582getLambda$618514130$invoicing_prodRelease() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
