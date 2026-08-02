package org.betup.model.remote.api.rest.user;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.remote.api.Invalidatable;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.entity.user.BaseUserModel;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class GetV7MyInfoInteractor extends BaseNewVersionBettingInteractor<BaseUserModel, Void> implements Invalidatable {
    private static final long LIFETIME = 60000;

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(Void id, Bundle parameters) {
        return 60000L;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public int getRetryCount() {
        return 3;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public boolean isCritical() {
        return true;
    }

    @Inject
    public GetV7MyInfoInteractor(Context context) {
        super(context);
    }

    @Override // org.betup.model.remote.api.Invalidatable
    public void invalidate(boolean loadNow) {
        Log.d("PUSHTEST", "INVALIDATING USER MODEL (V7)...");
        removeFromCache(getHash(null, null));
        if (loadNow) {
            load(null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<BaseUserModel> makeCall(NewVersionBettingApi bettingApi, Void id, Bundle parameters, String token) {
        return bettingApi.getV7MeInfo(token);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public void invalidate(Void id) {
        removeFromCache(getHash(null, null));
    }
}
