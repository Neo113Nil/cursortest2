package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ItemLineupsPlayerListBinding implements ViewBinding {
    public final ConstraintLayout container;
    public final ImageView country;
    public final LinearLayout events;
    public final TextView name;
    public final ImageView player;
    private final ConstraintLayout rootView;

    private ItemLineupsPlayerListBinding(ConstraintLayout rootView, ConstraintLayout container, ImageView country, LinearLayout events, TextView name, ImageView player) {
        this.rootView = rootView;
        this.container = container;
        this.country = country;
        this.events = events;
        this.name = name;
        this.player = player;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemLineupsPlayerListBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemLineupsPlayerListBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_lineups_player_list, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemLineupsPlayerListBinding bind(View rootView) {
        ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
        int i = R.id.country;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.country);
        if (imageView != null) {
            i = R.id.events;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.events);
            if (linearLayout != null) {
                i = R.id.name;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.name);
                if (textView != null) {
                    i = R.id.player;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.player);
                    if (imageView2 != null) {
                        return new ItemLineupsPlayerListBinding(constraintLayout, constraintLayout, imageView, linearLayout, textView, imageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
