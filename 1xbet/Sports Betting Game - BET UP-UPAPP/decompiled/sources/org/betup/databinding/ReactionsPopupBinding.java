package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ReactionsPopupBinding implements ViewBinding {
    public final LinearLayout container;
    private final LinearLayout rootView;

    private ReactionsPopupBinding(LinearLayout rootView, LinearLayout container) {
        this.rootView = rootView;
        this.container = container;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ReactionsPopupBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ReactionsPopupBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.reactions_popup, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ReactionsPopupBinding bind(View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        LinearLayout linearLayout = (LinearLayout) rootView;
        return new ReactionsPopupBinding(linearLayout, linearLayout);
    }
}
