package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import org.betup.R;
import org.betup.ui.views.PagerSlidingTabStrip;

/* loaded from: classes2.dex */
public final class FragmentSearchTabsBinding implements ViewBinding {
    public final ViewPager pager;
    public final PagerSlidingTabStrip pages;
    public final RecyclerView recentList;
    public final LinearLayout recents;
    private final LinearLayout rootView;

    private FragmentSearchTabsBinding(LinearLayout rootView, ViewPager pager, PagerSlidingTabStrip pages, RecyclerView recentList, LinearLayout recents) {
        this.rootView = rootView;
        this.pager = pager;
        this.pages = pages;
        this.recentList = recentList;
        this.recents = recents;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSearchTabsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentSearchTabsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_search_tabs, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentSearchTabsBinding bind(View rootView) {
        int i = R.id.pager;
        ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(rootView, R.id.pager);
        if (viewPager != null) {
            i = R.id.pages;
            PagerSlidingTabStrip pagerSlidingTabStrip = (PagerSlidingTabStrip) ViewBindings.findChildViewById(rootView, R.id.pages);
            if (pagerSlidingTabStrip != null) {
                i = R.id.recentList;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recentList);
                if (recyclerView != null) {
                    i = R.id.recents;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.recents);
                    if (linearLayout != null) {
                        return new FragmentSearchTabsBinding((LinearLayout) rootView, viewPager, pagerSlidingTabStrip, recyclerView, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
