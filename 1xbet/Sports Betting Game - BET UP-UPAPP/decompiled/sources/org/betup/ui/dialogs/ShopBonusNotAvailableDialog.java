package org.betup.ui.dialogs;

import android.content.Context;
import butterknife.OnClick;
import org.betup.R;

/* loaded from: classes2.dex */
public class ShopBonusNotAvailableDialog extends BaseBlurredDialog {
    @Override // org.betup.ui.dialogs.BaseBlurredDialog
    protected int getLayoutId() {
        return R.layout.dialog_buy_to_get_bonus;
    }

    public ShopBonusNotAvailableDialog(Context context) {
        super(context);
    }

    @OnClick({R.id.ok})
    public void onOkClick() {
        dismiss();
    }
}
