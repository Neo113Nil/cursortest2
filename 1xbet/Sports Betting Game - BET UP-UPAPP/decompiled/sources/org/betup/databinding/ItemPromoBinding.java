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
public final class ItemPromoBinding implements ViewBinding {
    public final TextView desc;
    public final LinearLayout header;
    public final ImageView icon;
    public final TextView price;
    private final LinearLayout rootView;
    public final TextView title;

    private ItemPromoBinding(LinearLayout rootView, TextView desc, LinearLayout header, ImageView icon, TextView price, TextView title) {
        this.rootView = rootView;
        this.desc = desc;
        this.header = header;
        this.icon = icon;
        this.price = price;
        this.title = title;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemPromoBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemPromoBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_promo, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemPromoBinding bind(View rootView) {
        int i = R.id.desc;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.desc);
        if (textView != null) {
            LinearLayout linearLayout = (LinearLayout) rootView;
            i = R.id.icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon);
            if (imageView != null) {
                i = R.id.price;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.price);
                if (textView2 != null) {
                    i = R.id.title;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                    if (textView3 != null) {
                        return new ItemPromoBinding(linearLayout, textView, linearLayout, imageView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
