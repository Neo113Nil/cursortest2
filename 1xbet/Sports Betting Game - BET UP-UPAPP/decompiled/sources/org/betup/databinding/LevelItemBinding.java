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
import org.betup.ui.views.GradientTextView;

/* loaded from: classes2.dex */
public final class LevelItemBinding implements ViewBinding {
    public final ImageView icon;
    public final GradientTextView label;
    public final LinearLayout labelContainer;
    private final ConstraintLayout rootView;
    public final ImageView subIcon;

    private LevelItemBinding(ConstraintLayout rootView, ImageView icon, GradientTextView label, LinearLayout labelContainer, ImageView subIcon) {
        this.rootView = rootView;
        this.icon = icon;
        this.label = label;
        this.labelContainer = labelContainer;
        this.subIcon = subIcon;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static LevelItemBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static LevelItemBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.level_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static LevelItemBinding bind(View rootView) {
        int i = R.id.icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon);
        if (imageView != null) {
            i = R.id.label;
            GradientTextView gradientTextView = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.label);
            if (gradientTextView != null) {
                i = R.id.label_container;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.label_container);
                if (linearLayout != null) {
                    i = R.id.subIcon;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.subIcon);
                    if (imageView2 != null) {
                        return new LevelItemBinding((ConstraintLayout) rootView, imageView, gradientTextView, linearLayout, imageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
