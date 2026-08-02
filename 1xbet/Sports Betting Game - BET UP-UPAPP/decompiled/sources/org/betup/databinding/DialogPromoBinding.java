package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class DialogPromoBinding implements ViewBinding {
    public final ImageView banner;
    public final TextView msg;
    public final TextView ok;
    private final RelativeLayout rootView;
    public final TextView title;

    private DialogPromoBinding(RelativeLayout rootView, ImageView banner, TextView msg, TextView ok, TextView title) {
        this.rootView = rootView;
        this.banner = banner;
        this.msg = msg;
        this.ok = ok;
        this.title = title;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static DialogPromoBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogPromoBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_promo, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogPromoBinding bind(View rootView) {
        int i = R.id.banner;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.banner);
        if (imageView != null) {
            i = R.id.msg;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.msg);
            if (textView != null) {
                i = R.id.ok;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ok);
                if (textView2 != null) {
                    i = R.id.title;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                    if (textView3 != null) {
                        return new DialogPromoBinding((RelativeLayout) rootView, imageView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
