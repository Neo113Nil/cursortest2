package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class DialogBetAmountSuggestionBinding implements ViewBinding {
    public final RadioGroup betSuggestionRadioGroup;
    public final TextView cancelButton;
    public final CheckBox customBetAmount;
    public final CheckBox defaultBetAmount;
    public final TextView okButton;
    private final LinearLayout rootView;

    private DialogBetAmountSuggestionBinding(LinearLayout rootView, RadioGroup betSuggestionRadioGroup, TextView cancelButton, CheckBox customBetAmount, CheckBox defaultBetAmount, TextView okButton) {
        this.rootView = rootView;
        this.betSuggestionRadioGroup = betSuggestionRadioGroup;
        this.cancelButton = cancelButton;
        this.customBetAmount = customBetAmount;
        this.defaultBetAmount = defaultBetAmount;
        this.okButton = okButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogBetAmountSuggestionBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogBetAmountSuggestionBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_bet_amount_suggestion, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogBetAmountSuggestionBinding bind(View rootView) {
        int i = R.id.bet_suggestion_radio_group;
        RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(rootView, R.id.bet_suggestion_radio_group);
        if (radioGroup != null) {
            i = R.id.cancel_button;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.cancel_button);
            if (textView != null) {
                i = R.id.custom_bet_amount;
                CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.custom_bet_amount);
                if (checkBox != null) {
                    i = R.id.default_bet_amount;
                    CheckBox checkBox2 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.default_bet_amount);
                    if (checkBox2 != null) {
                        i = R.id.ok_button;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ok_button);
                        if (textView2 != null) {
                            return new DialogBetAmountSuggestionBinding((LinearLayout) rootView, radioGroup, textView, checkBox, checkBox2, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
