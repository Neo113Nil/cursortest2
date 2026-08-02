package org.betup.ui.dialogs;

import android.content.Context;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import org.betup.R;
import org.betup.utils.SharedPrefs;

/* loaded from: classes2.dex */
public class DialogBetAmountSuggestion extends BaseDialog {

    @BindView(R.id.cancel_button)
    TextView cancelButton;

    @BindView(R.id.custom_bet_amount)
    CheckBox customBetAmount;

    @BindView(R.id.default_bet_amount)
    CheckBox defaultBetAmount;

    @BindView(R.id.bet_suggestion_radio_group)
    RadioGroup radioGroup;
    private boolean selectCustom;

    public DialogBetAmountSuggestion(Context context, boolean selectCustom) {
        super(R.layout.dialog_bet_amount_suggestion, context);
        this.selectCustom = selectCustom;
    }

    @Override // org.betup.ui.dialogs.BaseDialog, android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        init();
    }

    @OnClick({R.id.default_bet_amount, R.id.custom_bet_amount})
    public void onRadioButtonClick(CheckBox radioButton) {
        if (radioButton.isChecked()) {
            int id = radioButton.getId();
            if (id == R.id.custom_bet_amount) {
                setCustomBetAmountCheckState();
            } else {
                if (id != R.id.default_bet_amount) {
                    return;
                }
                setDefaultBetAmountCheckState();
            }
        }
    }

    @OnClick({R.id.cancel_button})
    public void onCancelButtonClick() {
        dismiss();
    }

    @OnClick({R.id.ok_button})
    public void onOkButtonClick() {
        saveBetsAmount();
        dismiss();
    }

    private void init() {
        if (!this.selectCustom && SharedPrefs.isSelectedDefaultsBetsAmounts(this.context)) {
            setDefaultBetAmountCheckState();
        } else {
            setCustomBetAmountCheckState();
        }
    }

    private void setDefaultBetAmountCheckState() {
        this.defaultBetAmount.setChecked(true);
        this.customBetAmount.setChecked(false);
    }

    private void setCustomBetAmountCheckState() {
        this.customBetAmount.setChecked(true);
        this.defaultBetAmount.setChecked(false);
    }

    private void saveBetsAmount() {
        SharedPrefs.setIsSelectedDefaultsBetsAmounts(this.context, this.defaultBetAmount.isChecked());
    }
}
