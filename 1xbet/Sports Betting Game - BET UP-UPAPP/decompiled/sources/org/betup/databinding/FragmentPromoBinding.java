package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentPromoBinding implements ViewBinding {
    public final TextView balance;
    public final RecyclerView list;
    private final LinearLayout rootView;

    private FragmentPromoBinding(LinearLayout rootView, TextView balance, RecyclerView list) {
        this.rootView = rootView;
        this.balance = balance;
        this.list = list;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPromoBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentPromoBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_promo, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentPromoBinding bind(View rootView) {
        int i = R.id.balance;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.balance);
        if (textView != null) {
            i = R.id.list;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.list);
            if (recyclerView != null) {
                return new FragmentPromoBinding((LinearLayout) rootView, textView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
