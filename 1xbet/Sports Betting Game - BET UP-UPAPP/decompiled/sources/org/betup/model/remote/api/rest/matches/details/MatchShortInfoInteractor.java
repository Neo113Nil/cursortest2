package org.betup.model.remote.api.rest.matches.details;

import android.content.Context;
import android.os.Bundle;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.BuildConfig;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.entity.matches.details.MatchShortInfoModel;
import org.betup.utils.HashCoder;
import org.betup.utils.SupportedLanguagesManager;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class MatchShortInfoInteractor extends BaseNewVersionBettingInteractor<MatchShortInfoModel, Integer> {
    private static final long LIFETIME = 5000;

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(Integer id, Bundle parameters) {
        return 5000L;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public int getRetryCount() {
        return 2;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public boolean isCritical() {
        return true;
    }

    @Inject
    public MatchShortInfoInteractor(Context context) {
        super(context);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public int getHash(Integer id, Bundle parameters) {
        return HashCoder.hashCode(id, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<MatchShortInfoModel> makeCall(NewVersionBettingApi api, Integer id, Bundle parameters, String token) {
        return api.getMatchShortInfo(token, id.intValue(), SupportedLanguagesManager.getSupportedLanguage(this.context, SupportedLanguagesManager.LangTypeGroup.BIG_9), String.valueOf(BuildConfig.VERSION_CODE), BuildConfig.VERSION_NAME);
    }
}
