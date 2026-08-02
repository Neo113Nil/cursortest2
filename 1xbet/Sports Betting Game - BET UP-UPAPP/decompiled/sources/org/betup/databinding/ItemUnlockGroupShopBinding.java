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
public final class ItemUnlockGroupShopBinding implements ViewBinding {
    public final LinearLayout amountContainer;
    public final FontText bonus;
    public final ConstraintLayout container;
    public final ImageView icon;
    public final GradientTextView price;
    public final LinearLayout priceContainer;
    private final RelativeLayout rootView;
    public final GradientTextView title;

    private ItemUnlockGroupShopBinding(RelativeLayout rootView, LinearLayout amountContainer, FontText bonus, ConstraintLayout container, ImageView icon, GradientTextView price, LinearLayout priceContainer, GradientTextView title) {
        this.rootView = rootView;
        this.amountContainer = amountContainer;
        this.bonus = bonus;
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

    public static ItemUnlockGroupShopBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemUnlockGroupShopBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_unlock_group_shop, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemUnlockGroupShopBinding bind(View rootView) {
        int i = R.id.amountContainer;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.amountContainer);
        if (linearLayout != null) {
            i = R.id.bonus;
            FontText fontText = (FontText) ViewBindings.findChildViewById(rootView, R.id.bonus);
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
                            i = R.id.priceContainer;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.priceContainer);
                            if (linearLayout2 != null) {
                                i = R.id.title;
                                GradientTextView gradientTextView2 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.title);
                                if (gradientTextView2 != null) {
                                    return new ItemUnlockGroupShopBinding((RelativeLayout) rootView, linearLayout, fontText, constraintLayout, imageView, gradientTextView, linearLayout2, gradientTextView2);
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
