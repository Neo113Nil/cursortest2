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
public final class ItemUserFavoriteBinding implements ViewBinding {
    public final ImageView icon;
    public final TextView name;
    private final LinearLayout rootView;

    private ItemUserFavoriteBinding(LinearLayout rootView, ImageView icon, TextView name) {
        this.rootView = rootView;
        this.icon = icon;
        this.name = name;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemUserFavoriteBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemUserFavoriteBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_user_favorite, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemUserFavoriteBinding bind(View rootView) {
        int i = R.id.icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon);
        if (imageView != null) {
            i = R.id.name;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.name);
            if (textView != null) {
                return new ItemUserFavoriteBinding((LinearLayout) rootView, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
