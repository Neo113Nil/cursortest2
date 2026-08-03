package com.fyber.inneractive.sdk.cache;

/* loaded from: classes3.dex */
public final class l implements com.fyber.inneractive.sdk.cache.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f3558a;
    public final java.lang.String b;

    public l(java.lang.String str) {
        this.f3558a = str;
        this.b = java.lang.String.format("template_%d.html", java.lang.Integer.valueOf(str.hashCode()));
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final java.lang.Object a(java.lang.String str) {
        return str;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final java.lang.String b() {
        return this.b;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final java.lang.String c() {
        return this.b;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final boolean d() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj) {
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final java.lang.String a() {
        return this.f3558a;
    }
}
