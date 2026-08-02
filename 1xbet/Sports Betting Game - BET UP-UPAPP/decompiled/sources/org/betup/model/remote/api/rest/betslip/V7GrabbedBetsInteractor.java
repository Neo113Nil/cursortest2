package org.betup.model.remote.api.rest.betslip;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.dynamiclinks.DynamicLink;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.entity.betslip.V7GrabbedBetsRequestModel;
import org.betup.model.remote.entity.betslip.V7GrabbedBetsResponse;
import org.betup.utils.HashCoder;
import org.betup.utils.SupportedLanguagesManager;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import retrofit2.Call;

/* compiled from: V7GrabbedBetsInteractor.kt */
@Singleton
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u001cB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J \u0010\f\u001a\u00020\r2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J6\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0014J \u0010\u0016\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J>\u0010\u0019\u001a\u00020\n2\u001a\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u001b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016¨\u0006\u001d"}, d2 = {"Lorg/betup/model/remote/api/rest/betslip/V7GrabbedBetsInteractor;", "Lorg/betup/model/remote/api/rest/base/BaseNewVersionBettingInteractor;", "Lorg/betup/model/remote/entity/betslip/V7GrabbedBetsResponse;", "", "", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "invalidate", "", "id", "getHash", "", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Landroid/os/Bundle;", "makeCall", "Lretrofit2/Call;", "bettingApi", "Lorg/betup/model/remote/api/infrastructure/NewVersionBettingApi;", "token", "", "getLifetime", "isCritical", "", "load", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class V7GrabbedBetsInteractor extends BaseNewVersionBettingInteractor<V7GrabbedBetsResponse, List<? extends Long>> {
    private static final long LIFETIME = 0;
    public static final int $stable = 8;

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(List<Long> id, Bundle parameters) {
        Intrinsics.checkNotNullParameter(id, "id");
        return 0L;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public void invalidate(List<Long> id) {
        Intrinsics.checkNotNullParameter(id, "id");
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public boolean isCritical() {
        return false;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public /* bridge */ /* synthetic */ void load(BaseCachedSharedInteractor.OnFetchedListener onFetchedListener, Object obj, Bundle bundle) {
        load((BaseCachedSharedInteractor.OnFetchedListener<V7GrabbedBetsResponse, List<Long>>) onFetchedListener, (List<Long>) obj, bundle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public V7GrabbedBetsInteractor(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public int getHash(List<Long> id, Bundle parameters) {
        Intrinsics.checkNotNullParameter(id, "id");
        return HashCoder.hashCode(Integer.valueOf(id.hashCode()), Locale.getDefault().getLanguage());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<V7GrabbedBetsResponse> makeCall(NewVersionBettingApi bettingApi, List<Long> id, Bundle parameters, String token) {
        Intrinsics.checkNotNullParameter(bettingApi, "bettingApi");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(token, "token");
        String supportedLanguage = SupportedLanguagesManager.getSupportedLanguage(this.context, SupportedLanguagesManager.LangTypeGroup.BIG_9);
        V7GrabbedBetsRequestModel v7GrabbedBetsRequestModel = new V7GrabbedBetsRequestModel(id);
        Log.d("V7GrabbedBetsInteractor", "Fetching grabbed bets: ids=" + id + ", lang=" + supportedLanguage);
        Call<V7GrabbedBetsResponse> v7GrabbedBets = bettingApi.getV7GrabbedBets(token, v7GrabbedBetsRequestModel, supportedLanguage);
        Intrinsics.checkNotNullExpressionValue(v7GrabbedBets, "getV7GrabbedBets(...)");
        return v7GrabbedBets;
    }

    public void load(BaseCachedSharedInteractor.OnFetchedListener<V7GrabbedBetsResponse, List<Long>> listener, List<Long> id, Bundle parameters) {
        List<Long> list = id;
        if (list == null || list.isEmpty()) {
            Log.d("V7GrabbedBetsInteractor", "Empty IDs list, returning empty response without network call");
            V7GrabbedBetsResponse v7GrabbedBetsResponse = new V7GrabbedBetsResponse(CollectionsKt.emptyList(), 0, 0, 0L);
            if (listener != null) {
                FetchStat fetchStat = FetchStat.SUCCESS;
                if (id == null) {
                    id = CollectionsKt.emptyList();
                }
                listener.onFetched(new FetchedResponseMessage<>(v7GrabbedBetsResponse, fetchStat, id, null));
                return;
            }
            return;
        }
        super.load((BaseCachedSharedInteractor.OnFetchedListener<T, BaseCachedSharedInteractor.OnFetchedListener<V7GrabbedBetsResponse, List<Long>>>) listener, (BaseCachedSharedInteractor.OnFetchedListener<V7GrabbedBetsResponse, List<Long>>) id, parameters);
    }
}
