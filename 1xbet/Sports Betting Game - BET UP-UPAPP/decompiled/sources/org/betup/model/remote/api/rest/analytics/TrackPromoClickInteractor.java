package org.betup.model.remote.api.rest.analytics;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.util.Locale;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.betup.model.remote.api.infrastructure.AnalyticsApi;
import org.betup.model.remote.api.rest.base.BaseAnalyticsInteractor;
import org.betup.utils.AppVersionUtil;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import retrofit2.Call;

/* compiled from: TrackPromoClickInteractor.kt */
@Singleton
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J0\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0014¨\u0006\u0013"}, d2 = {"Lorg/betup/model/remote/api/rest/analytics/TrackPromoClickInteractor;", "Lorg/betup/model/remote/api/rest/base/BaseAnalyticsInteractor;", "Lokhttp3/ResponseBody;", "", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "getLifetime", "id", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Landroid/os/Bundle;", "makeCall", "Lretrofit2/Call;", "api", "Lorg/betup/model/remote/api/infrastructure/AnalyticsApi;", "matchId", "token", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TrackPromoClickInteractor extends BaseAnalyticsInteractor<ResponseBody, Long> {
    public static final int $stable = 8;

    public long getLifetime(long id, Bundle parameters) {
        return 0L;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public /* bridge */ /* synthetic */ long getLifetime(Object obj, Bundle bundle) {
        return getLifetime(((Number) obj).longValue(), bundle);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public /* bridge */ /* synthetic */ Call makeCall(AnalyticsApi analyticsApi, Object obj, Bundle bundle, String str) {
        return makeCall(analyticsApi, ((Number) obj).longValue(), bundle, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public TrackPromoClickInteractor(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    protected Call<ResponseBody> makeCall(AnalyticsApi api, long matchId, Bundle parameters, String token) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(token, "token");
        String language = Locale.getDefault().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        String appVersion = AppVersionUtil.getAppVersion();
        Intrinsics.checkNotNullExpressionValue(appVersion, "getAppVersion(...)");
        return api.trackClickForMatch(token, matchId, language, appVersion);
    }
}
