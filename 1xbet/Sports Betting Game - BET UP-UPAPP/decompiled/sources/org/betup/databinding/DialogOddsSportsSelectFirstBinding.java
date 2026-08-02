package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.views.BetView;

/* loaded from: classes2.dex */
public final class DialogOddsSportsSelectFirstBinding implements ViewBinding {
    public final LinearLayout advancedContainer;
    public final TextView americanOddsButton;
    public final EditText amount;
    public final RelativeLayout amountLimitsContainer;
    public final RadioGroup betSuggestionRadioGroup;
    public final TextView cancelButton;
    public final TextView decimalOddsButton;
    public final CheckBox disable;
    public final CheckBox enable;
    public final BetView firstBet;
    public final TextView fractionalOddsButton;
    public final ImageView leftCoin;
    public final TextView maxAmount;
    public final TextView minAmount;
    public final TextView oddsLabel;
    public final TextView ok;
    public final ImageView rightCoin;
    private final ConstraintLayout rootView;
    public final BetView secondBet;
    public final SeekBar seekBar;
    public final LinearLayout teamsOddsExampleContainer;

    private DialogOddsSportsSelectFirstBinding(ConstraintLayout rootView, LinearLayout advancedContainer, TextView americanOddsButton, EditText amount, RelativeLayout amountLimitsContainer, RadioGroup betSuggestionRadioGroup, TextView cancelButton, TextView decimalOddsButton, CheckBox disable, CheckBox enable, BetView firstBet, TextView fractionalOddsButton, ImageView leftCoin, TextView maxAmount, TextView minAmount, TextView oddsLabel, TextView ok, ImageView rightCoin, BetView secondBet, SeekBar seekBar, LinearLayout teamsOddsExampleContainer) {
        this.rootView = rootView;
        this.advancedContainer = advancedContainer;
        this.americanOddsButton = americanOddsButton;
        this.amount = amount;
        this.amountLimitsContainer = amountLimitsContainer;
        this.betSuggestionRadioGroup = betSuggestionRadioGroup;
        this.cancelButton = cancelButton;
        this.decimalOddsButton = decimalOddsButton;
        this.disable = disable;
        this.enable = enable;
        this.firstBet = firstBet;
        this.fractionalOddsButton = fractionalOddsButton;
        this.leftCoin = leftCoin;
        this.maxAmount = maxAmount;
        this.minAmount = minAmount;
        this.oddsLabel = oddsLabel;
        this.ok = ok;
        this.rightCoin = rightCoin;
        this.secondBet = secondBet;
        this.seekBar = seekBar;
        this.teamsOddsExampleContainer = teamsOddsExampleContainer;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogOddsSportsSelectFirstBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogOddsSportsSelectFirstBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_odds_sports_select_first, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogOddsSportsSelectFirstBinding bind(View rootView) {
        int i = R.id.advanced_container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.advanced_container);
        if (linearLayout != null) {
            i = R.id.americanOddsButton;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.americanOddsButton);
            if (textView != null) {
                i = R.id.amount;
                EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.amount);
                if (editText != null) {
                    i = R.id.amountLimitsContainer;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.amountLimitsContainer);
                    if (relativeLayout != null) {
                        i = R.id.bet_suggestion_radio_group;
                        RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(rootView, R.id.bet_suggestion_radio_group);
                        if (radioGroup != null) {
                            i = R.id.cancel_button;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.cancel_button);
                            if (textView2 != null) {
                                i = R.id.decimalOddsButton;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.decimalOddsButton);
                                if (textView3 != null) {
                                    i = R.id.disable;
                                    CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.disable);
                                    if (checkBox != null) {
                                        i = R.id.enable;
                                        CheckBox checkBox2 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.enable);
                                        if (checkBox2 != null) {
                                            i = R.id.firstBet;
                                            BetView betView = (BetView) ViewBindings.findChildViewById(rootView, R.id.firstBet);
                                            if (betView != null) {
                                                i = R.id.fractionalOddsButton;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.fractionalOddsButton);
                                                if (textView4 != null) {
                                                    i = R.id.leftCoin;
                                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.leftCoin);
                                                    if (imageView != null) {
                                                        i = R.id.maxAmount;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.maxAmount);
                                                        if (textView5 != null) {
                                                            i = R.id.minAmount;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.minAmount);
                                                            if (textView6 != null) {
                                                                i = R.id.odds_label;
                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.odds_label);
                                                                if (textView7 != null) {
                                                                    i = R.id.ok;
                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ok);
                                                                    if (textView8 != null) {
                                                                        i = R.id.rightCoin;
                                                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.rightCoin);
                                                                        if (imageView2 != null) {
                                                                            i = R.id.secondBet;
                                                                            BetView betView2 = (BetView) ViewBindings.findChildViewById(rootView, R.id.secondBet);
                                                                            if (betView2 != null) {
                                                                                i = R.id.seekBar;
                                                                                SeekBar seekBar = (SeekBar) ViewBindings.findChildViewById(rootView, R.id.seekBar);
                                                                                if (seekBar != null) {
                                                                                    i = R.id.teamsOddsExampleContainer;
                                                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.teamsOddsExampleContainer);
                                                                                    if (linearLayout2 != null) {
                                                                                        return new DialogOddsSportsSelectFirstBinding((ConstraintLayout) rootView, linearLayout, textView, editText, relativeLayout, radioGroup, textView2, textView3, checkBox, checkBox2, betView, textView4, imageView, textView5, textView6, textView7, textView8, imageView2, betView2, seekBar, linearLayout2);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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
