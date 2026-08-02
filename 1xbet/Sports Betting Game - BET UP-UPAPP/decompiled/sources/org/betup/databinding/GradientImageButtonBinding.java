package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.views.GradientTextView;

/* loaded from: classes2.dex */
public final class GradientImageButtonBinding implements ViewBinding {
    public final ImageView icon;
    private final LinearLayout rootView;
    public final GradientTextView title;

    private GradientImageButtonBinding(LinearLayout rootView, ImageView icon, GradientTextView title) {
        this.rootView = rootView;
        this.icon = icon;
        this.title = title;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static GradientImageButtonBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static GradientImageButtonBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.gradient_image_button, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static GradientImageButtonBinding bind(View rootView) {
        int i = R.id.icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon);
        if (imageView != null) {
            i = R.id.title;
            GradientTextView gradientTextView = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.title);
            if (gradientTextView != null) {
                return new GradientImageButtonBinding((LinearLayout) rootView, imageView, gradientTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
