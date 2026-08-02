package org.betup.model.remote.api.rest.energy;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.dynamiclinks.DynamicLink;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.entity.challenges.V7ChallengeDetailsResponseModel;
import org.betup.utils.SupportedLanguagesManager;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import retrofit2.Call;

/* compiled from: ChallengeCancelInteractor.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\f\u001a\u00020\u0003J0\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0014J\u001a\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016¨\u0006\u001c"}, d2 = {"Lorg/betup/model/remote/api/rest/energy/ChallengeCancelInteractor;", "Lorg/betup/model/remote/api/rest/base/BaseNewVersionBettingInteractor;", "Lorg/betup/model/remote/entity/challenges/V7ChallengeDetailsResponseModel;", "", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "load", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "challengeId", "makeCall", "Lretrofit2/Call;", "api", "Lorg/betup/model/remote/api/infrastructure/NewVersionBettingApi;", "request", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Landroid/os/Bundle;", "token", "", "getLifetime", "id", "getRetryCount", "", "isCritical", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ChallengeCancelInteractor extends BaseNewVersionBettingInteractor<V7ChallengeDetailsResponseModel, Long> {
    public static final int $stable = 8;

    public long getLifetime(long id, Bundle parameters) {
        return 0L;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public int getRetryCount() {
        return 2;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public boolean isCritical() {
        return true;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public /* bridge */ /* synthetic */ long getLifetime(Object obj, Bundle bundle) {
        return getLifetime(((Number) obj).longValue(), bundle);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public /* bridge */ /* synthetic */ Call makeCall(NewVersionBettingApi newVersionBettingApi, Object obj, Bundle bundle, String str) {
        return makeCall(newVersionBettingApi, ((Number) obj).longValue(), bundle, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public ChallengeCancelInteractor(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void load(BaseCachedSharedInteractor.OnFetchedListener<V7ChallengeDetailsResponseModel, Long> listener, long challengeId) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        super.load(listener, Long.valueOf(challengeId), null);
    }

    protected Call<V7ChallengeDetailsResponseModel> makeCall(NewVersionBettingApi api, long request, Bundle parameters, String token) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(token, "token");
        Call<V7ChallengeDetailsResponseModel> cancelChallenge = api.cancelChallenge(token, request, SupportedLanguagesManager.getSupportedLanguage(this.context, SupportedLanguagesManager.LangTypeGroup.BIG_9));
        Intrinsics.checkNotNullExpressionValue(cancelChallenge, "cancelChallenge(...)");
        return cancelChallenge;
    }
}
