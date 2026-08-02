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
public final class DialogSubscriptionBinding implements ViewBinding {
    public final TextView accessLabel;
    public final LinearLayout betcoinsContainer;
    public final AlphaPressButton close;
    public final ConstraintLayout dialogContainer;
    public final LinearLayout fifthItem;
    public final LinearLayout firstItem;
    public final LinearLayout fourthItem;
    public final ImageView imageView;
    public final ArcTextView label;
    public final AlphaPressButton month;
    public final GradientTextView orLabel;
    public final GradientTextView priceMonth;
    public final GradientTextView priceWeek;
    private final ConstraintLayout rootView;
    public final LinearLayout secondItem;
    public final LinearLayout thirdItem;
    public final GradientTextView tickets;
    public final AlphaPressButton week;

    private DialogSubscriptionBinding(ConstraintLayout rootView, TextView accessLabel, LinearLayout betcoinsContainer, AlphaPressButton close, ConstraintLayout dialogContainer, LinearLayout fifthItem, LinearLayout firstItem, LinearLayout fourthItem, ImageView imageView, ArcTextView label, AlphaPressButton month, GradientTextView orLabel, GradientTextView priceMonth, GradientTextView priceWeek, LinearLayout secondItem, LinearLayout thirdItem, GradientTextView tickets, AlphaPressButton week) {
        this.rootView = rootView;
        this.accessLabel = accessLabel;
        this.betcoinsContainer = betcoinsContainer;
        this.close = close;
        this.dialogContainer = dialogContainer;
        this.fifthItem = fifthItem;
        this.firstItem = firstItem;
        this.fourthItem = fourthItem;
        this.imageView = imageView;
        this.label = label;
        this.month = month;
        this.orLabel = orLabel;
        this.priceMonth = priceMonth;
        this.priceWeek = priceWeek;
        this.secondItem = secondItem;
        this.thirdItem = thirdItem;
        this.tickets = tickets;
        this.week = week;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogSubscriptionBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogSubscriptionBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_subscription, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogSubscriptionBinding bind(View rootView) {
        int i = R.id.access_label;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.access_label);
        if (textView != null) {
            i = R.id.betcoinsContainer;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.betcoinsContainer);
            if (linearLayout != null) {
                i = R.id.close;
                AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.close);
                if (alphaPressButton != null) {
                    i = R.id.dialog_container;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.dialog_container);
                    if (constraintLayout != null) {
                        i = R.id.fifthItem;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.fifthItem);
                        if (linearLayout2 != null) {
                            i = R.id.firstItem;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.firstItem);
                            if (linearLayout3 != null) {
                                i = R.id.fourthItem;
                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.fourthItem);
                                if (linearLayout4 != null) {
                                    i = R.id.imageView;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imageView);
                                    if (imageView != null) {
                                        i = R.id.label;
                                        ArcTextView arcTextView = (ArcTextView) ViewBindings.findChildViewById(rootView, R.id.label);
                                        if (arcTextView != null) {
                                            i = R.id.month;
                                            AlphaPressButton alphaPressButton2 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.month);
                                            if (alphaPressButton2 != null) {
                                                i = R.id.or_label;
                                                GradientTextView gradientTextView = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.or_label);
                                                if (gradientTextView != null) {
                                                    i = R.id.priceMonth;
                                                    GradientTextView gradientTextView2 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.priceMonth);
                                                    if (gradientTextView2 != null) {
                                                        i = R.id.priceWeek;
                                                        GradientTextView gradientTextView3 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.priceWeek);
                                                        if (gradientTextView3 != null) {
                                                            i = R.id.secondItem;
                                                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.secondItem);
                                                            if (linearLayout5 != null) {
                                                                i = R.id.thirdItem;
                                                                LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.thirdItem);
                                                                if (linearLayout6 != null) {
                                                                    i = R.id.tickets;
                                                                    GradientTextView gradientTextView4 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.tickets);
                                                                    if (gradientTextView4 != null) {
                                                                        i = R.id.week;
                                                                        AlphaPressButton alphaPressButton3 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.week);
                                                                        if (alphaPressButton3 != null) {
                                                                            return new DialogSubscriptionBinding((ConstraintLayout) rootView, textView, linearLayout, alphaPressButton, constraintLayout, linearLayout2, linearLayout3, linearLayout4, imageView, arcTextView, alphaPressButton2, gradientTextView, gradientTextView2, gradientTextView3, linearLayout5, linearLayout6, gradientTextView4, alphaPressButton3);
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
