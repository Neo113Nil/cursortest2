package androidx.view;

@kotlin.Metadata(d1 = {"androidx/navigation/NavGraphBuilderKt__NavGraphBuilderKt", "androidx/navigation/NavGraphBuilderKt__NavGraphBuilder_androidKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavGraphBuilderKt {
    @kotlin.Deprecated(message = "Use routes to build your NavGraph instead", replaceWith = @kotlin.ReplaceWith(expression = "navigation(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    public static final androidx.view.NavGraph navigation(androidx.view.NavigatorProvider navigatorProvider, int i, int i2, kotlin.jvm.functions.Function1<? super androidx.view.NavGraphBuilder, kotlin.Unit> function1) {
        return androidx.view.NavGraphBuilderKt__NavGraphBuilder_androidKt.navigation(navigatorProvider, i, i2, function1);
    }

    public static final androidx.view.NavGraph navigation(androidx.view.NavigatorProvider navigatorProvider, java.lang.Object obj, kotlin.reflect.KClass<?> kClass, java.util.Map<kotlin.reflect.KType, androidx.view.NavType<?>> map, kotlin.jvm.functions.Function1<? super androidx.view.NavGraphBuilder, kotlin.Unit> function1) {
        return androidx.view.NavGraphBuilderKt__NavGraphBuilderKt.navigation(navigatorProvider, obj, kClass, map, function1);
    }

    public static final androidx.view.NavGraph navigation(androidx.view.NavigatorProvider navigatorProvider, java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function1<? super androidx.view.NavGraphBuilder, kotlin.Unit> function1) {
        return androidx.view.NavGraphBuilderKt__NavGraphBuilderKt.navigation(navigatorProvider, str, str2, function1);
    }

    public static final androidx.view.NavGraph navigation(androidx.view.NavigatorProvider navigatorProvider, kotlin.reflect.KClass<?> kClass, kotlin.reflect.KClass<?> kClass2, java.util.Map<kotlin.reflect.KType, androidx.view.NavType<?>> map, kotlin.jvm.functions.Function1<? super androidx.view.NavGraphBuilder, kotlin.Unit> function1) {
        return androidx.view.NavGraphBuilderKt__NavGraphBuilderKt.navigation(navigatorProvider, kClass, kClass2, map, function1);
    }

    @kotlin.Deprecated(message = "Use routes to build your nested NavGraph instead", replaceWith = @kotlin.ReplaceWith(expression = "navigation(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    public static final void navigation(androidx.view.NavGraphBuilder navGraphBuilder, int i, int i2, kotlin.jvm.functions.Function1<? super androidx.view.NavGraphBuilder, kotlin.Unit> function1) {
        androidx.view.NavGraphBuilderKt__NavGraphBuilder_androidKt.navigation(navGraphBuilder, i, i2, function1);
    }

    public static final void navigation(androidx.view.NavGraphBuilder navGraphBuilder, java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function1<? super androidx.view.NavGraphBuilder, kotlin.Unit> function1) {
        androidx.view.NavGraphBuilderKt__NavGraphBuilderKt.navigation(navGraphBuilder, str, str2, function1);
    }

    public static final <T> void navigation(androidx.view.NavGraphBuilder navGraphBuilder, kotlin.reflect.KClass<T> kClass, java.lang.Object obj, java.util.Map<kotlin.reflect.KType, androidx.view.NavType<?>> map, kotlin.jvm.functions.Function1<? super androidx.view.NavGraphBuilder, kotlin.Unit> function1) {
        androidx.view.NavGraphBuilderKt__NavGraphBuilderKt.navigation(navGraphBuilder, kClass, obj, map, function1);
    }

    public static final <T> void navigation(androidx.view.NavGraphBuilder navGraphBuilder, kotlin.reflect.KClass<T> kClass, kotlin.reflect.KClass<?> kClass2, java.util.Map<kotlin.reflect.KType, androidx.view.NavType<?>> map, kotlin.jvm.functions.Function1<? super androidx.view.NavGraphBuilder, kotlin.Unit> function1) {
        androidx.view.NavGraphBuilderKt__NavGraphBuilderKt.navigation(navGraphBuilder, (kotlin.reflect.KClass) kClass, kClass2, map, function1);
    }
}
