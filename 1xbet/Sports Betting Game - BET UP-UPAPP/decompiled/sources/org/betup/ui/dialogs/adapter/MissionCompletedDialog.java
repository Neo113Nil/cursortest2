package org.betup.ui.dialogs.adapter;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import org.betup.R;
import org.betup.ui.dialogs.BaseBlurredDialog;
import org.betup.utils.FormatHelper;

/* loaded from: classes2.dex */
public class MissionCompletedDialog extends BaseBlurredDialog {

    @BindView(R.id.betcoin)
    ImageView betcoinIcon;

    @BindView(R.id.balance)
    TextView betcoins;
    private long betcoinsValue;
    private long ticketsValue;

    @Override // org.betup.ui.dialogs.BaseBlurredDialog
    protected int getLayoutId() {
        return R.layout.dialog_mission_completed;
    }

    public MissionCompletedDialog(Context context, long betcoins, long tickets) {
        super(context);
        this.betcoinsValue = betcoins;
        this.ticketsValue = tickets;
    }

    @Override // org.betup.ui.dialogs.BaseBlurredDialog, android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buildDialogByArguments();
    }

    private void buildDialogByArguments() {
        long j = this.betcoinsValue;
        if (j > 0) {
            this.betcoins.setText(FormatHelper.getShopBetcoinsFormated(j));
        } else {
            this.betcoins.setVisibility(8);
            this.betcoinIcon.setVisibility(8);
        }
    }

    @OnClick({R.id.ok})
    public void onOkClick() {
        dismiss();
    }
}
