package com.inmobi.ads.core;

import com.adjust.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/inmobi/ads/core/TrackingInfo;", "", "<init>", "()V", "imBaseUrl", "", "getImBaseUrl", "()Ljava/lang/String;", Constants.ADJUST_PREINSTALL_CONTENT_URI_PATH, "", "Lcom/inmobi/ads/core/Trackers;", "getTrackers", "()Ljava/util/List;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TrackingInfo {
    private final String imBaseUrl = "";
    private final List<Trackers> trackers = CollectionsKt.emptyList();

    public final String getImBaseUrl() {
        return this.imBaseUrl;
    }

    public final List<Trackers> getTrackers() {
        return this.trackers;
    }
}
