package org.betup.model.remote.api.rest.subscription;

import android.content.Context;
import android.os.Bundle;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class DeleteAllV7SubscriptionsInteractor extends BaseNewVersionBettingInteractor<Map<String, String>, Void> {
    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(Void id, Bundle parameters) {
        return 0L;
    }

    @Inject
    public DeleteAllV7SubscriptionsInteractor(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<Map<String, String>> makeCall(NewVersionBettingApi bettingApi, Void id, Bundle parameters, String token) {
        return bettingApi.deleteAllV7Subscriptions(token);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public void invalidate(Void id) {
        super.invalidate((DeleteAllV7SubscriptionsInteractor) id);
    }
}
