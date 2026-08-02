package org.betup.model.remote.api.rest.support;

import android.content.Context;
import android.os.Bundle;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.entity.support.FAQModel;
import org.betup.utils.SupportedLanguagesManager;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class GetV7FAQInteractor extends BaseNewVersionBettingInteractor<FAQModel, String> {
    private static final long LIFETIME = 300000;

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(String id, Bundle parameters) {
        return 300000L;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public void invalidate(String id) {
    }

    @Inject
    public GetV7FAQInteractor(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<FAQModel> makeCall(NewVersionBettingApi bettingApi, String id, Bundle parameters, String token) {
        String supportedLanguage;
        if (parameters != null && parameters.containsKey("lang")) {
            supportedLanguage = parameters.getString("lang");
        } else {
            supportedLanguage = SupportedLanguagesManager.getSupportedLanguage(this.context, SupportedLanguagesManager.LangTypeGroup.BIG_9);
        }
        return bettingApi.getV7FAQ(token, supportedLanguage);
    }
}
