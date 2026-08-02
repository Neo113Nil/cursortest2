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
import org.betup.ui.controls.SpriteImageButton;
import org.betup.ui.views.AlphaPressButton;
import org.betup.ui.views.GradientTextView;

/* loaded from: classes2.dex */
public final class DialogUnlockBetAmountBinding implements ViewBinding {
    public final LinearLayout betcoinsContainer;
    public final GradientTextView bonusText;
    public final AlphaPressButton close;
    public final ConstraintLayout dialogContainer;
    public final SpriteImageButton exchange;
    public final ImageView icon;
    public final View iconContainer;
    public final ImageView imageView;
    public final ArcTextView label;
    public final GradientTextView onlyNow;
    private final ConstraintLayout rootView;
    public final GradientTextView title;

    private DialogUnlockBetAmountBinding(ConstraintLayout rootView, LinearLayout betcoinsContainer, GradientTextView bonusText, AlphaPressButton close, ConstraintLayout dialogContainer, SpriteImageButton exchange, ImageView icon, View iconContainer, ImageView imageView, ArcTextView label, GradientTextView onlyNow, GradientTextView title) {
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
        this.onlyNow = onlyNow;
        this.title = title;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogUnlockBetAmountBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogUnlockBetAmountBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_unlock_bet_amount, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogUnlockBetAmountBinding bind(View rootView) {
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
                        SpriteImageButton spriteImageButton = (SpriteImageButton) ViewBindings.findChildViewById(rootView, R.id.exchange);
                        if (spriteImageButton != null) {
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
                                            i = R.id.only_now;
                                            GradientTextView gradientTextView2 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.only_now);
                                            if (gradientTextView2 != null) {
                                                i = R.id.title;
                                                GradientTextView gradientTextView3 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.title);
                                                if (gradientTextView3 != null) {
                                                    return new DialogUnlockBetAmountBinding((ConstraintLayout) rootView, linearLayout, gradientTextView, alphaPressButton, constraintLayout, spriteImageButton, imageView, findChildViewById, imageView2, arcTextView, gradientTextView2, gradientTextView3);
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
