package com.fyber.inneractive.sdk.external;

/* loaded from: classes3.dex */
public final class b implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
        android.content.SharedPreferences sharedPreferences = com.fyber.inneractive.sdk.util.o.f4302a.getSharedPreferences("IAConfigurationPreferences", 0);
        if (sharedPreferences == null || !sharedPreferences.contains("IAConfigFQE")) {
            com.fyber.inneractive.sdk.config.IAConfigManager.f();
            new com.fyber.inneractive.sdk.network.w(com.fyber.inneractive.sdk.network.u.FIRST_OPENED, (com.fyber.inneractive.sdk.external.InneractiveAdRequest) null, (com.fyber.inneractive.sdk.response.e) null).a((java.lang.String) null);
        }
    }
}
