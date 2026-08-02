package org.betup.services.analytics;

import android.content.Context;
import android.os.Bundle;
import java.util.Map;
import kotlin.Metadata;
import org.betup.model.remote.entity.analytics.PurchasePlacement;
import org.betup.model.remote.entity.analytics.PurchaseType;
import org.betup.model.remote.entity.analytics.TrackEventType;

/* compiled from: AnalyticsService.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J&\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\bH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\tH&J \u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H&¨\u0006\u0018"}, d2 = {"Lorg/betup/services/analytics/AnalyticsService;", "", "sendTrackEvent", "", "eventType", "Lorg/betup/model/remote/entity/analytics/TrackEventType;", "sendTrackEventWithParams", "params", "", "", "sendServerDown", "logs", "Landroid/os/Bundle;", "sendPurchaseCanceled", "productId", "sendPurchaseEvent", "storeCode", "purchasePlacement", "Lorg/betup/model/remote/entity/analytics/PurchasePlacement;", "purchaseType", "Lorg/betup/model/remote/entity/analytics/PurchaseType;", "sendSessionStarted", "context", "Landroid/content/Context;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface AnalyticsService {
    void sendPurchaseCanceled(String productId);

    void sendPurchaseEvent(String storeCode, PurchasePlacement purchasePlacement, PurchaseType purchaseType);

    void sendServerDown(Bundle logs);

    void sendSessionStarted(Context context);

    void sendTrackEvent(TrackEventType eventType);

    void sendTrackEventWithParams(TrackEventType eventType, Map<String, String> params);
}
