package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ItemRecentSearchBinding implements ViewBinding {
    public final LinearLayout container;
    public final TextView item;
    private final LinearLayout rootView;

    private ItemRecentSearchBinding(LinearLayout rootView, LinearLayout container, TextView item) {
        this.rootView = rootView;
        this.container = container;
        this.item = item;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemRecentSearchBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemRecentSearchBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_recent_search, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemRecentSearchBinding bind(View rootView) {
        LinearLayout linearLayout = (LinearLayout) rootView;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.item);
        if (textView != null) {
            return new ItemRecentSearchBinding(linearLayout, linearLayout, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.item)));
    }
}
