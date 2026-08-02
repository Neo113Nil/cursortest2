package com.facetec.sdk;

/* loaded from: classes8.dex */
class ag {
    static final /* synthetic */ boolean c = true;

    /* renamed from: a, reason: collision with root package name */
    final java.lang.Object f3383a = new java.lang.Object();
    boolean e = false;

    ag() {
    }

    final void d(boolean z) {
        synchronized (this.f3383a) {
            if (this.e != z) {
                this.e = z;
                this.f3383a.notifyAll();
            }
        }
    }
}
