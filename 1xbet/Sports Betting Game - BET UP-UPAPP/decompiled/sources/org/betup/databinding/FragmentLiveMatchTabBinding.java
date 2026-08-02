package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.PagerTabStrip;
import org.betup.R;
import org.betup.ui.views.StaticViewPager;

/* loaded from: classes2.dex */
public final class FragmentLiveMatchTabBinding implements ViewBinding {
    public final RelativeLayout background;
    public final FrameLayout bottomContainer;
    public final StaticViewPager pager;
    private final LinearLayout rootView;
    public final ComposeView sliderContainer;
    public final SwipeRefreshLayout swipeRefreshLayout;
    public final PagerTabStrip tabs;

    private FragmentLiveMatchTabBinding(LinearLayout rootView, RelativeLayout background, FrameLayout bottomContainer, StaticViewPager pager, ComposeView sliderContainer, SwipeRefreshLayout swipeRefreshLayout, PagerTabStrip tabs) {
        this.rootView = rootView;
        this.background = background;
        this.bottomContainer = bottomContainer;
        this.pager = pager;
        this.sliderContainer = sliderContainer;
        this.swipeRefreshLayout = swipeRefreshLayout;
        this.tabs = tabs;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentLiveMatchTabBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentLiveMatchTabBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_live_match_tab, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentLiveMatchTabBinding bind(View rootView) {
        int i = R.id.background;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.background);
        if (relativeLayout != null) {
            i = R.id.bottom_container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.bottom_container);
            if (frameLayout != null) {
                i = R.id.pager;
                StaticViewPager staticViewPager = (StaticViewPager) ViewBindings.findChildViewById(rootView, R.id.pager);
                if (staticViewPager != null) {
                    i = R.id.sliderContainer;
                    ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(rootView, R.id.sliderContainer);
                    if (composeView != null) {
                        i = R.id.swipeRefreshLayout;
                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(rootView, R.id.swipeRefreshLayout);
                        if (swipeRefreshLayout != null) {
                            i = R.id.tabs;
                            PagerTabStrip pagerTabStrip = (PagerTabStrip) ViewBindings.findChildViewById(rootView, R.id.tabs);
                            if (pagerTabStrip != null) {
                                return new FragmentLiveMatchTabBinding((LinearLayout) rootView, relativeLayout, frameLayout, staticViewPager, composeView, swipeRefreshLayout, pagerTabStrip);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
