package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.d5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0297d5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f5694a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f5695b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f5696c;

    public C0297d5(android.content.Context context) {
        this.f5696c = context.getApplicationContext();
    }

    public final io.appmetrica.analytics.impl.Ga a(io.appmetrica.analytics.impl.Q4 q4, io.appmetrica.analytics.impl.C0606p4 c0606p4, io.appmetrica.analytics.impl.O7 o7, java.util.HashMap hashMap) {
        io.appmetrica.analytics.impl.Ga ga = (io.appmetrica.analytics.impl.Ga) hashMap.get(q4.toString());
        if (ga != null) {
            ga.a(c0606p4);
            return ga;
        }
        io.appmetrica.analytics.impl.Ga a2 = o7.a(this.f5696c, q4, c0606p4);
        hashMap.put(q4.toString(), a2);
        return a2;
    }
}
