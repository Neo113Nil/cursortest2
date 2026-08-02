package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class SlideStatsBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final LinearLayout table;

    private SlideStatsBinding(LinearLayout rootView, LinearLayout table) {
        this.rootView = rootView;
        this.table = table;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static SlideStatsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static SlideStatsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.slide_stats, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static SlideStatsBinding bind(View rootView) {
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.table);
        if (linearLayout != null) {
            return new SlideStatsBinding((LinearLayout) rootView, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.table)));
    }
}
