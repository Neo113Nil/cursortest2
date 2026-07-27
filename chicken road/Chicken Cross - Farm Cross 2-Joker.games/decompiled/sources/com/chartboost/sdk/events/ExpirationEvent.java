package com.chartboost.sdk.events;

import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.internal.caching.ExpirationReason;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B#\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/chartboost/sdk/events/ExpirationEvent;", "Lcom/chartboost/sdk/events/AdEvent;", "adID", "", "ad", "Lcom/chartboost/sdk/ads/Ad;", "reason", "Lcom/chartboost/sdk/internal/caching/ExpirationReason;", "<init>", "(Ljava/lang/String;Lcom/chartboost/sdk/ads/Ad;Lcom/chartboost/sdk/internal/caching/ExpirationReason;)V", "getAdID", "()Ljava/lang/String;", "getAd", "()Lcom/chartboost/sdk/ads/Ad;", "getReason", "()Lcom/chartboost/sdk/internal/caching/ExpirationReason;", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ExpirationEvent implements AdEvent {
    private final Ad ad;
    private final String adID;
    private final ExpirationReason reason;

    public ExpirationEvent(String str, Ad ad, ExpirationReason reason) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.adID = str;
        this.ad = ad;
        this.reason = reason;
    }

    @Override // com.chartboost.sdk.events.AdEvent
    public Ad getAd() {
        return this.ad;
    }

    @Override // com.chartboost.sdk.events.AdEvent
    public String getAdID() {
        return this.adID;
    }

    public final ExpirationReason getReason() {
        return this.reason;
    }
}
