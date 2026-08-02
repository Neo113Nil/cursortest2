package org.betup.model.remote.api.rest.user;

import android.content.Context;
import android.os.Bundle;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.entity.user.NewUserInfoModel;
import org.betup.model.remote.entity.user.UpdateCountryRequestModel;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class ChangeV7CountryInteractor extends BaseNewVersionBettingInteractor<NewUserInfoModel, String> {
    private static final long LIFETIME = 0;

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(String id, Bundle parameters) {
        return 0L;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public void invalidate(String id) {
    }

    @Inject
    public ChangeV7CountryInteractor(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<NewUserInfoModel> makeCall(NewVersionBettingApi bettingApi, String countryIso, Bundle parameters, String token) {
        return bettingApi.updateV7Country(token, new UpdateCountryRequestModel(countryIso));
    }
}
