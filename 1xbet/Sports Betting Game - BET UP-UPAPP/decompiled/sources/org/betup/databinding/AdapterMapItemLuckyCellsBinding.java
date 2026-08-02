package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.views.SquareConstraintLayout;

/* loaded from: classes2.dex */
public final class AdapterMapItemLuckyCellsBinding implements ViewBinding {
    public final SquareConstraintLayout mapItem;
    public final ImageView mapItemI;
    public final ImageView mapItemV;
    private final SquareConstraintLayout rootView;

    private AdapterMapItemLuckyCellsBinding(SquareConstraintLayout rootView, SquareConstraintLayout mapItem, ImageView mapItemI, ImageView mapItemV) {
        this.rootView = rootView;
        this.mapItem = mapItem;
        this.mapItemI = mapItemI;
        this.mapItemV = mapItemV;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SquareConstraintLayout getRoot() {
        return this.rootView;
    }

    public static AdapterMapItemLuckyCellsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static AdapterMapItemLuckyCellsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.adapter_map_item_lucky_cells, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static AdapterMapItemLuckyCellsBinding bind(View rootView) {
        SquareConstraintLayout squareConstraintLayout = (SquareConstraintLayout) rootView;
        int i = R.id.map_item_i;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.map_item_i);
        if (imageView != null) {
            i = R.id.map_item_v;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.map_item_v);
            if (imageView2 != null) {
                return new AdapterMapItemLuckyCellsBinding(squareConstraintLayout, squareConstraintLayout, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
