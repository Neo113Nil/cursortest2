package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.views.AlphaPressButton;
import org.betup.ui.views.GradientImageButton;
import org.betup.ui.views.GradientTextView;

/* loaded from: classes2.dex */
public final class DialogLevelBinding implements ViewBinding {
    public final ConstraintLayout dialogContainer;
    public final View effects;
    public final RecyclerView effectsList;
    public final GradientImageButton fbShare;
    public final ImageView imageView;
    public final ImageView label;
    public final ImageView leftPipes;
    public final GradientTextView levelLabel;
    public final AlphaPressButton ok;
    public final GradientTextView price;
    public final ImageView rightPipes;
    private final ConstraintLayout rootView;
    public final GradientImageButton share;
    public final LinearLayout shareContainer;
    public final ImageView star;
    public final ImageView trumpery;
    public final GradientImageButton vkShare;

    private DialogLevelBinding(ConstraintLayout rootView, ConstraintLayout dialogContainer, View effects, RecyclerView effectsList, GradientImageButton fbShare, ImageView imageView, ImageView label, ImageView leftPipes, GradientTextView levelLabel, AlphaPressButton ok, GradientTextView price, ImageView rightPipes, GradientImageButton share, LinearLayout shareContainer, ImageView star, ImageView trumpery, GradientImageButton vkShare) {
        this.rootView = rootView;
        this.dialogContainer = dialogContainer;
        this.effects = effects;
        this.effectsList = effectsList;
        this.fbShare = fbShare;
        this.imageView = imageView;
        this.label = label;
        this.leftPipes = leftPipes;
        this.levelLabel = levelLabel;
        this.ok = ok;
        this.price = price;
        this.rightPipes = rightPipes;
        this.share = share;
        this.shareContainer = shareContainer;
        this.star = star;
        this.trumpery = trumpery;
        this.vkShare = vkShare;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogLevelBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogLevelBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_level, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogLevelBinding bind(View rootView) {
        int i = R.id.dialog_container;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.dialog_container);
        if (constraintLayout != null) {
            i = R.id.effects;
            View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.effects);
            if (findChildViewById != null) {
                i = R.id.effectsList;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.effectsList);
                if (recyclerView != null) {
                    i = R.id.fb_share;
                    GradientImageButton gradientImageButton = (GradientImageButton) ViewBindings.findChildViewById(rootView, R.id.fb_share);
                    if (gradientImageButton != null) {
                        i = R.id.imageView;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imageView);
                        if (imageView != null) {
                            i = R.id.label;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.label);
                            if (imageView2 != null) {
                                i = R.id.left_pipes;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.left_pipes);
                                if (imageView3 != null) {
                                    i = R.id.levelLabel;
                                    GradientTextView gradientTextView = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.levelLabel);
                                    if (gradientTextView != null) {
                                        i = R.id.ok;
                                        AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.ok);
                                        if (alphaPressButton != null) {
                                            i = R.id.price;
                                            GradientTextView gradientTextView2 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.price);
                                            if (gradientTextView2 != null) {
                                                i = R.id.right_pipes;
                                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.right_pipes);
                                                if (imageView4 != null) {
                                                    i = R.id.share;
                                                    GradientImageButton gradientImageButton2 = (GradientImageButton) ViewBindings.findChildViewById(rootView, R.id.share);
                                                    if (gradientImageButton2 != null) {
                                                        i = R.id.share_container;
                                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.share_container);
                                                        if (linearLayout != null) {
                                                            i = R.id.star;
                                                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.star);
                                                            if (imageView5 != null) {
                                                                i = R.id.trumpery;
                                                                ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.trumpery);
                                                                if (imageView6 != null) {
                                                                    i = R.id.vk_share;
                                                                    GradientImageButton gradientImageButton3 = (GradientImageButton) ViewBindings.findChildViewById(rootView, R.id.vk_share);
                                                                    if (gradientImageButton3 != null) {
                                                                        return new DialogLevelBinding((ConstraintLayout) rootView, constraintLayout, findChildViewById, recyclerView, gradientImageButton, imageView, imageView2, imageView3, gradientTextView, alphaPressButton, gradientTextView2, imageView4, gradientImageButton2, linearLayout, imageView5, imageView6, gradientImageButton3);
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
