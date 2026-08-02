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
public final class OfferBetcoinItemBinding implements ViewBinding {
    public final TextView betcoinTv;
    private final LinearLayout rootView;

    private OfferBetcoinItemBinding(LinearLayout rootView, TextView betcoinTv) {
        this.rootView = rootView;
        this.betcoinTv = betcoinTv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static OfferBetcoinItemBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static OfferBetcoinItemBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.offer_betcoin_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static OfferBetcoinItemBinding bind(View rootView) {
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.betcoin_tv);
        if (textView != null) {
            return new OfferBetcoinItemBinding((LinearLayout) rootView, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.betcoin_tv)));
    }
}
