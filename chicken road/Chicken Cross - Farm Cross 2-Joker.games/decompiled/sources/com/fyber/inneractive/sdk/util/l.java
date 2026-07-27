package com.fyber.inneractive.sdk.util;

/* loaded from: classes4.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.cache.a f5955a;

    public l(com.fyber.inneractive.sdk.cache.a aVar) {
        this.f5955a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.cache.a aVar;
        try {
            if (o.f5960a == null || (aVar = this.f5955a) == null) {
                return;
            }
            o.f5960a.getSharedPreferences("IAConfigurationPreferences", 0).edit().remove(aVar.b()).apply();
        } catch (Throwable unused) {
        }
    }
}
