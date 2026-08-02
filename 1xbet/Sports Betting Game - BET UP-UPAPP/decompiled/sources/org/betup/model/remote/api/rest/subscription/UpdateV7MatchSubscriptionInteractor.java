package org.betup.model.remote.api.rest.subscription;

import android.content.Context;
import android.os.Bundle;
import com.android.billingclient.api.BillingClient;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.entity.subscription.V7MatchSubscriptionUpdateRequest;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class UpdateV7MatchSubscriptionInteractor extends BaseNewVersionBettingInteractor<Map<String, Boolean>, Long> {
    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(Long matchId, Bundle parameters) {
        return 0L;
    }

    @Inject
    public UpdateV7MatchSubscriptionInteractor(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<Map<String, Boolean>> makeCall(NewVersionBettingApi bettingApi, Long matchId, Bundle parameters, String token) {
        List list;
        if (parameters != null && parameters.containsKey(BillingClient.FeatureType.SUBSCRIPTIONS) && (list = (List) parameters.getSerializable(BillingClient.FeatureType.SUBSCRIPTIONS)) != null && !list.isEmpty()) {
            return bettingApi.updateV7MatchSubscriptionBulk(token, matchId.longValue(), new V7MatchSubscriptionUpdateRequest(list));
        }
        String string = parameters != null ? parameters.getString("event") : null;
        int i = (parameters == null || !parameters.containsKey("action")) ? 0 : parameters.getInt("action");
        if (string == null || i == 0) {
            throw new RuntimeException("Invalid subscription attempt! Either provide 'subscriptions' list or 'event' and 'action' parameters!");
        }
        return bettingApi.updateV7MatchSubscriptionSingle(token, matchId.longValue(), i, string);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public void invalidate(Long matchId) {
        super.invalidate((UpdateV7MatchSubscriptionInteractor) matchId);
    }
}
