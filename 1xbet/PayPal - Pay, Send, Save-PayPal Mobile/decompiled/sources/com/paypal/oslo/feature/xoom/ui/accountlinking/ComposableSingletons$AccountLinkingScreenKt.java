package com.paypal.oslo.feature.xoom.ui.accountlinking;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ComposableSingletons$AccountLinkingScreenKt {
    public static final com.paypal.oslo.feature.xoom.ui.accountlinking.ComposableSingletons$AccountLinkingScreenKt INSTANCE = new com.paypal.oslo.feature.xoom.ui.accountlinking.ComposableSingletons$AccountLinkingScreenKt();
    private static kotlin.jvm.functions.Function8<com.paypal.oslo.core.navigation.AppNavigator, java.lang.String, java.util.Map<java.lang.String, java.lang.String>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2032544309, false, new kotlin.jvm.functions.Function8() { // from class: com.paypal.oslo.feature.xoom.ui.accountlinking.ComposableSingletons$AccountLinkingScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function8
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8) {
            return com.paypal.oslo.feature.xoom.ui.accountlinking.ComposableSingletons$AccountLinkingScreenKt.$r8$lambda$uaRtzSRdZKlNfzgxspAWe0QHHOk((com.paypal.oslo.core.navigation.AppNavigator) obj, (java.lang.String) obj2, (java.util.Map) obj3, (kotlin.jvm.functions.Function0) obj4, (kotlin.jvm.functions.Function1) obj5, (androidx.compose.ui.Modifier) obj6, (androidx.compose.runtime.Composer) obj7, ((java.lang.Integer) obj8).intValue());
        }
    });
    private static kotlin.jvm.functions.Function5<com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1455024724, false, new kotlin.jvm.functions.Function5() { // from class: com.paypal.oslo.feature.xoom.ui.accountlinking.ComposableSingletons$AccountLinkingScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function5
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
            return com.paypal.oslo.feature.xoom.ui.accountlinking.ComposableSingletons$AccountLinkingScreenKt.$r8$lambda$tU8OwLCXuKuZqRkM3txiFpGM4MY((com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration) obj, (kotlin.jvm.functions.Function0) obj2, (androidx.compose.ui.Modifier) obj3, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$tU8OwLCXuKuZqRkM3txiFpGM4MY(com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
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
                androidx.compose.runtime.ComposerKt.traceEventStart(-1455024724, i2, -1, "com.paypal.oslo.feature.xoom.ui.accountlinking.ComposableSingletons$AccountLinkingScreenKt.lambda$-1455024724.<anonymous> (AccountLinkingScreen.kt:190)");
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$uaRtzSRdZKlNfzgxspAWe0QHHOk(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.util.Map map, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2032544309, i, -1, "com.paypal.oslo.feature.xoom.ui.accountlinking.ComposableSingletons$AccountLinkingScreenKt.lambda$2032544309.<anonymous> (AccountLinkingScreen.kt:69)");
        }
        com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingScreenKt.AccountLinkingSecureWebView(appNavigator, str, map, function0, function1, modifier, null, composer, i & 524286, 64);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function8<com.paypal.oslo.core.navigation.AppNavigator, java.lang.String, java.util.Map<java.lang.String, java.lang.String>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$2032544309$xoom_prodRelease() {
        return Camera2StreamConfigurationMap;
    }

    /* renamed from: getLambda$-1455024724$xoom_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function5<com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m21524getLambda$1455024724$xoom_prodRelease() {
        return getHighSpeedVideoSizes;
    }
}
