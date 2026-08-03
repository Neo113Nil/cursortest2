package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.p2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0604p2 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.We f6624a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6625b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6626c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider f6627d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f6628e;

    public C0604p2(io.appmetrica.analytics.impl.Q4 q4, io.appmetrica.analytics.impl.We we) {
        this.f6624a = we;
        q4.b();
        this.f6625b = java.util.concurrent.TimeUnit.MINUTES.toMillis(1L);
        this.f6626c = java.util.concurrent.TimeUnit.DAYS.toMillis(7L);
        this.f6627d = new io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider();
        java.util.Map<java.lang.String, java.lang.Long> f2 = we.f();
        a(f2);
        this.f6628e = f2;
    }

    public final void a(java.util.Map map) {
        long currentTimeMillis = this.f6627d.currentTimeMillis();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            if (((java.lang.Number) entry.getValue()).longValue() < currentTimeMillis - this.f6626c) {
                linkedHashSet.add(str);
            }
        }
        java.util.Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            map.remove((java.lang.String) it.next());
        }
    }
}
