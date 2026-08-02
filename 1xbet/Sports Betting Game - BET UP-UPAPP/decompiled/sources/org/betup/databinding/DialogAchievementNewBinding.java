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
import org.betup.ui.views.GradientImageButton;
import org.betup.ui.views.GradientTextView;

/* loaded from: classes2.dex */
public final class DialogAchievementNewBinding implements ViewBinding {
    public final TextView betcoins;
    public final ImageView coin;
    public final TextView desc;
    public final ConstraintLayout dialogContainer;
    public final TextView earnedLabel;
    public final ConstraintLayout effects;
    public final GradientImageButton fbShare;
    public final ImageView icon;
    public final ImageView imageView;
    public final ArcTextView label;
    public final AlphaPressButton ok;
    public final GradientTextView price;
    private final ConstraintLayout rootView;
    public final GradientImageButton share;
    public final LinearLayout shareContainer;
    public final View stars;
    public final TextView title;
    public final GradientImageButton vkShare;

    private DialogAchievementNewBinding(ConstraintLayout rootView, TextView betcoins, ImageView coin, TextView desc, ConstraintLayout dialogContainer, TextView earnedLabel, ConstraintLayout effects, GradientImageButton fbShare, ImageView icon, ImageView imageView, ArcTextView label, AlphaPressButton ok, GradientTextView price, GradientImageButton share, LinearLayout shareContainer, View stars, TextView title, GradientImageButton vkShare) {
        this.rootView = rootView;
        this.betcoins = betcoins;
        this.coin = coin;
        this.desc = desc;
        this.dialogContainer = dialogContainer;
        this.earnedLabel = earnedLabel;
        this.effects = effects;
        this.fbShare = fbShare;
        this.icon = icon;
        this.imageView = imageView;
        this.label = label;
        this.ok = ok;
        this.price = price;
        this.share = share;
        this.shareContainer = shareContainer;
        this.stars = stars;
        this.title = title;
        this.vkShare = vkShare;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogAchievementNewBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogAchievementNewBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_achievement_new, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogAchievementNewBinding bind(View rootView) {
        int i = R.id.betcoins;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.betcoins);
        if (textView != null) {
            i = R.id.coin;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.coin);
            if (imageView != null) {
                i = R.id.desc;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.desc);
                if (textView2 != null) {
                    i = R.id.dialog_container;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.dialog_container);
                    if (constraintLayout != null) {
                        i = R.id.earned_label;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.earned_label);
                        if (textView3 != null) {
                            i = R.id.effects;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.effects);
                            if (constraintLayout2 != null) {
                                i = R.id.fb_share;
                                GradientImageButton gradientImageButton = (GradientImageButton) ViewBindings.findChildViewById(rootView, R.id.fb_share);
                                if (gradientImageButton != null) {
                                    i = R.id.icon;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon);
                                    if (imageView2 != null) {
                                        i = R.id.imageView;
                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imageView);
                                        if (imageView3 != null) {
                                            i = R.id.label;
                                            ArcTextView arcTextView = (ArcTextView) ViewBindings.findChildViewById(rootView, R.id.label);
                                            if (arcTextView != null) {
                                                i = R.id.ok;
                                                AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.ok);
                                                if (alphaPressButton != null) {
                                                    i = R.id.price;
                                                    GradientTextView gradientTextView = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.price);
                                                    if (gradientTextView != null) {
                                                        i = R.id.share;
                                                        GradientImageButton gradientImageButton2 = (GradientImageButton) ViewBindings.findChildViewById(rootView, R.id.share);
                                                        if (gradientImageButton2 != null) {
                                                            i = R.id.share_container;
                                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.share_container);
                                                            if (linearLayout != null) {
                                                                i = R.id.stars;
                                                                View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.stars);
                                                                if (findChildViewById != null) {
                                                                    i = R.id.title;
                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                                                                    if (textView4 != null) {
                                                                        i = R.id.vk_share;
                                                                        GradientImageButton gradientImageButton3 = (GradientImageButton) ViewBindings.findChildViewById(rootView, R.id.vk_share);
                                                                        if (gradientImageButton3 != null) {
                                                                            return new DialogAchievementNewBinding((ConstraintLayout) rootView, textView, imageView, textView2, constraintLayout, textView3, constraintLayout2, gradientImageButton, imageView2, imageView3, arcTextView, alphaPressButton, gradientTextView, gradientImageButton2, linearLayout, findChildViewById, textView4, gradientImageButton3);
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
