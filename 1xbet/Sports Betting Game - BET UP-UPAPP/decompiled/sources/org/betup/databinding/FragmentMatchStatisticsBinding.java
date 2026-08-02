package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import org.betup.R;
import org.betup.ui.views.PagerSlidingTabStrip;

/* loaded from: classes2.dex */
public final class FragmentMatchStatisticsBinding implements ViewBinding {
    public final ViewPager pager;
    public final ProgressBar progress;
    private final ConstraintLayout rootView;
    public final PagerSlidingTabStrip tabs;

    private FragmentMatchStatisticsBinding(ConstraintLayout rootView, ViewPager pager, ProgressBar progress, PagerSlidingTabStrip tabs) {
        this.rootView = rootView;
        this.pager = pager;
        this.progress = progress;
        this.tabs = tabs;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentMatchStatisticsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentMatchStatisticsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_match_statistics, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentMatchStatisticsBinding bind(View rootView) {
        int i = R.id.pager;
        ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(rootView, R.id.pager);
        if (viewPager != null) {
            i = R.id.progress;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
            if (progressBar != null) {
                i = R.id.tabs;
                PagerSlidingTabStrip pagerSlidingTabStrip = (PagerSlidingTabStrip) ViewBindings.findChildViewById(rootView, R.id.tabs);
                if (pagerSlidingTabStrip != null) {
                    return new FragmentMatchStatisticsBinding((ConstraintLayout) rootView, viewPager, progressBar, pagerSlidingTabStrip);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
