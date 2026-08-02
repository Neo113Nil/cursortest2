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
public final class ItemBalanceHistoryBinding implements ViewBinding {
    public final LinearLayout container;
    public final TextView date;
    public final TextView money;
    public final LinearLayout moneyContainer;
    public final TextView name;
    private final LinearLayout rootView;
    public final TextView time;

    private ItemBalanceHistoryBinding(LinearLayout rootView, LinearLayout container, TextView date, TextView money, LinearLayout moneyContainer, TextView name, TextView time) {
        this.rootView = rootView;
        this.container = container;
        this.date = date;
        this.money = money;
        this.moneyContainer = moneyContainer;
        this.name = name;
        this.time = time;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemBalanceHistoryBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemBalanceHistoryBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_balance_history, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemBalanceHistoryBinding bind(View rootView) {
        LinearLayout linearLayout = (LinearLayout) rootView;
        int i = R.id.date;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.date);
        if (textView != null) {
            i = R.id.money;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.money);
            if (textView2 != null) {
                i = R.id.moneyContainer;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.moneyContainer);
                if (linearLayout2 != null) {
                    i = R.id.name;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.name);
                    if (textView3 != null) {
                        i = R.id.time;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.time);
                        if (textView4 != null) {
                            return new ItemBalanceHistoryBinding(linearLayout, linearLayout, textView, textView2, linearLayout2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
