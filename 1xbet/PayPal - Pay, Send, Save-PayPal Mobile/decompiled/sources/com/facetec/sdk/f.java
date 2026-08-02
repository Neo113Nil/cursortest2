package com.facetec.sdk;

/* loaded from: classes8.dex */
final class f<T> {

    /* renamed from: a, reason: collision with root package name */
    private T f3562a = null;

    @java.lang.FunctionalInterface
    interface d {
        java.lang.Object create();
    }

    f() {
    }

    final T d(com.facetec.sdk.f.d dVar) {
        T t;
        synchronized (this) {
            if (this.f3562a == null) {
                this.f3562a = (T) dVar.create();
            }
            t = this.f3562a;
        }
        return t;
    }

    final T a() {
        T t;
        synchronized (this) {
            t = this.f3562a;
        }
        return t;
    }

    final void c() {
        synchronized (this) {
            this.f3562a = null;
        }
    }
}
