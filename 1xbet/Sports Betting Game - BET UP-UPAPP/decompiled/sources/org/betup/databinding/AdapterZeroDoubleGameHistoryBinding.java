package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class AdapterZeroDoubleGameHistoryBinding implements ViewBinding {
    public final TextView ordinalTv;
    private final ConstraintLayout rootView;

    private AdapterZeroDoubleGameHistoryBinding(ConstraintLayout rootView, TextView ordinalTv) {
        this.rootView = rootView;
        this.ordinalTv = ordinalTv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static AdapterZeroDoubleGameHistoryBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static AdapterZeroDoubleGameHistoryBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.adapter_zero_double_game_history, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static AdapterZeroDoubleGameHistoryBinding bind(View rootView) {
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.ordinal_tv);
        if (textView != null) {
            return new AdapterZeroDoubleGameHistoryBinding((ConstraintLayout) rootView, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.ordinal_tv)));
    }
}
