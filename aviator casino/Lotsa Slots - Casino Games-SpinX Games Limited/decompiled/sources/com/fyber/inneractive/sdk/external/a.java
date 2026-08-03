package com.fyber.inneractive.sdk.external;

/* loaded from: classes3.dex */
public final class a implements com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f3658a;
    public final /* synthetic */ com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener b;

    public a(android.content.Context context, com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener) {
        this.f3658a = context;
        this.b = onFyberMarketplaceInitializedListener;
    }

    @Override // com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener
    public final void onConfigurationReadyAndValid(com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager, boolean z, java.lang.Exception exc) {
        if (this.f3658a.getApplicationContext() != null) {
            com.fyber.inneractive.sdk.config.IAConfigManager.removeListener(this);
            com.fyber.inneractive.sdk.external.InneractiveAdManager.e = null;
            if (z) {
                com.fyber.inneractive.sdk.external.InneractiveAdManager.a(this.b, com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY, null);
            } else {
                com.fyber.inneractive.sdk.external.InneractiveAdManager.a(this.b, exc instanceof com.fyber.inneractive.sdk.external.InvalidAppIdException ? com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener.FyberInitStatus.INVALID_APP_ID : com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED, exc != null ? exc.getLocalizedMessage() : null);
            }
            if (com.fyber.inneractive.sdk.external.d.f3660a.f3649a == null || !com.fyber.inneractive.sdk.config.IAConfigManager.c() || com.fyber.inneractive.sdk.external.d.f3660a.d) {
                return;
            }
            com.fyber.inneractive.sdk.external.d.f3660a.d = true;
            com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(com.fyber.inneractive.sdk.network.u.IA_IAB_GDPR_TCF_PURPOSE_1_DISABLED);
            com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager2 = com.fyber.inneractive.sdk.config.IAConfigManager.N;
            wVar.a("cmp_id", iAConfigManager2.C.f(), "cmp_version", iAConfigManager2.C.g()).a((java.lang.String) null);
        }
    }
}
