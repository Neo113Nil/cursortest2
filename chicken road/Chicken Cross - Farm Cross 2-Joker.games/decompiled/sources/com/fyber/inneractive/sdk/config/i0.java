package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes4.dex */
public final class i0 implements com.fyber.inneractive.sdk.network.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IAConfigManager f5265a;

    public i0(IAConfigManager iAConfigManager) {
        this.f5265a = iAConfigManager;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z) {
        com.fyber.inneractive.sdk.config.global.l lVar = (com.fyber.inneractive.sdk.config.global.l) obj;
        if (lVar != null) {
            IAlog.a("calling mergeRemoteFeaturesConfig fromCache: %b", Boolean.valueOf(z));
            IAConfigManager iAConfigManager = this.f5265a;
            iAConfigManager.z.f5249a = lVar;
            if (!z) {
                iAConfigManager.O.a(true, "");
                IAConfigManager.R.F.a(iAConfigManager.O);
            }
            IAConfigManager iAConfigManager2 = this.f5265a;
            iAConfigManager2.J.f = iAConfigManager2.O;
            return;
        }
        if (exc != null) {
            if (exc instanceof com.fyber.inneractive.sdk.network.g) {
                IAlog.a("remote features config not modified", new Object[0]);
                IAConfigManager iAConfigManager3 = this.f5265a;
                iAConfigManager3.O.a(true, "");
                IAConfigManager.R.F.a(iAConfigManager3.O);
                return;
            }
            IAlog.a("Config manager: Error getting or parsing remote config. Resetting configurable features", new Object[0]);
            IAConfigManager iAConfigManager4 = this.f5265a;
            IAConfigManager iAConfigManager5 = IAConfigManager.R;
            iAConfigManager4.getClass();
            new com.fyber.inneractive.sdk.network.w(com.fyber.inneractive.sdk.network.t.FATAL_FEATURES_CONFIG_ERROR).a("exception", exc.getClass().getName(), "message", exc.getLocalizedMessage()).a((String) null);
        }
    }
}
