package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentOfferBinding implements ViewBinding {
    public final ImageView closeBtnIv;
    public final ImageView offerBgIv;
    public final FrameLayout progress;
    private final ConstraintLayout rootView;

    private FragmentOfferBinding(ConstraintLayout rootView, ImageView closeBtnIv, ImageView offerBgIv, FrameLayout progress) {
        this.rootView = rootView;
        this.closeBtnIv = closeBtnIv;
        this.offerBgIv = offerBgIv;
        this.progress = progress;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOfferBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentOfferBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_offer, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentOfferBinding bind(View rootView) {
        int i = R.id.close_btn_iv;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.close_btn_iv);
        if (imageView != null) {
            i = R.id.offer_bg_iv;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.offer_bg_iv);
            if (imageView2 != null) {
                i = R.id.progress;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.progress);
                if (frameLayout != null) {
                    return new FragmentOfferBinding((ConstraintLayout) rootView, imageView, imageView2, frameLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
