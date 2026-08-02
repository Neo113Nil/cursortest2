package org.betup.model.remote.api.rest.betslip;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.gson.Gson;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.entity.betslip.V7BetlistPlacementResponse;
import org.betup.model.remote.entity.betslip.V7CreateBetlistRequestModel;
import org.betup.utils.HashCoder;
import org.betup.utils.SupportedLanguagesManager;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import retrofit2.Call;

/* compiled from: V7CreateBetlistInteractor.kt */
@Singleton
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001%B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0014H\u0016JT\u0010\u001b\u001a\u00020\t2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0!2\b\b\u0002\u0010#\u001a\u00020\u00182\b\b\u0002\u0010$\u001a\u00020\u0018¨\u0006&"}, d2 = {"Lorg/betup/model/remote/api/rest/betslip/V7CreateBetlistInteractor;", "Lorg/betup/model/remote/api/rest/base/BaseNewVersionBettingInteractor;", "Lorg/betup/model/remote/entity/betslip/V7BetlistPlacementResponse;", "Lorg/betup/model/remote/entity/betslip/V7CreateBetlistRequestModel;", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "invalidate", "", "id", "getHash", "", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Landroid/os/Bundle;", "makeCall", "Lretrofit2/Call;", "bettingApi", "Lorg/betup/model/remote/api/infrastructure/NewVersionBettingApi;", "token", "", "getLifetime", "", "isCritical", "", "transformErrorBody", "body", "placeBet", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "moneyPlaced", "", "grabbedBetIds", "", "grabbedBetCoefs", AppLovinEventTypes.USER_COMPLETED_TUTORIAL, "forceAccept", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class V7CreateBetlistInteractor extends BaseNewVersionBettingInteractor<V7BetlistPlacementResponse, V7CreateBetlistRequestModel> {
    private static final long LIFETIME = 0;
    public static final int $stable = 8;

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(V7CreateBetlistRequestModel id, Bundle parameters) {
        Intrinsics.checkNotNullParameter(id, "id");
        return 0L;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public void invalidate(V7CreateBetlistRequestModel id) {
        Intrinsics.checkNotNullParameter(id, "id");
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public boolean isCritical() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public V7CreateBetlistInteractor(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public int getHash(V7CreateBetlistRequestModel id, Bundle parameters) {
        Intrinsics.checkNotNullParameter(id, "id");
        return HashCoder.hashCode(Integer.valueOf(id.hashCode()), Integer.valueOf(id.getGrabbedBetIds().hashCode()), Integer.valueOf(id.getGrabbedBetCoefs().hashCode()), Integer.valueOf(Boolean.hashCode(id.getTutorial())), Integer.valueOf(Boolean.hashCode(id.getForceAccept())));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<V7BetlistPlacementResponse> makeCall(NewVersionBettingApi bettingApi, V7CreateBetlistRequestModel id, Bundle parameters, String token) {
        Intrinsics.checkNotNullParameter(bettingApi, "bettingApi");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(token, "token");
        String supportedLanguage = SupportedLanguagesManager.getSupportedLanguage(this.context, SupportedLanguagesManager.LangTypeGroup.BIG_9);
        Log.d("V7CreateBetlistInteractor", "Creating betlist: amount=" + id.getMoneyPlaced() + ", bets=" + id.getGrabbedBetIds().size() + ", lang=" + supportedLanguage);
        Call<V7BetlistPlacementResponse> createV7Betlist = bettingApi.createV7Betlist(token, id, supportedLanguage);
        Intrinsics.checkNotNullExpressionValue(createV7Betlist, "createV7Betlist(...)");
        return createV7Betlist;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public V7BetlistPlacementResponse transformErrorBody(String body) {
        String str = body;
        if (str == null || StringsKt.isBlank(str)) {
            return null;
        }
        try {
            return (V7BetlistPlacementResponse) new Gson().fromJson(body, V7BetlistPlacementResponse.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void placeBet(BaseCachedSharedInteractor.OnFetchedListener<V7BetlistPlacementResponse, V7CreateBetlistRequestModel> listener, double moneyPlaced, List<Long> grabbedBetIds, List<Double> grabbedBetCoefs, boolean tutorial, boolean forceAccept) {
        Intrinsics.checkNotNullParameter(grabbedBetIds, "grabbedBetIds");
        Intrinsics.checkNotNullParameter(grabbedBetCoefs, "grabbedBetCoefs");
        load(listener, new V7CreateBetlistRequestModel(moneyPlaced, grabbedBetIds, grabbedBetCoefs, tutorial, forceAccept), null);
    }
}
