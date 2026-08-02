package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ItemDrawerBinding implements ViewBinding {
    public final ImageView arrow;
    public final ImageView image;
    public final ImageView newLabel;
    private final LinearLayout rootView;
    public final TextView title;

    private ItemDrawerBinding(LinearLayout rootView, ImageView arrow, ImageView image, ImageView newLabel, TextView title) {
        this.rootView = rootView;
        this.arrow = arrow;
        this.image = image;
        this.newLabel = newLabel;
        this.title = title;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemDrawerBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemDrawerBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_drawer, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemDrawerBinding bind(View rootView) {
        int i = R.id.arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.arrow);
        if (imageView != null) {
            i = R.id.image;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image);
            if (imageView2 != null) {
                i = R.id.newLabel;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.newLabel);
                if (imageView3 != null) {
                    i = R.id.title;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                    if (textView != null) {
                        return new ItemDrawerBinding((LinearLayout) rootView, imageView, imageView2, imageView3, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
