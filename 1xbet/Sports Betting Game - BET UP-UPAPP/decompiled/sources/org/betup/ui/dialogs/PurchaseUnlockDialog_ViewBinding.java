package org.betup.ui.dialogs;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes2.dex */
public class PurchaseUnlockDialog_ViewBinding implements Unbinder {
    private PurchaseUnlockDialog target;
    private View view7f0a0524;

    public PurchaseUnlockDialog_ViewBinding(PurchaseUnlockDialog target) {
        this(target, target.getWindow().getDecorView());
    }

    public PurchaseUnlockDialog_ViewBinding(final PurchaseUnlockDialog target, View source) {
        this.target = target;
        target.desc = (TextView) Utils.findRequiredViewAsType(source, R.id.desc, "field 'desc'", TextView.class);
        target.what = (TextView) Utils.findRequiredViewAsType(source, R.id.what, "field 'what'", TextView.class);
        target.bonusText = (TextView) Utils.findRequiredViewAsType(source, R.id.bonus, "field 'bonusText'", TextView.class);
        View findRequiredView = Utils.findRequiredView(source, R.id.ok, "method 'onOkClick'");
        this.view7f0a0524 = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.PurchaseUnlockDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onOkClick(p0);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PurchaseUnlockDialog purchaseUnlockDialog = this.target;
        if (purchaseUnlockDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        purchaseUnlockDialog.desc = null;
        purchaseUnlockDialog.what = null;
        purchaseUnlockDialog.bonusText = null;
        this.view7f0a0524.setOnClickListener(null);
        this.view7f0a0524 = null;
    }
}
