package org.betup.model.remote.api.rest.shop;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.api.rest.user.V7UserBetStatisticsInteractor;
import org.betup.model.remote.entity.shop.NewShopItemModel;
import org.betup.utils.HashCoder;
import org.betup.utils.SupportedLanguagesManager;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class NewShopItemsInteractor extends BaseNewVersionBettingInteractor<List<NewShopItemModel>, Void> {
    private static final long LIFETIME = 600000;

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(Void id, Bundle parameters) {
        return 600000L;
    }

    @Inject
    public NewShopItemsInteractor(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<List<NewShopItemModel>> makeCall(NewVersionBettingApi bettingApi, Void id, Bundle parameters, String token) {
        String supportedLanguage = SupportedLanguagesManager.getSupportedLanguage(getContext(), SupportedLanguagesManager.LangTypeGroup.BIG_9);
        String shopTypeFrom = ShopRequestParams.shopTypeFrom(parameters);
        Log.d("NewShopItemsInteractor", "makeCall: shopType=" + shopTypeFrom + " token length: " + (token != null ? token.length() : 0));
        return bettingApi.getNewShopItems(token, "ANDROID", shopTypeFrom, V7UserBetStatisticsInteractor.STATS_TYPE_ALL, supportedLanguage);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public int getHash(Void id, Bundle parameters) {
        return HashCoder.hashCode(SupportedLanguagesManager.getSupportedLanguage(getContext(), SupportedLanguagesManager.LangTypeGroup.BIG_9), ShopRequestParams.shopTypeFrom(parameters));
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public void invalidate(Void id) {
        clearCache();
    }
}
