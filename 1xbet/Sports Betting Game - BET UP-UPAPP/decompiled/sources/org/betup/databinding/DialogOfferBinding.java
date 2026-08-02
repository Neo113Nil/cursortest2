package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.controls.ArcTextView;
import org.betup.ui.views.AlphaPressButton;

/* loaded from: classes2.dex */
public final class DialogOfferBinding implements ViewBinding {
    public final AppCompatTextView betcoinsAmount;
    public final AppCompatImageView betcoinsIcon;
    public final ConstraintLayout buyContainer;
    public final AppCompatImageView closeButton;
    public final ConstraintLayout dialogContainer;
    public final ImageView flashBackground;
    public final AppCompatImageView middleView;
    public final AppCompatTextView newPrice;
    public final ConstraintLayout offerDialog;
    public final ArcTextView offerTitle;
    public final AppCompatTextView oldPrice;
    public final AlphaPressButton pricesViews;
    public final FrameLayout progress;
    private final ConstraintLayout rootView;
    public final AppCompatTextView saleIcon;
    public final LinearLayoutCompat saleInfoContainer;
    public final AppCompatImageView snowView;
    public final AppCompatTextView subtitle;
    public final TextView timerTimeView;
    public final FrameLayout timerView;
    public final AppCompatImageView topImage;

    private DialogOfferBinding(ConstraintLayout rootView, AppCompatTextView betcoinsAmount, AppCompatImageView betcoinsIcon, ConstraintLayout buyContainer, AppCompatImageView closeButton, ConstraintLayout dialogContainer, ImageView flashBackground, AppCompatImageView middleView, AppCompatTextView newPrice, ConstraintLayout offerDialog, ArcTextView offerTitle, AppCompatTextView oldPrice, AlphaPressButton pricesViews, FrameLayout progress, AppCompatTextView saleIcon, LinearLayoutCompat saleInfoContainer, AppCompatImageView snowView, AppCompatTextView subtitle, TextView timerTimeView, FrameLayout timerView, AppCompatImageView topImage) {
        this.rootView = rootView;
        this.betcoinsAmount = betcoinsAmount;
        this.betcoinsIcon = betcoinsIcon;
        this.buyContainer = buyContainer;
        this.closeButton = closeButton;
        this.dialogContainer = dialogContainer;
        this.flashBackground = flashBackground;
        this.middleView = middleView;
        this.newPrice = newPrice;
        this.offerDialog = offerDialog;
        this.offerTitle = offerTitle;
        this.oldPrice = oldPrice;
        this.pricesViews = pricesViews;
        this.progress = progress;
        this.saleIcon = saleIcon;
        this.saleInfoContainer = saleInfoContainer;
        this.snowView = snowView;
        this.subtitle = subtitle;
        this.timerTimeView = timerTimeView;
        this.timerView = timerView;
        this.topImage = topImage;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogOfferBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogOfferBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_offer, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogOfferBinding bind(View rootView) {
        int i = R.id.betcoinsAmount;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.betcoinsAmount);
        if (appCompatTextView != null) {
            i = R.id.betcoinsIcon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.betcoinsIcon);
            if (appCompatImageView != null) {
                i = R.id.buyContainer;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.buyContainer);
                if (constraintLayout != null) {
                    i = R.id.closeButton;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.closeButton);
                    if (appCompatImageView2 != null) {
                        i = R.id.dialog_container;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.dialog_container);
                        if (constraintLayout2 != null) {
                            i = R.id.flashBackground;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.flashBackground);
                            if (imageView != null) {
                                i = R.id.middleView;
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.middleView);
                                if (appCompatImageView3 != null) {
                                    i = R.id.newPrice;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.newPrice);
                                    if (appCompatTextView2 != null) {
                                        i = R.id.offer_dialog;
                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.offer_dialog);
                                        if (constraintLayout3 != null) {
                                            i = R.id.offerTitle;
                                            ArcTextView arcTextView = (ArcTextView) ViewBindings.findChildViewById(rootView, R.id.offerTitle);
                                            if (arcTextView != null) {
                                                i = R.id.oldPrice;
                                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.oldPrice);
                                                if (appCompatTextView3 != null) {
                                                    i = R.id.pricesViews;
                                                    AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.pricesViews);
                                                    if (alphaPressButton != null) {
                                                        i = R.id.progress;
                                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.progress);
                                                        if (frameLayout != null) {
                                                            i = R.id.saleIcon;
                                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.saleIcon);
                                                            if (appCompatTextView4 != null) {
                                                                i = R.id.saleInfoContainer;
                                                                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(rootView, R.id.saleInfoContainer);
                                                                if (linearLayoutCompat != null) {
                                                                    i = R.id.snowView;
                                                                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.snowView);
                                                                    if (appCompatImageView4 != null) {
                                                                        i = R.id.subtitle;
                                                                        AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.subtitle);
                                                                        if (appCompatTextView5 != null) {
                                                                            i = R.id.timerTimeView;
                                                                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.timerTimeView);
                                                                            if (textView != null) {
                                                                                i = R.id.timerView;
                                                                                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.timerView);
                                                                                if (frameLayout2 != null) {
                                                                                    i = R.id.top_image;
                                                                                    AppCompatImageView appCompatImageView5 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.top_image);
                                                                                    if (appCompatImageView5 != null) {
                                                                                        return new DialogOfferBinding((ConstraintLayout) rootView, appCompatTextView, appCompatImageView, constraintLayout, appCompatImageView2, constraintLayout2, imageView, appCompatImageView3, appCompatTextView2, constraintLayout3, arcTextView, appCompatTextView3, alphaPressButton, frameLayout, appCompatTextView4, linearLayoutCompat, appCompatImageView4, appCompatTextView5, textView, frameLayout2, appCompatImageView5);
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
