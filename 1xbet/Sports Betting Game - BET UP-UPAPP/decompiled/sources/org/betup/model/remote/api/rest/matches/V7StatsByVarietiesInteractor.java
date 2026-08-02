package org.betup.model.remote.api.rest.matches;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.dynamiclinks.DynamicLink;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.entity.matches.statistics.VarietyStatsModel;
import org.betup.utils.HashCoder;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import retrofit2.Call;

/* compiled from: V7StatsByVarietiesInteractor.kt */
@Singleton
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0017B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J6\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0014J\u001a\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016¨\u0006\u0018"}, d2 = {"Lorg/betup/model/remote/api/rest/matches/V7StatsByVarietiesInteractor;", "Lorg/betup/model/remote/api/rest/base/BaseNewVersionBettingInteractor;", "", "Lorg/betup/model/remote/entity/matches/statistics/VarietyStatsModel;", "", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "invalidate", "", "id", "getHash", "", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Landroid/os/Bundle;", "makeCall", "Lretrofit2/Call;", "bettingApi", "Lorg/betup/model/remote/api/infrastructure/NewVersionBettingApi;", "token", "", "getLifetime", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class V7StatsByVarietiesInteractor extends BaseNewVersionBettingInteractor<List<? extends VarietyStatsModel>, Long> {
    private static final long LIFETIME = 0;
    public static final int $stable = 8;

    public long getLifetime(long id, Bundle parameters) {
        return 0L;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public /* bridge */ /* synthetic */ int getHash(Object obj, Bundle bundle) {
        return getHash(((Number) obj).longValue(), bundle);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public /* bridge */ /* synthetic */ long getLifetime(Object obj, Bundle bundle) {
        return getLifetime(((Number) obj).longValue(), bundle);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public /* bridge */ /* synthetic */ void invalidate(Object obj) {
        invalidate(((Number) obj).longValue());
    }

    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public /* bridge */ /* synthetic */ Call makeCall(NewVersionBettingApi newVersionBettingApi, Object obj, Bundle bundle, String str) {
        return makeCall(newVersionBettingApi, ((Number) obj).longValue(), bundle, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public V7StatsByVarietiesInteractor(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public void invalidate(long id) {
        removeFromCache(getHash(id, (Bundle) null));
    }

    public int getHash(long id, Bundle parameters) {
        return HashCoder.hashCode(Long.valueOf(id), new Object[0]);
    }

    protected Call<List<VarietyStatsModel>> makeCall(NewVersionBettingApi bettingApi, long id, Bundle parameters, String token) {
        Intrinsics.checkNotNullParameter(bettingApi, "bettingApi");
        Intrinsics.checkNotNullParameter(token, "token");
        Call<List<VarietyStatsModel>> v7StatsByVarieties = bettingApi.getV7StatsByVarieties(token, id);
        Intrinsics.checkNotNullExpressionValue(v7StatsByVarieties, "getV7StatsByVarieties(...)");
        return v7StatsByVarieties;
    }
}
