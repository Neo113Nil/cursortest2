package com.paypal.oslo.app.navigation.di;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ComposableSingletons$DemoModuleKt {
    public static final com.paypal.oslo.app.navigation.di.ComposableSingletons$DemoModuleKt INSTANCE = new com.paypal.oslo.app.navigation.di.ComposableSingletons$DemoModuleKt();
    private static kotlin.jvm.functions.Function3<com.paypal.oslo.core.navigation.DemoL2Destination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-830716186, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.app.navigation.di.ComposableSingletons$DemoModuleKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.app.navigation.di.ComposableSingletons$DemoModuleKt.$r8$lambda$5wsGRSkKoHkoy8IV09x5tBP6mwY((com.paypal.oslo.core.navigation.DemoL2Destination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$5wsGRSkKoHkoy8IV09x5tBP6mwY(com.paypal.oslo.core.navigation.DemoL2Destination demoL2Destination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(demoL2Destination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-830716186, i, -1, "com.paypal.oslo.app.navigation.di.ComposableSingletons$DemoModuleKt.lambda$-830716186.<anonymous> (DemoModule.kt:76)");
            }
            com.paypal.oslo.app.navigation.DemoScreensKt.DemoL2(composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-830716186$app_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function3<com.paypal.oslo.core.navigation.DemoL2Destination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m11076getLambda$830716186$app_prodRelease() {
        return getHighSpeedVideoFpsRanges;
    }
}
