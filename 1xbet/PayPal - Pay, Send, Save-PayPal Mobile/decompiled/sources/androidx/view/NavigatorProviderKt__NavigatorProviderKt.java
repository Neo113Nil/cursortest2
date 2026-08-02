package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a.\u0010\u0006\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\n¢\u0006\u0004\b\u0006\u0010\u0007\u001a6\u0010\t\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u0000*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\u0086\n¢\u0006\u0004\b\t\u0010\n\u001a$\u0010\f\u001a\u00020\u000b*\u00020\u00032\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\u0086\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "T", "Landroidx/navigation/NavigatorProvider;", "", "p0", "get", "(Landroidx/navigation/NavigatorProvider;Ljava/lang/String;)Landroidx/navigation/Navigator;", "p1", "set", "(Landroidx/navigation/NavigatorProvider;Ljava/lang/String;Landroidx/navigation/Navigator;)Landroidx/navigation/Navigator;", "", "plusAssign", "(Landroidx/navigation/NavigatorProvider;Landroidx/navigation/Navigator;)V"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/navigation/NavigatorProviderKt")
/* loaded from: classes7.dex */
final /* synthetic */ class NavigatorProviderKt__NavigatorProviderKt {
    public static final <T extends androidx.view.Navigator<? extends androidx.view.NavDestination>> T get(androidx.view.NavigatorProvider navigatorProvider, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigatorProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return (T) navigatorProvider.getNavigator(str);
    }

    public static final androidx.view.Navigator<? extends androidx.view.NavDestination> set(androidx.view.NavigatorProvider navigatorProvider, java.lang.String str, androidx.view.Navigator<? extends androidx.view.NavDestination> navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigatorProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return navigatorProvider.addNavigator(str, navigator);
    }

    public static final void plusAssign(androidx.view.NavigatorProvider navigatorProvider, androidx.view.Navigator<? extends androidx.view.NavDestination> navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigatorProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        navigatorProvider.addNavigator(navigator);
    }
}
