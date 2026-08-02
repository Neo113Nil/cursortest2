package org.betup.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.betup.ui.MenuBarsController;
import org.betup.ui.TabMenuItem;
import org.betup.utils.ActivitySavedStateGuard;

/* loaded from: classes4.dex */
public abstract class BaseFragment extends Fragment {
    private MenuBarsController menuBarsController;
    protected Unbinder unbinder;
    private boolean controllingMenus = true;
    private String title = "BetUp";
    private TabMenuItem tabMenuType = TabMenuItem.NONE;

    protected void onFragmentAttached(Context context) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Unbinder unbinder = this.unbinder;
        if (unbinder != null) {
            unbinder.unbind();
        }
        this.unbinder = null;
        this.menuBarsController.setBottomMenu(this, null);
    }

    protected MenuBarsController getMenuBarsController() {
        return this.menuBarsController;
    }

    public boolean isActive() {
        return isAdded() && this.unbinder != null;
    }

    protected void bindView(View view) {
        this.unbinder = ButterKnife.bind(this, view);
    }

    public boolean isControllingMenus() {
        return this.controllingMenus;
    }

    public void setControllingMenus(boolean controllingMenus) {
        this.controllingMenus = controllingMenus;
    }

    public void setTabMenuType(TabMenuItem tabMenuType) {
        this.tabMenuType = tabMenuType;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TabMenuItem getTabMenType() {
        return this.tabMenuType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.menuBarsController = (MenuBarsController) context;
            onFragmentAttached(context);
        } catch (ClassCastException unused) {
            throw new ClassCastException(context + " should implement MenuBarsController");
        }
    }

    protected void updateMenuBars(String title, TabMenuItem tabMenuItem) {
        if (this.controllingMenus) {
            MenuBarsController menuBarsController = this.menuBarsController;
            this.tabMenuType = tabMenuItem;
            menuBarsController.updateTabMenu(tabMenuItem);
            MenuBarsController menuBarsController2 = this.menuBarsController;
            this.title = title;
            menuBarsController2.updateTitle(title);
        }
    }

    protected void updateMenuBars() {
        if (this.controllingMenus) {
            this.menuBarsController.updateTabMenu(this.tabMenuType);
            this.menuBarsController.updateTitle(this.title);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        ActivitySavedStateGuard.stripNestedViewStatesPublic(outState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.controllingMenus) {
            Log.d("MENUBARS", this + " UPDATING MENU BARS RESUMED " + this.title + " " + this.tabMenuType);
            if (this.tabMenuType != TabMenuItem.NONE) {
                this.menuBarsController.updateTabMenu(this.tabMenuType);
            }
            this.menuBarsController.updateTitle(this.title);
            String name = getClass().getName();
            try {
                name = name.substring(name.lastIndexOf(46) + 1);
            } catch (Exception unused) {
            }
            Log.d("ANALYTICSTEST", "CURRENT SCREEN IS " + name);
            Bundle bundle = new Bundle();
            FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(getActivity());
            firebaseAnalytics.setCurrentScreen(getActivity(), name, name);
            bundle.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "screen");
            bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, name);
            firebaseAnalytics.logEvent(FirebaseAnalytics.Event.VIEW_ITEM, bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }
}
