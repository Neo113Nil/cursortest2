package androidx.view;

@kotlin.Metadata(d1 = {"androidx/navigation/NavControllerKt__NavControllerKt", "androidx/navigation/NavControllerKt__NavController_androidKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavControllerKt {
    public static final androidx.view.NavDeepLinkRequest NavDeepLinkRequest(android.content.Intent intent) {
        return androidx.view.NavControllerKt__NavController_androidKt.NavDeepLinkRequest(intent);
    }

    @kotlin.Deprecated(message = "Use routes to create your NavGraph instead", replaceWith = @kotlin.ReplaceWith(expression = "createGraph(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    public static final androidx.view.NavGraph createGraph(androidx.view.NavController navController, int i, int i2, kotlin.jvm.functions.Function1<? super androidx.view.NavGraphBuilder, kotlin.Unit> function1) {
        return androidx.view.NavControllerKt__NavController_androidKt.createGraph(navController, i, i2, function1);
    }

    public static final androidx.view.NavGraph createGraph(androidx.view.NavController navController, java.lang.Object obj, kotlin.reflect.KClass<?> kClass, java.util.Map<kotlin.reflect.KType, androidx.view.NavType<?>> map, kotlin.jvm.functions.Function1<? super androidx.view.NavGraphBuilder, kotlin.Unit> function1) {
        return androidx.view.NavControllerKt__NavControllerKt.createGraph(navController, obj, kClass, map, function1);
    }

    public static final androidx.view.NavGraph createGraph(androidx.view.NavController navController, java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function1<? super androidx.view.NavGraphBuilder, kotlin.Unit> function1) {
        return androidx.view.NavControllerKt__NavControllerKt.createGraph(navController, str, str2, function1);
    }

    public static final androidx.view.NavGraph createGraph(androidx.view.NavController navController, kotlin.reflect.KClass<?> kClass, kotlin.reflect.KClass<?> kClass2, java.util.Map<kotlin.reflect.KType, androidx.view.NavType<?>> map, kotlin.jvm.functions.Function1<? super androidx.view.NavGraphBuilder, kotlin.Unit> function1) {
        return androidx.view.NavControllerKt__NavControllerKt.createGraph(navController, kClass, kClass2, map, function1);
    }
}
