package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* loaded from: classes.dex */
public final class fd implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ld f3692a;

    public fd(ld ldVar) {
        this.f3692a = ldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ld ldVar = this.f3692a;
        if (ldVar.f4001o || ldVar.f3993g) {
            return;
        }
        try {
            ldVar.f3993g = true;
            g0.d(ldVar.f3988a);
            if (ldVar.f3997k && MetaData.E().i0()) {
                g0.a(ldVar.f3988a, ldVar.f3992e);
            } else {
                g0.b(ldVar.f3988a, ldVar.f3992e);
            }
            Runnable runnable = ldVar.f4000n;
            if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th) {
            d9.a(th);
        }
    }
}
