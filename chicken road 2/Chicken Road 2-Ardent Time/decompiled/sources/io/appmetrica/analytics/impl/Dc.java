package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public class Dc {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f4207a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f4208b;

    public Dc(java.lang.Object obj) {
        this(new java.util.HashMap(), obj);
    }

    public final void a(java.lang.Object obj, java.lang.Object obj2) {
        this.f4207a.put(obj, obj2);
    }

    public Dc(java.util.HashMap hashMap, java.lang.Object obj) {
        this.f4207a = hashMap;
        this.f4208b = obj;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        java.lang.Object obj2 = this.f4207a.get(obj);
        return obj2 == null ? this.f4208b : obj2;
    }
}
