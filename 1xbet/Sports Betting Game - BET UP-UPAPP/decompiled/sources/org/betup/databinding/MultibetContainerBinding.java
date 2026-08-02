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
public final class MultibetContainerBinding implements ViewBinding {
    public final BetView firstBet;
    private final LinearLayout rootView;
    public final BetView secondBet;
    public final BetView thirdBet;

    private MultibetContainerBinding(LinearLayout rootView, BetView firstBet, BetView secondBet, BetView thirdBet) {
        this.rootView = rootView;
        this.firstBet = firstBet;
        this.secondBet = secondBet;
        this.thirdBet = thirdBet;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static MultibetContainerBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static MultibetContainerBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.multibet_container, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static MultibetContainerBinding bind(View rootView) {
        int i = R.id.firstBet;
        BetView betView = (BetView) ViewBindings.findChildViewById(rootView, R.id.firstBet);
        if (betView != null) {
            i = R.id.secondBet;
            BetView betView2 = (BetView) ViewBindings.findChildViewById(rootView, R.id.secondBet);
            if (betView2 != null) {
                i = R.id.thirdBet;
                BetView betView3 = (BetView) ViewBindings.findChildViewById(rootView, R.id.thirdBet);
                if (betView3 != null) {
                    return new MultibetContainerBinding((LinearLayout) rootView, betView, betView2, betView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
