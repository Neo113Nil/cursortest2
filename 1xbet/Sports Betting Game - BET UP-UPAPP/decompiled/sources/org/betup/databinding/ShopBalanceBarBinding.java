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
public final class ShopBalanceBarBinding implements ViewBinding {
    public final ConstraintLayout balanceView;
    public final ImageView betcoinIv;
    public final TextView betcoins;
    private final ConstraintLayout rootView;

    private ShopBalanceBarBinding(ConstraintLayout rootView, ConstraintLayout balanceView, ImageView betcoinIv, TextView betcoins) {
        this.rootView = rootView;
        this.balanceView = balanceView;
        this.betcoinIv = betcoinIv;
        this.betcoins = betcoins;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ShopBalanceBarBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ShopBalanceBarBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.shop_balance_bar, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ShopBalanceBarBinding bind(View rootView) {
        ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
        int i = R.id.betcoin_iv;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.betcoin_iv);
        if (imageView != null) {
            i = R.id.betcoins;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.betcoins);
            if (textView != null) {
                return new ShopBalanceBarBinding(constraintLayout, constraintLayout, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
