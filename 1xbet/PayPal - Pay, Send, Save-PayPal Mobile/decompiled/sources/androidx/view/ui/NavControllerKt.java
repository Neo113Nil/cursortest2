package androidx.view.ui;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b"}, d2 = {"Landroidx/navigation/NavController;", "Landroidx/customview/widget/Openable;", "drawerLayout", "", "navigateUp", "(Landroidx/navigation/NavController;Landroidx/customview/widget/Openable;)Z", "Landroidx/navigation/ui/AppBarConfiguration;", "appBarConfiguration", "(Landroidx/navigation/NavController;Landroidx/navigation/ui/AppBarConfiguration;)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavControllerKt {
    public static final boolean navigateUp(androidx.view.NavController navController, androidx.customview.widget.Openable openable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navController, "");
        return androidx.view.ui.NavigationUI.navigateUp(navController, new androidx.navigation.ui.AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new androidx.view.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(androidx.view.ui.AppBarConfigurationKt$AppBarConfiguration$1.INSTANCE)).build());
    }

    public static final boolean navigateUp(androidx.view.NavController navController, androidx.view.ui.AppBarConfiguration appBarConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appBarConfiguration, "");
        return androidx.view.ui.NavigationUI.navigateUp(navController, appBarConfiguration);
    }
}
