package com.fyber.inneractive.sdk.cache;

/* loaded from: classes3.dex */
public final class c implements com.fyber.inneractive.sdk.cache.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f3550a;

    public c(java.lang.String str) {
        this.f3550a = str;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final java.lang.Object a(java.lang.String str) {
        return str;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final java.lang.String b() {
        return "IALastModifiedFromHeader.endcard";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final java.lang.String c() {
        return java.lang.String.valueOf(("fmp.endcard_" + this.f3550a).hashCode());
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final boolean d() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final void a(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (str != null) {
            com.fyber.inneractive.sdk.util.o.f4302a.getSharedPreferences("IAConfigurationPreferences", 0).edit().putString("fmp.endcard.data", str).apply();
        }
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final java.lang.String a() {
        return this.f3550a;
    }
}
