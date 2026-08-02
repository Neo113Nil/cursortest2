package com.paypal.oslo.feature.businesshome.di;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$NavigationModuleKt {
    public static final com.paypal.oslo.feature.businesshome.di.ComposableSingletons$NavigationModuleKt INSTANCE = new com.paypal.oslo.feature.businesshome.di.ComposableSingletons$NavigationModuleKt();
    private static kotlin.jvm.functions.Function3<com.paypal.oslo.feature.businesshome.di.navigation.BusinessExperienceDisabledDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(392440904, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesshome.di.ComposableSingletons$NavigationModuleKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.businesshome.di.ComposableSingletons$NavigationModuleKt.$r8$lambda$kp5DQ6yT7j0jJpCKOlmWDDg2qCc((com.paypal.oslo.feature.businesshome.di.navigation.BusinessExperienceDisabledDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$kp5DQ6yT7j0jJpCKOlmWDDg2qCc(com.paypal.oslo.feature.businesshome.di.navigation.BusinessExperienceDisabledDestination businessExperienceDisabledDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessExperienceDisabledDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(392440904, i, -1, "com.paypal.oslo.feature.businesshome.di.ComposableSingletons$NavigationModuleKt.lambda$392440904.<anonymous> (NavigationModule.kt:255)");
            }
            com.paypal.oslo.feature.businesshome.ui.businessexperiencedisabled.BusinessExperienceDisabledScreenKt.BusinessExperienceDisabledScreen(null, composer, 0, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function3<com.paypal.oslo.feature.businesshome.di.navigation.BusinessExperienceDisabledDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$392440904$business_home_prodRelease() {
        return Camera2StreamConfigurationMap;
    }
}
