package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.views.AlphaPressButton;

/* loaded from: classes2.dex */
public final class PlaceBetcoinsAmountContainerBinding implements ViewBinding {
    public final AlphaPressButton buttonDouble;
    public final AlphaPressButton buttonHalf;
    public final AlphaPressButton buttonMax;
    public final AlphaPressButton buttonMin;
    public final EditText editBetAmount;
    public final AlphaPressButton enterBet;
    public final AlphaPressButton makeBet;
    private final ConstraintLayout rootView;

    private PlaceBetcoinsAmountContainerBinding(ConstraintLayout rootView, AlphaPressButton buttonDouble, AlphaPressButton buttonHalf, AlphaPressButton buttonMax, AlphaPressButton buttonMin, EditText editBetAmount, AlphaPressButton enterBet, AlphaPressButton makeBet) {
        this.rootView = rootView;
        this.buttonDouble = buttonDouble;
        this.buttonHalf = buttonHalf;
        this.buttonMax = buttonMax;
        this.buttonMin = buttonMin;
        this.editBetAmount = editBetAmount;
        this.enterBet = enterBet;
        this.makeBet = makeBet;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static PlaceBetcoinsAmountContainerBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static PlaceBetcoinsAmountContainerBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.place_betcoins_amount_container, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static PlaceBetcoinsAmountContainerBinding bind(View rootView) {
        int i = R.id.buttonDouble;
        AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.buttonDouble);
        if (alphaPressButton != null) {
            i = R.id.buttonHalf;
            AlphaPressButton alphaPressButton2 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.buttonHalf);
            if (alphaPressButton2 != null) {
                i = R.id.buttonMax;
                AlphaPressButton alphaPressButton3 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.buttonMax);
                if (alphaPressButton3 != null) {
                    i = R.id.buttonMin;
                    AlphaPressButton alphaPressButton4 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.buttonMin);
                    if (alphaPressButton4 != null) {
                        i = R.id.editBetAmount;
                        EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.editBetAmount);
                        if (editText != null) {
                            i = R.id.enterBet;
                            AlphaPressButton alphaPressButton5 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.enterBet);
                            if (alphaPressButton5 != null) {
                                i = R.id.makeBet;
                                AlphaPressButton alphaPressButton6 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.makeBet);
                                if (alphaPressButton6 != null) {
                                    return new PlaceBetcoinsAmountContainerBinding((ConstraintLayout) rootView, alphaPressButton, alphaPressButton2, alphaPressButton3, alphaPressButton4, editText, alphaPressButton5, alphaPressButton6);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
