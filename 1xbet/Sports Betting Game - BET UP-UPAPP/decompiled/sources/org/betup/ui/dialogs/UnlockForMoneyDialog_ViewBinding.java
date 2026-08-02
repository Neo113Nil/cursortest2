package org.betup.ui.dialogs;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes2.dex */
public class UnlockForMoneyDialog_ViewBinding implements Unbinder {
    private UnlockForMoneyDialog target;
    private View view7f0a0175;
    private View view7f0a0524;

    public UnlockForMoneyDialog_ViewBinding(UnlockForMoneyDialog target) {
        this(target, target.getWindow().getDecorView());
    }

    public UnlockForMoneyDialog_ViewBinding(final UnlockForMoneyDialog target, View source) {
        this.target = target;
        target.title = (TextView) Utils.findRequiredViewAsType(source, R.id.title, "field 'title'", TextView.class);
        target.desc = (TextView) Utils.findRequiredViewAsType(source, R.id.desc, "field 'desc'", TextView.class);
        target.price = (TextView) Utils.findRequiredViewAsType(source, R.id.price, "field 'price'", TextView.class);
        View findRequiredView = Utils.findRequiredView(source, R.id.ok, "method 'onOkClick'");
        this.view7f0a0524 = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.UnlockForMoneyDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onOkClick();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(source, R.id.cancel, "method 'onCancelClick'");
        this.view7f0a0175 = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.UnlockForMoneyDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onCancelClick();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        UnlockForMoneyDialog unlockForMoneyDialog = this.target;
        if (unlockForMoneyDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        unlockForMoneyDialog.title = null;
        unlockForMoneyDialog.desc = null;
        unlockForMoneyDialog.price = null;
        this.view7f0a0524.setOnClickListener(null);
        this.view7f0a0524 = null;
        this.view7f0a0175.setOnClickListener(null);
        this.view7f0a0175 = null;
    }
}
