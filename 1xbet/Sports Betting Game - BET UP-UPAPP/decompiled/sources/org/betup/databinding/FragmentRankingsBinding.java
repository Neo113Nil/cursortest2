package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import org.betup.R;
import org.betup.ui.views.NicePagerTabStrip;

/* loaded from: classes2.dex */
public final class FragmentRankingsBinding implements ViewBinding {
    public final ViewPager pager;
    public final NicePagerTabStrip pagerSlidingTabStrip;
    public final ProgressBar progress;
    public final LinearLayout rewards;
    public final TextView rewardsButton;
    private final RelativeLayout rootView;

    private FragmentRankingsBinding(RelativeLayout rootView, ViewPager pager, NicePagerTabStrip pagerSlidingTabStrip, ProgressBar progress, LinearLayout rewards, TextView rewardsButton) {
        this.rootView = rootView;
        this.pager = pager;
        this.pagerSlidingTabStrip = pagerSlidingTabStrip;
        this.progress = progress;
        this.rewards = rewards;
        this.rewardsButton = rewardsButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRankingsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentRankingsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_rankings, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentRankingsBinding bind(View rootView) {
        int i = R.id.pager;
        ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(rootView, R.id.pager);
        if (viewPager != null) {
            i = R.id.pagerSlidingTabStrip;
            NicePagerTabStrip nicePagerTabStrip = (NicePagerTabStrip) ViewBindings.findChildViewById(rootView, R.id.pagerSlidingTabStrip);
            if (nicePagerTabStrip != null) {
                i = R.id.progress;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                if (progressBar != null) {
                    i = R.id.rewards;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.rewards);
                    if (linearLayout != null) {
                        i = R.id.rewardsButton;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.rewardsButton);
                        if (textView != null) {
                            return new FragmentRankingsBinding((RelativeLayout) rootView, viewPager, nicePagerTabStrip, progressBar, linearLayout, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
