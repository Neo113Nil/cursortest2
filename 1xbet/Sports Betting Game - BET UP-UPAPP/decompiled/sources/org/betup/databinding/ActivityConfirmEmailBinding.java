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
public final class ActivityConfirmEmailBinding implements ViewBinding {
    public final TextView confirm;
    public final TextView desc;
    public final ImageView icon;
    private final LinearLayout rootView;
    public final TextView sendAgain;
    public final TextView signOut;
    public final TextView subtitle;
    public final TextView title;

    private ActivityConfirmEmailBinding(LinearLayout rootView, TextView confirm, TextView desc, ImageView icon, TextView sendAgain, TextView signOut, TextView subtitle, TextView title) {
        this.rootView = rootView;
        this.confirm = confirm;
        this.desc = desc;
        this.icon = icon;
        this.sendAgain = sendAgain;
        this.signOut = signOut;
        this.subtitle = subtitle;
        this.title = title;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityConfirmEmailBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityConfirmEmailBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_confirm_email, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityConfirmEmailBinding bind(View rootView) {
        int i = R.id.confirm;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.confirm);
        if (textView != null) {
            i = R.id.desc;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.desc);
            if (textView2 != null) {
                i = R.id.icon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon);
                if (imageView != null) {
                    i = R.id.sendAgain;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sendAgain);
                    if (textView3 != null) {
                        i = R.id.signOut;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.signOut);
                        if (textView4 != null) {
                            i = R.id.subtitle;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.subtitle);
                            if (textView5 != null) {
                                i = R.id.title;
                                TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                                if (textView6 != null) {
                                    return new ActivityConfirmEmailBinding((LinearLayout) rootView, textView, textView2, imageView, textView3, textView4, textView5, textView6);
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
