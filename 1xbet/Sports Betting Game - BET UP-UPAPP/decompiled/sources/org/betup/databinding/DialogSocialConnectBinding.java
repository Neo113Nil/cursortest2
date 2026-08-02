package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
public final class DialogSocialConnectBinding implements ViewBinding {
    public final TextView already;
    public final AlphaPressButton close;
    public final ConstraintLayout dialogContainer;
    public final LinearLayout divider;
    public final AlphaPressButton fbButton;
    public final AlphaPressButton googlePlusButton;
    public final ImageView imageView;
    public final ArcTextView loginTitle;
    public final ProgressBar progress;
    public final GradientTextView rewardAmount;
    private final ConstraintLayout rootView;
    public final AlphaPressButton signInButton;
    public final Group socialButtons;
    public final LinearLayout stats;
    public final AlphaPressButton vkButton;

    private DialogSocialConnectBinding(ConstraintLayout rootView, TextView already, AlphaPressButton close, ConstraintLayout dialogContainer, LinearLayout divider, AlphaPressButton fbButton, AlphaPressButton googlePlusButton, ImageView imageView, ArcTextView loginTitle, ProgressBar progress, GradientTextView rewardAmount, AlphaPressButton signInButton, Group socialButtons, LinearLayout stats, AlphaPressButton vkButton) {
        this.rootView = rootView;
        this.already = already;
        this.close = close;
        this.dialogContainer = dialogContainer;
        this.divider = divider;
        this.fbButton = fbButton;
        this.googlePlusButton = googlePlusButton;
        this.imageView = imageView;
        this.loginTitle = loginTitle;
        this.progress = progress;
        this.rewardAmount = rewardAmount;
        this.signInButton = signInButton;
        this.socialButtons = socialButtons;
        this.stats = stats;
        this.vkButton = vkButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogSocialConnectBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogSocialConnectBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_social_connect, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogSocialConnectBinding bind(View rootView) {
        int i = R.id.already;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.already);
        if (textView != null) {
            i = R.id.close;
            AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.close);
            if (alphaPressButton != null) {
                i = R.id.dialog_container;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.dialog_container);
                if (constraintLayout != null) {
                    i = R.id.divider;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.divider);
                    if (linearLayout != null) {
                        i = R.id.fbButton;
                        AlphaPressButton alphaPressButton2 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.fbButton);
                        if (alphaPressButton2 != null) {
                            i = R.id.googlePlusButton;
                            AlphaPressButton alphaPressButton3 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.googlePlusButton);
                            if (alphaPressButton3 != null) {
                                i = R.id.imageView;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imageView);
                                if (imageView != null) {
                                    i = R.id.loginTitle;
                                    ArcTextView arcTextView = (ArcTextView) ViewBindings.findChildViewById(rootView, R.id.loginTitle);
                                    if (arcTextView != null) {
                                        i = R.id.progress;
                                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                                        if (progressBar != null) {
                                            i = R.id.rewardAmount;
                                            GradientTextView gradientTextView = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.rewardAmount);
                                            if (gradientTextView != null) {
                                                i = R.id.signInButton;
                                                AlphaPressButton alphaPressButton4 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.signInButton);
                                                if (alphaPressButton4 != null) {
                                                    i = R.id.socialButtons;
                                                    Group group = (Group) ViewBindings.findChildViewById(rootView, R.id.socialButtons);
                                                    if (group != null) {
                                                        i = R.id.stats;
                                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.stats);
                                                        if (linearLayout2 != null) {
                                                            i = R.id.vkButton;
                                                            AlphaPressButton alphaPressButton5 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.vkButton);
                                                            if (alphaPressButton5 != null) {
                                                                return new DialogSocialConnectBinding((ConstraintLayout) rootView, textView, alphaPressButton, constraintLayout, linearLayout, alphaPressButton2, alphaPressButton3, imageView, arcTextView, progressBar, gradientTextView, alphaPressButton4, group, linearLayout2, alphaPressButton5);
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
