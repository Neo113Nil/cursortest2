package org.betup.model.remote.api.rest.user.balance;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.dynamiclinks.DynamicLink;
import io.bidmachine.iab.vast.tags.VastTagName;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.betup.model.remote.entity.user.balance.BalanceModel;
import org.betup.utils.HashCoder;
import org.betup.utils.SupportedLanguagesManager;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import retrofit2.Call;

/* compiled from: V7BalanceHistoryInteractor.kt */
@Singleton
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016J\u001c\u0010\u000b\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J2\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u001c\u0010\u0015\u001a\u00020\u00162\b\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016¨\u0006\u001a"}, d2 = {"Lorg/betup/model/remote/api/rest/user/balance/V7BalanceHistoryInteractor;", "Lorg/betup/model/remote/api/rest/base/BaseNewVersionBettingInteractor;", "Lorg/betup/model/remote/entity/user/balance/BalanceModel;", "Ljava/lang/Void;", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "invalidate", "", "id", "getHash", "", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Landroid/os/Bundle;", "makeCall", "Lretrofit2/Call;", "bettingApi", "Lorg/betup/model/remote/api/infrastructure/NewVersionBettingApi;", "token", "", "getLifetime", "", "isCritical", "", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class V7BalanceHistoryInteractor extends BaseNewVersionBettingInteractor<BalanceModel, Void> {
    private static final long LIFETIME = 60000;
    public static final int $stable = 8;

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(Void id, Bundle parameters) {
        return 60000L;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public boolean isCritical() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public V7BalanceHistoryInteractor(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public void invalidate(Void id) {
        removeFromCache(getHash(id, (Bundle) null));
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public int getHash(Void id, Bundle parameters) {
        if (parameters != null) {
            return HashCoder.hashCode(Integer.valueOf(parameters.getInt("offset", 0)), Integer.valueOf(parameters.getInt(MatchMyBetsInteractor.PARAM_LIMIT, 15)), parameters.getString("lang", "en"));
        }
        return super.getHash((V7BalanceHistoryInteractor) id, (Bundle) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<BalanceModel> makeCall(NewVersionBettingApi bettingApi, Void id, Bundle parameters, String token) {
        String supportedLanguage;
        Intrinsics.checkNotNullParameter(bettingApi, "bettingApi");
        Intrinsics.checkNotNullParameter(token, "token");
        int i = parameters != null ? parameters.getInt(MatchMyBetsInteractor.PARAM_LIMIT, 15) : 15;
        int i2 = parameters != null ? parameters.getInt("offset", 0) : 0;
        if (parameters == null || (supportedLanguage = parameters.getString("lang")) == null) {
            supportedLanguage = SupportedLanguagesManager.getSupportedLanguage(this.context, SupportedLanguagesManager.LangTypeGroup.DEFAULT_4);
        }
        Call<BalanceModel> v7BalanceHistory = bettingApi.getV7BalanceHistory(token, i, i2, supportedLanguage);
        Intrinsics.checkNotNullExpressionValue(v7BalanceHistory, "getV7BalanceHistory(...)");
        return v7BalanceHistory;
    }
}
