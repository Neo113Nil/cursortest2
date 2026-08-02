package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.controls.ArcTextView;
import org.betup.ui.views.AlphaPressButton;
import org.betup.ui.views.GradientTextView;

/* loaded from: classes2.dex */
public final class DialogSellBetBinding implements ViewBinding {
    public final TextView betcoins;
    public final AlphaPressButton close;
    public final ImageView coinIcon;
    public final Group contentGroup;
    public final ConstraintLayout dialogContainer;
    public final ImageView imageView;
    public final ArcTextView label;
    public final GradientTextView message;
    public final ConstraintLayout messageContainer;
    public final AlphaPressButton ok;
    public final GradientTextView price;
    public final ProgressBar progress;
    private final ConstraintLayout rootView;
    public final TextView subMessage;

    private DialogSellBetBinding(ConstraintLayout rootView, TextView betcoins, AlphaPressButton close, ImageView coinIcon, Group contentGroup, ConstraintLayout dialogContainer, ImageView imageView, ArcTextView label, GradientTextView message, ConstraintLayout messageContainer, AlphaPressButton ok, GradientTextView price, ProgressBar progress, TextView subMessage) {
        this.rootView = rootView;
        this.betcoins = betcoins;
        this.close = close;
        this.coinIcon = coinIcon;
        this.contentGroup = contentGroup;
        this.dialogContainer = dialogContainer;
        this.imageView = imageView;
        this.label = label;
        this.message = message;
        this.messageContainer = messageContainer;
        this.ok = ok;
        this.price = price;
        this.progress = progress;
        this.subMessage = subMessage;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogSellBetBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogSellBetBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_sell_bet, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogSellBetBinding bind(View rootView) {
        int i = R.id.betcoins;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.betcoins);
        if (textView != null) {
            i = R.id.close;
            AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.close);
            if (alphaPressButton != null) {
                i = R.id.coinIcon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.coinIcon);
                if (imageView != null) {
                    i = R.id.contentGroup;
                    Group group = (Group) ViewBindings.findChildViewById(rootView, R.id.contentGroup);
                    if (group != null) {
                        i = R.id.dialog_container;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.dialog_container);
                        if (constraintLayout != null) {
                            i = R.id.imageView;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imageView);
                            if (imageView2 != null) {
                                i = R.id.label;
                                ArcTextView arcTextView = (ArcTextView) ViewBindings.findChildViewById(rootView, R.id.label);
                                if (arcTextView != null) {
                                    i = R.id.message;
                                    GradientTextView gradientTextView = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.message);
                                    if (gradientTextView != null) {
                                        i = R.id.messageContainer;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.messageContainer);
                                        if (constraintLayout2 != null) {
                                            i = R.id.ok;
                                            AlphaPressButton alphaPressButton2 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.ok);
                                            if (alphaPressButton2 != null) {
                                                i = R.id.price;
                                                GradientTextView gradientTextView2 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.price);
                                                if (gradientTextView2 != null) {
                                                    i = R.id.progress;
                                                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                                                    if (progressBar != null) {
                                                        i = R.id.subMessage;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.subMessage);
                                                        if (textView2 != null) {
                                                            return new DialogSellBetBinding((ConstraintLayout) rootView, textView, alphaPressButton, imageView, group, constraintLayout, imageView2, arcTextView, gradientTextView, constraintLayout2, alphaPressButton2, gradientTextView2, progressBar, textView2);
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
