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
public final class AdapterCoefItemLuckyCellsBinding implements ViewBinding {
    public final TextView coefTv;
    public final ConstraintLayout mapItem;
    private final ConstraintLayout rootView;

    private AdapterCoefItemLuckyCellsBinding(ConstraintLayout rootView, TextView coefTv, ConstraintLayout mapItem) {
        this.rootView = rootView;
        this.coefTv = coefTv;
        this.mapItem = mapItem;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static AdapterCoefItemLuckyCellsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static AdapterCoefItemLuckyCellsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.adapter_coef_item_lucky_cells, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static AdapterCoefItemLuckyCellsBinding bind(View rootView) {
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.coef_tv);
        if (textView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
            return new AdapterCoefItemLuckyCellsBinding(constraintLayout, textView, constraintLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.coef_tv)));
    }
}
