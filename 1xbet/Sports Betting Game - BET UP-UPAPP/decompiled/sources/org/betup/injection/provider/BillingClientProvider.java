package org.betup.injection.provider;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.PurchasesUpdatedListener;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* loaded from: classes2.dex */
public class BillingClientProvider {
    @Inject
    public BillingClientProvider() {
    }

    public BillingClient createBillingClient(Context context, PurchasesUpdatedListener listener) {
        return BillingClient.newBuilder(context).setListener(listener).enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).enableAutoServiceReconnection().build();
    }
}
