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
public final class ReactionItemBinding implements ViewBinding {
    public final TextView counter;
    public final ImageView icon;
    private final LinearLayout rootView;

    private ReactionItemBinding(LinearLayout rootView, TextView counter, ImageView icon) {
        this.rootView = rootView;
        this.counter = counter;
        this.icon = icon;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ReactionItemBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ReactionItemBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.reaction_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ReactionItemBinding bind(View rootView) {
        int i = R.id.counter;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.counter);
        if (textView != null) {
            i = R.id.icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon);
            if (imageView != null) {
                return new ReactionItemBinding((LinearLayout) rootView, textView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
