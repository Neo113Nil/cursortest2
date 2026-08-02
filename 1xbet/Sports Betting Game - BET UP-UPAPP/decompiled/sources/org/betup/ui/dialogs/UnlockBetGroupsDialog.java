package org.betup.ui.dialogs;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
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
import org.betup.utils.FormatHelper;

/* loaded from: classes2.dex */
public class UnlockBetGroupsDialog extends BaseBlurredDialog implements DialogInterface.OnDismissListener {

    @BindView(R.id.bonusText)
    TextView bonusText;
    private PurchaseConfirmationListener listener;

    @BindView(R.id.or)
    View or;

    @BindView(R.id.price)
    TextView tickets;

    @BindView(R.id.title)
    TextView title;
    private ShopItemModel unlockShopItemModel;
    private UserDecision userDecision;

    @Inject
    UserService userService;
    private boolean videoAvailable;

    @BindView(R.id.videoIcon)
    ImageView videoIcon;

    @BindView(R.id.watchVideo)
    View watchVideoButton;

    private enum UserDecision {
        Purchase,
        Video,
        Cancel
    }

    @Override // org.betup.ui.dialogs.BaseBlurredDialog
    protected int getLayoutId() {
        return R.layout.dialog_unlock_bet_groups;
    }

    public UnlockBetGroupsDialog(Context context) {
        super(context);
        this.userDecision = UserDecision.Cancel;
    }

    public static UnlockBetGroupsDialog showDialog(Context context, ShopItemModel unlockShopItemModel, boolean videoAvailable, PurchaseConfirmationListener listener) {
        UnlockBetGroupsDialog unlockBetGroupsDialog = new UnlockBetGroupsDialog(context);
        unlockBetGroupsDialog.unlockShopItemModel = unlockShopItemModel;
        unlockBetGroupsDialog.listener = listener;
        unlockBetGroupsDialog.videoAvailable = videoAvailable;
        unlockBetGroupsDialog.show();
        return unlockBetGroupsDialog;
    }

    @Override // org.betup.ui.dialogs.BaseBlurredDialog, android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((BetUpApp) getContext().getApplicationContext()).getComponent().inject(this);
        ButterKnife.bind(this);
        setOnDismissListener(this);
        this.title.setText(Html.fromHtml(getContext().getString(R.string.unlock_all_bet_types)));
        this.bonusText.setText("+ " + FormatHelper.getDialogBetcoinsFormated(this.unlockShopItemModel.getBonus()));
        this.tickets.setText(this.unlockShopItemModel.getPrice());
        if (this.videoAvailable) {
            this.watchVideoButton.setVisibility(0);
            this.videoIcon.setVisibility(0);
            this.or.setVisibility(0);
        } else {
            this.watchVideoButton.setVisibility(8);
            this.videoIcon.setVisibility(8);
            this.or.setVisibility(8);
        }
    }

    @OnClick({R.id.exchange})
    public void onOkClick() {
        this.userDecision = UserDecision.Purchase;
        dismiss();
        this.listener.onPurchaseConfirmed(this.unlockShopItemModel.getStoreCode());
    }

    @OnClick({R.id.watchVideo})
    public void onWatchVideoClicked() {
        this.userDecision = UserDecision.Video;
        dismiss();
        this.listener.onVideoConfirmed();
    }

    @OnClick({R.id.close})
    public void onCloseButtonClick() {
        this.userDecision = UserDecision.Cancel;
        dismiss();
    }

    @Override // org.betup.ui.dialogs.BaseBlurredDialog, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        if (this.userDecision == UserDecision.Cancel) {
            this.listener.onPurchaseCanceledByUser();
        }
    }
}
