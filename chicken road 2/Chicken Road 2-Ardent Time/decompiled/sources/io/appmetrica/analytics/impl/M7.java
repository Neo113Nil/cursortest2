package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class M7 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.U f4648a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0216a2 f4649b;

    public M7(io.appmetrica.analytics.impl.U u2, io.appmetrica.analytics.impl.C0216a2 c0216a2) {
        this.f4648a = u2;
        this.f4649b = c0216a2;
    }

    public final java.lang.String a() {
        io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder advertisingIdsHolder;
        byte[] bArr;
        io.appmetrica.analytics.impl.U u2 = this.f4648a;
        io.appmetrica.analytics.impl.Jn jn = new io.appmetrica.analytics.impl.Jn(5, 500);
        synchronized (u2) {
            try {
                u2.a((io.appmetrica.analytics.impl.Gi) jn, true).get();
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            }
            advertisingIdsHolder = u2.f5050k;
        }
        io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
        if (!yandex.isValid()) {
            java.lang.String id = this.f4649b.getAppSetId().getId();
            if (id != null && id.length() != 0) {
                try {
                    java.util.UUID.fromString(id);
                    if (!id.equals("00000000-0000-0000-0000-000000000000")) {
                        return y1.o.I(id, "-", "");
                    }
                } catch (java.lang.Throwable unused2) {
                }
            }
            return y1.o.I(java.util.UUID.randomUUID().toString(), "-", "").toLowerCase(java.util.Locale.US);
        }
        io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo adTrackingInfo = yandex.mAdTrackingInfo;
        kotlin.jvm.internal.i.b(adTrackingInfo);
        java.lang.String str = adTrackingInfo.advId;
        kotlin.jvm.internal.i.b(str);
        try {
            bArr = java.security.MessageDigest.getInstance("MD5").digest(str.getBytes(y1.a.f8486a));
        } catch (java.security.NoSuchAlgorithmException unused3) {
            bArr = new byte[0];
        }
        return io.appmetrica.analytics.coreutils.internal.StringUtils.toHexString(bArr);
    }

    public M7() {
        this(io.appmetrica.analytics.impl.C0560na.k().c(), io.appmetrica.analytics.impl.C0560na.k().d());
    }
}
