package com.fyber.inneractive.sdk.ignite;

/* loaded from: classes3.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.ignite.h f3773a;

    public d(com.fyber.inneractive.sdk.ignite.h hVar) {
        this.f3773a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.ignite.h hVar = this.f3773a;
        com.fyber.inneractive.sdk.util.IAlog.a("onInstallTimeout after %d msec", java.lang.Long.valueOf(hVar.k));
        java.util.Iterator it = hVar.h.iterator();
        while (it.hasNext()) {
            com.fyber.inneractive.sdk.ignite.r rVar = (com.fyber.inneractive.sdk.ignite.r) it.next();
            if (rVar != null) {
                rVar.a((java.lang.String) null, com.fyber.inneractive.sdk.ignite.j.INSTALL_TIMEOUT.a(), (java.lang.String) null);
            }
        }
    }
}
