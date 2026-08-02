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
public final class OfferButtonItemBinding implements ViewBinding {
    public final TextView btnTv;
    private final LinearLayout rootView;

    private OfferButtonItemBinding(LinearLayout rootView, TextView btnTv) {
        this.rootView = rootView;
        this.btnTv = btnTv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static OfferButtonItemBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static OfferButtonItemBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.offer_button_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static OfferButtonItemBinding bind(View rootView) {
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.btn_tv);
        if (textView != null) {
            return new OfferButtonItemBinding((LinearLayout) rootView, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.btn_tv)));
    }
}
