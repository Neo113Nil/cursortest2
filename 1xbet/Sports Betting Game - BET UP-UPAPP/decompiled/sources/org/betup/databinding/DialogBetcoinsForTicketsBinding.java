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
import org.betup.ui.controls.ArcTextView;
import org.betup.ui.views.AlphaPressButton;
import org.betup.ui.views.GradientTextView;

/* loaded from: classes2.dex */
public final class DialogBetcoinsForTicketsBinding implements ViewBinding {
    public final GradientTextView betcoins;
    public final LinearLayout betcoinsContainer;
    public final AlphaPressButton close;
    public final ConstraintLayout dialogContainer;
    public final AlphaPressButton exchange;
    public final ImageView icon;
    public final View iconContainer;
    public final ImageView imageView;
    public final ArcTextView label;
    public final GradientTextView price;
    private final ConstraintLayout rootView;

    private DialogBetcoinsForTicketsBinding(ConstraintLayout rootView, GradientTextView betcoins, LinearLayout betcoinsContainer, AlphaPressButton close, ConstraintLayout dialogContainer, AlphaPressButton exchange, ImageView icon, View iconContainer, ImageView imageView, ArcTextView label, GradientTextView price) {
        this.rootView = rootView;
        this.betcoins = betcoins;
        this.betcoinsContainer = betcoinsContainer;
        this.close = close;
        this.dialogContainer = dialogContainer;
        this.exchange = exchange;
        this.icon = icon;
        this.iconContainer = iconContainer;
        this.imageView = imageView;
        this.label = label;
        this.price = price;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogBetcoinsForTicketsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogBetcoinsForTicketsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_betcoins_for_tickets, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogBetcoinsForTicketsBinding bind(View rootView) {
        int i = R.id.betcoins;
        GradientTextView gradientTextView = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.betcoins);
        if (gradientTextView != null) {
            i = R.id.betcoinsContainer;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.betcoinsContainer);
            if (linearLayout != null) {
                i = R.id.close;
                AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.close);
                if (alphaPressButton != null) {
                    i = R.id.dialog_container;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.dialog_container);
                    if (constraintLayout != null) {
                        i = R.id.exchange;
                        AlphaPressButton alphaPressButton2 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.exchange);
                        if (alphaPressButton2 != null) {
                            i = R.id.icon;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon);
                            if (imageView != null) {
                                i = R.id.iconContainer;
                                View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.iconContainer);
                                if (findChildViewById != null) {
                                    i = R.id.imageView;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imageView);
                                    if (imageView2 != null) {
                                        i = R.id.label;
                                        ArcTextView arcTextView = (ArcTextView) ViewBindings.findChildViewById(rootView, R.id.label);
                                        if (arcTextView != null) {
                                            i = R.id.price;
                                            GradientTextView gradientTextView2 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.price);
                                            if (gradientTextView2 != null) {
                                                return new DialogBetcoinsForTicketsBinding((ConstraintLayout) rootView, gradientTextView, linearLayout, alphaPressButton, constraintLayout, alphaPressButton2, imageView, findChildViewById, imageView2, arcTextView, gradientTextView2);
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
