package com.amazon.device.iap.internal.c;

/* compiled from: PurchaseRequestTracker.java */
/* loaded from: classes2.dex */
public class b {
    private static final com.amazon.device.iap.internal.c.b b = new com.amazon.device.iap.internal.c.b();

    /* renamed from: a, reason: collision with root package name */
    private final java.util.Set<java.lang.String> f3486a = new java.util.concurrent.ConcurrentSkipListSet();

    public boolean a(java.lang.String str) {
        if (com.amazon.device.iap.internal.util.d.a(str)) {
            return false;
        }
        return this.f3486a.remove(str);
    }

    public void b(java.lang.String str) {
        if (com.amazon.device.iap.internal.util.d.a(str)) {
            return;
        }
        this.f3486a.add(str);
    }

    public static com.amazon.device.iap.internal.c.b a() {
        return b;
    }
}
