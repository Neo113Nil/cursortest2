package org.betup.model.remote.api.rest.analytics;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.dynamiclinks.DynamicLink;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.api.infrastructure.AnalyticsApi;
import org.betup.model.remote.api.rest.base.BaseAnalyticsInteractor;
import org.betup.model.remote.entity.analytics.OfferType;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import retrofit2.Call;

/* compiled from: GetSingleOfferInfoInteractor.kt */
@Singleton
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J0\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u0002H\u0014¨\u0006\u0011"}, d2 = {"Lorg/betup/model/remote/api/rest/analytics/GetSingleOfferInfoInteractor;", "Lorg/betup/model/remote/api/rest/base/BaseAnalyticsInteractor;", "", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "getLifetime", "", "id", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Landroid/os/Bundle;", "makeCall", "Lretrofit2/Call;", "api", "Lorg/betup/model/remote/api/infrastructure/AnalyticsApi;", "token", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GetSingleOfferInfoInteractor extends BaseAnalyticsInteractor<String, String> {
    public static final int $stable = 8;

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(String id, Bundle parameters) {
        Intrinsics.checkNotNullParameter(id, "id");
        return 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public GetSingleOfferInfoInteractor(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<String> makeCall(AnalyticsApi api, String id, Bundle parameters, String token) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(token, "token");
        return api.getSingleOfferInfo(token, id, OfferType.DYNAMIC);
    }
}
