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
public final class IntroChallenge2Binding implements ViewBinding {
    public final GradientTextView description;
    public final ConstraintLayout icon;
    public final GradientTextView mainLabel;
    private final ConstraintLayout rootView;
    public final View shape;

    private IntroChallenge2Binding(ConstraintLayout rootView, GradientTextView description, ConstraintLayout icon, GradientTextView mainLabel, View shape) {
        this.rootView = rootView;
        this.description = description;
        this.icon = icon;
        this.mainLabel = mainLabel;
        this.shape = shape;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static IntroChallenge2Binding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static IntroChallenge2Binding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.intro_challenge_2, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static IntroChallenge2Binding bind(View rootView) {
        int i = R.id.description;
        GradientTextView gradientTextView = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.description);
        if (gradientTextView != null) {
            i = R.id.icon;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.icon);
            if (constraintLayout != null) {
                i = R.id.main_label;
                GradientTextView gradientTextView2 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.main_label);
                if (gradientTextView2 != null) {
                    i = R.id.shape;
                    View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.shape);
                    if (findChildViewById != null) {
                        return new IntroChallenge2Binding((ConstraintLayout) rootView, gradientTextView, constraintLayout, gradientTextView2, findChildViewById);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
