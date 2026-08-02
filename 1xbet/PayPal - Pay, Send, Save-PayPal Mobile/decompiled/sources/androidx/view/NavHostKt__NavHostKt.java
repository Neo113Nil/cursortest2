package androidx.view;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u001aD\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001ak\u0010\n\u001a\u00020\t*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\f2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f2\u001d\b\u0002\u0010\b\u001a\u0017\u0012\u0004\u0012\u00020\u000e\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u000f¢\u0006\u0002\b\u00100\r2\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0012\u001ag\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00132\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f2\u001d\b\u0002\u0010\b\u001a\u0017\u0012\u0004\u0012\u00020\u000e\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u000f¢\u0006\u0002\b\u00100\r2\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/navigation/NavHost;", "", "p0", "p1", "Lkotlin/Function1;", "Landroidx/navigation/NavGraphBuilder;", "", "Lkotlin/ExtensionFunctionType;", "p2", "Landroidx/navigation/NavGraph;", "createGraph", "(Landroidx/navigation/NavHost;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Landroidx/navigation/NavGraph;", "Lkotlin/reflect/KClass;", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "p3", "(Landroidx/navigation/NavHost;Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Landroidx/navigation/NavGraph;", "", "(Landroidx/navigation/NavHost;Ljava/lang/Object;Lkotlin/reflect/KClass;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Landroidx/navigation/NavGraph;"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/navigation/NavHostKt")
/* loaded from: classes.dex */
final /* synthetic */ class NavHostKt__NavHostKt {
    public static /* synthetic */ androidx.view.NavGraph createGraph$default(androidx.view.NavHost navHost, java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navHost, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.view.NavGraphBuilder navGraphBuilder = new androidx.view.NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), str, str2);
        function1.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static final androidx.view.NavGraph createGraph(androidx.view.NavHost navHost, java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function1<? super androidx.view.NavGraphBuilder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navHost, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.view.NavGraphBuilder navGraphBuilder = new androidx.view.NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), str, str2);
        function1.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ androidx.view.NavGraph createGraph$default(androidx.view.NavHost navHost, kotlin.reflect.KClass kClass, kotlin.reflect.KClass kClass2, java.util.Map map, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            kClass2 = null;
        }
        if ((i & 4) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navHost, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.view.NavGraphBuilder navGraphBuilder = new androidx.view.NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), (kotlin.reflect.KClass<?>) kClass, (kotlin.reflect.KClass<?>) kClass2, (java.util.Map<kotlin.reflect.KType, androidx.view.NavType<?>>) map);
        function1.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static final androidx.view.NavGraph createGraph(androidx.view.NavHost navHost, kotlin.reflect.KClass<?> kClass, kotlin.reflect.KClass<?> kClass2, java.util.Map<kotlin.reflect.KType, androidx.view.NavType<?>> map, kotlin.jvm.functions.Function1<? super androidx.view.NavGraphBuilder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navHost, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.view.NavGraphBuilder navGraphBuilder = new androidx.view.NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), kClass, kClass2, map);
        function1.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ androidx.view.NavGraph createGraph$default(androidx.view.NavHost navHost, java.lang.Object obj, kotlin.reflect.KClass kClass, java.util.Map map, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            kClass = null;
        }
        if ((i & 4) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navHost, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.view.NavGraphBuilder navGraphBuilder = new androidx.view.NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), obj, (kotlin.reflect.KClass<?>) kClass, (java.util.Map<kotlin.reflect.KType, androidx.view.NavType<?>>) map);
        function1.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static final androidx.view.NavGraph createGraph(androidx.view.NavHost navHost, java.lang.Object obj, kotlin.reflect.KClass<?> kClass, java.util.Map<kotlin.reflect.KType, androidx.view.NavType<?>> map, kotlin.jvm.functions.Function1<? super androidx.view.NavGraphBuilder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navHost, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.view.NavGraphBuilder navGraphBuilder = new androidx.view.NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), obj, kClass, map);
        function1.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }
}
