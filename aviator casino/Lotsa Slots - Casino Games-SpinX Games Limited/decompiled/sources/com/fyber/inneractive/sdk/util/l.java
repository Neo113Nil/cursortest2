package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.cache.a f4297a;

    public l(com.fyber.inneractive.sdk.cache.a aVar) {
        this.f4297a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.cache.a aVar;
        try {
            if (com.fyber.inneractive.sdk.util.o.f4302a == null || (aVar = this.f4297a) == null) {
                return;
            }
            com.fyber.inneractive.sdk.util.o.f4302a.getSharedPreferences("IAConfigurationPreferences", 0).edit().remove(aVar.b()).apply();
        } catch (java.lang.Throwable unused) {
        }
    }
}
