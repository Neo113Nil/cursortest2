package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.services.menu.MenuView;

/* loaded from: classes2.dex */
public final class ActivityMainBinding implements ViewBinding {
    public final MenuView bottomPanel;
    public final FrameLayout container;
    public final CoordinatorLayout coordinatorLayout;
    public final ComposeView drawer;
    public final DrawerLayout drawerLayout;
    public final View drawerScrimTouchBlocker;
    public final TextView inetError;
    public final RelativeLayout layout;
    private final DrawerLayout rootView;
    public final ComposeView tourOverlay;

    private ActivityMainBinding(DrawerLayout rootView, MenuView bottomPanel, FrameLayout container, CoordinatorLayout coordinatorLayout, ComposeView drawer, DrawerLayout drawerLayout, View drawerScrimTouchBlocker, TextView inetError, RelativeLayout layout, ComposeView tourOverlay) {
        this.rootView = rootView;
        this.bottomPanel = bottomPanel;
        this.container = container;
        this.coordinatorLayout = coordinatorLayout;
        this.drawer = drawer;
        this.drawerLayout = drawerLayout;
        this.drawerScrimTouchBlocker = drawerScrimTouchBlocker;
        this.inetError = inetError;
        this.layout = layout;
        this.tourOverlay = tourOverlay;
    }

    @Override // androidx.viewbinding.ViewBinding
    public DrawerLayout getRoot() {
        return this.rootView;
    }

    public static ActivityMainBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityMainBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_main, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityMainBinding bind(View rootView) {
        int i = R.id.bottomPanel;
        MenuView menuView = (MenuView) ViewBindings.findChildViewById(rootView, R.id.bottomPanel);
        if (menuView != null) {
            i = R.id.container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.container);
            if (frameLayout != null) {
                i = R.id.coordinator_layout;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(rootView, R.id.coordinator_layout);
                if (coordinatorLayout != null) {
                    i = R.id.drawer;
                    ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(rootView, R.id.drawer);
                    if (composeView != null) {
                        DrawerLayout drawerLayout = (DrawerLayout) rootView;
                        i = R.id.drawer_scrim_touch_blocker;
                        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.drawer_scrim_touch_blocker);
                        if (findChildViewById != null) {
                            i = R.id.inet_error;
                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.inet_error);
                            if (textView != null) {
                                i = R.id.layout;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.layout);
                                if (relativeLayout != null) {
                                    i = R.id.tour_overlay;
                                    ComposeView composeView2 = (ComposeView) ViewBindings.findChildViewById(rootView, R.id.tour_overlay);
                                    if (composeView2 != null) {
                                        return new ActivityMainBinding(drawerLayout, menuView, frameLayout, coordinatorLayout, composeView, drawerLayout, findChildViewById, textView, relativeLayout, composeView2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
