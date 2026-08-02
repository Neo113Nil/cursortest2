package androidx.view.ui;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\u001a7\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\n\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\n\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\f\u001a=\u0010\b\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\n\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/navigation/NavGraph;", "navGraph", "Landroidx/customview/widget/Openable;", "drawerLayout", "Lkotlin/Function0;", "", "fallbackOnNavigateUpListener", "Landroidx/navigation/ui/AppBarConfiguration;", "AppBarConfiguration", "(Landroidx/navigation/NavGraph;Landroidx/customview/widget/Openable;Lkotlin/jvm/functions/Function0;)Landroidx/navigation/ui/AppBarConfiguration;", "Landroid/view/Menu;", "topLevelMenu", "(Landroid/view/Menu;Landroidx/customview/widget/Openable;Lkotlin/jvm/functions/Function0;)Landroidx/navigation/ui/AppBarConfiguration;", "", "", "topLevelDestinationIds", "(Ljava/util/Set;Landroidx/customview/widget/Openable;Lkotlin/jvm/functions/Function0;)Landroidx/navigation/ui/AppBarConfiguration;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AppBarConfigurationKt {
    public static /* synthetic */ androidx.view.ui.AppBarConfiguration AppBarConfiguration$default(androidx.view.NavGraph navGraph, androidx.customview.widget.Openable openable, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            openable = null;
        }
        if ((i & 4) != 0) {
            function0 = androidx.view.ui.AppBarConfigurationKt$AppBarConfiguration$1.INSTANCE;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navGraph, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return new androidx.navigation.ui.AppBarConfiguration.Builder(navGraph).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new androidx.view.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(function0)).build();
    }

    public static final androidx.view.ui.AppBarConfiguration AppBarConfiguration(androidx.view.NavGraph navGraph, androidx.customview.widget.Openable openable, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navGraph, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return new androidx.navigation.ui.AppBarConfiguration.Builder(navGraph).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new androidx.view.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(function0)).build();
    }

    public static /* synthetic */ androidx.view.ui.AppBarConfiguration AppBarConfiguration$default(android.view.Menu menu, androidx.customview.widget.Openable openable, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            openable = null;
        }
        if ((i & 4) != 0) {
            function0 = new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Boolean invoke() {
                    return java.lang.Boolean.FALSE;
                }
            };
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menu, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return new androidx.navigation.ui.AppBarConfiguration.Builder(menu).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new androidx.view.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(function0)).build();
    }

    public static final androidx.view.ui.AppBarConfiguration AppBarConfiguration(android.view.Menu menu, androidx.customview.widget.Openable openable, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menu, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return new androidx.navigation.ui.AppBarConfiguration.Builder(menu).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new androidx.view.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(function0)).build();
    }

    public static /* synthetic */ androidx.view.ui.AppBarConfiguration AppBarConfiguration$default(java.util.Set set, androidx.customview.widget.Openable openable, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            openable = null;
        }
        if ((i & 4) != 0) {
            function0 = new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$3
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Boolean invoke() {
                    return java.lang.Boolean.FALSE;
                }
            };
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return new androidx.navigation.ui.AppBarConfiguration.Builder((java.util.Set<java.lang.Integer>) set).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new androidx.view.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(function0)).build();
    }

    public static final androidx.view.ui.AppBarConfiguration AppBarConfiguration(java.util.Set<java.lang.Integer> set, androidx.customview.widget.Openable openable, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return new androidx.navigation.ui.AppBarConfiguration.Builder(set).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new androidx.view.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(function0)).build();
    }
}
