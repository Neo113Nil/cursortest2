package com.paypal.oslo.feature.identity.challenges.stepupwebview.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$StepupWebViewContentKt {
    public static final com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.ComposableSingletons$StepupWebViewContentKt INSTANCE = new com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.ComposableSingletons$StepupWebViewContentKt();
    private static kotlin.jvm.functions.Function4<com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1728923277, false, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.ComposableSingletons$StepupWebViewContentKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function4
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
            return com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.ComposableSingletons$StepupWebViewContentKt.m15104$r8$lambda$RWHVUA7ArsNDJJafvW_pGJ18EY((com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration) obj, (kotlin.jvm.functions.Function0) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
        }
    });

    /* renamed from: $r8$lambda$RWHVUA7Ar-sNDJJafvW_pGJ18EY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15104$r8$lambda$RWHVUA7ArsNDJJafvW_pGJ18EY(com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composer.changed(secureWebViewConfiguration) : composer.changedInstance(secureWebViewConfiguration) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composer.changedInstance(function0) ? 32 : 16;
        }
        if (composer.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1728923277, i2, -1, "com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.ComposableSingletons$StepupWebViewContentKt.lambda$-1728923277.<anonymous> (StepupWebViewContent.kt:53)");
            }
            com.paypal.oslo.core.webview.ui.compose.SecureWebViewKt.SecureWebView(secureWebViewConfiguration, function0, null, null, composer, com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable | (i2 & 14) | (i2 & 112), 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-1728923277$identity_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function4<com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m15105getLambda$1728923277$identity_prodRelease() {
        return getHighSpeedVideoSizes;
    }
}
