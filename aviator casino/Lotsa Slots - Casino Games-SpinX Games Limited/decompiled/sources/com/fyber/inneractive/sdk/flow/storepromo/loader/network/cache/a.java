package com.fyber.inneractive.sdk.flow.storepromo.loader.network.cache;

/* loaded from: classes3.dex */
public final class a implements com.fyber.inneractive.sdk.cache.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f3745a;

    public a(java.lang.String str) {
        this.f3745a = str;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final java.lang.Object a(java.lang.String str) {
        return str;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final java.lang.String b() {
        return "IALastModifiedFromHeader.dt_storepromo";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final java.lang.String c() {
        return java.lang.String.valueOf(("dt_store.promo_" + this.f3745a).hashCode());
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final boolean d() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final void a(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (str != null) {
            com.fyber.inneractive.sdk.util.o.f4302a.getSharedPreferences("IAConfigurationPreferences", 0).edit().putString("dt_store.promo.data", str).apply();
        }
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final java.lang.String a() {
        return this.f3745a;
    }
}
