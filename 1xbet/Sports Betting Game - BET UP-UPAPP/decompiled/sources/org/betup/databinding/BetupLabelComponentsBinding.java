package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class BetupLabelComponentsBinding implements ViewBinding {
    public final ImageView betupTitle;
    public final ImageView fifthStar;
    public final ImageView firstStar;
    public final ImageView fourthStar;
    private final LinearLayout rootView;
    public final ImageView secondStar;
    public final LinearLayout starsLayout;
    public final ImageView thirdStar;

    private BetupLabelComponentsBinding(LinearLayout rootView, ImageView betupTitle, ImageView fifthStar, ImageView firstStar, ImageView fourthStar, ImageView secondStar, LinearLayout starsLayout, ImageView thirdStar) {
        this.rootView = rootView;
        this.betupTitle = betupTitle;
        this.fifthStar = fifthStar;
        this.firstStar = firstStar;
        this.fourthStar = fourthStar;
        this.secondStar = secondStar;
        this.starsLayout = starsLayout;
        this.thirdStar = thirdStar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static BetupLabelComponentsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static BetupLabelComponentsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.betup_label_components, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static BetupLabelComponentsBinding bind(View rootView) {
        int i = R.id.betupTitle;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.betupTitle);
        if (imageView != null) {
            i = R.id.fifthStar;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.fifthStar);
            if (imageView2 != null) {
                i = R.id.firstStar;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.firstStar);
                if (imageView3 != null) {
                    i = R.id.fourthStar;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.fourthStar);
                    if (imageView4 != null) {
                        i = R.id.secondStar;
                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.secondStar);
                        if (imageView5 != null) {
                            i = R.id.starsLayout;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.starsLayout);
                            if (linearLayout != null) {
                                i = R.id.thirdStar;
                                ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.thirdStar);
                                if (imageView6 != null) {
                                    return new BetupLabelComponentsBinding((LinearLayout) rootView, imageView, imageView2, imageView3, imageView4, imageView5, linearLayout, imageView6);
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
