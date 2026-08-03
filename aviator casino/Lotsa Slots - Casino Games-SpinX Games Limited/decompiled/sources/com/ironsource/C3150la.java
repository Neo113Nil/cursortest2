package com.ironsource;

/* renamed from: com.ironsource.la, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3150la {
    private static com.ironsource.C3150la c;

    /* renamed from: a, reason: collision with root package name */
    private final java.util.HashSet<com.ironsource.mediationsdk.impressionData.ImpressionDataListener> f6370a = new java.util.HashSet<>();
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> b = new java.util.concurrent.ConcurrentHashMap<>();

    C3150la() {
    }

    public static synchronized com.ironsource.C3150la b() {
        com.ironsource.C3150la c3150la;
        synchronized (com.ironsource.C3150la.class) {
            if (c == null) {
                c = new com.ironsource.C3150la();
            }
            c3150la = c;
        }
        return c3150la;
    }

    public java.util.HashSet<com.ironsource.mediationsdk.impressionData.ImpressionDataListener> a() {
        return this.f6370a;
    }

    public java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> c() {
        return this.b;
    }

    public void d() {
        synchronized (this) {
            this.f6370a.clear();
        }
    }

    public void a(com.ironsource.mediationsdk.impressionData.ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f6370a.add(impressionDataListener);
        }
    }

    public void a(java.lang.String str, java.util.List<java.lang.String> list) {
        this.b.put(str, list);
    }

    public void b(com.ironsource.mediationsdk.impressionData.ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f6370a.remove(impressionDataListener);
        }
    }
}
