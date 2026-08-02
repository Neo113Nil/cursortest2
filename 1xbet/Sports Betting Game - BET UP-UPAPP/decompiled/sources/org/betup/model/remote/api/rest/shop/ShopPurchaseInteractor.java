package org.betup.model.remote.api.rest.shop;

import android.content.Context;
import android.os.Bundle;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.entity.billing.UserPurchaseRequestModel;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class ShopPurchaseInteractor extends BaseNewVersionBettingInteractor<String, String> {
    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(String id, Bundle parameters) {
        return 0L;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public void invalidate(String id) {
    }

    @Inject
    public ShopPurchaseInteractor(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<String> makeCall(NewVersionBettingApi bettingApi, String productId, Bundle parameters, String token) {
        return bettingApi.makePurchase(new UserPurchaseRequestModel(parameters.getString("token"), productId, parameters.getString("environment", "GOOGLE_PLAY")), token);
    }
}
