package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class HomeMatchAdAdapterBinding implements ViewBinding {
    public final ImageView iconIv;
    private final CardView rootView;

    private HomeMatchAdAdapterBinding(CardView rootView, ImageView iconIv) {
        this.rootView = rootView;
        this.iconIv = iconIv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CardView getRoot() {
        return this.rootView;
    }

    public static HomeMatchAdAdapterBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static HomeMatchAdAdapterBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.home_match_ad_adapter, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static HomeMatchAdAdapterBinding bind(View rootView) {
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_iv);
        if (imageView != null) {
            return new HomeMatchAdAdapterBinding((CardView) rootView, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.icon_iv)));
    }
}
