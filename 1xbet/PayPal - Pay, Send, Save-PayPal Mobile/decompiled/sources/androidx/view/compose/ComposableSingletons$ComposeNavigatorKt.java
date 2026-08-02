package androidx.view.compose;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$ComposeNavigatorKt {
    public static final androidx.view.compose.ComposableSingletons$ComposeNavigatorKt INSTANCE = new androidx.view.compose.ComposableSingletons$ComposeNavigatorKt();
    private static kotlin.jvm.functions.Function4<androidx.compose.animation.AnimatedContentScope, androidx.view.NavBackStackEntry, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(127448943, false, new kotlin.jvm.functions.Function4<androidx.compose.animation.AnimatedContentScope, androidx.view.NavBackStackEntry, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.navigation.compose.ComposableSingletons$ComposeNavigatorKt$lambda$127448943$1
        @Override // kotlin.jvm.functions.Function4
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.AnimatedContentScope animatedContentScope, androidx.view.NavBackStackEntry navBackStackEntry, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            int intValue = num.intValue();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(127448943, intValue, -1, "androidx.navigation.compose.ComposableSingletons$ComposeNavigatorKt.lambda$127448943.<anonymous> (ComposeNavigator.kt:61)");
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            return kotlin.Unit.INSTANCE;
        }
    });

    public final kotlin.jvm.functions.Function4<androidx.compose.animation.AnimatedContentScope, androidx.view.NavBackStackEntry, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$127448943$navigation_compose_release() {
        return getHighSpeedVideoSizes;
    }
}
