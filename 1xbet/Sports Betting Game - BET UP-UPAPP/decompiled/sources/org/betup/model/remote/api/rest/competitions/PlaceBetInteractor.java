package org.betup.model.remote.api.rest.competitions;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.dynamiclinks.DynamicLink;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.Serializable;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.entity.competitions.PlaceBetRequestModel;
import org.betup.model.remote.entity.competitions.PlaceBetResponseModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import retrofit2.Call;

/* compiled from: PlaceBetInteractor.kt */
@Singleton
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0016J\u001a\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J,\u0010\u0015\u001a\u00020\u00122\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00172\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019¨\u0006\u001b"}, d2 = {"Lorg/betup/model/remote/api/rest/competitions/PlaceBetInteractor;", "Lorg/betup/model/remote/api/rest/base/BaseNewVersionBettingInteractor;", "Lorg/betup/model/remote/entity/competitions/PlaceBetResponseModel;", "", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "makeCall", "Lretrofit2/Call;", "bettingApi", "Lorg/betup/model/remote/api/infrastructure/NewVersionBettingApi;", "competitionId", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Landroid/os/Bundle;", "token", "", "invalidate", "", "id", "getLifetime", "placeBet", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "request", "Lorg/betup/model/remote/entity/competitions/PlaceBetRequestModel;", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlaceBetInteractor extends BaseNewVersionBettingInteractor<PlaceBetResponseModel, Long> {
    private static final long LIFETIME = 0;
    public static final int $stable = 8;

    public long getLifetime(long id, Bundle parameters) {
        return 0L;
    }

    public void invalidate(long id) {
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
    public PlaceBetInteractor(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    protected Call<PlaceBetResponseModel> makeCall(NewVersionBettingApi bettingApi, long competitionId, Bundle parameters, String token) {
        Intrinsics.checkNotNullParameter(bettingApi, "bettingApi");
        Intrinsics.checkNotNullParameter(token, "token");
        Serializable serializable = parameters != null ? parameters.getSerializable("request") : null;
        PlaceBetRequestModel placeBetRequestModel = serializable instanceof PlaceBetRequestModel ? (PlaceBetRequestModel) serializable : null;
        if (placeBetRequestModel == null) {
            throw new IllegalArgumentException("PlaceBetRequestModel is required in parameters");
        }
        Call<PlaceBetResponseModel> placeCompetitionBet = bettingApi.placeCompetitionBet(token, competitionId, placeBetRequestModel);
        Intrinsics.checkNotNullExpressionValue(placeCompetitionBet, "placeCompetitionBet(...)");
        return placeCompetitionBet;
    }

    public final void placeBet(BaseCachedSharedInteractor.OnFetchedListener<PlaceBetResponseModel, Long> listener, long competitionId, PlaceBetRequestModel request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Bundle bundle = new Bundle();
        bundle.putSerializable("request", request);
        load(listener, Long.valueOf(competitionId), bundle);
    }
}
