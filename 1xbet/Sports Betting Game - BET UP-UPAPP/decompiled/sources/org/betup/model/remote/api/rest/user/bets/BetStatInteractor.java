package org.betup.model.remote.api.rest.user.bets;

import android.content.Context;
import android.os.Bundle;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.api.rest.user.V7UserBetStatisticsInteractor;
import org.betup.model.remote.entity.user.NewUserBetStatisticsModel;
import org.betup.utils.SupportedLanguagesManager;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class BetStatInteractor extends BaseNewVersionBettingInteractor<NewUserBetStatisticsModel, Void> {
    private static final long LIFETIME = 600000;

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(Void id, Bundle parameters) {
        return 600000L;
    }

    @Inject
    public BetStatInteractor(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<NewUserBetStatisticsModel> makeCall(NewVersionBettingApi api, Void id, Bundle parameters, String token) {
        return api.getV7UserBetStatistics(token, parameters.getInt("userId"), SupportedLanguagesManager.getSupportedLanguage(this.context, SupportedLanguagesManager.LangTypeGroup.BIG_9), V7UserBetStatisticsInteractor.STATS_TYPE_ALL);
    }
}
