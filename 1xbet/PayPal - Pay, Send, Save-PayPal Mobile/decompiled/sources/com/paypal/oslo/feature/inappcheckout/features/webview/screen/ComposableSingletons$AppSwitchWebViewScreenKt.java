package com.paypal.oslo.feature.inappcheckout.features.webview.screen;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComposableSingletons$AppSwitchWebViewScreenKt {
    public static final com.paypal.oslo.feature.inappcheckout.features.webview.screen.ComposableSingletons$AppSwitchWebViewScreenKt INSTANCE = new com.paypal.oslo.feature.inappcheckout.features.webview.screen.ComposableSingletons$AppSwitchWebViewScreenKt();
    private static kotlin.jvm.functions.Function5<com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2084744297, false, new kotlin.jvm.functions.Function5() { // from class: com.paypal.oslo.feature.inappcheckout.features.webview.screen.ComposableSingletons$AppSwitchWebViewScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function5
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
            return com.paypal.oslo.feature.inappcheckout.features.webview.screen.ComposableSingletons$AppSwitchWebViewScreenKt.m15450$r8$lambda$vIQRr7kOl9YC2ZijX8XDr5jro((com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration) obj, (kotlin.jvm.functions.Function0) obj2, (androidx.compose.ui.Modifier) obj3, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
        }
    });

    /* renamed from: $r8$lambda$vIQRr7kOl9YC2ZijX8XD-r5-jro, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15450$r8$lambda$vIQRr7kOl9YC2ZijX8XDr5jro(com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
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
                androidx.compose.runtime.ComposerKt.traceEventStart(2084744297, i2, -1, "com.paypal.oslo.feature.inappcheckout.features.webview.screen.ComposableSingletons$AppSwitchWebViewScreenKt.lambda$2084744297.<anonymous> (AppSwitchWebViewScreen.kt:119)");
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

    public final kotlin.jvm.functions.Function5<com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$2084744297$inappcheckout_prodRelease() {
        return getHighSpeedVideoSizes;
    }
}
