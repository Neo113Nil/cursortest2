package androidx.view;

@kotlin.Metadata(d1 = {"androidx/navigation/NavHostKt__NavHostKt", "androidx/navigation/NavHostKt__NavHost_androidKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavHostKt {
    @kotlin.Deprecated(message = "Use routes to create your NavGraph instead", replaceWith = @kotlin.ReplaceWith(expression = "createGraph(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    public static final androidx.view.NavGraph createGraph(androidx.view.NavHost navHost, int i, int i2, kotlin.jvm.functions.Function1<? super androidx.view.NavGraphBuilder, kotlin.Unit> function1) {
        return androidx.view.NavHostKt__NavHost_androidKt.createGraph(navHost, i, i2, function1);
    }

    public static final androidx.view.NavGraph createGraph(androidx.view.NavHost navHost, java.lang.Object obj, kotlin.reflect.KClass<?> kClass, java.util.Map<kotlin.reflect.KType, androidx.view.NavType<?>> map, kotlin.jvm.functions.Function1<? super androidx.view.NavGraphBuilder, kotlin.Unit> function1) {
        return androidx.view.NavHostKt__NavHostKt.createGraph(navHost, obj, kClass, map, function1);
    }

    public static final androidx.view.NavGraph createGraph(androidx.view.NavHost navHost, java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function1<? super androidx.view.NavGraphBuilder, kotlin.Unit> function1) {
        return androidx.view.NavHostKt__NavHostKt.createGraph(navHost, str, str2, function1);
    }

    public static final androidx.view.NavGraph createGraph(androidx.view.NavHost navHost, kotlin.reflect.KClass<?> kClass, kotlin.reflect.KClass<?> kClass2, java.util.Map<kotlin.reflect.KType, androidx.view.NavType<?>> map, kotlin.jvm.functions.Function1<? super androidx.view.NavGraphBuilder, kotlin.Unit> function1) {
        return androidx.view.NavHostKt__NavHostKt.createGraph(navHost, kClass, kClass2, map, function1);
    }
}
