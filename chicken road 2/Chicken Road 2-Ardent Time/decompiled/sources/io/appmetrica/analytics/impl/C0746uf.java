package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.uf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0746uf {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0643qf f6906a;

    public C0746uf(io.appmetrica.analytics.PreloadInfo preloadInfo, io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger, boolean z2) {
        if (preloadInfo != null) {
            if (android.text.TextUtils.isEmpty(preloadInfo.getTrackingId())) {
                publicLogger.error("Required field \"PreloadInfo.trackingId\" is empty!\nThis preload info will be skipped.", new java.lang.Object[0]);
            } else {
                this.f6906a = new io.appmetrica.analytics.impl.C0643qf(preloadInfo.getTrackingId(), new org.json.JSONObject(preloadInfo.getAdditionalParams()), true, z2, io.appmetrica.analytics.impl.S7.f4954c);
            }
        }
    }
}
