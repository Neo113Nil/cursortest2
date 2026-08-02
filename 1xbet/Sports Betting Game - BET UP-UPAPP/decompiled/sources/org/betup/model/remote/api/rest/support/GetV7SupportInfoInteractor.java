package org.betup.model.remote.api.rest.support;

import android.content.Context;
import android.os.Bundle;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.entity.support.V7SupportUserDto;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class GetV7SupportInfoInteractor extends BaseNewVersionBettingInteractor<V7SupportUserDto, Void> {
    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(Void id, Bundle parameters) {
        return 0L;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public void invalidate(Void id) {
    }

    @Inject
    public GetV7SupportInfoInteractor(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<V7SupportUserDto> makeCall(NewVersionBettingApi bettingApi, Void id, Bundle parameters, String token) {
        return bettingApi.getV7SupportInfo(token);
    }
}
