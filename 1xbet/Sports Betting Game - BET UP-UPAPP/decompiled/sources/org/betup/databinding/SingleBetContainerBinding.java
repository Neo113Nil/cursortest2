package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.views.BetView;

/* loaded from: classes2.dex */
public final class SingleBetContainerBinding implements ViewBinding {
    public final BetView bet;
    private final LinearLayout rootView;

    private SingleBetContainerBinding(LinearLayout rootView, BetView bet) {
        this.rootView = rootView;
        this.bet = bet;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static SingleBetContainerBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static SingleBetContainerBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.single_bet_container, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static SingleBetContainerBinding bind(View rootView) {
        BetView betView = (BetView) ViewBindings.findChildViewById(rootView, R.id.bet);
        if (betView != null) {
            return new SingleBetContainerBinding((LinearLayout) rootView, betView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.bet)));
    }
}
