package com.fyber.inneractive.sdk.config;

/* loaded from: classes3.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.config.IAConfigManager f3593a;

    public d0(com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager) {
        this.f3593a = iAConfigManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = this.f3593a;
        if (iAConfigManager.p == null) {
            iAConfigManager.p = com.fyber.inneractive.sdk.config.j.a(iAConfigManager.f);
        }
        com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.inneractive.sdk.config.c0(this));
    }
}
