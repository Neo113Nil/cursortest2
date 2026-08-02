package androidx.view.ui;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n"}, d2 = {"Landroidx/appcompat/widget/Toolbar;", "Landroidx/navigation/NavController;", "navController", "Landroidx/drawerlayout/widget/DrawerLayout;", "drawerLayout", "", "setupWithNavController", "(Landroidx/appcompat/widget/Toolbar;Landroidx/navigation/NavController;Landroidx/drawerlayout/widget/DrawerLayout;)V", "Landroidx/navigation/ui/AppBarConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "(Landroidx/appcompat/widget/Toolbar;Landroidx/navigation/NavController;Landroidx/navigation/ui/AppBarConfiguration;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ToolbarKt {
    public static final void setupWithNavController(androidx.appcompat.widget.Toolbar toolbar, androidx.view.NavController navController, androidx.drawerlayout.widget.DrawerLayout drawerLayout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toolbar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navController, "");
        androidx.view.ui.NavigationUI.setupWithNavController(toolbar, navController, new androidx.navigation.ui.AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(drawerLayout).setFallbackOnNavigateUpListener(new androidx.view.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(androidx.view.ui.AppBarConfigurationKt$AppBarConfiguration$1.INSTANCE)).build());
    }

    public static /* synthetic */ void setupWithNavController$default(androidx.appcompat.widget.Toolbar toolbar, androidx.view.NavController navController, androidx.view.ui.AppBarConfiguration appBarConfiguration, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            appBarConfiguration = new androidx.navigation.ui.AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(null).setFallbackOnNavigateUpListener(new androidx.view.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(androidx.view.ui.AppBarConfigurationKt$AppBarConfiguration$1.INSTANCE)).build();
        }
        setupWithNavController(toolbar, navController, appBarConfiguration);
    }

    public static final void setupWithNavController(androidx.appcompat.widget.Toolbar toolbar, androidx.view.NavController navController, androidx.view.ui.AppBarConfiguration appBarConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toolbar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appBarConfiguration, "");
        androidx.view.ui.NavigationUI.setupWithNavController(toolbar, navController, appBarConfiguration);
    }
}
