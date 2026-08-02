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
public final class ItemH2hStatBinding implements ViewBinding {
    public final TextView count;
    public final ImageView icon;
    private final LinearLayout rootView;

    private ItemH2hStatBinding(LinearLayout rootView, TextView count, ImageView icon) {
        this.rootView = rootView;
        this.count = count;
        this.icon = icon;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemH2hStatBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemH2hStatBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_h2h_stat, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemH2hStatBinding bind(View rootView) {
        int i = R.id.count;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.count);
        if (textView != null) {
            i = R.id.icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon);
            if (imageView != null) {
                return new ItemH2hStatBinding((LinearLayout) rootView, textView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
