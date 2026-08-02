package org.betup.ui.fragment.matches.dialog;

import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes4.dex */
public class ChooseTimeDialog_ViewBinding implements Unbinder {
    private ChooseTimeDialog target;
    private View view7f0a0758;
    private View view7f0a0759;

    public ChooseTimeDialog_ViewBinding(ChooseTimeDialog target) {
        this(target, target.getWindow().getDecorView());
    }

    public ChooseTimeDialog_ViewBinding(final ChooseTimeDialog target, View source) {
        this.target = target;
        target.timeOptions = (Spinner) Utils.findRequiredViewAsType(source, R.id.timeSpinner, "field 'timeOptions'", Spinner.class);
        View findRequiredView = Utils.findRequiredView(source, R.id.timeOkButton, "field 'okButton' and method 'okButtonClicked'");
        target.okButton = (Button) Utils.castView(findRequiredView, R.id.timeOkButton, "field 'okButton'", Button.class);
        this.view7f0a0759 = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.matches.dialog.ChooseTimeDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.okButtonClicked();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(source, R.id.timeCancelButton, "field 'cancelButton' and method 'cancelButtonClicked'");
        target.cancelButton = (Button) Utils.castView(findRequiredView2, R.id.timeCancelButton, "field 'cancelButton'", Button.class);
        this.view7f0a0758 = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.matches.dialog.ChooseTimeDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.cancelButtonClicked();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ChooseTimeDialog chooseTimeDialog = this.target;
        if (chooseTimeDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        chooseTimeDialog.timeOptions = null;
        chooseTimeDialog.okButton = null;
        chooseTimeDialog.cancelButton = null;
        this.view7f0a0759.setOnClickListener(null);
        this.view7f0a0759 = null;
        this.view7f0a0758.setOnClickListener(null);
        this.view7f0a0758 = null;
    }
}
