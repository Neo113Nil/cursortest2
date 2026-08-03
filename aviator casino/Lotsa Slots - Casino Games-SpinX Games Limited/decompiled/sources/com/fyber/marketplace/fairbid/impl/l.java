package com.fyber.marketplace.fairbid.impl;

/* loaded from: classes3.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.marketplace.fairbid.bridge.MarketplaceOnUserAgentAvailableListener f4376a;

    public l(com.fyber.marketplace.fairbid.bridge.MarketplaceOnUserAgentAvailableListener marketplaceOnUserAgentAvailableListener) {
        this.f4376a = marketplaceOnUserAgentAvailableListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager;
        int i = 0;
        while (true) {
            iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
            if (!iAConfigManager.x.f4312a.get() || iAConfigManager.x.d.compareAndSet(true, true) || i >= 100) {
                break;
            }
            com.fyber.inneractive.sdk.util.IAlog.a("UserAgentProvider | waiting on user agent", new java.lang.Object[0]);
            try {
                java.lang.Thread.sleep(100L);
            } catch (java.lang.InterruptedException unused) {
            }
            i++;
        }
        java.lang.String a2 = iAConfigManager.x.a();
        if (a2.isEmpty()) {
            return;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("UserAgentAvailable", new java.lang.Object[0]);
        this.f4376a.onUserAgentAvailable(a2);
    }
}
