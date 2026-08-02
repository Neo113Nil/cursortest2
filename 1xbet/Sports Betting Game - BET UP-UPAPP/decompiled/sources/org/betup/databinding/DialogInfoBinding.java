package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class DialogInfoBinding implements ViewBinding {
    public final TextView desc;
    public final ImageView email;
    public final ImageView facebook;
    public final ImageView icon;
    public final TextView money;
    public final TextView ok;
    private final RelativeLayout rootView;
    public final TextView secondButton;
    public final LinearLayout social;
    public final TextView subtitle;
    public final TextView thirdButton;
    public final TextView title;
    public final ImageView vk;
    public final TextView xp;

    private DialogInfoBinding(RelativeLayout rootView, TextView desc, ImageView email, ImageView facebook, ImageView icon, TextView money, TextView ok, TextView secondButton, LinearLayout social, TextView subtitle, TextView thirdButton, TextView title, ImageView vk, TextView xp) {
        this.rootView = rootView;
        this.desc = desc;
        this.email = email;
        this.facebook = facebook;
        this.icon = icon;
        this.money = money;
        this.ok = ok;
        this.secondButton = secondButton;
        this.social = social;
        this.subtitle = subtitle;
        this.thirdButton = thirdButton;
        this.title = title;
        this.vk = vk;
        this.xp = xp;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static DialogInfoBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogInfoBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_info, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogInfoBinding bind(View rootView) {
        int i = R.id.desc;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.desc);
        if (textView != null) {
            i = R.id.email;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.email);
            if (imageView != null) {
                i = R.id.facebook;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.facebook);
                if (imageView2 != null) {
                    i = R.id.icon;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon);
                    if (imageView3 != null) {
                        i = R.id.money;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.money);
                        if (textView2 != null) {
                            i = R.id.ok;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ok);
                            if (textView3 != null) {
                                i = R.id.secondButton;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.secondButton);
                                if (textView4 != null) {
                                    i = R.id.social;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.social);
                                    if (linearLayout != null) {
                                        i = R.id.subtitle;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.subtitle);
                                        if (textView5 != null) {
                                            i = R.id.thirdButton;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.thirdButton);
                                            if (textView6 != null) {
                                                i = R.id.title;
                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                                                if (textView7 != null) {
                                                    i = R.id.vk;
                                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.vk);
                                                    if (imageView4 != null) {
                                                        i = R.id.xp;
                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.xp);
                                                        if (textView8 != null) {
                                                            return new DialogInfoBinding((RelativeLayout) rootView, textView, imageView, imageView2, imageView3, textView2, textView3, textView4, linearLayout, textView5, textView6, textView7, imageView4, textView8);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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
