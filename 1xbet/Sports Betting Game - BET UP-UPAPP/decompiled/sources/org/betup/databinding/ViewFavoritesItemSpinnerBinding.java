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
public final class ViewFavoritesItemSpinnerBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final TextView sportsNameTextView;
    public final ImageView sportsPictureImageView;

    private ViewFavoritesItemSpinnerBinding(LinearLayout rootView, TextView sportsNameTextView, ImageView sportsPictureImageView) {
        this.rootView = rootView;
        this.sportsNameTextView = sportsNameTextView;
        this.sportsPictureImageView = sportsPictureImageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ViewFavoritesItemSpinnerBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ViewFavoritesItemSpinnerBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.view_favorites_item_spinner, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ViewFavoritesItemSpinnerBinding bind(View rootView) {
        int i = R.id.sportsNameTextView;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.sportsNameTextView);
        if (textView != null) {
            i = R.id.sportsPictureImageView;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sportsPictureImageView);
            if (imageView != null) {
                return new ViewFavoritesItemSpinnerBinding((LinearLayout) rootView, textView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
