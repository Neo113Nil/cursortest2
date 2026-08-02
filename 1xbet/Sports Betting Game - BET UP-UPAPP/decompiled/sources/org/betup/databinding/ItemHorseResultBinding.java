package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ItemHorseResultBinding implements ViewBinding {
    public final FrameLayout avatarContainer;
    public final LinearLayout container;
    public final ImageView icon;
    public final TextView name;
    public final TextView number;
    public final TextView position;
    private final LinearLayout rootView;

    private ItemHorseResultBinding(LinearLayout rootView, FrameLayout avatarContainer, LinearLayout container, ImageView icon, TextView name, TextView number, TextView position) {
        this.rootView = rootView;
        this.avatarContainer = avatarContainer;
        this.container = container;
        this.icon = icon;
        this.name = name;
        this.number = number;
        this.position = position;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemHorseResultBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemHorseResultBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_horse_result, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemHorseResultBinding bind(View rootView) {
        int i = R.id.avatarContainer;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.avatarContainer);
        if (frameLayout != null) {
            LinearLayout linearLayout = (LinearLayout) rootView;
            i = R.id.icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon);
            if (imageView != null) {
                i = R.id.name;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.name);
                if (textView != null) {
                    i = R.id.number;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.number);
                    if (textView2 != null) {
                        i = R.id.position;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.position);
                        if (textView3 != null) {
                            return new ItemHorseResultBinding(linearLayout, frameLayout, linearLayout, imageView, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
