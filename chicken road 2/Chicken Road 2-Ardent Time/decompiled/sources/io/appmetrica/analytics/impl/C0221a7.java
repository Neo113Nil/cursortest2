package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.a7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0221a7 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.I6 f5468a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f5469b;

    public C0221a7(java.io.File file) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f5469b = arrayList;
        if (file != null) {
            this.f5468a = new io.appmetrica.analytics.impl.C0642qe(file, new io.appmetrica.analytics.impl.N6());
            arrayList.add(new io.appmetrica.analytics.impl.C0642qe(file, new io.appmetrica.analytics.impl.C0460je()));
        } else {
            this.f5468a = new io.appmetrica.analytics.impl.J6(new io.appmetrica.analytics.impl.N6());
        }
        arrayList.add(new io.appmetrica.analytics.impl.J6(new io.appmetrica.analytics.impl.C0460je()));
    }
}
