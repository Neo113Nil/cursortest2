package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a4\u0010\u0006\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000*\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "T", "Landroidx/navigation/NavigatorProvider;", "Lkotlin/reflect/KClass;", "p0", "get", "(Landroidx/navigation/NavigatorProvider;Lkotlin/reflect/KClass;)Landroidx/navigation/Navigator;"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/navigation/NavigatorProviderKt")
/* loaded from: classes7.dex */
final /* synthetic */ class NavigatorProviderKt__NavigatorProvider_androidKt {
    public static final <T extends androidx.view.Navigator<? extends androidx.view.NavDestination>> T get(androidx.view.NavigatorProvider navigatorProvider, kotlin.reflect.KClass<T> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigatorProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        return (T) navigatorProvider.getNavigator(kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) kClass));
    }
}
