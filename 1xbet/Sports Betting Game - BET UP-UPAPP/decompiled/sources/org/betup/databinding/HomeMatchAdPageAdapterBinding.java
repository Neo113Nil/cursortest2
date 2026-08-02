package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class HomeMatchAdPageAdapterBinding implements ViewBinding {
    public final CardView adBannerIndexCv;
    public final View adBannerIndexV;
    private final LinearLayout rootView;

    private HomeMatchAdPageAdapterBinding(LinearLayout rootView, CardView adBannerIndexCv, View adBannerIndexV) {
        this.rootView = rootView;
        this.adBannerIndexCv = adBannerIndexCv;
        this.adBannerIndexV = adBannerIndexV;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static HomeMatchAdPageAdapterBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static HomeMatchAdPageAdapterBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.home_match_ad_page_adapter, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static HomeMatchAdPageAdapterBinding bind(View rootView) {
        int i = R.id.ad_banner_index_cv;
        CardView cardView = (CardView) ViewBindings.findChildViewById(rootView, R.id.ad_banner_index_cv);
        if (cardView != null) {
            i = R.id.ad_banner_index_v;
            View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.ad_banner_index_v);
            if (findChildViewById != null) {
                return new HomeMatchAdPageAdapterBinding((LinearLayout) rootView, cardView, findChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
