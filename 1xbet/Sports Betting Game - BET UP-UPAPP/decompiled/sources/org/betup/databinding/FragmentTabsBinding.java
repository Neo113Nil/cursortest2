package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import org.betup.R;
import org.betup.ui.views.PagerSlidingTabStrip;

/* loaded from: classes2.dex */
public final class FragmentTabsBinding implements ViewBinding {
    public final ViewPager pager;
    public final PagerSlidingTabStrip pages;
    private final RelativeLayout rootView;

    private FragmentTabsBinding(RelativeLayout rootView, ViewPager pager, PagerSlidingTabStrip pages) {
        this.rootView = rootView;
        this.pager = pager;
        this.pages = pages;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentTabsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentTabsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_tabs, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentTabsBinding bind(View rootView) {
        int i = R.id.pager;
        ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(rootView, R.id.pager);
        if (viewPager != null) {
            i = R.id.pages;
            PagerSlidingTabStrip pagerSlidingTabStrip = (PagerSlidingTabStrip) ViewBindings.findChildViewById(rootView, R.id.pages);
            if (pagerSlidingTabStrip != null) {
                return new FragmentTabsBinding((RelativeLayout) rootView, viewPager, pagerSlidingTabStrip);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
