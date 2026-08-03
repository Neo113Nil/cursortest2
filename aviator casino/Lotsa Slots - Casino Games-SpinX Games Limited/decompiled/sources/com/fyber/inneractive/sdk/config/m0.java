package com.fyber.inneractive.sdk.config;

/* loaded from: classes3.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f3621a;
    public final /* synthetic */ com.fyber.inneractive.sdk.config.w b;

    public m0(android.content.Context context, com.fyber.inneractive.sdk.config.w wVar) {
        this.f3621a = context;
        this.b = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (com.fyber.inneractive.sdk.external.InneractiveAdManager.isCurrentUserAChild()) {
            return;
        }
        try {
            java.lang.Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            com.fyber.inneractive.sdk.config.n0.a(this.f3621a, this.b);
            com.fyber.inneractive.sdk.config.v vVar = com.fyber.inneractive.sdk.config.u.f3639a.b;
            if (android.text.TextUtils.isEmpty(vVar != null ? vVar.f3641a : null)) {
                com.fyber.inneractive.sdk.config.n.a(this.f3621a, this.b);
            }
        } catch (java.lang.Throwable th) {
            com.fyber.inneractive.sdk.util.IAlog.a("SDK internal error: Make sure that Google Play Services for Mobile Ads is added to the compile dependencies of your project", th, new java.lang.Object[0]);
        }
    }
}
