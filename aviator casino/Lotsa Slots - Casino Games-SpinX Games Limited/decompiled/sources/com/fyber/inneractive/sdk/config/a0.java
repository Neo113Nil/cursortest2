package com.fyber.inneractive.sdk.config;

/* loaded from: classes3.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.config.IAConfigManager f3583a;
    public final /* synthetic */ android.content.Context b;

    public a0(com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager, android.content.Context context) {
        this.f3583a = iAConfigManager;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            java.lang.Class.forName("com.iab.omid.library.fyber.Omid");
            com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.inneractive.sdk.config.z(this));
        } catch (java.lang.Throwable unused) {
        }
    }
}
