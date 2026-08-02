package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class XbetPromoBannerBinding implements ViewBinding {
    public final Button action;
    public final TextView ad;
    public final ConstraintLayout container;
    public final TextView description;
    public final ImageView icon;
    public final FrameLayout provider;
    private final LinearLayout rootView;
    public final TextView title;

    private XbetPromoBannerBinding(LinearLayout rootView, Button action, TextView ad, ConstraintLayout container, TextView description, ImageView icon, FrameLayout provider, TextView title) {
        this.rootView = rootView;
        this.action = action;
        this.ad = ad;
        this.container = container;
        this.description = description;
        this.icon = icon;
        this.provider = provider;
        this.title = title;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static XbetPromoBannerBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static XbetPromoBannerBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.xbet_promo_banner, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static XbetPromoBannerBinding bind(View rootView) {
        int i = R.id.action;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.action);
        if (button != null) {
            i = R.id.ad;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.ad);
            if (textView != null) {
                i = R.id.container;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.container);
                if (constraintLayout != null) {
                    i = R.id.description;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.description);
                    if (textView2 != null) {
                        i = R.id.icon;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon);
                        if (imageView != null) {
                            i = R.id.provider;
                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.provider);
                            if (frameLayout != null) {
                                i = R.id.title;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                                if (textView3 != null) {
                                    return new XbetPromoBannerBinding((LinearLayout) rootView, button, textView, constraintLayout, textView2, imageView, frameLayout, textView3);
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
