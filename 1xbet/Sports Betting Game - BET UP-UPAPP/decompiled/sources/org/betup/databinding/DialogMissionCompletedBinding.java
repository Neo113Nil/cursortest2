package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.views.AlphaPressButton;
import org.betup.ui.views.GradientTextView;

/* loaded from: classes2.dex */
public final class DialogMissionCompletedBinding implements ViewBinding {
    public final GradientTextView actionTitle;
    public final GradientTextView balance;
    public final ImageView betcoin;
    public final ConstraintLayout dialogContainer;
    public final LinearLayout message;
    public final AlphaPressButton ok;
    private final ConstraintLayout rootView;
    public final GradientTextView thanksLabel;
    public final GradientTextView wishLabel;
    public final GradientTextView yourPurchaseLabel;

    private DialogMissionCompletedBinding(ConstraintLayout rootView, GradientTextView actionTitle, GradientTextView balance, ImageView betcoin, ConstraintLayout dialogContainer, LinearLayout message, AlphaPressButton ok, GradientTextView thanksLabel, GradientTextView wishLabel, GradientTextView yourPurchaseLabel) {
        this.rootView = rootView;
        this.actionTitle = actionTitle;
        this.balance = balance;
        this.betcoin = betcoin;
        this.dialogContainer = dialogContainer;
        this.message = message;
        this.ok = ok;
        this.thanksLabel = thanksLabel;
        this.wishLabel = wishLabel;
        this.yourPurchaseLabel = yourPurchaseLabel;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogMissionCompletedBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogMissionCompletedBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_mission_completed, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogMissionCompletedBinding bind(View rootView) {
        int i = R.id.actionTitle;
        GradientTextView gradientTextView = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.actionTitle);
        if (gradientTextView != null) {
            i = R.id.balance;
            GradientTextView gradientTextView2 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.balance);
            if (gradientTextView2 != null) {
                i = R.id.betcoin;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.betcoin);
                if (imageView != null) {
                    i = R.id.dialog_container;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.dialog_container);
                    if (constraintLayout != null) {
                        i = R.id.message;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.message);
                        if (linearLayout != null) {
                            i = R.id.ok;
                            AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.ok);
                            if (alphaPressButton != null) {
                                i = R.id.thanks_label;
                                GradientTextView gradientTextView3 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.thanks_label);
                                if (gradientTextView3 != null) {
                                    i = R.id.wish_label;
                                    GradientTextView gradientTextView4 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.wish_label);
                                    if (gradientTextView4 != null) {
                                        i = R.id.your_purchase_label;
                                        GradientTextView gradientTextView5 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.your_purchase_label);
                                        if (gradientTextView5 != null) {
                                            return new DialogMissionCompletedBinding((ConstraintLayout) rootView, gradientTextView, gradientTextView2, imageView, constraintLayout, linearLayout, alphaPressButton, gradientTextView3, gradientTextView4, gradientTextView5);
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
