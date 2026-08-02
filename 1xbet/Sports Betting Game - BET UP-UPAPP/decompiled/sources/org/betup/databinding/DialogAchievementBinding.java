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
public final class DialogAchievementBinding implements ViewBinding {
    public final TextView desc;
    public final ImageView email;
    public final ImageView facebook;
    public final ImageView icon;
    public final TextView money;
    public final TextView name;
    public final TextView ok;
    private final RelativeLayout rootView;
    public final TextView title;
    public final ImageView vk;

    private DialogAchievementBinding(RelativeLayout rootView, TextView desc, ImageView email, ImageView facebook, ImageView icon, TextView money, TextView name, TextView ok, TextView title, ImageView vk) {
        this.rootView = rootView;
        this.desc = desc;
        this.email = email;
        this.facebook = facebook;
        this.icon = icon;
        this.money = money;
        this.name = name;
        this.ok = ok;
        this.title = title;
        this.vk = vk;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static DialogAchievementBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogAchievementBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_achievement, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogAchievementBinding bind(View rootView) {
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
                            i = R.id.name;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.name);
                            if (textView3 != null) {
                                i = R.id.ok;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ok);
                                if (textView4 != null) {
                                    i = R.id.title;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                                    if (textView5 != null) {
                                        i = R.id.vk;
                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.vk);
                                        if (imageView4 != null) {
                                            return new DialogAchievementBinding((RelativeLayout) rootView, textView, imageView, imageView2, imageView3, textView2, textView3, textView4, textView5, imageView4);
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
