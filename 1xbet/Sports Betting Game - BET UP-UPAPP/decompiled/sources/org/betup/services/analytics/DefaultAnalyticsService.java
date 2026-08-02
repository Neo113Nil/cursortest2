package org.betup.services.analytics;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import io.sentry.protocol.Device;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.ResponseBody;
import org.betup.bus.OffersUpdatedMessage;
import org.betup.model.domain.ShopConstants;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.analytics.PostTrackEventInteractor;
import org.betup.model.remote.api.rest.analytics.PostTrackPurchaseInteractor;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.entity.analytics.PurchasePlacement;
import org.betup.model.remote.entity.analytics.PurchaseType;
import org.betup.model.remote.entity.analytics.TrackEventModel;
import org.betup.model.remote.entity.analytics.TrackEventParamType;
import org.betup.model.remote.entity.analytics.TrackEventType;
import org.betup.model.remote.entity.analytics.TrackPurchaseModel;
import org.betup.utils.BundleUtil;
import org.betup.utils.SharedPrefs;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: DefaultAnalyticsService.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J&\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J \u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020#0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lorg/betup/services/analytics/DefaultAnalyticsService;", "Lorg/betup/services/analytics/AnalyticsService;", "postTrackEventInteractor", "Lorg/betup/model/remote/api/rest/analytics/PostTrackEventInteractor;", "postTrackPurchaseInteractor", "Lorg/betup/model/remote/api/rest/analytics/PostTrackPurchaseInteractor;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/api/rest/analytics/PostTrackEventInteractor;Lorg/betup/model/remote/api/rest/analytics/PostTrackPurchaseInteractor;)V", "sendSessionStarted", "", "context", "Landroid/content/Context;", "sendPurchaseCanceled", "productId", "", "sendTrackEvent", "eventType", "Lorg/betup/model/remote/entity/analytics/TrackEventType;", "sendTrackEventWithParams", "params", "", "sendServerDown", "logs", "Landroid/os/Bundle;", "onFetchTrackResponseListener", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lokhttp3/ResponseBody;", "Lorg/betup/model/remote/entity/analytics/TrackEventModel;", "sendPurchaseEvent", "storeCode", "purchasePlacement", "Lorg/betup/model/remote/entity/analytics/PurchasePlacement;", "purchaseType", "Lorg/betup/model/remote/entity/analytics/PurchaseType;", "onFetchTrackPurchaseResponseListener", "Lorg/betup/model/remote/entity/analytics/TrackPurchaseModel;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DefaultAnalyticsService implements AnalyticsService {
    public static final int $stable = 8;
    private final BaseCachedSharedInteractor.OnFetchedListener<ResponseBody, TrackPurchaseModel> onFetchTrackPurchaseResponseListener;
    private final BaseCachedSharedInteractor.OnFetchedListener<ResponseBody, TrackEventModel> onFetchTrackResponseListener;
    private final PostTrackEventInteractor postTrackEventInteractor;
    private final PostTrackPurchaseInteractor postTrackPurchaseInteractor;

    public DefaultAnalyticsService(PostTrackEventInteractor postTrackEventInteractor, PostTrackPurchaseInteractor postTrackPurchaseInteractor) {
        Intrinsics.checkNotNullParameter(postTrackEventInteractor, "postTrackEventInteractor");
        Intrinsics.checkNotNullParameter(postTrackPurchaseInteractor, "postTrackPurchaseInteractor");
        this.postTrackEventInteractor = postTrackEventInteractor;
        this.postTrackPurchaseInteractor = postTrackPurchaseInteractor;
        this.onFetchTrackResponseListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.services.analytics.DefaultAnalyticsService$$ExternalSyntheticLambda0
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                DefaultAnalyticsService.onFetchTrackResponseListener$lambda$0(fetchedResponseMessage);
            }
        };
        this.onFetchTrackPurchaseResponseListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.services.analytics.DefaultAnalyticsService$$ExternalSyntheticLambda1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                DefaultAnalyticsService.onFetchTrackPurchaseResponseListener$lambda$1(fetchedResponseMessage);
            }
        };
    }

    @Override // org.betup.services.analytics.AnalyticsService
    public void sendSessionStarted(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        String uid = currentUser != null ? currentUser.getUid() : null;
        long currentTimeMillis = System.currentTimeMillis();
        long lastSessionStarted = SharedPrefs.getLastSessionStarted(context, uid);
        if (SharedPrefs.isNeedToStartSession(context, uid)) {
            long lastSessionStarted2 = SharedPrefs.getLastSessionStarted(context, uid);
            if (uid == null) {
                uid = "global";
            }
            Log.d("DefaultAnalyticsService", "SESSION_STARTED will be sent. scope=" + uid + " previous=" + lastSessionStarted + " updated=" + lastSessionStarted2 + " timeoutMs=" + SharedPrefs.getSessionValidTimeoutMs());
            this.postTrackEventInteractor.load(this.onFetchTrackResponseListener, new TrackEventModel(TrackEventType.SESSION_STARTED, null, null, null, null, null, 60, null), null);
            return;
        }
        long j = lastSessionStarted > 0 ? currentTimeMillis - lastSessionStarted : -1L;
        if (uid == null) {
            uid = "global";
        }
        Log.d("DefaultAnalyticsService", "SESSION_STARTED skipped. scope=" + uid + " last=" + lastSessionStarted + " elapsedMs=" + j + " timeoutMs=" + SharedPrefs.getSessionValidTimeoutMs());
    }

    @Override // org.betup.services.analytics.AnalyticsService
    public void sendPurchaseCanceled(String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        this.postTrackEventInteractor.load(this.onFetchTrackResponseListener, new TrackEventModel(TrackEventType.PURCHASE_CANCELED, MapsKt.mapOf(TuplesKt.to(TrackEventParamType.ProductId.toString(), productId)), null, null, null, null, 60, null));
    }

    @Override // org.betup.services.analytics.AnalyticsService
    public void sendTrackEvent(TrackEventType eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.postTrackEventInteractor.load(this.onFetchTrackResponseListener, new TrackEventModel(eventType, null, null, null, null, null, 60, null), null);
    }

    @Override // org.betup.services.analytics.AnalyticsService
    public void sendTrackEventWithParams(TrackEventType eventType, Map<String, String> params) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.postTrackEventInteractor.load(this.onFetchTrackResponseListener, new TrackEventModel(eventType, params, null, null, null, null, 60, null), null);
    }

    @Override // org.betup.services.analytics.AnalyticsService
    public void sendServerDown(Bundle logs) {
        Intrinsics.checkNotNullParameter(logs, "logs");
        Map<String, String> bundleToMap = BundleUtil.bundleToMap(logs);
        Intrinsics.checkNotNull(bundleToMap);
        bundleToMap.put("os", "API " + Build.VERSION.SDK_INT);
        Intrinsics.checkNotNull(bundleToMap);
        bundleToMap.put("model", Build.MODEL);
        Intrinsics.checkNotNull(bundleToMap);
        bundleToMap.put(Device.JsonKeys.MANUFACTURER, Build.MANUFACTURER);
        this.postTrackEventInteractor.load(this.onFetchTrackResponseListener, new TrackEventModel(TrackEventType.SERVER_DOWN, bundleToMap, null, null, null, null, 60, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFetchTrackResponseListener$lambda$0(FetchedResponseMessage fetchedResponseMessage) {
        Log.d("DefaultAnalyticsService", "TRACK_EVENT: " + fetchedResponseMessage.getStat() + "; ORDINAL" + fetchedResponseMessage.getStat().ordinal());
    }

    @Override // org.betup.services.analytics.AnalyticsService
    public void sendPurchaseEvent(String storeCode, PurchasePlacement purchasePlacement, PurchaseType purchaseType) {
        Intrinsics.checkNotNullParameter(storeCode, "storeCode");
        Intrinsics.checkNotNullParameter(purchasePlacement, "purchasePlacement");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        this.postTrackPurchaseInteractor.load(this.onFetchTrackPurchaseResponseListener, new TrackPurchaseModel(storeCode, purchasePlacement, purchaseType, null, null, null, null, 120, null), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFetchTrackPurchaseResponseListener$lambda$1(FetchedResponseMessage fetchedResponseMessage) {
        Log.d("DefaultAnalyticsService", "PURCHASE: " + fetchedResponseMessage.getStat() + "; ORDINAL" + fetchedResponseMessage.getStat().ordinal());
        if (StringsKt.startsWith$default(((TrackPurchaseModel) fetchedResponseMessage.getId()).getProductId(), ShopConstants.OFFER_PREFIX, false, 2, (Object) null)) {
            EventBus.getDefault().post(new OffersUpdatedMessage());
        }
    }
}
