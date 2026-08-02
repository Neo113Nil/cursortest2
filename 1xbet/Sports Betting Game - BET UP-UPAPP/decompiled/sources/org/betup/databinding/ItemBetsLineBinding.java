package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.views.BetView;

/* loaded from: classes2.dex */
public final class ItemBetsLineBinding implements ViewBinding {
    public final BetView firstBet;
    public final View leftDivider;
    public final View rightDivider;
    private final ConstraintLayout rootView;
    public final BetView secondBet;
    public final BetView thirdBet;
    public final TextView title;

    private ItemBetsLineBinding(ConstraintLayout rootView, BetView firstBet, View leftDivider, View rightDivider, BetView secondBet, BetView thirdBet, TextView title) {
        this.rootView = rootView;
        this.firstBet = firstBet;
        this.leftDivider = leftDivider;
        this.rightDivider = rightDivider;
        this.secondBet = secondBet;
        this.thirdBet = thirdBet;
        this.title = title;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemBetsLineBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemBetsLineBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_bets_line, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemBetsLineBinding bind(View rootView) {
        int i = R.id.first_bet;
        BetView betView = (BetView) ViewBindings.findChildViewById(rootView, R.id.first_bet);
        if (betView != null) {
            i = R.id.left_divider;
            View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.left_divider);
            if (findChildViewById != null) {
                i = R.id.right_divider;
                View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.right_divider);
                if (findChildViewById2 != null) {
                    i = R.id.second_bet;
                    BetView betView2 = (BetView) ViewBindings.findChildViewById(rootView, R.id.second_bet);
                    if (betView2 != null) {
                        i = R.id.third_bet;
                        BetView betView3 = (BetView) ViewBindings.findChildViewById(rootView, R.id.third_bet);
                        if (betView3 != null) {
                            i = R.id.title;
                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                            if (textView != null) {
                                return new ItemBetsLineBinding((ConstraintLayout) rootView, betView, findChildViewById, findChildViewById2, betView2, betView3, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
