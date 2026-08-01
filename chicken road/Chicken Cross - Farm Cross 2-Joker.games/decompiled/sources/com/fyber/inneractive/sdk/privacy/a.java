package com.fyber.inneractive.sdk.privacy;

import com.fyber.inneractive.sdk.config.h;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes4.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f5829a;

    public a(c cVar) {
        this.f5829a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (c.g) {
            c cVar = this.f5829a;
            if (!cVar.c) {
                cVar.b.set(null);
                return;
            }
            String str = (String) cVar.b.getAndSet(null);
            if (str != null) {
                h hVar = (h) this.f5829a.f5831a;
                hVar.getClass();
                IAlog.a("%sIAB app default preference updated (%s) — refreshing cached GDPR/GPP state", "ConfigDataProtectionProvider: ", str);
                hVar.h();
            }
        }
    }
}
