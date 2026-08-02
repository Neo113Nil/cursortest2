package com.paypal.oslo.feature.activity.ui.navigation;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ComposableSingletons$ActivityTabbedNavigationImplKt {
    public static final com.paypal.oslo.feature.activity.ui.navigation.ComposableSingletons$ActivityTabbedNavigationImplKt INSTANCE = new com.paypal.oslo.feature.activity.ui.navigation.ComposableSingletons$ActivityTabbedNavigationImplKt();
    private static kotlin.jvm.functions.Function3<com.paypal.oslo.core.navigation.AppNavigator, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(101772719, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.activity.ui.navigation.ComposableSingletons$ActivityTabbedNavigationImplKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.activity.ui.navigation.ComposableSingletons$ActivityTabbedNavigationImplKt.$r8$lambda$pghFmeaZIELyIAe72zDQXXM93SI((com.paypal.oslo.core.navigation.AppNavigator) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$pghFmeaZIELyIAe72zDQXXM93SI(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(101772719, i, -1, "com.paypal.oslo.feature.activity.ui.navigation.ComposableSingletons$ActivityTabbedNavigationImplKt.lambda$101772719.<anonymous> (ActivityTabbedNavigationImpl.kt:37)");
            }
            com.paypal.oslo.feature.activity.ui.navigation.ActivityTabRendererKt.SetActivityTabContent(null, composer, 0, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function3<com.paypal.oslo.core.navigation.AppNavigator, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$101772719$activity_prodRelease() {
        return Camera2StreamConfigurationMap;
    }
}
