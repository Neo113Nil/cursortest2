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
public final class ShopBannerItemBinding implements ViewBinding {
    public final LinearLayout benefitContainer;
    public final ConstraintLayout container;
    public final ImageView icon;
    public final GradientTextView price;
    public final LinearLayout priceContainer;
    private final RelativeLayout rootView;
    public final FontText title;

    private ShopBannerItemBinding(RelativeLayout rootView, LinearLayout benefitContainer, ConstraintLayout container, ImageView icon, GradientTextView price, LinearLayout priceContainer, FontText title) {
        this.rootView = rootView;
        this.benefitContainer = benefitContainer;
        this.container = container;
        this.icon = icon;
        this.price = price;
        this.priceContainer = priceContainer;
        this.title = title;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ShopBannerItemBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ShopBannerItemBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.shop_banner_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ShopBannerItemBinding bind(View rootView) {
        int i = R.id.benefitContainer;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.benefitContainer);
        if (linearLayout != null) {
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
                            i = R.id.title;
                            FontText fontText = (FontText) ViewBindings.findChildViewById(rootView, R.id.title);
                            if (fontText != null) {
                                return new ShopBannerItemBinding((RelativeLayout) rootView, linearLayout, constraintLayout, imageView, gradientTextView, linearLayout2, fontText);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
