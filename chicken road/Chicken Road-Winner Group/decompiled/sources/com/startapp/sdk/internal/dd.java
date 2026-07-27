package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* loaded from: classes.dex */
public final class dd implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ld f3588a;

    public dd(ld ldVar) {
        this.f3588a = ldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ld ldVar = this.f3588a;
        if (ldVar.f3993g) {
            return;
        }
        try {
            d9 d9Var = new d9(e9.f3618e);
            d9Var.f3574d = "Failed smart redirect hop info: ".concat(ldVar.f4002p ? "Page Finished" : "Timeout");
            d9Var.f = ldVar.b();
            d9Var.f3576g = ldVar.f;
            d9Var.a();
        } catch (Throwable th) {
            d9.a(th);
        }
        try {
            ldVar.f4001o = true;
            g0.d(ldVar.f3988a);
            ldVar.a();
            if (ldVar.f3997k && MetaData.E().i0()) {
                g0.a(ldVar.f3988a, ldVar.f3992e);
            } else {
                g0.b(ldVar.f3988a, ldVar.f3992e);
            }
            Runnable runnable = ldVar.f4000n;
            if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th2) {
            d9.a(th2);
        }
    }
}
