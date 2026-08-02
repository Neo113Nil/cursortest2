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
public class DeleteV7MatchSubscriptionInteractor extends BaseNewVersionBettingInteractor<Map<String, Boolean>, Long> {
    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(Long matchId, Bundle parameters) {
        return 0L;
    }

    @Inject
    public DeleteV7MatchSubscriptionInteractor(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<Map<String, Boolean>> makeCall(NewVersionBettingApi bettingApi, Long matchId, Bundle parameters, String token) {
        if (parameters == null || !parameters.containsKey("event")) {
            throw new RuntimeException("Invalid delete subscription attempt! 'event' parameter is required.");
        }
        String string = parameters.getString("event");
        if (string == null) {
            throw new RuntimeException("Invalid delete subscription attempt! 'event' parameter cannot be null.");
        }
        return bettingApi.deleteV7MatchSubscription(token, matchId.longValue(), string);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public void invalidate(Long matchId) {
        super.invalidate((DeleteV7MatchSubscriptionInteractor) matchId);
    }
}
