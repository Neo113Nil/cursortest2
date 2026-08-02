package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class HighlightItemHomeBinding implements ViewBinding {
    public final ImageView icon;
    public final TextView minute;
    private final ConstraintLayout rootView;
    public final TextView subtitle;
    public final TextView title;

    private HighlightItemHomeBinding(ConstraintLayout rootView, ImageView icon, TextView minute, TextView subtitle, TextView title) {
        this.rootView = rootView;
        this.icon = icon;
        this.minute = minute;
        this.subtitle = subtitle;
        this.title = title;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static HighlightItemHomeBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static HighlightItemHomeBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.highlight_item_home, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static HighlightItemHomeBinding bind(View rootView) {
        int i = R.id.icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon);
        if (imageView != null) {
            i = R.id.minute;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.minute);
            if (textView != null) {
                i = R.id.subtitle;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.subtitle);
                if (textView2 != null) {
                    i = R.id.title;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                    if (textView3 != null) {
                        return new HighlightItemHomeBinding((ConstraintLayout) rootView, imageView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
