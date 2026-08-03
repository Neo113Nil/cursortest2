package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Dn {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Cn f4236a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.backport.BiFunction f4237b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Cf f4238c;

    public Dn() {
        this(new io.appmetrica.analytics.impl.An(), new io.appmetrica.analytics.impl.C0508la(), io.appmetrica.analytics.impl.C0244b4.l().n());
    }

    public final java.util.ArrayList a(java.lang.Thread thread, java.lang.Thread thread2) {
        java.util.Map map;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.TreeMap treeMap = new java.util.TreeMap(new io.appmetrica.analytics.impl.Bn());
        try {
            map = this.f4236a.c();
        } catch (java.lang.SecurityException unused) {
            map = null;
        }
        if (map != null) {
            treeMap.putAll(map);
        }
        if (thread2 != null) {
            treeMap.remove(thread2);
        }
        for (java.util.Map.Entry entry : treeMap.entrySet()) {
            java.lang.Thread thread3 = (java.lang.Thread) entry.getKey();
            if (thread3 != thread && thread3 != thread2) {
                arrayList.add((io.appmetrica.analytics.impl.C0806wn) this.f4237b.apply(thread3, (java.lang.StackTraceElement[]) entry.getValue()));
            }
        }
        return arrayList;
    }

    public Dn(io.appmetrica.analytics.impl.Cn cn, io.appmetrica.analytics.impl.C0508la c0508la, io.appmetrica.analytics.impl.C0659r6 c0659r6) {
        this.f4236a = cn;
        this.f4237b = c0508la;
        this.f4238c = c0659r6;
    }
}
