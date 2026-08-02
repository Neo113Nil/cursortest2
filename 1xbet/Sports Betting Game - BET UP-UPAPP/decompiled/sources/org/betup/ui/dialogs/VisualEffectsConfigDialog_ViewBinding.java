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
public class VisualEffectsConfigDialog_ViewBinding implements Unbinder {
    private VisualEffectsConfigDialog target;
    private View view7f0a017b;
    private View view7f0a0238;
    private View view7f0a0275;
    private View view7f0a0526;

    public VisualEffectsConfigDialog_ViewBinding(VisualEffectsConfigDialog target) {
        this(target, target.getWindow().getDecorView());
    }

    public VisualEffectsConfigDialog_ViewBinding(final VisualEffectsConfigDialog target, View source) {
        this.target = target;
        target.radioGroup = (RadioGroup) Utils.findRequiredViewAsType(source, R.id.bet_suggestion_radio_group, "field 'radioGroup'", RadioGroup.class);
        View findRequiredView = Utils.findRequiredView(source, R.id.cancel_button, "field 'cancelButton' and method 'onCancelButtonClick'");
        target.cancelButton = (TextView) Utils.castView(findRequiredView, R.id.cancel_button, "field 'cancelButton'", TextView.class);
        this.view7f0a017b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.VisualEffectsConfigDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onCancelButtonClick();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(source, R.id.enable, "field 'enabled' and method 'onRadioButtonClick'");
        target.enabled = (CheckBox) Utils.castView(findRequiredView2, R.id.enable, "field 'enabled'", CheckBox.class);
        this.view7f0a0275 = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.VisualEffectsConfigDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onRadioButtonClick((CheckBox) Utils.castParam(p0, "doClick", 0, "onRadioButtonClick", 0, CheckBox.class));
            }
        });
        View findRequiredView3 = Utils.findRequiredView(source, R.id.disable, "field 'disabled' and method 'onRadioButtonClick'");
        target.disabled = (CheckBox) Utils.castView(findRequiredView3, R.id.disable, "field 'disabled'", CheckBox.class);
        this.view7f0a0238 = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.VisualEffectsConfigDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onRadioButtonClick((CheckBox) Utils.castParam(p0, "doClick", 0, "onRadioButtonClick", 0, CheckBox.class));
            }
        });
        View findRequiredView4 = Utils.findRequiredView(source, R.id.ok_button, "method 'onOkButtonClick'");
        this.view7f0a0526 = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.VisualEffectsConfigDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onOkButtonClick();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        VisualEffectsConfigDialog visualEffectsConfigDialog = this.target;
        if (visualEffectsConfigDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        visualEffectsConfigDialog.radioGroup = null;
        visualEffectsConfigDialog.cancelButton = null;
        visualEffectsConfigDialog.enabled = null;
        visualEffectsConfigDialog.disabled = null;
        this.view7f0a017b.setOnClickListener(null);
        this.view7f0a017b = null;
        this.view7f0a0275.setOnClickListener(null);
        this.view7f0a0275 = null;
        this.view7f0a0238.setOnClickListener(null);
        this.view7f0a0238 = null;
        this.view7f0a0526.setOnClickListener(null);
        this.view7f0a0526 = null;
    }
}
