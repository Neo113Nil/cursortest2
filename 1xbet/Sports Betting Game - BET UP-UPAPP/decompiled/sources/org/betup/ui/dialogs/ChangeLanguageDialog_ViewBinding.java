package org.betup.ui.dialogs;

import android.view.View;
import android.widget.Spinner;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes2.dex */
public class ChangeLanguageDialog_ViewBinding implements Unbinder {
    private ChangeLanguageDialog target;
    private View view7f0a0175;
    private View view7f0a0524;

    public ChangeLanguageDialog_ViewBinding(ChangeLanguageDialog target) {
        this(target, target.getWindow().getDecorView());
    }

    public ChangeLanguageDialog_ViewBinding(final ChangeLanguageDialog target, View source) {
        this.target = target;
        target.spinner = (Spinner) Utils.findRequiredViewAsType(source, R.id.spinner, "field 'spinner'", Spinner.class);
        View findRequiredView = Utils.findRequiredView(source, R.id.ok, "method 'onOkClick'");
        this.view7f0a0524 = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.ChangeLanguageDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onOkClick();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(source, R.id.cancel, "method 'onCancelClick'");
        this.view7f0a0175 = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.ChangeLanguageDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onCancelClick();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ChangeLanguageDialog changeLanguageDialog = this.target;
        if (changeLanguageDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        changeLanguageDialog.spinner = null;
        this.view7f0a0524.setOnClickListener(null);
        this.view7f0a0524 = null;
        this.view7f0a0175.setOnClickListener(null);
        this.view7f0a0175 = null;
    }
}
