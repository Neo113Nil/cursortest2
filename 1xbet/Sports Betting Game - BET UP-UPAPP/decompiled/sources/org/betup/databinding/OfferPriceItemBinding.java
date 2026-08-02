package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class OfferPriceItemBinding implements ViewBinding {
    public final TextView discountTv;
    public final TextView priceTv;
    private final LinearLayout rootView;

    private OfferPriceItemBinding(LinearLayout rootView, TextView discountTv, TextView priceTv) {
        this.rootView = rootView;
        this.discountTv = discountTv;
        this.priceTv = priceTv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static OfferPriceItemBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static OfferPriceItemBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.offer_price_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static OfferPriceItemBinding bind(View rootView) {
        int i = R.id.discount_tv;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.discount_tv);
        if (textView != null) {
            i = R.id.price_tv;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.price_tv);
            if (textView2 != null) {
                return new OfferPriceItemBinding((LinearLayout) rootView, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
