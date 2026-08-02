package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import me.relex.circleindicator.CircleIndicator;
import org.betup.R;
import org.betup.ui.views.AlphaPressButton;

/* loaded from: classes2.dex */
public final class DialogOffersBinding implements ViewBinding {
    public final CircleIndicator indicator;
    public final AlphaPressButton leftArrow;
    public final ViewPager pager;
    public final FrameLayout progressBar;
    public final AlphaPressButton rightArrow;
    private final ConstraintLayout rootView;

    private DialogOffersBinding(ConstraintLayout rootView, CircleIndicator indicator, AlphaPressButton leftArrow, ViewPager pager, FrameLayout progressBar, AlphaPressButton rightArrow) {
        this.rootView = rootView;
        this.indicator = indicator;
        this.leftArrow = leftArrow;
        this.pager = pager;
        this.progressBar = progressBar;
        this.rightArrow = rightArrow;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogOffersBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogOffersBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_offers, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogOffersBinding bind(View rootView) {
        int i = R.id.indicator;
        CircleIndicator circleIndicator = (CircleIndicator) ViewBindings.findChildViewById(rootView, R.id.indicator);
        if (circleIndicator != null) {
            i = R.id.leftArrow;
            AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.leftArrow);
            if (alphaPressButton != null) {
                i = R.id.pager;
                ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(rootView, R.id.pager);
                if (viewPager != null) {
                    i = R.id.progressBar;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.progressBar);
                    if (frameLayout != null) {
                        i = R.id.rightArrow;
                        AlphaPressButton alphaPressButton2 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.rightArrow);
                        if (alphaPressButton2 != null) {
                            return new DialogOffersBinding((ConstraintLayout) rootView, circleIndicator, alphaPressButton, viewPager, frameLayout, alphaPressButton2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
