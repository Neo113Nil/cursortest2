package org.betup.ui.dialogs;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import org.betup.R;
import org.betup.utils.FormatHelper;

/* loaded from: classes2.dex */
public class PurchaseCompletedDialog extends BaseDialog {

    @BindView(R.id.bonus)
    TextView bonus;

    @BindView(R.id.bonusGroup)
    Group bonusGroup;
    private Builder builder;

    @BindView(R.id.desc)
    TextView desc;

    @BindView(R.id.money)
    TextView money;

    public PurchaseCompletedDialog(Builder builder) {
        super(R.layout.dialog_purchase, builder.context);
        this.builder = builder;
    }

    @OnClick({R.id.ok})
    public void onOkClick() {
        dismiss();
    }

    @Override // org.betup.ui.dialogs.BaseDialog, android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        this.desc.setText(Html.fromHtml(getContext().getString(R.string.enjoy_purchase)));
        this.money.setText(FormatHelper.getShopBetcoinsFormated(this.builder.money));
        if (this.builder.bonus > 0) {
            this.bonus.setText(FormatHelper.getShopBetcoinsFormated(this.builder.bonus));
        } else {
            this.bonusGroup.setVisibility(8);
        }
    }

    public static class Builder {
        private long bonus;
        private Context context;
        private long money;

        public Builder(Context context) {
            this.context = context;
        }

        public Builder setBonus(long bonus) {
            this.bonus = bonus;
            return this;
        }

        public Builder setMoney(long money) {
            this.money = money;
            return this;
        }

        public PurchaseCompletedDialog build() {
            return new PurchaseCompletedDialog(this);
        }
    }
}
