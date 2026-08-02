package com.paypal.oslo.feature.revolvingcreditservicing.di;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposableSingletons$NavigationModuleKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.di.ComposableSingletons$NavigationModuleKt INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.di.ComposableSingletons$NavigationModuleKt();
    private static kotlin.jvm.functions.Function3<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.LearnMoreDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(849250476, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.ComposableSingletons$NavigationModuleKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.revolvingcreditservicing.di.ComposableSingletons$NavigationModuleKt.m18049$r8$lambda$j3BRGLBLR4VAR_I_gD9jULQPBM((com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.LearnMoreDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    /* renamed from: $r8$lambda$j3BRGLBLR4VAR_I_gD9jULQ-PBM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18049$r8$lambda$j3BRGLBLR4VAR_I_gD9jULQPBM(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.LearnMoreDestination learnMoreDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(learnMoreDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(849250476, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.ComposableSingletons$NavigationModuleKt.lambda$849250476.<anonymous> (NavigationModule.kt:572)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.learnmore.LearnMoreScreenKt.LearnMoreScreen(composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function3<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.LearnMoreDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$849250476$revolvingcredit_servicing_prodRelease() {
        return Camera2StreamConfigurationMap;
    }
}
