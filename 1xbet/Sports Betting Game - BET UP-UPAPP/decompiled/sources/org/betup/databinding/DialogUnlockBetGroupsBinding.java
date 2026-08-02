package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.controls.ArcTextView;
import org.betup.ui.views.AlphaPressButton;
import org.betup.ui.views.GradientTextView;

/* loaded from: classes2.dex */
public final class DialogUnlockBetGroupsBinding implements ViewBinding {
    public final LinearLayout betcoinsContainer;
    public final GradientTextView bonusText;
    public final AlphaPressButton close;
    public final ConstraintLayout dialogContainer;
    public final AlphaPressButton exchange;
    public final ImageView icon;
    public final View iconContainer;
    public final ImageView imageView;
    public final ArcTextView label;
    public final AppCompatTextView multiplyBonusTitle;
    public final GradientTextView onlyNow;
    public final GradientTextView or;
    public final GradientTextView price;
    private final ConstraintLayout rootView;
    public final GradientTextView title;
    public final ImageView videoIcon;
    public final AlphaPressButton watchVideo;

    private DialogUnlockBetGroupsBinding(ConstraintLayout rootView, LinearLayout betcoinsContainer, GradientTextView bonusText, AlphaPressButton close, ConstraintLayout dialogContainer, AlphaPressButton exchange, ImageView icon, View iconContainer, ImageView imageView, ArcTextView label, AppCompatTextView multiplyBonusTitle, GradientTextView onlyNow, GradientTextView or, GradientTextView price, GradientTextView title, ImageView videoIcon, AlphaPressButton watchVideo) {
        this.rootView = rootView;
        this.betcoinsContainer = betcoinsContainer;
        this.bonusText = bonusText;
        this.close = close;
        this.dialogContainer = dialogContainer;
        this.exchange = exchange;
        this.icon = icon;
        this.iconContainer = iconContainer;
        this.imageView = imageView;
        this.label = label;
        this.multiplyBonusTitle = multiplyBonusTitle;
        this.onlyNow = onlyNow;
        this.or = or;
        this.price = price;
        this.title = title;
        this.videoIcon = videoIcon;
        this.watchVideo = watchVideo;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogUnlockBetGroupsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogUnlockBetGroupsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_unlock_bet_groups, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogUnlockBetGroupsBinding bind(View rootView) {
        int i = R.id.betcoinsContainer;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.betcoinsContainer);
        if (linearLayout != null) {
            i = R.id.bonusText;
            GradientTextView gradientTextView = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.bonusText);
            if (gradientTextView != null) {
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
                                            i = R.id.multiplyBonusTitle;
                                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.multiplyBonusTitle);
                                            if (appCompatTextView != null) {
                                                i = R.id.only_now;
                                                GradientTextView gradientTextView2 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.only_now);
                                                if (gradientTextView2 != null) {
                                                    i = R.id.or;
                                                    GradientTextView gradientTextView3 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.or);
                                                    if (gradientTextView3 != null) {
                                                        i = R.id.price;
                                                        GradientTextView gradientTextView4 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.price);
                                                        if (gradientTextView4 != null) {
                                                            i = R.id.title;
                                                            GradientTextView gradientTextView5 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.title);
                                                            if (gradientTextView5 != null) {
                                                                i = R.id.videoIcon;
                                                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.videoIcon);
                                                                if (imageView3 != null) {
                                                                    i = R.id.watchVideo;
                                                                    AlphaPressButton alphaPressButton3 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.watchVideo);
                                                                    if (alphaPressButton3 != null) {
                                                                        return new DialogUnlockBetGroupsBinding((ConstraintLayout) rootView, linearLayout, gradientTextView, alphaPressButton, constraintLayout, alphaPressButton2, imageView, findChildViewById, imageView2, arcTextView, appCompatTextView, gradientTextView2, gradientTextView3, gradientTextView4, gradientTextView5, imageView3, alphaPressButton3);
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
