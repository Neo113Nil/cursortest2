package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ItemBottomMenuBinding implements ViewBinding {
    public final TextView counter;
    public final ImageView icon;
    public final ConstraintLayout layoutButton;
    private final ConstraintLayout rootView;
    public final ConstraintLayout tabContainer;
    public final TextView title;

    private ItemBottomMenuBinding(ConstraintLayout rootView, TextView counter, ImageView icon, ConstraintLayout layoutButton, ConstraintLayout tabContainer, TextView title) {
        this.rootView = rootView;
        this.counter = counter;
        this.icon = icon;
        this.layoutButton = layoutButton;
        this.tabContainer = tabContainer;
        this.title = title;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemBottomMenuBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemBottomMenuBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_bottom_menu, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemBottomMenuBinding bind(View rootView) {
        int i = R.id.counter;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.counter);
        if (textView != null) {
            i = R.id.icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon);
            if (imageView != null) {
                i = R.id.layout_button;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.layout_button);
                if (constraintLayout != null) {
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) rootView;
                    i = R.id.title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                    if (textView2 != null) {
                        return new ItemBottomMenuBinding(constraintLayout2, textView, imageView, constraintLayout, constraintLayout2, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
