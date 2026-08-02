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
public class VisualEffectsConfigDialog extends BaseDialog {

    @BindView(R.id.cancel_button)
    TextView cancelButton;

    @BindView(R.id.disable)
    CheckBox disabled;

    @BindView(R.id.enable)
    CheckBox enabled;

    @BindView(R.id.bet_suggestion_radio_group)
    RadioGroup radioGroup;

    public VisualEffectsConfigDialog(Context context) {
        super(R.layout.dialog_visual_effects_config, context);
    }

    @Override // org.betup.ui.dialogs.BaseDialog, android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        init();
    }

    @OnClick({R.id.enable, R.id.disable})
    public void onRadioButtonClick(CheckBox radioButton) {
        if (radioButton.isChecked()) {
            int id = radioButton.getId();
            if (id == R.id.disable) {
                setCustomBetAmountCheckState();
            } else {
                if (id != R.id.enable) {
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
        if (SharedPrefs.areVisualEffectsEnabled(this.context)) {
            setDefaultBetAmountCheckState();
        } else {
            setCustomBetAmountCheckState();
        }
    }

    private void setDefaultBetAmountCheckState() {
        this.enabled.setChecked(true);
        this.disabled.setChecked(false);
    }

    private void setCustomBetAmountCheckState() {
        this.disabled.setChecked(true);
        this.enabled.setChecked(false);
    }

    private void saveBetsAmount() {
        SharedPrefs.setAreVisualEffectsEnabled(this.context, this.enabled.isChecked());
    }
}
