package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.views.AlphaPressButton;
import org.betup.ui.views.GradientTextView;

/* loaded from: classes2.dex */
public final class DialogBuyToGetBonusBinding implements ViewBinding {
    public final ConstraintLayout dialogContainer;
    public final AlphaPressButton ok;
    public final GradientTextView price;
    private final ConstraintLayout rootView;
    public final GradientTextView thanksLabel;
    public final GradientTextView wishLabel;

    private DialogBuyToGetBonusBinding(ConstraintLayout rootView, ConstraintLayout dialogContainer, AlphaPressButton ok, GradientTextView price, GradientTextView thanksLabel, GradientTextView wishLabel) {
        this.rootView = rootView;
        this.dialogContainer = dialogContainer;
        this.ok = ok;
        this.price = price;
        this.thanksLabel = thanksLabel;
        this.wishLabel = wishLabel;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogBuyToGetBonusBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogBuyToGetBonusBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_buy_to_get_bonus, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogBuyToGetBonusBinding bind(View rootView) {
        int i = R.id.dialog_container;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.dialog_container);
        if (constraintLayout != null) {
            i = R.id.ok;
            AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.ok);
            if (alphaPressButton != null) {
                i = R.id.price;
                GradientTextView gradientTextView = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.price);
                if (gradientTextView != null) {
                    i = R.id.thanks_label;
                    GradientTextView gradientTextView2 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.thanks_label);
                    if (gradientTextView2 != null) {
                        i = R.id.wish_label;
                        GradientTextView gradientTextView3 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.wish_label);
                        if (gradientTextView3 != null) {
                            return new DialogBuyToGetBonusBinding((ConstraintLayout) rootView, constraintLayout, alphaPressButton, gradientTextView, gradientTextView2, gradientTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
