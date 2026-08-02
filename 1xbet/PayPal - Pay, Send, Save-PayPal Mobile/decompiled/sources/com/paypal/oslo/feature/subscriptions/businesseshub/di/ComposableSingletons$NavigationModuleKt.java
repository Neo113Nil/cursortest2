package com.paypal.oslo.feature.subscriptions.businesseshub.di;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ComposableSingletons$NavigationModuleKt {
    public static final com.paypal.oslo.feature.subscriptions.businesseshub.di.ComposableSingletons$NavigationModuleKt INSTANCE = new com.paypal.oslo.feature.subscriptions.businesseshub.di.ComposableSingletons$NavigationModuleKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1092753523, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.di.ComposableSingletons$NavigationModuleKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.subscriptions.businesseshub.di.ComposableSingletons$NavigationModuleKt.$r8$lambda$7wYDgfiRLqFRlBwqEPOLw_aEo7M((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$7wYDgfiRLqFRlBwqEPOLw_aEo7M(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1092753523, i, -1, "com.paypal.oslo.feature.subscriptions.businesseshub.di.ComposableSingletons$NavigationModuleKt.lambda$1092753523.<anonymous> (NavigationModule.kt:85)");
            }
            com.paypal.oslo.feature.subscriptions.businesseshub.ui.AboutBusinessesModalKt.AboutBusinessesModal(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), composer, 6, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1092753523$subscriptions_prodRelease() {
        return getHighSpeedVideoFpsRanges;
    }
}
