package org.betup.ui.dialogs;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import org.betup.R;

/* loaded from: classes2.dex */
public class PurchaseUnlockDialog extends BaseDialog {
    private long bonus;

    @BindView(R.id.bonus)
    TextView bonusText;

    @BindView(R.id.desc)
    TextView desc;

    @BindView(R.id.what)
    TextView what;
    private String whatDesc;

    public PurchaseUnlockDialog(Context context) {
        super(R.layout.dialog_purchase_unlock, context);
        this.bonus = 1000L;
    }

    @Override // org.betup.ui.dialogs.BaseDialog, android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        this.desc.setText(Html.fromHtml(getContext().getString(R.string.enjoy_purchase)));
        this.what.setText(this.whatDesc);
        this.bonusText.setText(getContext().getString(R.string.bonus_betcoins, String.valueOf(this.bonus)));
    }

    @OnClick({R.id.ok})
    public void onOkClick(View v) {
        dismiss();
    }

    public static PurchaseUnlockDialog showDialog(Context context, String whatDesc, long bonus) {
        PurchaseUnlockDialog purchaseUnlockDialog = new PurchaseUnlockDialog(context);
        purchaseUnlockDialog.whatDesc = whatDesc;
        purchaseUnlockDialog.bonus = bonus;
        purchaseUnlockDialog.show();
        return purchaseUnlockDialog;
    }
}
