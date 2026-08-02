package org.betup.model.remote.api.rest.user;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.Locale;
import java.util.TimeZone;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.BuildConfig;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.entity.login.LoginRequestModel;
import org.betup.model.remote.entity.login.LoginResponseModel;
import org.betup.utils.SupportedLanguagesManager;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class NewLoginInteractor extends BaseNewVersionBettingInteractor<LoginResponseModel, Void> {
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
    public NewLoginInteractor(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<LoginResponseModel> makeCall(NewVersionBettingApi bettingApi, Void id, Bundle parameters, String token) {
        String id2 = TimeZone.getDefault().getID();
        String supportedLanguage = SupportedLanguagesManager.getSupportedLanguage(this.context, SupportedLanguagesManager.LangTypeGroup.DEFAULT_4);
        String valueOf = String.valueOf(BuildConfig.VERSION_CODE);
        String country = Locale.getDefault().getCountry();
        boolean z = false;
        if (parameters != null && parameters.getBoolean("isNewUser", false)) {
            z = true;
        }
        Log.d("NEW_LOGIN", "Making login request with timezone: " + id2 + ", language: " + supportedLanguage + ", appVersion: " + valueOf + ", country: " + country + ", osType: android, isNewUser: " + z);
        return bettingApi.login(token, new LoginRequestModel(id2, supportedLanguage, valueOf, country, "android", Boolean.valueOf(z)));
    }
}
