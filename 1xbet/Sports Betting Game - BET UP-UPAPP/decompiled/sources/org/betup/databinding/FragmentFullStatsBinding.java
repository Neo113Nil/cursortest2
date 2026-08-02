package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import org.betup.R;
import org.betup.ui.views.PagerSlidingTabStrip;

/* loaded from: classes2.dex */
public final class FragmentFullStatsBinding implements ViewBinding {
    public final ImageView awayTeamIcon;
    public final TextView awayTeamName;
    public final ConstraintLayout container;
    public final TextView date;
    public final ImageView homeTeamIcon;
    public final TextView homeTeamName;
    public final TextView leagueName;
    public final CollapsingToolbarLayout mainCollapsing;
    public final AppBarLayout materialupAppbar;
    public final ViewPager materialupViewpager;
    private final CoordinatorLayout rootView;
    public final AppCompatTextView score;
    public final ImageView sportIcon;
    public final PagerSlidingTabStrip tabs;

    private FragmentFullStatsBinding(CoordinatorLayout rootView, ImageView awayTeamIcon, TextView awayTeamName, ConstraintLayout container, TextView date, ImageView homeTeamIcon, TextView homeTeamName, TextView leagueName, CollapsingToolbarLayout mainCollapsing, AppBarLayout materialupAppbar, ViewPager materialupViewpager, AppCompatTextView score, ImageView sportIcon, PagerSlidingTabStrip tabs) {
        this.rootView = rootView;
        this.awayTeamIcon = awayTeamIcon;
        this.awayTeamName = awayTeamName;
        this.container = container;
        this.date = date;
        this.homeTeamIcon = homeTeamIcon;
        this.homeTeamName = homeTeamName;
        this.leagueName = leagueName;
        this.mainCollapsing = mainCollapsing;
        this.materialupAppbar = materialupAppbar;
        this.materialupViewpager = materialupViewpager;
        this.score = score;
        this.sportIcon = sportIcon;
        this.tabs = tabs;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    public static FragmentFullStatsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentFullStatsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_full_stats, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentFullStatsBinding bind(View rootView) {
        int i = R.id.awayTeamIcon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.awayTeamIcon);
        if (imageView != null) {
            i = R.id.awayTeamName;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.awayTeamName);
            if (textView != null) {
                i = R.id.container;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.container);
                if (constraintLayout != null) {
                    i = R.id.date;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.date);
                    if (textView2 != null) {
                        i = R.id.homeTeamIcon;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.homeTeamIcon);
                        if (imageView2 != null) {
                            i = R.id.homeTeamName;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.homeTeamName);
                            if (textView3 != null) {
                                i = R.id.leagueName;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.leagueName);
                                if (textView4 != null) {
                                    i = R.id.main_collapsing;
                                    CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) ViewBindings.findChildViewById(rootView, R.id.main_collapsing);
                                    if (collapsingToolbarLayout != null) {
                                        i = R.id.materialup_appbar;
                                        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(rootView, R.id.materialup_appbar);
                                        if (appBarLayout != null) {
                                            i = R.id.materialup_viewpager;
                                            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(rootView, R.id.materialup_viewpager);
                                            if (viewPager != null) {
                                                i = R.id.score;
                                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.score);
                                                if (appCompatTextView != null) {
                                                    i = R.id.sportIcon;
                                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sportIcon);
                                                    if (imageView3 != null) {
                                                        i = R.id.tabs;
                                                        PagerSlidingTabStrip pagerSlidingTabStrip = (PagerSlidingTabStrip) ViewBindings.findChildViewById(rootView, R.id.tabs);
                                                        if (pagerSlidingTabStrip != null) {
                                                            return new FragmentFullStatsBinding((CoordinatorLayout) rootView, imageView, textView, constraintLayout, textView2, imageView2, textView3, textView4, collapsingToolbarLayout, appBarLayout, viewPager, appCompatTextView, imageView3, pagerSlidingTabStrip);
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
