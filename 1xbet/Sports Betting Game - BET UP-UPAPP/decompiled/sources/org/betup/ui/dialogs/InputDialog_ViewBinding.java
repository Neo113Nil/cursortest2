package org.betup.ui.dialogs;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes2.dex */
public class InputDialog_ViewBinding implements Unbinder {
    private InputDialog target;
    private View view7f0a0524;
    private View view7f0a064f;

    public InputDialog_ViewBinding(InputDialog target) {
        this(target, target.getWindow().getDecorView());
    }

    public InputDialog_ViewBinding(final InputDialog target, View source) {
        this.target = target;
        target.title = (TextView) Utils.findRequiredViewAsType(source, R.id.subtitle, "field 'title'", TextView.class);
        target.desc = (TextView) Utils.findRequiredViewAsType(source, R.id.desc, "field 'desc'", TextView.class);
        target.code = (EditText) Utils.findRequiredViewAsType(source, R.id.code, "field 'code'", EditText.class);
        View findRequiredView = Utils.findRequiredView(source, R.id.ok, "field 'ok' and method 'onOkClick'");
        target.ok = findRequiredView;
        this.view7f0a0524 = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.InputDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onOkClick();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(source, R.id.secondButton, "field 'cancel' and method 'onCancelClick'");
        target.cancel = findRequiredView2;
        this.view7f0a064f = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.InputDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onCancelClick();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        InputDialog inputDialog = this.target;
        if (inputDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        inputDialog.title = null;
        inputDialog.desc = null;
        inputDialog.code = null;
        inputDialog.ok = null;
        inputDialog.cancel = null;
        this.view7f0a0524.setOnClickListener(null);
        this.view7f0a0524 = null;
        this.view7f0a064f.setOnClickListener(null);
        this.view7f0a064f = null;
    }
}
