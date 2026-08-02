package org.betup.ui.dialogs;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.android.billingclient.api.ProductDetails;
import org.betup.R;
import org.betup.services.billing.PurchaseConfirmationListener;

/* loaded from: classes2.dex */
public class UnlockForMoneyDialog extends BaseDialog {
    private Builder builder;

    @BindView(R.id.desc)
    TextView desc;

    @BindView(R.id.price)
    TextView price;

    @BindView(R.id.title)
    TextView title;

    public UnlockForMoneyDialog(Context context, Builder builder) {
        super(R.layout.dialog_unlock_for_money, context);
        this.builder = builder;
    }

    @Override // org.betup.ui.dialogs.BaseDialog, android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        this.title.setText(this.builder.title);
        this.desc.setText(this.builder.desc);
        this.price.setText(this.builder.price);
    }

    @OnClick({R.id.ok})
    public void onOkClick() {
        dismiss();
        if (this.builder.purchaseConfirmationListener == null || this.builder.productDetails == null) {
            return;
        }
        this.builder.purchaseConfirmationListener.onPurchaseConfirmed(this.builder.productDetails.getProductId());
    }

    @OnClick({R.id.cancel})
    public void onCancelClick() {
        dismiss();
    }

    public static class Builder {
        private Context context;
        private String desc;
        private int icon;
        private String price;
        private ProductDetails productDetails;
        private PurchaseConfirmationListener purchaseConfirmationListener;
        private String title;

        public Builder(Context context) {
            this.context = context;
        }

        public Builder setPurchaseConfirmationListener(PurchaseConfirmationListener purchaseConfirmationListener) {
            this.purchaseConfirmationListener = purchaseConfirmationListener;
            return this;
        }

        public Builder setProductDetails(ProductDetails productDetails) {
            this.productDetails = productDetails;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setDesc(String desc) {
            this.desc = desc;
            return this;
        }

        public Builder setPrice(String price) {
            this.price = price;
            return this;
        }

        public Builder setIcon(int icon) {
            this.icon = icon;
            return this;
        }

        public UnlockForMoneyDialog build() {
            return new UnlockForMoneyDialog(this.context, this);
        }
    }
}
