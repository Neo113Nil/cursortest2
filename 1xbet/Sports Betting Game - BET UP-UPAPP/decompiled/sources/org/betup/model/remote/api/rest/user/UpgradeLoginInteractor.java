package org.betup.model.remote.api.rest.user;

import android.content.Context;
import android.os.Bundle;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.entity.login.UserUpgradeResultModel;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class UpgradeLoginInteractor extends BaseNewVersionBettingInteractor<UserUpgradeResultModel, Void> {
    private static final int LIFETIME = 0;

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(Void id, Bundle parameters) {
        return 0L;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public int getRetryCount() {
        return 3;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public void invalidate(Void id) {
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public boolean isCritical() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public boolean shouldForceRefreshToken(Void id, Bundle parameters) {
        return true;
    }

    @Inject
    public UpgradeLoginInteractor(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<UserUpgradeResultModel> makeCall(NewVersionBettingApi bettingApi, Void id, Bundle parameters, String token) {
        return bettingApi.loginUpgrade(token);
    }
}
