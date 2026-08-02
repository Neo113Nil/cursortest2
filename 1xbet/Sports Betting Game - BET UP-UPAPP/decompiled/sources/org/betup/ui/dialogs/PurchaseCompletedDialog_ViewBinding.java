package org.betup.ui.dialogs;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes2.dex */
public class PurchaseCompletedDialog_ViewBinding implements Unbinder {
    private PurchaseCompletedDialog target;
    private View view7f0a0524;

    public PurchaseCompletedDialog_ViewBinding(PurchaseCompletedDialog target) {
        this(target, target.getWindow().getDecorView());
    }

    public PurchaseCompletedDialog_ViewBinding(final PurchaseCompletedDialog target, View source) {
        this.target = target;
        target.money = (TextView) Utils.findRequiredViewAsType(source, R.id.money, "field 'money'", TextView.class);
        target.bonus = (TextView) Utils.findRequiredViewAsType(source, R.id.bonus, "field 'bonus'", TextView.class);
        target.desc = (TextView) Utils.findRequiredViewAsType(source, R.id.desc, "field 'desc'", TextView.class);
        target.bonusGroup = (Group) Utils.findRequiredViewAsType(source, R.id.bonusGroup, "field 'bonusGroup'", Group.class);
        View findRequiredView = Utils.findRequiredView(source, R.id.ok, "method 'onOkClick'");
        this.view7f0a0524 = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.PurchaseCompletedDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onOkClick();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PurchaseCompletedDialog purchaseCompletedDialog = this.target;
        if (purchaseCompletedDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        purchaseCompletedDialog.money = null;
        purchaseCompletedDialog.bonus = null;
        purchaseCompletedDialog.desc = null;
        purchaseCompletedDialog.bonusGroup = null;
        this.view7f0a0524.setOnClickListener(null);
        this.view7f0a0524 = null;
    }
}
