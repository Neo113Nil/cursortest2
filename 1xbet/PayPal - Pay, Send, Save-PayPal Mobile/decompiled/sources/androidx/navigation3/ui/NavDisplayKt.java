package androidx.navigation3.ui;

@kotlin.Metadata(d1 = {"androidx/navigation3/ui/NavDisplayKt__NavDisplayKt", "androidx/navigation3/ui/NavDisplayKt__NavDisplay_androidKt"}, k = 4, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavDisplayKt {
    public static final int DEFAULT_TRANSITION_DURATION_MILLISECOND = 700;

    public static final <T> void NavDisplay(androidx.navigation3.scene.SceneState<T> sceneState, androidx.view.compose.NavigationEventState<androidx.navigation3.scene.SceneInfo<T>> navigationEventState, androidx.compose.ui.Modifier modifier, androidx.compose.ui.Alignment alignment, androidx.compose.animation.SizeTransform sizeTransform, kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function1, kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function12, kotlin.jvm.functions.Function2<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, ? super java.lang.Integer, androidx.compose.animation.ContentTransform> function2, androidx.compose.runtime.Composer composer, int i, int i2) {
        androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.NavDisplay(sceneState, navigationEventState, modifier, alignment, sizeTransform, function1, function12, function2, composer, i, i2);
    }

    public static final <T> void NavDisplay(java.util.List<androidx.navigation3.runtime.NavEntry<T>> list, androidx.compose.ui.Modifier modifier, androidx.compose.ui.Alignment alignment, java.util.List<? extends androidx.navigation3.scene.SceneStrategy<T>> list2, java.util.List<? extends androidx.navigation3.scene.SceneDecoratorStrategy<T>> list3, androidx.compose.animation.SharedTransitionScope sharedTransitionScope, androidx.compose.animation.SizeTransform sizeTransform, kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function1, kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function12, kotlin.jvm.functions.Function2<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, ? super java.lang.Integer, androidx.compose.animation.ContentTransform> function2, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, int i, int i2, int i3) {
        androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.NavDisplay(list, modifier, alignment, list2, list3, sharedTransitionScope, sizeTransform, function1, function12, function2, function0, composer, i, i2, i3);
    }

    public static final <T> void NavDisplay(java.util.List<? extends T> list, androidx.compose.ui.Modifier modifier, androidx.compose.ui.Alignment alignment, kotlin.jvm.functions.Function0<kotlin.Unit> function0, java.util.List<? extends androidx.navigation3.runtime.NavEntryDecorator<T>> list2, java.util.List<? extends androidx.navigation3.scene.SceneStrategy<T>> list3, java.util.List<? extends androidx.navigation3.scene.SceneDecoratorStrategy<T>> list4, androidx.compose.animation.SharedTransitionScope sharedTransitionScope, androidx.compose.animation.SizeTransform sizeTransform, kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function1, kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> function12, kotlin.jvm.functions.Function2<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, ? super java.lang.Integer, androidx.compose.animation.ContentTransform> function2, kotlin.jvm.functions.Function1<? super T, androidx.navigation3.runtime.NavEntry<T>> function13, androidx.compose.runtime.Composer composer, int i, int i2, int i3) {
        androidx.navigation3.ui.NavDisplayKt__NavDisplayKt.NavDisplay(list, modifier, alignment, function0, list2, list3, list4, sharedTransitionScope, sizeTransform, function1, function12, function2, function13, composer, i, i2, i3);
    }

    public static final <T> kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> defaultPopTransitionSpec() {
        return androidx.navigation3.ui.NavDisplayKt__NavDisplay_androidKt.defaultPopTransitionSpec();
    }

    public static final <T> kotlin.jvm.functions.Function2<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, java.lang.Integer, androidx.compose.animation.ContentTransform> defaultPredictivePopTransitionSpec() {
        return androidx.navigation3.ui.NavDisplayKt__NavDisplay_androidKt.defaultPredictivePopTransitionSpec();
    }

    public static final <T> kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> defaultTransitionSpec() {
        return androidx.navigation3.ui.NavDisplayKt__NavDisplay_androidKt.defaultTransitionSpec();
    }
}
