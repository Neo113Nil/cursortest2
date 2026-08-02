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
import com.makeramen.roundedimageview.RoundedImageView;
import org.betup.R;
import org.betup.ui.controls.ArcTextView;
import org.betup.ui.views.GradientImageButton;

/* loaded from: classes2.dex */
public final class DialogFollowNotificationBinding implements ViewBinding {
    public final RoundedImageView avatar;
    public final GradientImageButton close;
    public final ImageView countryLogo;
    public final ConstraintLayout dialogContainer;
    public final GradientImageButton follow;
    public final ImageView imageView;
    public final TextView label;
    public final ProgressBar progress;
    private final ConstraintLayout rootView;
    public final ImageView star;
    public final ArcTextView title;
    public final Group userDetails;

    private DialogFollowNotificationBinding(ConstraintLayout rootView, RoundedImageView avatar, GradientImageButton close, ImageView countryLogo, ConstraintLayout dialogContainer, GradientImageButton follow, ImageView imageView, TextView label, ProgressBar progress, ImageView star, ArcTextView title, Group userDetails) {
        this.rootView = rootView;
        this.avatar = avatar;
        this.close = close;
        this.countryLogo = countryLogo;
        this.dialogContainer = dialogContainer;
        this.follow = follow;
        this.imageView = imageView;
        this.label = label;
        this.progress = progress;
        this.star = star;
        this.title = title;
        this.userDetails = userDetails;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogFollowNotificationBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogFollowNotificationBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_follow_notification, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogFollowNotificationBinding bind(View rootView) {
        int i = R.id.avatar;
        RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(rootView, R.id.avatar);
        if (roundedImageView != null) {
            i = R.id.close;
            GradientImageButton gradientImageButton = (GradientImageButton) ViewBindings.findChildViewById(rootView, R.id.close);
            if (gradientImageButton != null) {
                i = R.id.countryLogo;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.countryLogo);
                if (imageView != null) {
                    i = R.id.dialog_container;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.dialog_container);
                    if (constraintLayout != null) {
                        i = R.id.follow;
                        GradientImageButton gradientImageButton2 = (GradientImageButton) ViewBindings.findChildViewById(rootView, R.id.follow);
                        if (gradientImageButton2 != null) {
                            i = R.id.imageView;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imageView);
                            if (imageView2 != null) {
                                i = R.id.label;
                                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.label);
                                if (textView != null) {
                                    i = R.id.progress;
                                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                                    if (progressBar != null) {
                                        i = R.id.star;
                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.star);
                                        if (imageView3 != null) {
                                            i = R.id.title;
                                            ArcTextView arcTextView = (ArcTextView) ViewBindings.findChildViewById(rootView, R.id.title);
                                            if (arcTextView != null) {
                                                i = R.id.userDetails;
                                                Group group = (Group) ViewBindings.findChildViewById(rootView, R.id.userDetails);
                                                if (group != null) {
                                                    return new DialogFollowNotificationBinding((ConstraintLayout) rootView, roundedImageView, gradientImageButton, imageView, constraintLayout, gradientImageButton2, imageView2, textView, progressBar, imageView3, arcTextView, group);
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
