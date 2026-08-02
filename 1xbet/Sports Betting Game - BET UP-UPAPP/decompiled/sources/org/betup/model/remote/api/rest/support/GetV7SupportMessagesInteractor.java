package org.betup.model.remote.api.rest.support;

import android.content.Context;
import android.os.Bundle;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.entity.support.V7SupportMessagesPageDto;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class GetV7SupportMessagesInteractor extends BaseNewVersionBettingInteractor<V7SupportMessagesPageDto, String> {
    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(String id, Bundle parameters) {
        return 0L;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public void invalidate(String id) {
    }

    @Inject
    public GetV7SupportMessagesInteractor(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<V7SupportMessagesPageDto> makeCall(NewVersionBettingApi bettingApi, String id, Bundle parameters, String token) {
        return bettingApi.getV7SupportMessages(token, parameters.containsKey("pageSize") ? Integer.valueOf(parameters.getInt("pageSize")) : null, parameters.containsKey("offset") ? Integer.valueOf(parameters.getInt("offset")) : null, parameters.containsKey("headId") ? Long.valueOf(parameters.getLong("headId")) : null, parameters.getString("searchTerm"), parameters.getString("searchField"), null, parameters.getString("direction"), parameters.getString("continuationToken"));
    }
}
