package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.controls.ArcTextView;
import org.betup.ui.views.AlphaPressButton;
import org.betup.ui.views.GradientTextView;

/* loaded from: classes2.dex */
public final class DialogOneTimeOfferBinding implements ViewBinding {
    public final GradientTextView betcoins;
    public final LinearLayout betcoinsContainer;
    public final AlphaPressButton buy;
    public final AlphaPressButton close;
    public final LinearLayout container;
    public final ConstraintLayout dialogContainer;
    public final ImageView imageView;
    public final ArcTextView label;
    public final GradientTextView oldPrice;
    public final ImageView oneTimeOffer;
    public final GradientTextView price;
    private final ConstraintLayout rootView;
    public final GradientTextView tickets;
    public final TextView timer;

    private DialogOneTimeOfferBinding(ConstraintLayout rootView, GradientTextView betcoins, LinearLayout betcoinsContainer, AlphaPressButton buy, AlphaPressButton close, LinearLayout container, ConstraintLayout dialogContainer, ImageView imageView, ArcTextView label, GradientTextView oldPrice, ImageView oneTimeOffer, GradientTextView price, GradientTextView tickets, TextView timer) {
        this.rootView = rootView;
        this.betcoins = betcoins;
        this.betcoinsContainer = betcoinsContainer;
        this.buy = buy;
        this.close = close;
        this.container = container;
        this.dialogContainer = dialogContainer;
        this.imageView = imageView;
        this.label = label;
        this.oldPrice = oldPrice;
        this.oneTimeOffer = oneTimeOffer;
        this.price = price;
        this.tickets = tickets;
        this.timer = timer;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogOneTimeOfferBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogOneTimeOfferBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_one_time_offer, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogOneTimeOfferBinding bind(View rootView) {
        int i = R.id.betcoins;
        GradientTextView gradientTextView = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.betcoins);
        if (gradientTextView != null) {
            i = R.id.betcoinsContainer;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.betcoinsContainer);
            if (linearLayout != null) {
                i = R.id.buy;
                AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.buy);
                if (alphaPressButton != null) {
                    i = R.id.close;
                    AlphaPressButton alphaPressButton2 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.close);
                    if (alphaPressButton2 != null) {
                        i = R.id.container;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.container);
                        if (linearLayout2 != null) {
                            i = R.id.dialog_container;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.dialog_container);
                            if (constraintLayout != null) {
                                i = R.id.imageView;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imageView);
                                if (imageView != null) {
                                    i = R.id.label;
                                    ArcTextView arcTextView = (ArcTextView) ViewBindings.findChildViewById(rootView, R.id.label);
                                    if (arcTextView != null) {
                                        i = R.id.old_price;
                                        GradientTextView gradientTextView2 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.old_price);
                                        if (gradientTextView2 != null) {
                                            i = R.id.one_time_offer;
                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.one_time_offer);
                                            if (imageView2 != null) {
                                                i = R.id.price;
                                                GradientTextView gradientTextView3 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.price);
                                                if (gradientTextView3 != null) {
                                                    i = R.id.tickets;
                                                    GradientTextView gradientTextView4 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.tickets);
                                                    if (gradientTextView4 != null) {
                                                        i = R.id.timer;
                                                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.timer);
                                                        if (textView != null) {
                                                            return new DialogOneTimeOfferBinding((ConstraintLayout) rootView, gradientTextView, linearLayout, alphaPressButton, alphaPressButton2, linearLayout2, constraintLayout, imageView, arcTextView, gradientTextView2, imageView2, gradientTextView3, gradientTextView4, textView);
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
