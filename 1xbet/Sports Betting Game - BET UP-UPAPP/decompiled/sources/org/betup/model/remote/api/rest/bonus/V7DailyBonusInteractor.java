package org.betup.model.remote.api.rest.bonus;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.dynamiclinks.DynamicLink;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Locale;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.entity.bonus.V7DailyBonusResponse;
import org.betup.utils.HashCoder;
import org.betup.utils.SupportedLanguagesManager;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import retrofit2.Call;

/* compiled from: V7DailyBonusInteractor.kt */
@Singleton
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001fB\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0002\u0010\u000fJ5\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0014¢\u0006\u0002\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u001c\u0010\u001c\u001a\u00020\u00032\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001e¨\u0006 "}, d2 = {"Lorg/betup/model/remote/api/rest/bonus/V7DailyBonusInteractor;", "Lorg/betup/model/remote/api/rest/base/BaseNewVersionBettingInteractor;", "Lorg/betup/model/remote/entity/bonus/V7DailyBonusResponse;", "", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "invalidate", "id", "(Lkotlin/Unit;)V", "getHash", "", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Landroid/os/Bundle;", "(Lkotlin/Unit;Landroid/os/Bundle;)I", "makeCall", "Lretrofit2/Call;", "bettingApi", "Lorg/betup/model/remote/api/infrastructure/NewVersionBettingApi;", "token", "", "(Lorg/betup/model/remote/api/infrastructure/NewVersionBettingApi;Lkotlin/Unit;Landroid/os/Bundle;Ljava/lang/String;)Lretrofit2/Call;", "getLifetime", "", "(Lkotlin/Unit;Landroid/os/Bundle;)J", "isCritical", "", "load", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class V7DailyBonusInteractor extends BaseNewVersionBettingInteractor<V7DailyBonusResponse, Unit> {
    private static final long LIFETIME = 60000;
    public static final int $stable = 8;

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(Unit id, Bundle parameters) {
        Intrinsics.checkNotNullParameter(id, "id");
        return 60000L;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public boolean isCritical() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public V7DailyBonusInteractor(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public void invalidate(Unit id) {
        Intrinsics.checkNotNullParameter(id, "id");
        removeFromCache(getHash(id, (Bundle) null));
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public int getHash(Unit id, Bundle parameters) {
        Intrinsics.checkNotNullParameter(id, "id");
        return HashCoder.hashCode("daily_bonus", Locale.getDefault().getLanguage());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<V7DailyBonusResponse> makeCall(NewVersionBettingApi bettingApi, Unit id, Bundle parameters, String token) {
        Intrinsics.checkNotNullParameter(bettingApi, "bettingApi");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(token, "token");
        String supportedLanguage = SupportedLanguagesManager.getSupportedLanguage(this.context, SupportedLanguagesManager.LangTypeGroup.BIG_9);
        Log.d("V7DailyBonusInteractor", "Fetching daily bonus: lang=" + supportedLanguage);
        Call<V7DailyBonusResponse> v7DailyBonus = bettingApi.getV7DailyBonus(token, supportedLanguage);
        Intrinsics.checkNotNullExpressionValue(v7DailyBonus, "getV7DailyBonus(...)");
        return v7DailyBonus;
    }

    public final void load(BaseCachedSharedInteractor.OnFetchedListener<V7DailyBonusResponse, Unit> listener) {
        super.load(listener, Unit.INSTANCE, null);
    }
}
