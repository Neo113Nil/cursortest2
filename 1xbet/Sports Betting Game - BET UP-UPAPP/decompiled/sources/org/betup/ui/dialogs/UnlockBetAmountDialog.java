package org.betup.ui.dialogs;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import javax.inject.Inject;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.model.remote.entity.shop.ShopItemModel;
import org.betup.services.billing.PurchaseConfirmationListener;
import org.betup.services.user.UserService;
import org.betup.ui.controls.SpriteImageButton;
import org.betup.utils.FormatHelper;

/* loaded from: classes2.dex */
public class UnlockBetAmountDialog extends BaseBlurredDialog implements DialogInterface.OnDismissListener {

    @BindView(R.id.bonusText)
    TextView bonusText;

    @BindView(R.id.exchange)
    SpriteImageButton exchange;
    private PurchaseConfirmationListener listener;
    private boolean success;
    private ShopItemModel unlockShopItemModel;

    @Inject
    UserService userService;

    @Override // org.betup.ui.dialogs.BaseBlurredDialog
    protected int getLayoutId() {
        return R.layout.dialog_unlock_bet_amount;
    }

    public UnlockBetAmountDialog(Context context) {
        super(context);
    }

    public static UnlockBetAmountDialog showDialog(Context context, ShopItemModel unlockShopItemModel, PurchaseConfirmationListener listener) {
        UnlockBetAmountDialog unlockBetAmountDialog = new UnlockBetAmountDialog(context);
        unlockBetAmountDialog.listener = listener;
        unlockBetAmountDialog.unlockShopItemModel = unlockShopItemModel;
        unlockBetAmountDialog.show();
        return unlockBetAmountDialog;
    }

    @Override // org.betup.ui.dialogs.BaseBlurredDialog, android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((BetUpApp) getContext().getApplicationContext()).getComponent().inject(this);
        ButterKnife.bind(this);
        this.success = false;
        setOnDismissListener(this);
        this.bonusText.setText(getContext().getString(R.string.bonus_betcoins, FormatHelper.getDialogBetcoinsFormated(this.unlockShopItemModel.getBonus())));
        this.exchange.setTitle(this.unlockShopItemModel.getPrice());
    }

    @OnClick({R.id.exchange})
    public void onOkClick() {
        this.success = true;
        dismiss();
        this.listener.onPurchaseConfirmed(this.unlockShopItemModel.getStoreCode());
    }

    @OnClick({R.id.close})
    public void onCloseButtonClick() {
        dismiss();
        this.listener.onPurchaseCanceledByUser();
    }

    @Override // org.betup.ui.dialogs.BaseBlurredDialog, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        if (this.success) {
            return;
        }
        this.listener.onPurchaseCanceledByUser();
    }
}
