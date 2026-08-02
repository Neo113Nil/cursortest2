package org.betup.model.remote.api.rest.country;

import android.content.Context;
import android.os.Bundle;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.entity.country.CountryResponseModel;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class GetV7CountriesInteractor extends BaseNewVersionBettingInteractor<CountryResponseModel, Void> {
    private static final long LIFETIME = 600000;

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(Void id, Bundle parameters) {
        return 600000L;
    }

    @Inject
    public GetV7CountriesInteractor(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<CountryResponseModel> makeCall(NewVersionBettingApi bettingApi, Void id, Bundle parameters, String token) {
        return bettingApi.getV7CountryList(token);
    }
}
