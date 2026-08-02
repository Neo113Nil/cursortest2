package org.betup.ui.dialogs;

import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes2.dex */
public class DialogBetAmountSuggestion_ViewBinding implements Unbinder {
    private DialogBetAmountSuggestion target;
    private View view7f0a017b;
    private View view7f0a020e;
    private View view7f0a021e;
    private View view7f0a0526;

    public DialogBetAmountSuggestion_ViewBinding(DialogBetAmountSuggestion target) {
        this(target, target.getWindow().getDecorView());
    }

    public DialogBetAmountSuggestion_ViewBinding(final DialogBetAmountSuggestion target, View source) {
        this.target = target;
        target.radioGroup = (RadioGroup) Utils.findRequiredViewAsType(source, R.id.bet_suggestion_radio_group, "field 'radioGroup'", RadioGroup.class);
        View findRequiredView = Utils.findRequiredView(source, R.id.cancel_button, "field 'cancelButton' and method 'onCancelButtonClick'");
        target.cancelButton = (TextView) Utils.castView(findRequiredView, R.id.cancel_button, "field 'cancelButton'", TextView.class);
        this.view7f0a017b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.DialogBetAmountSuggestion_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onCancelButtonClick();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(source, R.id.default_bet_amount, "field 'defaultBetAmount' and method 'onRadioButtonClick'");
        target.defaultBetAmount = (CheckBox) Utils.castView(findRequiredView2, R.id.default_bet_amount, "field 'defaultBetAmount'", CheckBox.class);
        this.view7f0a021e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.DialogBetAmountSuggestion_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onRadioButtonClick((CheckBox) Utils.castParam(p0, "doClick", 0, "onRadioButtonClick", 0, CheckBox.class));
            }
        });
        View findRequiredView3 = Utils.findRequiredView(source, R.id.custom_bet_amount, "field 'customBetAmount' and method 'onRadioButtonClick'");
        target.customBetAmount = (CheckBox) Utils.castView(findRequiredView3, R.id.custom_bet_amount, "field 'customBetAmount'", CheckBox.class);
        this.view7f0a020e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.DialogBetAmountSuggestion_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onRadioButtonClick((CheckBox) Utils.castParam(p0, "doClick", 0, "onRadioButtonClick", 0, CheckBox.class));
            }
        });
        View findRequiredView4 = Utils.findRequiredView(source, R.id.ok_button, "method 'onOkButtonClick'");
        this.view7f0a0526 = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.DialogBetAmountSuggestion_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onOkButtonClick();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DialogBetAmountSuggestion dialogBetAmountSuggestion = this.target;
        if (dialogBetAmountSuggestion == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        dialogBetAmountSuggestion.radioGroup = null;
        dialogBetAmountSuggestion.cancelButton = null;
        dialogBetAmountSuggestion.defaultBetAmount = null;
        dialogBetAmountSuggestion.customBetAmount = null;
        this.view7f0a017b.setOnClickListener(null);
        this.view7f0a017b = null;
        this.view7f0a021e.setOnClickListener(null);
        this.view7f0a021e = null;
        this.view7f0a020e.setOnClickListener(null);
        this.view7f0a020e = null;
        this.view7f0a0526.setOnClickListener(null);
        this.view7f0a0526 = null;
    }
}
