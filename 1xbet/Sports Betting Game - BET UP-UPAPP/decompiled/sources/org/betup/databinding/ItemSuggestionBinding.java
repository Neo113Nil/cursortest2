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
public final class ItemSuggestionBinding implements ViewBinding {
    public final LinearLayout container;
    public final TextView label;
    private final LinearLayout rootView;

    private ItemSuggestionBinding(LinearLayout rootView, LinearLayout container, TextView label) {
        this.rootView = rootView;
        this.container = container;
        this.label = label;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemSuggestionBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemSuggestionBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_suggestion, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemSuggestionBinding bind(View rootView) {
        LinearLayout linearLayout = (LinearLayout) rootView;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.label);
        if (textView != null) {
            return new ItemSuggestionBinding(linearLayout, linearLayout, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.label)));
    }
}
