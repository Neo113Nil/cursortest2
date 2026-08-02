package org.betup.model.remote.api.rest.support;

import android.content.Context;
import android.os.Bundle;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.entity.support.V7SupportMessageDto;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class SendV7SupportMessageInteractor extends BaseNewVersionBettingInteractor<V7SupportMessageDto, String> {
    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(String id, Bundle parameters) {
        return 0L;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public void invalidate(String id) {
    }

    @Inject
    public SendV7SupportMessageInteractor(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<V7SupportMessageDto> makeCall(NewVersionBettingApi bettingApi, String id, Bundle parameters, String token) {
        return bettingApi.sendV7SupportMessage(token, parameters.getString("message"));
    }
}
