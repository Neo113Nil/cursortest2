package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.views.FontText;
import org.betup.ui.views.GradientTextView;

/* loaded from: classes2.dex */
public final class ShopItemBinding implements ViewBinding {
    public final LinearLayout amountContainer;
    public final FontText betcoins;
    public final ConstraintLayout container;
    public final ImageView icon;
    public final GradientTextView price;
    public final LinearLayout priceContainer;
    private final RelativeLayout rootView;

    private ShopItemBinding(RelativeLayout rootView, LinearLayout amountContainer, FontText betcoins, ConstraintLayout container, ImageView icon, GradientTextView price, LinearLayout priceContainer) {
        this.rootView = rootView;
        this.amountContainer = amountContainer;
        this.betcoins = betcoins;
        this.container = container;
        this.icon = icon;
        this.price = price;
        this.priceContainer = priceContainer;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ShopItemBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ShopItemBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.shop_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ShopItemBinding bind(View rootView) {
        int i = R.id.amountContainer;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.amountContainer);
        if (linearLayout != null) {
            i = R.id.betcoins;
            FontText fontText = (FontText) ViewBindings.findChildViewById(rootView, R.id.betcoins);
            if (fontText != null) {
                i = R.id.container;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.container);
                if (constraintLayout != null) {
                    i = R.id.icon;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon);
                    if (imageView != null) {
                        i = R.id.price;
                        GradientTextView gradientTextView = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.price);
                        if (gradientTextView != null) {
                            i = R.id.price_container;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.price_container);
                            if (linearLayout2 != null) {
                                return new ShopItemBinding((RelativeLayout) rootView, linearLayout, fontText, constraintLayout, imageView, gradientTextView, linearLayout2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
