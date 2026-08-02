package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.views.FontText;

/* loaded from: classes2.dex */
public final class ShopBonusItemBinding implements ViewBinding {
    public final LinearLayout amountContainer;
    public final FontText betcoins;
    public final ConstraintLayout container;
    public final ImageView icon;
    public final LinearLayout priceContainer;
    private final RelativeLayout rootView;
    public final ImageView videoIcon;
    public final RelativeLayout videoOffer;
    public final TextView videoRewardAmount;

    private ShopBonusItemBinding(RelativeLayout rootView, LinearLayout amountContainer, FontText betcoins, ConstraintLayout container, ImageView icon, LinearLayout priceContainer, ImageView videoIcon, RelativeLayout videoOffer, TextView videoRewardAmount) {
        this.rootView = rootView;
        this.amountContainer = amountContainer;
        this.betcoins = betcoins;
        this.container = container;
        this.icon = icon;
        this.priceContainer = priceContainer;
        this.videoIcon = videoIcon;
        this.videoOffer = videoOffer;
        this.videoRewardAmount = videoRewardAmount;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ShopBonusItemBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ShopBonusItemBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.shop_bonus_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ShopBonusItemBinding bind(View rootView) {
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
                        i = R.id.price_container;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.price_container);
                        if (linearLayout2 != null) {
                            i = R.id.videoIcon;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.videoIcon);
                            if (imageView2 != null) {
                                RelativeLayout relativeLayout = (RelativeLayout) rootView;
                                i = R.id.videoRewardAmount;
                                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.videoRewardAmount);
                                if (textView != null) {
                                    return new ShopBonusItemBinding(relativeLayout, linearLayout, fontText, constraintLayout, imageView, linearLayout2, imageView2, relativeLayout, textView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
