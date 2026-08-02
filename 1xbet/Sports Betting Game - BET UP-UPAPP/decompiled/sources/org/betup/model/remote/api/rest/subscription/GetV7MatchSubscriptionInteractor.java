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
public class GetV7MatchSubscriptionInteractor extends BaseNewVersionBettingInteractor<Map<String, Boolean>, Long> {
    private static final long LIFETIME = 600000;

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(Long matchId, Bundle parameters) {
        return 600000L;
    }

    @Inject
    public GetV7MatchSubscriptionInteractor(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<Map<String, Boolean>> makeCall(NewVersionBettingApi bettingApi, Long matchId, Bundle parameters, String token) {
        return bettingApi.getV7MatchSubscription(token, matchId.longValue());
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public void invalidate(Long matchId) {
        super.invalidate((GetV7MatchSubscriptionInteractor) matchId);
    }
}
