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
public final class FragmentSupportBinding implements ViewBinding {
    public final ViewPager pager;
    public final PagerSlidingTabStrip pagerSlidingTabStrip;
    private final RelativeLayout rootView;

    private FragmentSupportBinding(RelativeLayout rootView, ViewPager pager, PagerSlidingTabStrip pagerSlidingTabStrip) {
        this.rootView = rootView;
        this.pager = pager;
        this.pagerSlidingTabStrip = pagerSlidingTabStrip;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSupportBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentSupportBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_support, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentSupportBinding bind(View rootView) {
        int i = R.id.pager;
        ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(rootView, R.id.pager);
        if (viewPager != null) {
            i = R.id.pagerSlidingTabStrip;
            PagerSlidingTabStrip pagerSlidingTabStrip = (PagerSlidingTabStrip) ViewBindings.findChildViewById(rootView, R.id.pagerSlidingTabStrip);
            if (pagerSlidingTabStrip != null) {
                return new FragmentSupportBinding((RelativeLayout) rootView, viewPager, pagerSlidingTabStrip);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
