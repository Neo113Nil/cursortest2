package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import org.betup.R;
import org.betup.ui.views.FontText;

/* loaded from: classes2.dex */
public final class ShopBenefitItemBinding implements ViewBinding {
    public final FontText benefit1;
    private final FontText rootView;

    private ShopBenefitItemBinding(FontText rootView, FontText benefit1) {
        this.rootView = rootView;
        this.benefit1 = benefit1;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FontText getRoot() {
        return this.rootView;
    }

    public static ShopBenefitItemBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ShopBenefitItemBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.shop_benefit_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ShopBenefitItemBinding bind(View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        FontText fontText = (FontText) rootView;
        return new ShopBenefitItemBinding(fontText, fontText);
    }
}
