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
public final class ItemMyBetsGroupBinding implements ViewBinding {
    public final TextView betDate;
    public final TextView betResult;
    public final LinearLayout betResultContainer;
    public final TextView betTime;
    public final TextView betType;
    public final LinearLayout container;
    private final LinearLayout rootView;

    private ItemMyBetsGroupBinding(LinearLayout rootView, TextView betDate, TextView betResult, LinearLayout betResultContainer, TextView betTime, TextView betType, LinearLayout container) {
        this.rootView = rootView;
        this.betDate = betDate;
        this.betResult = betResult;
        this.betResultContainer = betResultContainer;
        this.betTime = betTime;
        this.betType = betType;
        this.container = container;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemMyBetsGroupBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemMyBetsGroupBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_my_bets_group, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemMyBetsGroupBinding bind(View rootView) {
        int i = R.id.betDate;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.betDate);
        if (textView != null) {
            i = R.id.betResult;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.betResult);
            if (textView2 != null) {
                i = R.id.betResultContainer;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.betResultContainer);
                if (linearLayout != null) {
                    i = R.id.betTime;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.betTime);
                    if (textView3 != null) {
                        i = R.id.betType;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.betType);
                        if (textView4 != null) {
                            LinearLayout linearLayout2 = (LinearLayout) rootView;
                            return new ItemMyBetsGroupBinding(linearLayout2, textView, textView2, linearLayout, textView3, textView4, linearLayout2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
