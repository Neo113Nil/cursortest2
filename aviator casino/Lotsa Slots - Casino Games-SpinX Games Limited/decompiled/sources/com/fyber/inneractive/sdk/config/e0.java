package com.fyber.inneractive.sdk.config;

/* loaded from: classes3.dex */
public final class e0 implements com.fyber.inneractive.sdk.network.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.config.IAConfigManager f3595a;

    public e0(com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager) {
        this.f3595a = iAConfigManager;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(java.lang.Object obj, java.lang.Exception exc, boolean z) {
        com.fyber.inneractive.sdk.config.global.l lVar = (com.fyber.inneractive.sdk.config.global.l) obj;
        if (lVar != null) {
            com.fyber.inneractive.sdk.util.IAlog.a("calling mergeRemoteFeaturesConfig fromCache: %b", java.lang.Boolean.valueOf(z));
            com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = this.f3595a;
            iAConfigManager.y.f3599a = lVar;
            if (!z) {
                iAConfigManager.L.a(true, "");
                com.fyber.inneractive.sdk.config.IAConfigManager.N.D.a(iAConfigManager.L);
            }
            com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager2 = this.f3595a;
            iAConfigManager2.H.f = iAConfigManager2.L;
            return;
        }
        if (exc != null) {
            if (exc instanceof com.fyber.inneractive.sdk.network.g) {
                com.fyber.inneractive.sdk.util.IAlog.a("remote features config not modified", new java.lang.Object[0]);
                com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager3 = this.f3595a;
                iAConfigManager3.L.a(true, "");
                com.fyber.inneractive.sdk.config.IAConfigManager.N.D.a(iAConfigManager3.L);
                return;
            }
            com.fyber.inneractive.sdk.util.IAlog.a("Config manager: Error getting or parsing remote config. Resetting configurable features", new java.lang.Object[0]);
            com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager4 = this.f3595a;
            com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager5 = com.fyber.inneractive.sdk.config.IAConfigManager.N;
            iAConfigManager4.getClass();
            new com.fyber.inneractive.sdk.network.w(com.fyber.inneractive.sdk.network.t.FATAL_FEATURES_CONFIG_ERROR).a("exception", exc.getClass().getName(), "message", exc.getLocalizedMessage()).a((java.lang.String) null);
        }
    }
}
