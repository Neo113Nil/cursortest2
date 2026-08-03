package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.pa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0612pa {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f6642a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6643b;

    public C0612pa() {
        this(false);
    }

    public final void a(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Collection collection = (java.util.Collection) this.f6642a.get(obj);
        java.util.ArrayList arrayList = collection == null ? new java.util.ArrayList() : new java.util.ArrayList(collection);
        arrayList.add(obj2);
    }

    public final java.lang.String toString() {
        return this.f6642a.toString();
    }

    public C0612pa(boolean z2) {
        this.f6642a = new java.util.HashMap();
        this.f6643b = z2;
    }
}
