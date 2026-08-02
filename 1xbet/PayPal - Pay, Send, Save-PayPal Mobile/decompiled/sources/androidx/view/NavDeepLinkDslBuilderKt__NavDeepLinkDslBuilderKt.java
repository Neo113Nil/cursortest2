package androidx.view;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001aa\u0010\u0006\u001a\u00020\u0005\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\b2\u0006\u0010\u0004\u001a\u00020\n2\u001d\b\u0002\u0010\u000f\u001a\u0017\u0012\u0004\u0012\u00020\f\u0012\r\u0012\u000b\u0012\u0002\b\u00030\r¢\u0006\u0002\b\u000e0\u000b2\u0019\b\n\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0011\u001ae\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\t*\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u000f\u001a\u00020\n2\u001d\b\u0002\u0010\u0010\u001a\u0017\u0012\u0004\u0012\u00020\f\u0012\r\u0012\u000b\u0012\u0002\b\u00030\r¢\u0006\u0002\b\u000e0\u000b2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0004\b\u0006\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/Function1;", "Landroidx/navigation/NavDeepLinkDslBuilder;", "", "Lkotlin/ExtensionFunctionType;", "p0", "Landroidx/navigation/NavDeepLink;", "navDeepLink", "(Lkotlin/jvm/functions/Function1;)Landroidx/navigation/NavDeepLink;", "", "T", "", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "p1", "p2", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Landroidx/navigation/NavDeepLink;", "Lkotlin/reflect/KClass;", "p3", "(Lkotlin/reflect/KClass;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Landroidx/navigation/NavDeepLink;"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/navigation/NavDeepLinkDslBuilderKt")
/* loaded from: classes7.dex */
final /* synthetic */ class NavDeepLinkDslBuilderKt__NavDeepLinkDslBuilderKt {
    public static final androidx.view.NavDeepLink navDeepLink(kotlin.jvm.functions.Function1<? super androidx.view.NavDeepLinkDslBuilder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.view.NavDeepLinkDslBuilder navDeepLinkDslBuilder = new androidx.view.NavDeepLinkDslBuilder();
        function1.invoke(navDeepLinkDslBuilder);
        return navDeepLinkDslBuilder.build$navigation_common_release();
    }

    public static /* synthetic */ androidx.view.NavDeepLink navDeepLink$default(java.lang.String str, java.util.Map map, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        if ((i & 4) != 0) {
            function1 = new kotlin.jvm.functions.Function1<androidx.view.NavDeepLinkDslBuilder, kotlin.Unit>() { // from class: androidx.navigation.NavDeepLinkDslBuilderKt__NavDeepLinkDslBuilderKt$navDeepLink$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.view.NavDeepLinkDslBuilder navDeepLinkDslBuilder) {
                    invoke2(navDeepLinkDslBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.view.NavDeepLinkDslBuilder navDeepLinkDslBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navDeepLinkDslBuilder, "");
                }
            };
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return androidx.view.NavDeepLinkDslBuilderKt.navDeepLink(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), str, map, function1);
    }

    public static final /* synthetic */ <T> androidx.view.NavDeepLink navDeepLink(java.lang.String str, java.util.Map<kotlin.reflect.KType, androidx.view.NavType<?>> map, kotlin.jvm.functions.Function1<? super androidx.view.NavDeepLinkDslBuilder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return androidx.view.NavDeepLinkDslBuilderKt.navDeepLink(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), str, map, function1);
    }

    public static /* synthetic */ androidx.view.NavDeepLink navDeepLink$default(kotlin.reflect.KClass kClass, java.lang.String str, java.util.Map map, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        return androidx.view.NavDeepLinkDslBuilderKt.navDeepLink(kClass, str, map, function1);
    }

    public static final <T> androidx.view.NavDeepLink navDeepLink(kotlin.reflect.KClass<T> kClass, java.lang.String str, java.util.Map<kotlin.reflect.KType, androidx.view.NavType<?>> map, kotlin.jvm.functions.Function1<? super androidx.view.NavDeepLinkDslBuilder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.view.NavDeepLinkDslBuilder navDeepLinkDslBuilder = new androidx.view.NavDeepLinkDslBuilder(str, kClass, map);
        function1.invoke(navDeepLinkDslBuilder);
        return navDeepLinkDslBuilder.build$navigation_common_release();
    }

    public static final <T> androidx.view.NavDeepLink navDeepLink(kotlin.reflect.KClass<T> kClass, java.lang.String str, kotlin.jvm.functions.Function1<? super androidx.view.NavDeepLinkDslBuilder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return navDeepLink$default(kClass, str, null, function1, 4, null);
    }
}
