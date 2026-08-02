package org.betup.ui.dialogs;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import butterknife.OnClick;
import org.betup.R;
import org.betup.bus.OfferMessage;
import org.betup.model.remote.entity.promo.PromoType;
import org.betup.services.offer.PromoService;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes2.dex */
public class TourCompletedDialog extends BaseBlurredDialog {
    @Override // org.betup.ui.dialogs.BaseBlurredDialog
    protected int getLayoutId() {
        return R.layout.dialog_tour_completed;
    }

    public TourCompletedDialog(Context context) {
        super(context);
    }

    @Override // org.betup.ui.dialogs.BaseBlurredDialog, android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @OnClick({R.id.ok})
    public void onOkClick() {
        dismiss();
    }

    @OnClick({R.id.close})
    public void onCloseButtonClick() {
        dismiss();
    }

    @Override // org.betup.ui.dialogs.BaseBlurredDialog, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        EventBus.getDefault().post(new OfferMessage(PromoType.INTERSTITIAL, PromoService.PromoCase.AFTER_TOUR, null));
    }
}
