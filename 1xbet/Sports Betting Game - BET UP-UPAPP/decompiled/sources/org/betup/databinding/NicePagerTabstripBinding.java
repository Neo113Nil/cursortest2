package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class NicePagerTabstripBinding implements ViewBinding {
    public final View bottomHeader;
    private final LinearLayout rootView;
    public final LinearLayout tabContainer;

    private NicePagerTabstripBinding(LinearLayout rootView, View bottomHeader, LinearLayout tabContainer) {
        this.rootView = rootView;
        this.bottomHeader = bottomHeader;
        this.tabContainer = tabContainer;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static NicePagerTabstripBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static NicePagerTabstripBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.nice_pager_tabstrip, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static NicePagerTabstripBinding bind(View rootView) {
        int i = R.id.bottom_header;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.bottom_header);
        if (findChildViewById != null) {
            i = R.id.tab_container;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.tab_container);
            if (linearLayout != null) {
                return new NicePagerTabstripBinding((LinearLayout) rootView, findChildViewById, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
