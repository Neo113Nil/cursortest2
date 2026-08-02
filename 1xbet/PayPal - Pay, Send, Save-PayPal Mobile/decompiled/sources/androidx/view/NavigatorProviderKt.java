package androidx.view;

@kotlin.Metadata(d1 = {"androidx/navigation/NavigatorProviderKt__NavigatorProviderKt", "androidx/navigation/NavigatorProviderKt__NavigatorProvider_androidKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavigatorProviderKt {
    public static final <T extends androidx.view.Navigator<? extends androidx.view.NavDestination>> T get(androidx.view.NavigatorProvider navigatorProvider, java.lang.String str) {
        return (T) androidx.view.NavigatorProviderKt__NavigatorProviderKt.get(navigatorProvider, str);
    }

    public static final <T extends androidx.view.Navigator<? extends androidx.view.NavDestination>> T get(androidx.view.NavigatorProvider navigatorProvider, kotlin.reflect.KClass<T> kClass) {
        return (T) androidx.view.NavigatorProviderKt__NavigatorProvider_androidKt.get(navigatorProvider, kClass);
    }

    public static final void plusAssign(androidx.view.NavigatorProvider navigatorProvider, androidx.view.Navigator<? extends androidx.view.NavDestination> navigator) {
        androidx.view.NavigatorProviderKt__NavigatorProviderKt.plusAssign(navigatorProvider, navigator);
    }

    public static final androidx.view.Navigator<? extends androidx.view.NavDestination> set(androidx.view.NavigatorProvider navigatorProvider, java.lang.String str, androidx.view.Navigator<? extends androidx.view.NavDestination> navigator) {
        return androidx.view.NavigatorProviderKt__NavigatorProviderKt.set(navigatorProvider, str, navigator);
    }
}
