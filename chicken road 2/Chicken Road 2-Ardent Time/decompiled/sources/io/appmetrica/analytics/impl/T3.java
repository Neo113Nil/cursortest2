package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class T3 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Am f4996a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.U f4997b;

    public T3(io.appmetrica.analytics.impl.Am am, io.appmetrica.analytics.impl.U u2) {
        this.f4996a = am;
        this.f4997b = u2;
    }

    public final io.appmetrica.analytics.impl.S3 a(java.util.HashMap hashMap) {
        io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder a2;
        io.appmetrica.analytics.impl.C0365fm e2 = this.f4996a.e();
        io.appmetrica.analytics.impl.U u2 = this.f4997b;
        synchronized (u2) {
            a2 = u2.a(new io.appmetrica.analytics.impl.Xd());
        }
        return new io.appmetrica.analytics.impl.S3(io.appmetrica.analytics.impl.S3.a(e2.f5914d), io.appmetrica.analytics.impl.S3.a(e2.f5911a), io.appmetrica.analytics.impl.S3.a(e2.f5912b), io.appmetrica.analytics.impl.S3.a(e2.f5920j), io.appmetrica.analytics.impl.S3.a(e2.f5919i), io.appmetrica.analytics.impl.S3.a(io.appmetrica.analytics.impl.AbstractC0380gb.a(io.appmetrica.analytics.impl.Fm.a(e2.f5921k))), io.appmetrica.analytics.impl.S3.a(io.appmetrica.analytics.impl.AbstractC0380gb.a(hashMap)), new io.appmetrica.analytics.internal.IdentifiersResult(a2.getGoogle().mAdTrackingInfo == null ? null : a2.getGoogle().mAdTrackingInfo.advId, a2.getGoogle().mStatus, a2.getGoogle().mErrorExplanation), new io.appmetrica.analytics.internal.IdentifiersResult(a2.getHuawei().mAdTrackingInfo == null ? null : a2.getHuawei().mAdTrackingInfo.advId, a2.getHuawei().mStatus, a2.getHuawei().mErrorExplanation), new io.appmetrica.analytics.internal.IdentifiersResult(a2.getYandex().mAdTrackingInfo == null ? null : a2.getYandex().mAdTrackingInfo.advId, a2.getYandex().mStatus, a2.getYandex().mErrorExplanation), io.appmetrica.analytics.impl.S3.a(io.appmetrica.analytics.impl.AbstractC0380gb.a(e2.f5918h)), io.appmetrica.analytics.impl.In.a(), e2.f5925o + e2.f5935z.f4184a, io.appmetrica.analytics.impl.S3.a(e2.f5924n.f6328f), new android.os.Bundle());
    }
}
