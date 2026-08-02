package org.betup.model.remote.api.rest.user;

import android.content.Context;
import android.os.Bundle;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.entity.user.BaseUserModel;
import org.betup.model.remote.entity.user.UpdateDisplayNameRequestModel;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class ChangeV7NameInteractor extends BaseNewVersionBettingInteractor<BaseUserModel, String> {
    private static final long LIFETIME = 0;

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(String id, Bundle parameters) {
        return 0L;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public void invalidate(String id) {
    }

    @Inject
    public ChangeV7NameInteractor(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<BaseUserModel> makeCall(NewVersionBettingApi bettingApi, String name, Bundle parameters, String token) {
        return bettingApi.updateV7Name(token, new UpdateDisplayNameRequestModel(name));
    }
}
