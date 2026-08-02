package org.betup.ui;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.drawerlayout.widget.DrawerLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import org.betup.R;
import org.betup.services.menu.MenuView;

/* loaded from: classes2.dex */
public class MainActivity_ViewBinding implements Unbinder {
    private MainActivity target;

    public MainActivity_ViewBinding(MainActivity target) {
        this(target, target.getWindow().getDecorView());
    }

    public MainActivity_ViewBinding(MainActivity target, View source) {
        this.target = target;
        target.drawerContainer = (ComposeView) Utils.findRequiredViewAsType(source, R.id.drawer, "field 'drawerContainer'", ComposeView.class);
        target.tourOverlayView = (ComposeView) Utils.findRequiredViewAsType(source, R.id.tour_overlay, "field 'tourOverlayView'", ComposeView.class);
        target.drawer = (DrawerLayout) Utils.findRequiredViewAsType(source, R.id.drawer_layout, "field 'drawer'", DrawerLayout.class);
        target.drawerScrimTouchBlocker = Utils.findRequiredView(source, R.id.drawer_scrim_touch_blocker, "field 'drawerScrimTouchBlocker'");
        target.toolbar = (Toolbar) Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        target.mainView = (RelativeLayout) Utils.findRequiredViewAsType(source, R.id.layout, "field 'mainView'", RelativeLayout.class);
        target.inetError = Utils.findRequiredView(source, R.id.inet_error, "field 'inetError'");
        target.menuView = (MenuView) Utils.findRequiredViewAsType(source, R.id.bottomPanel, "field 'menuView'", MenuView.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        MainActivity mainActivity = this.target;
        if (mainActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        mainActivity.drawerContainer = null;
        mainActivity.tourOverlayView = null;
        mainActivity.drawer = null;
        mainActivity.drawerScrimTouchBlocker = null;
        mainActivity.toolbar = null;
        mainActivity.mainView = null;
        mainActivity.inetError = null;
        mainActivity.menuView = null;
    }
}
