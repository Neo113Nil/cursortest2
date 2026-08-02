package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class MatchStatRowBinding implements ViewBinding {
    public final LinearLayout container;
    public final ImageView icon;
    private final LinearLayout rootView;

    private MatchStatRowBinding(LinearLayout rootView, LinearLayout container, ImageView icon) {
        this.rootView = rootView;
        this.container = container;
        this.icon = icon;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static MatchStatRowBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static MatchStatRowBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.match_stat_row, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static MatchStatRowBinding bind(View rootView) {
        int i = R.id.container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.container);
        if (linearLayout != null) {
            i = R.id.icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon);
            if (imageView != null) {
                return new MatchStatRowBinding((LinearLayout) rootView, linearLayout, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
