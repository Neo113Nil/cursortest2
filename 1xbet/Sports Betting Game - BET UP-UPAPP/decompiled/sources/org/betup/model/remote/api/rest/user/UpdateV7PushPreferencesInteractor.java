package org.betup.model.remote.api.rest.user;

import android.content.Context;
import android.os.Bundle;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.entity.user.UpdatePushPreferencesRequestModel;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class UpdateV7PushPreferencesInteractor extends BaseNewVersionBettingInteractor<Boolean, Void> {
    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(Void id, Bundle parameters) {
        return 0L;
    }

    @Inject
    public UpdateV7PushPreferencesInteractor(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<Boolean> makeCall(NewVersionBettingApi bettingApi, Void id, Bundle parameters, String token) {
        if (parameters == null || (!parameters.containsKey("matchPush") && !parameters.containsKey("betPush"))) {
            throw new RuntimeException("Invalid update push preferences attempt! At least one of 'matchPush' or 'betPush' is required.");
        }
        return bettingApi.updateV7PushPreferences(token, new UpdatePushPreferencesRequestModel(parameters.containsKey("matchPush") ? Boolean.valueOf(parameters.getBoolean("matchPush")) : null, parameters.containsKey("betPush") ? Boolean.valueOf(parameters.getBoolean("betPush")) : null));
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public void invalidate(Void id) {
        super.invalidate((UpdateV7PushPreferencesInteractor) id);
    }
}
