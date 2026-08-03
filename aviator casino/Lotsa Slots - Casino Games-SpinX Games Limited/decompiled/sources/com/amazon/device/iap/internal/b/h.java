package com.amazon.device.iap.internal.b;

/* compiled from: KiwiRequestContext.java */
/* loaded from: classes2.dex */
public class h {
    static final /* synthetic */ boolean b = true;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map<java.lang.String, java.lang.Object> f3482a = new java.util.HashMap();

    public java.lang.Object a(java.lang.String str) {
        return this.f3482a.get(str);
    }

    public void a(java.lang.String str, java.lang.Object obj) {
        this.f3482a.put(str, obj);
    }

    public void a(java.lang.Object obj) {
        if (!b && obj == null) {
            throw new java.lang.AssertionError();
        }
        this.f3482a.put("RESPONSE", obj);
    }

    public java.lang.Object a() {
        return this.f3482a.get("RESPONSE");
    }

    public void b() {
        this.f3482a.remove("RESPONSE");
    }
}
