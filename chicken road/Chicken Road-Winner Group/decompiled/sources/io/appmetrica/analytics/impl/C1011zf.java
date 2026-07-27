package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.zf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1011zf {

    /* renamed from: a, reason: collision with root package name */
    public final C0909vf f8685a;

    public C1011zf(PreloadInfo preloadInfo, PublicLogger publicLogger, boolean z3) {
        if (preloadInfo != null) {
            if (TextUtils.isEmpty(preloadInfo.getTrackingId())) {
                publicLogger.error("Required field \"PreloadInfo.trackingId\" is empty!\nThis preload info will be skipped.", new Object[0]);
            } else {
                this.f8685a = new C0909vf(preloadInfo.getTrackingId(), new JSONObject(preloadInfo.getAdditionalParams()), true, z3, Y7.f6854c);
            }
        }
    }
}
