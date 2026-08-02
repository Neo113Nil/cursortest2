package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Uw extends AbstractC1223kw implements Runnable {

    /* renamed from: r, reason: collision with root package name */
    public final Runnable f11843r;

    public Uw(Runnable runnable) {
        runnable.getClass();
        this.f11843r = runnable;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1403ow
    public final String d() {
        return L1.a.n("task=[", this.f11843r.toString(), "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f11843r.run();
        } catch (Throwable th) {
            g(th);
            throw th;
        }
    }
}
