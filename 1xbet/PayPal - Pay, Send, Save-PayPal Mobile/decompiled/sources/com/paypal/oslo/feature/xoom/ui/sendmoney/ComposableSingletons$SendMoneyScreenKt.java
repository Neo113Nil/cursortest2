package com.paypal.oslo.feature.xoom.ui.sendmoney;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ComposableSingletons$SendMoneyScreenKt {
    public static final com.paypal.oslo.feature.xoom.ui.sendmoney.ComposableSingletons$SendMoneyScreenKt INSTANCE = new com.paypal.oslo.feature.xoom.ui.sendmoney.ComposableSingletons$SendMoneyScreenKt();
    private static kotlin.jvm.functions.Function9<com.paypal.oslo.core.navigation.AppNavigator, java.lang.String, java.util.Map<java.lang.String, java.lang.String>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-845255979, false, new kotlin.jvm.functions.Function9() { // from class: com.paypal.oslo.feature.xoom.ui.sendmoney.ComposableSingletons$SendMoneyScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function9
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9) {
            return com.paypal.oslo.feature.xoom.ui.sendmoney.ComposableSingletons$SendMoneyScreenKt.$r8$lambda$pwUfuyk3Mu6AkwszEvK0cEjaPmA((com.paypal.oslo.core.navigation.AppNavigator) obj, (java.lang.String) obj2, (java.util.Map) obj3, (kotlin.jvm.functions.Function0) obj4, (kotlin.jvm.functions.Function1) obj5, (kotlin.jvm.functions.Function1) obj6, (androidx.compose.ui.Modifier) obj7, (androidx.compose.runtime.Composer) obj8, ((java.lang.Integer) obj9).intValue());
        }
    });
    private static kotlin.jvm.functions.Function5<com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-720431890, false, new kotlin.jvm.functions.Function5() { // from class: com.paypal.oslo.feature.xoom.ui.sendmoney.ComposableSingletons$SendMoneyScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function5
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
            return com.paypal.oslo.feature.xoom.ui.sendmoney.ComposableSingletons$SendMoneyScreenKt.$r8$lambda$_WW_6_P9NQsJLgCrYlwiYek9ocA((com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration) obj, (kotlin.jvm.functions.Function0) obj2, (androidx.compose.ui.Modifier) obj3, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$_WW_6_P9NQsJLgCrYlwiYek9ocA(com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
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
                androidx.compose.runtime.ComposerKt.traceEventStart(-720431890, i2, -1, "com.paypal.oslo.feature.xoom.ui.sendmoney.ComposableSingletons$SendMoneyScreenKt.lambda$-720431890.<anonymous> (SendMoneyScreen.kt:285)");
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$pwUfuyk3Mu6AkwszEvK0cEjaPmA(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.util.Map map, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-845255979, i, -1, "com.paypal.oslo.feature.xoom.ui.sendmoney.ComposableSingletons$SendMoneyScreenKt.lambda$-845255979.<anonymous> (SendMoneyScreen.kt:214)");
        }
        com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt.SendMoneySecureWebView(appNavigator, str, map, function0, function1, function12, modifier, null, composer, i & 4194302, 128);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-845255979$xoom_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function9<com.paypal.oslo.core.navigation.AppNavigator, java.lang.String, java.util.Map<java.lang.String, java.lang.String>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m21539getLambda$845255979$xoom_prodRelease() {
        return getHighSpeedVideoSizes;
    }

    /* renamed from: getLambda$-720431890$xoom_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function5<com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m21538getLambda$720431890$xoom_prodRelease() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
