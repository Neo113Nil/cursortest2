package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.controls.ArcTextView;
import org.betup.ui.views.AlphaPressButton;
import org.betup.ui.views.GradientTextView;

/* loaded from: classes2.dex */
public final class DialogBuyTicketsBinding implements ViewBinding {
    public final AlphaPressButton close;
    public final ConstraintLayout dialogContainer;
    public final ImageView imageView;
    public final ArcTextView label;
    public final GradientTextView message;
    public final AlphaPressButton ok;
    public final GradientTextView price;
    private final ConstraintLayout rootView;

    private DialogBuyTicketsBinding(ConstraintLayout rootView, AlphaPressButton close, ConstraintLayout dialogContainer, ImageView imageView, ArcTextView label, GradientTextView message, AlphaPressButton ok, GradientTextView price) {
        this.rootView = rootView;
        this.close = close;
        this.dialogContainer = dialogContainer;
        this.imageView = imageView;
        this.label = label;
        this.message = message;
        this.ok = ok;
        this.price = price;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogBuyTicketsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogBuyTicketsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_buy_tickets, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogBuyTicketsBinding bind(View rootView) {
        int i = R.id.close;
        AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.close);
        if (alphaPressButton != null) {
            i = R.id.dialog_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.dialog_container);
            if (constraintLayout != null) {
                i = R.id.imageView;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imageView);
                if (imageView != null) {
                    i = R.id.label;
                    ArcTextView arcTextView = (ArcTextView) ViewBindings.findChildViewById(rootView, R.id.label);
                    if (arcTextView != null) {
                        i = R.id.message;
                        GradientTextView gradientTextView = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.message);
                        if (gradientTextView != null) {
                            i = R.id.ok;
                            AlphaPressButton alphaPressButton2 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.ok);
                            if (alphaPressButton2 != null) {
                                i = R.id.price;
                                GradientTextView gradientTextView2 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.price);
                                if (gradientTextView2 != null) {
                                    return new DialogBuyTicketsBinding((ConstraintLayout) rootView, alphaPressButton, constraintLayout, imageView, arcTextView, gradientTextView, alphaPressButton2, gradientTextView2);
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
