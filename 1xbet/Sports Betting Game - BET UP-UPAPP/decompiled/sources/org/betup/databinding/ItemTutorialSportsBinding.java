package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ItemTutorialSportsBinding implements ViewBinding {
    public final ImageView favIconImageView;
    public final ImageView itemImage;
    public final TextView itemName;
    private final RelativeLayout rootView;
    public final ImageView subIcon;

    private ItemTutorialSportsBinding(RelativeLayout rootView, ImageView favIconImageView, ImageView itemImage, TextView itemName, ImageView subIcon) {
        this.rootView = rootView;
        this.favIconImageView = favIconImageView;
        this.itemImage = itemImage;
        this.itemName = itemName;
        this.subIcon = subIcon;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ItemTutorialSportsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemTutorialSportsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_tutorial_sports, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemTutorialSportsBinding bind(View rootView) {
        int i = R.id.favIconImageView;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.favIconImageView);
        if (imageView != null) {
            i = R.id.itemImage;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.itemImage);
            if (imageView2 != null) {
                i = R.id.itemName;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.itemName);
                if (textView != null) {
                    i = R.id.subIcon;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.subIcon);
                    if (imageView3 != null) {
                        return new ItemTutorialSportsBinding((RelativeLayout) rootView, imageView, imageView2, textView, imageView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
