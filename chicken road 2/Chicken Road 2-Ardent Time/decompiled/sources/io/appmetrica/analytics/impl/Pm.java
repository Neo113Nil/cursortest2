package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Pm {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f4851a;

    public Pm() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f4851a = hashMap;
        io.appmetrica.analytics.impl.Jm jm = new io.appmetrica.analytics.impl.Jm();
        io.appmetrica.analytics.impl.Km km = new io.appmetrica.analytics.impl.Km();
        io.appmetrica.analytics.impl.Lm lm = new io.appmetrica.analytics.impl.Lm();
        io.appmetrica.analytics.impl.Mm mm = new io.appmetrica.analytics.impl.Mm();
        hashMap.put(io.appmetrica.analytics.impl.C0468jm.class, jm);
        hashMap.put(io.appmetrica.analytics.impl.T1.class, km);
        hashMap.put(io.appmetrica.analytics.impl.C0307df.class, lm);
        hashMap.put(io.appmetrica.analytics.impl.C0682s3.class, mm);
    }

    public static io.appmetrica.analytics.impl.Qm a(java.lang.Class cls) {
        return (io.appmetrica.analytics.impl.Qm) io.appmetrica.analytics.impl.Om.f4797a.f4851a.get(cls);
    }
}
