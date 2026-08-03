package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Fl {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.Hl f4306a;

    public Fl(io.appmetrica.analytics.impl.Hl hl) {
        this.f4306a = hl;
    }

    public final void a(java.lang.String str, io.appmetrica.analytics.impl.Jl jl, io.appmetrica.analytics.impl.C0365fm c0365fm) {
        java.util.ArrayList arrayList;
        synchronized (this.f4306a.f4395b) {
            try {
                java.util.Collection collection = (java.util.Collection) this.f4306a.f4394a.f6642a.get(str);
                arrayList = collection == null ? new java.util.ArrayList() : new java.util.ArrayList(collection);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((io.appmetrica.analytics.impl.Ql) it.next()).a(jl, c0365fm);
        }
    }
}
