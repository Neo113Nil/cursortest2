package org.betup.model.remote.api.rest.subscription;

import android.content.Context;
import android.os.Bundle;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.entity.subscription.SubscriptionResponseModel;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class GetAllV7SubscriptionsInteractor extends BaseNewVersionBettingInteractor<SubscriptionResponseModel, Integer> {
    private static final long LIFETIME = 600000;

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(Integer page, Bundle parameters) {
        return 600000L;
    }

    @Inject
    public GetAllV7SubscriptionsInteractor(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<SubscriptionResponseModel> makeCall(NewVersionBettingApi bettingApi, Integer page, Bundle parameters, String token) {
        return bettingApi.getAllV7Subscriptions(token, page != null ? page.intValue() : 0);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public void invalidate(Integer page) {
        super.invalidate((GetAllV7SubscriptionsInteractor) page);
    }
}
