package org.betup.model.remote.api.rest.user.bets;

import android.content.Context;
import android.os.Bundle;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.betup.model.remote.api.rest.user.bets.models.BetsResponseModel;
import org.betup.model.remote.entity.bets.BetState;
import org.betup.utils.HashCoder;
import org.betup.utils.SupportedLanguagesManager;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class BetsListInteractor extends BaseNewVersionBettingInteractor<BetsResponseModel, BetState> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long LIFETIME = 10000;

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(BetState id, Bundle parameters) {
        return 10000L;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor, org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public /* bridge */ /* synthetic */ void load(BaseCachedSharedInteractor.OnFetchedListener listener, Object id) {
        load((BaseCachedSharedInteractor.OnFetchedListener<BetsResponseModel, BetState>) listener, (BetState) id);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public void invalidate() {
        clearCache();
    }

    @Inject
    public BetsListInteractor(Context context) {
        super(context);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public void invalidate(BetState id) {
        removeFromCache(getHash(id, (Bundle) null));
    }

    public void load(BaseCachedSharedInteractor.OnFetchedListener<BetsResponseModel, BetState> listener, BetState id) {
        throw new IllegalArgumentException("you should obligatory provide bundle with offset and limit");
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public int getHash(BetState id, Bundle parameters) {
        return HashCoder.hashCode(id, Integer.valueOf(parameters.getInt("offset")), Integer.valueOf(parameters.getInt(MatchMyBetsInteractor.PARAM_LIMIT)), Integer.valueOf(parameters.containsKey("userId") ? parameters.getInt("userId") : 0), SupportedLanguagesManager.getSupportedLanguage(this.context, SupportedLanguagesManager.LangTypeGroup.BIG_9));
    }

    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<BetsResponseModel> makeCall(NewVersionBettingApi bettingApi, BetState id, Bundle parameters, String token) {
        int i = parameters.getInt("offset");
        int i2 = parameters.getInt(MatchMyBetsInteractor.PARAM_LIMIT);
        if (parameters.containsKey("userId")) {
            return bettingApi.getUserBetList(token, parameters.getInt("userId"), id.getName().toUpperCase(), i, i2, SupportedLanguagesManager.getSupportedLanguage(this.context, SupportedLanguagesManager.LangTypeGroup.BIG_9));
        }
        return bettingApi.getBetList(token, id.getName().toUpperCase(), i, i2, SupportedLanguagesManager.getSupportedLanguage(this.context, SupportedLanguagesManager.LangTypeGroup.BIG_9));
    }
}
