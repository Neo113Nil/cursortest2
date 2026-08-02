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
public final class MarkerViewBinding implements ViewBinding {
    public final TextView label;
    private final LinearLayout rootView;
    public final TextView value;

    private MarkerViewBinding(LinearLayout rootView, TextView label, TextView value) {
        this.rootView = rootView;
        this.label = label;
        this.value = value;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static MarkerViewBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static MarkerViewBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.marker_view, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static MarkerViewBinding bind(View rootView) {
        int i = R.id.label;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.label);
        if (textView != null) {
            i = R.id.value;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.value);
            if (textView2 != null) {
                return new MarkerViewBinding((LinearLayout) rootView, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
