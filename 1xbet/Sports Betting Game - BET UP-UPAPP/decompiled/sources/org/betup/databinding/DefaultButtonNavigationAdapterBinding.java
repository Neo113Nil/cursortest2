package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class DefaultButtonNavigationAdapterBinding implements ViewBinding {
    public final TextView btnTitleTv;
    public final ImageView iconIv;
    private final LinearLayout rootView;

    private DefaultButtonNavigationAdapterBinding(LinearLayout rootView, TextView btnTitleTv, ImageView iconIv) {
        this.rootView = rootView;
        this.btnTitleTv = btnTitleTv;
        this.iconIv = iconIv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DefaultButtonNavigationAdapterBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DefaultButtonNavigationAdapterBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.default_button_navigation_adapter, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DefaultButtonNavigationAdapterBinding bind(View rootView) {
        int i = R.id.btn_title_tv;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.btn_title_tv);
        if (textView != null) {
            i = R.id.icon_iv;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_iv);
            if (imageView != null) {
                return new DefaultButtonNavigationAdapterBinding((LinearLayout) rootView, textView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
