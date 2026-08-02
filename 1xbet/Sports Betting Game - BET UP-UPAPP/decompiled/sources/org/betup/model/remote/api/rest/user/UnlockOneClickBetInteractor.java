package org.betup.model.remote.api.rest.user;

import android.content.Context;
import android.os.Bundle;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.entity.user.UserProgressModel;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class UnlockOneClickBetInteractor extends BaseNewVersionBettingInteractor<UserProgressModel, Void> {
    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(Void id, Bundle parameters) {
        return 0L;
    }

    @Inject
    public UnlockOneClickBetInteractor(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<UserProgressModel> makeCall(NewVersionBettingApi api, Void id, Bundle parameters, String token) {
        return api.unlockOneClickBet(token);
    }
}
