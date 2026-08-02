package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import org.betup.R;
import org.betup.ui.views.PagerSlidingTabStrip;

/* loaded from: classes2.dex */
public final class DialogSelectionBetBinding implements ViewBinding {
    public final ImageView closeButton;
    public final TextView confirmButton;
    public final TextView header;
    public final TextView noBets;
    public final ViewPager pager;
    public final ProgressBar progressBar;
    private final ConstraintLayout rootView;
    public final RelativeLayout sliderContainer;
    public final PagerSlidingTabStrip tabs;

    private DialogSelectionBetBinding(ConstraintLayout rootView, ImageView closeButton, TextView confirmButton, TextView header, TextView noBets, ViewPager pager, ProgressBar progressBar, RelativeLayout sliderContainer, PagerSlidingTabStrip tabs) {
        this.rootView = rootView;
        this.closeButton = closeButton;
        this.confirmButton = confirmButton;
        this.header = header;
        this.noBets = noBets;
        this.pager = pager;
        this.progressBar = progressBar;
        this.sliderContainer = sliderContainer;
        this.tabs = tabs;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogSelectionBetBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogSelectionBetBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_selection_bet, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogSelectionBetBinding bind(View rootView) {
        int i = R.id.close_button;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.close_button);
        if (imageView != null) {
            i = R.id.confirm_button;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.confirm_button);
            if (textView != null) {
                i = R.id.header;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.header);
                if (textView2 != null) {
                    i = R.id.no_bets;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.no_bets);
                    if (textView3 != null) {
                        i = R.id.pager;
                        ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(rootView, R.id.pager);
                        if (viewPager != null) {
                            i = R.id.progress_bar;
                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress_bar);
                            if (progressBar != null) {
                                i = R.id.slider_container;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.slider_container);
                                if (relativeLayout != null) {
                                    i = R.id.tabs;
                                    PagerSlidingTabStrip pagerSlidingTabStrip = (PagerSlidingTabStrip) ViewBindings.findChildViewById(rootView, R.id.tabs);
                                    if (pagerSlidingTabStrip != null) {
                                        return new DialogSelectionBetBinding((ConstraintLayout) rootView, imageView, textView, textView2, textView3, viewPager, progressBar, relativeLayout, pagerSlidingTabStrip);
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
