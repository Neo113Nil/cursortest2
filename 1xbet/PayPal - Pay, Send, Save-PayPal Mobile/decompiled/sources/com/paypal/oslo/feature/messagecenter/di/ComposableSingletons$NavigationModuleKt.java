package com.paypal.oslo.feature.messagecenter.di;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComposableSingletons$NavigationModuleKt {
    public static final com.paypal.oslo.feature.messagecenter.di.ComposableSingletons$NavigationModuleKt INSTANCE = new com.paypal.oslo.feature.messagecenter.di.ComposableSingletons$NavigationModuleKt();
    private static kotlin.jvm.functions.Function3<com.paypal.oslo.feature.messagecenter.api.navigation.MessageCenterHome, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1552605633, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.messagecenter.di.ComposableSingletons$NavigationModuleKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.messagecenter.di.ComposableSingletons$NavigationModuleKt.m15601$r8$lambda$4WacziWdxGzENSwgJwd6Osghps((com.paypal.oslo.feature.messagecenter.api.navigation.MessageCenterHome) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    /* renamed from: $r8$lambda$4WacziWdxGzENSwgJwd6-Osghps, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15601$r8$lambda$4WacziWdxGzENSwgJwd6Osghps(com.paypal.oslo.feature.messagecenter.api.navigation.MessageCenterHome messageCenterHome, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageCenterHome, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1552605633, i, -1, "com.paypal.oslo.feature.messagecenter.di.ComposableSingletons$NavigationModuleKt.lambda$-1552605633.<anonymous> (NavigationModule.kt:33)");
        }
        com.paypal.oslo.feature.messagecenter.ui.screens.MessageCenterHomeScreenKt.MessageCenterHomeScreen(composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-1552605633$message_center_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function3<com.paypal.oslo.feature.messagecenter.api.navigation.MessageCenterHome, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m15602getLambda$1552605633$message_center_prodRelease() {
        return Camera2StreamConfigurationMap;
    }
}
