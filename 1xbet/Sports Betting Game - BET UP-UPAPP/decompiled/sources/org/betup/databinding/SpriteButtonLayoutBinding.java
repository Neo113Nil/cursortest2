package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.views.GradientTextView;

/* loaded from: classes2.dex */
public final class SpriteButtonLayoutBinding implements ViewBinding {
    public final ImageView buttonBackground;
    public final ImageView buttonIcon;
    public final GradientTextView buttonTitle;
    public final Space endMargin;
    private final ConstraintLayout rootView;

    private SpriteButtonLayoutBinding(ConstraintLayout rootView, ImageView buttonBackground, ImageView buttonIcon, GradientTextView buttonTitle, Space endMargin) {
        this.rootView = rootView;
        this.buttonBackground = buttonBackground;
        this.buttonIcon = buttonIcon;
        this.buttonTitle = buttonTitle;
        this.endMargin = endMargin;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static SpriteButtonLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static SpriteButtonLayoutBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.sprite_button_layout, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static SpriteButtonLayoutBinding bind(View rootView) {
        int i = R.id.buttonBackground;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.buttonBackground);
        if (imageView != null) {
            i = R.id.buttonIcon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.buttonIcon);
            if (imageView2 != null) {
                i = R.id.buttonTitle;
                GradientTextView gradientTextView = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.buttonTitle);
                if (gradientTextView != null) {
                    i = R.id.endMargin;
                    Space space = (Space) ViewBindings.findChildViewById(rootView, R.id.endMargin);
                    if (space != null) {
                        return new SpriteButtonLayoutBinding((ConstraintLayout) rootView, imageView, imageView2, gradientTextView, space);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
