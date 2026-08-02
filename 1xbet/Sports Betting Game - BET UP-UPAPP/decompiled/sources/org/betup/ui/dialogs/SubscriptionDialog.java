package org.betup.ui.dialogs;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.android.billingclient.api.ProductDetails;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.model.domain.ShopConstants;
import org.betup.services.billing.BillingService;
import org.betup.services.billing.ProductDetailsPrice;
import org.betup.services.user.UserService;
import org.betup.utils.SnackbarHelper;

/* loaded from: classes2.dex */
public class SubscriptionDialog extends BaseBlurredDialog implements BillingService.DetailsGotListener, BillingService.PurchaseListener {
    private final Activity activity;

    @Inject
    BillingService billingService;
    private final SubscriptionDialogListener listener;

    @BindView(R.id.month)
    View month;

    @BindView(R.id.priceMonth)
    TextView priceMonth;

    @BindView(R.id.priceWeek)
    TextView priceWeek;

    @Inject
    UserService userService;

    @BindView(R.id.week)
    View week;

    public interface SubscriptionDialogListener {
        void onSubscriptionFlowResult(SubscriptionResult result);
    }

    public enum SubscriptionResult {
        PURCHASED,
        ALREADY_HAD,
        CANCELED
    }

    @Override // org.betup.ui.dialogs.BaseBlurredDialog
    protected int getLayoutId() {
        return R.layout.dialog_subscription;
    }

    public SubscriptionDialog(Activity activity, SubscriptionDialogListener listener) {
        super(activity);
        this.activity = activity;
        this.listener = listener;
    }

    @Override // org.betup.ui.dialogs.BaseBlurredDialog, android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((BetUpApp) this.activity.getApplicationContext()).getComponent().inject(this);
        if (this.userService.isSubscriber()) {
            dismiss();
            this.listener.onSubscriptionFlowResult(SubscriptionResult.ALREADY_HAD);
        } else {
            this.week.setVisibility(4);
            this.month.setVisibility(4);
            this.billingService.getSubscriptionDetails(Arrays.asList(ShopConstants.SUBSCRIPTION_MONTH_ID, ShopConstants.SUBSCRIPTION_WEEK_ID), this);
        }
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
        this.listener.onSubscriptionFlowResult(SubscriptionResult.CANCELED);
    }

    @OnClick({R.id.close})
    public void close() {
        dismiss();
        this.listener.onSubscriptionFlowResult(SubscriptionResult.CANCELED);
    }

    @OnClick({R.id.week})
    public void buyWeekly() {
        this.billingService.purchaseItem(this.activity, ShopConstants.SUBSCRIPTION_WEEK_ID, this);
    }

    @OnClick({R.id.month})
    public void buyMonthly() {
        this.billingService.purchaseItem(this.activity, ShopConstants.SUBSCRIPTION_MONTH_ID, this);
    }

    @Override // org.betup.services.billing.BillingService.PurchaseListener
    public void purchaseCompleted() {
        dismiss();
        this.listener.onSubscriptionFlowResult(SubscriptionResult.PURCHASED);
    }

    @Override // org.betup.services.billing.BillingService.PurchaseListener
    public void purchaseFailed(BillingService.BillingError error) {
        if (error != BillingService.BillingError.CANCELED) {
            SnackbarHelper.showShort(this.activity, R.string.error);
        }
    }

    @Override // org.betup.services.billing.BillingService.DetailsGotListener
    public void detailsGot(Map<String, ProductDetails> details) {
        if (details.size() < 2) {
            SnackbarHelper.showShort(this.activity, R.string.play_services_error);
            dismiss();
            return;
        }
        this.week.setVisibility(0);
        this.month.setVisibility(0);
        this.priceMonth.setText(String.format(Locale.getDefault(), "%s/%s", ProductDetailsPrice.formattedPrice(details.get(ShopConstants.SUBSCRIPTION_MONTH_ID)), this.activity.getString(R.string.month)));
        this.priceWeek.setText(String.format(Locale.getDefault(), "%s/%s", ProductDetailsPrice.formattedPrice(details.get(ShopConstants.SUBSCRIPTION_WEEK_ID)), this.activity.getString(R.string.week)));
    }
}
