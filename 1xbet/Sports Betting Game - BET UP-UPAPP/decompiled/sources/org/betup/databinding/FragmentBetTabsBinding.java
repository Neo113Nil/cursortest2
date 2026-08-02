package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import org.betup.R;
import org.betup.ui.views.PagerSlidingTabStrip;

/* loaded from: classes2.dex */
public final class FragmentBetTabsBinding implements ViewBinding {
    public final AppCompatImageView betExpandButton;
    public final TextView noBets;
    public final ViewPager pager;
    public final PagerSlidingTabStrip pages;
    public final LinearLayout pagesListContainer;
    private final RelativeLayout rootView;

    private FragmentBetTabsBinding(RelativeLayout rootView, AppCompatImageView betExpandButton, TextView noBets, ViewPager pager, PagerSlidingTabStrip pages, LinearLayout pagesListContainer) {
        this.rootView = rootView;
        this.betExpandButton = betExpandButton;
        this.noBets = noBets;
        this.pager = pager;
        this.pages = pages;
        this.pagesListContainer = pagesListContainer;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentBetTabsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentBetTabsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_bet_tabs, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentBetTabsBinding bind(View rootView) {
        int i = R.id.betExpandButton;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.betExpandButton);
        if (appCompatImageView != null) {
            i = R.id.no_bets;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.no_bets);
            if (textView != null) {
                i = R.id.pager;
                ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(rootView, R.id.pager);
                if (viewPager != null) {
                    i = R.id.pages;
                    PagerSlidingTabStrip pagerSlidingTabStrip = (PagerSlidingTabStrip) ViewBindings.findChildViewById(rootView, R.id.pages);
                    if (pagerSlidingTabStrip != null) {
                        i = R.id.pagesListContainer;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.pagesListContainer);
                        if (linearLayout != null) {
                            return new FragmentBetTabsBinding((RelativeLayout) rootView, appCompatImageView, textView, viewPager, pagerSlidingTabStrip, linearLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
