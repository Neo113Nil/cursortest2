package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.views.GradientTextView;

/* loaded from: classes2.dex */
public final class IntroChallenge1Binding implements ViewBinding {
    public final GradientTextView first;
    public final ConstraintLayout icon;
    public final GradientTextView mainLabel;
    private final ConstraintLayout rootView;
    public final GradientTextView second;
    public final View shape;
    public final GradientTextView third;

    private IntroChallenge1Binding(ConstraintLayout rootView, GradientTextView first, ConstraintLayout icon, GradientTextView mainLabel, GradientTextView second, View shape, GradientTextView third) {
        this.rootView = rootView;
        this.first = first;
        this.icon = icon;
        this.mainLabel = mainLabel;
        this.second = second;
        this.shape = shape;
        this.third = third;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static IntroChallenge1Binding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static IntroChallenge1Binding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.intro_challenge_1, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static IntroChallenge1Binding bind(View rootView) {
        int i = R.id.first;
        GradientTextView gradientTextView = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.first);
        if (gradientTextView != null) {
            i = R.id.icon;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.icon);
            if (constraintLayout != null) {
                i = R.id.main_label;
                GradientTextView gradientTextView2 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.main_label);
                if (gradientTextView2 != null) {
                    i = R.id.second;
                    GradientTextView gradientTextView3 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.second);
                    if (gradientTextView3 != null) {
                        i = R.id.shape;
                        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.shape);
                        if (findChildViewById != null) {
                            i = R.id.third;
                            GradientTextView gradientTextView4 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.third);
                            if (gradientTextView4 != null) {
                                return new IntroChallenge1Binding((ConstraintLayout) rootView, gradientTextView, constraintLayout, gradientTextView2, gradientTextView3, findChildViewById, gradientTextView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
