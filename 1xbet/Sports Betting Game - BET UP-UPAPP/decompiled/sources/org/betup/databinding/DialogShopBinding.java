package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import org.betup.R;

/* loaded from: classes2.dex */
public final class DialogShopBinding implements ViewBinding {
    public final ShopBalanceBarBinding balanceView;
    public final ImageView close;
    public final ConstraintLayout dialogContainer;
    public final ViewPager pager;
    private final ConstraintLayout rootView;

    private DialogShopBinding(ConstraintLayout rootView, ShopBalanceBarBinding balanceView, ImageView close, ConstraintLayout dialogContainer, ViewPager pager) {
        this.rootView = rootView;
        this.balanceView = balanceView;
        this.close = close;
        this.dialogContainer = dialogContainer;
        this.pager = pager;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogShopBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogShopBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_shop, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogShopBinding bind(View rootView) {
        int i = R.id.balanceView;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.balanceView);
        if (findChildViewById != null) {
            ShopBalanceBarBinding bind = ShopBalanceBarBinding.bind(findChildViewById);
            i = R.id.close;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.close);
            if (imageView != null) {
                i = R.id.dialog_container;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.dialog_container);
                if (constraintLayout != null) {
                    i = R.id.pager;
                    ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(rootView, R.id.pager);
                    if (viewPager != null) {
                        return new DialogShopBinding((ConstraintLayout) rootView, bind, imageView, constraintLayout, viewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
