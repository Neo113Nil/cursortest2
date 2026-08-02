package com.paypal.oslo.feature.controlcenter.ui.screens;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$ControlCenterScreenKt {
    public static final com.paypal.oslo.feature.controlcenter.ui.screens.ComposableSingletons$ControlCenterScreenKt INSTANCE = new com.paypal.oslo.feature.controlcenter.ui.screens.ComposableSingletons$ControlCenterScreenKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(234526454, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.controlcenter.ui.screens.ComposableSingletons$ControlCenterScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.controlcenter.ui.screens.ComposableSingletons$ControlCenterScreenKt.$r8$lambda$lM8NpM7HJOdiZRX0yCYuZ4ARG8k((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$lM8NpM7HJOdiZRX0yCYuZ4ARG8k(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(234526454, i, -1, "com.paypal.oslo.feature.controlcenter.ui.screens.ComposableSingletons$ControlCenterScreenKt.lambda$234526454.<anonymous> (ControlCenterScreen.kt:136)");
            }
            com.paypal.oslo.feature.controlcenter.ui.screens.UserProfileSkeletonKt.UserProfileSkeleton(null, composer, 0, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$234526454$control_center_prodRelease() {
        return Camera2StreamConfigurationMap;
    }
}
