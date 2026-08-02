package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.C0852b;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.InterfaceC0869k;

/* loaded from: classes4.dex */
public final class M implements Runnable {
    public final /* synthetic */ C0852b a;
    public final /* synthetic */ N b;

    public M(N n, C0852b c0852b) {
        this.b = n;
        this.a = c0852b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0869k interfaceC0869k;
        N n = this.b;
        a.f fVar = n.a;
        K k = (K) n.f.l.get(n.b);
        if (k == null) {
            return;
        }
        C0852b c0852b = this.a;
        if (!c0852b.m()) {
            k.m(c0852b, null);
            return;
        }
        n.e = true;
        if (fVar.requiresSignIn()) {
            if (!n.e || (interfaceC0869k = n.c) == null) {
                return;
            }
            fVar.getRemoteService(interfaceC0869k, n.d);
            return;
        }
        try {
            fVar.getRemoteService(null, fVar.getScopesForConnectionlessNonSignIn());
        } catch (SecurityException unused) {
            fVar.disconnect("Failed to get service from broker.");
            k.m(new C0852b(10), null);
        }
    }
}
