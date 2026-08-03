package com.fyber.inneractive.sdk.config;

/* loaded from: classes3.dex */
public final class b0 implements com.fyber.inneractive.sdk.network.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.config.IAConfigManager f3585a;

    public b0(com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager) {
        this.f3585a = iAConfigManager;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(java.lang.Object obj, java.lang.Exception exc, boolean z) {
        int i;
        com.fyber.inneractive.sdk.config.h0 h0Var = (com.fyber.inneractive.sdk.config.h0) obj;
        if (h0Var != null) {
            if (z) {
                com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = this.f3585a;
                com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager2 = com.fyber.inneractive.sdk.config.IAConfigManager.N;
                iAConfigManager.getClass();
                iAConfigManager.e = h0Var.c;
                iAConfigManager.d = h0Var.b;
                iAConfigManager.f3582a = h0Var.d;
                iAConfigManager.b = h0Var.e;
            } else {
                com.fyber.inneractive.sdk.config.IAConfigManager.O = java.lang.System.currentTimeMillis();
                com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager3 = this.f3585a;
                iAConfigManager3.getClass();
                com.fyber.inneractive.sdk.util.IAlog.a("Got new remote configuration from server:", new java.lang.Object[0]);
                iAConfigManager3.e = h0Var.c;
                iAConfigManager3.d = h0Var.b;
                iAConfigManager3.f3582a = h0Var.d;
                iAConfigManager3.b = h0Var.e;
            }
        } else if (exc instanceof com.fyber.inneractive.sdk.network.g) {
            com.fyber.inneractive.sdk.config.IAConfigManager.O = java.lang.System.currentTimeMillis();
        }
        if (z) {
            return;
        }
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager4 = this.f3585a;
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager5 = com.fyber.inneractive.sdk.config.IAConfigManager.N;
        if (iAConfigManager5.e != null) {
            iAConfigManager4.a(true, null);
        } else {
            iAConfigManager4.getClass();
            if ((exc instanceof com.fyber.inneractive.sdk.external.InvalidAppIdException) || (exc instanceof java.io.FileNotFoundException) || (!(exc instanceof com.fyber.inneractive.sdk.network.k1) ? !android.text.TextUtils.isEmpty(iAConfigManager4.c.trim()) : (i = ((com.fyber.inneractive.sdk.network.k1) exc).f3844a) < 400 || i >= 500)) {
                iAConfigManager4.a(false, new com.fyber.inneractive.sdk.external.InvalidAppIdException());
            } else if (exc instanceof com.fyber.inneractive.sdk.network.b) {
                iAConfigManager4.a(false, exc);
            } else {
                iAConfigManager4.a(false, new com.fyber.inneractive.sdk.config.i0());
            }
        }
        if (iAConfigManager5.e != null) {
            com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager6 = this.f3585a;
            if (iAConfigManager6.B == null) {
                iAConfigManager6.B = new com.fyber.inneractive.sdk.network.v0(new com.fyber.inneractive.sdk.config.e0(iAConfigManager6), iAConfigManager6.f, new com.fyber.inneractive.sdk.config.global.m());
            }
            com.fyber.inneractive.sdk.network.i1 i1Var = iAConfigManager6.B.f;
            if (i1Var == com.fyber.inneractive.sdk.network.i1.RUNNING || i1Var == com.fyber.inneractive.sdk.network.i1.QUEUED) {
                return;
            }
            iAConfigManager5.r.a(iAConfigManager6.B);
        }
    }
}
