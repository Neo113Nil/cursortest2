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
public final class ItemSearchResultBinding implements ViewBinding {
    public final LinearLayout container;
    public final ImageView favIconImageView;
    public final ImageView itemImage;
    public final TextView itemName;
    private final LinearLayout rootView;

    private ItemSearchResultBinding(LinearLayout rootView, LinearLayout container, ImageView favIconImageView, ImageView itemImage, TextView itemName) {
        this.rootView = rootView;
        this.container = container;
        this.favIconImageView = favIconImageView;
        this.itemImage = itemImage;
        this.itemName = itemName;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemSearchResultBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemSearchResultBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_search_result, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemSearchResultBinding bind(View rootView) {
        LinearLayout linearLayout = (LinearLayout) rootView;
        int i = R.id.favIconImageView;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.favIconImageView);
        if (imageView != null) {
            i = R.id.itemImage;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.itemImage);
            if (imageView2 != null) {
                i = R.id.itemName;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.itemName);
                if (textView != null) {
                    return new ItemSearchResultBinding(linearLayout, linearLayout, imageView, imageView2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
