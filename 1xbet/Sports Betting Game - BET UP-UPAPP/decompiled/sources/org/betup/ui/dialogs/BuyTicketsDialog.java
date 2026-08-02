package org.betup.ui.dialogs;

import android.content.Context;
import android.content.DialogInterface;
import butterknife.OnClick;
import org.betup.R;
import org.betup.services.billing.PurchaseConfirmationListener;

/* loaded from: classes2.dex */
public class BuyTicketsDialog extends BaseBlurredDialog {
    private final PurchaseConfirmationListener listener;
    private boolean success;

    @Override // org.betup.ui.dialogs.BaseBlurredDialog
    protected int getLayoutId() {
        return R.layout.dialog_buy_tickets;
    }

    public BuyTicketsDialog(Context context, PurchaseConfirmationListener listener) {
        super(context);
        this.listener = listener;
    }

    @OnClick({R.id.close})
    public void onCloseClick() {
        dismiss();
    }

    @OnClick({R.id.ok})
    public void onOkClick() {
        this.success = true;
        dismiss();
    }

    @Override // org.betup.ui.dialogs.BaseBlurredDialog, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        PurchaseConfirmationListener purchaseConfirmationListener = this.listener;
        if (purchaseConfirmationListener != null) {
            if (this.success) {
                purchaseConfirmationListener.onPurchaseConfirmed(null);
            } else {
                purchaseConfirmationListener.onPurchaseCanceledByUser();
            }
        }
    }
}
