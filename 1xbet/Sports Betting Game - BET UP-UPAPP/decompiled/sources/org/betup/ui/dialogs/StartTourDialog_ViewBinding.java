package org.betup.ui.dialogs;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes2.dex */
public class StartTourDialog_ViewBinding implements Unbinder {
    private StartTourDialog target;
    private View view7f0a01ac;
    private View view7f0a0524;

    public StartTourDialog_ViewBinding(StartTourDialog target) {
        this(target, target.getWindow().getDecorView());
    }

    public StartTourDialog_ViewBinding(final StartTourDialog target, View source) {
        this.target = target;
        target.desc = (TextView) Utils.findRequiredViewAsType(source, R.id.desc, "field 'desc'", TextView.class);
        View findRequiredView = Utils.findRequiredView(source, R.id.ok, "method 'onOkClick'");
        this.view7f0a0524 = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.StartTourDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onOkClick();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(source, R.id.close, "method 'onCloseButtonClick'");
        this.view7f0a01ac = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.StartTourDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onCloseButtonClick();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        StartTourDialog startTourDialog = this.target;
        if (startTourDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        startTourDialog.desc = null;
        this.view7f0a0524.setOnClickListener(null);
        this.view7f0a0524 = null;
        this.view7f0a01ac.setOnClickListener(null);
        this.view7f0a01ac = null;
    }
}
