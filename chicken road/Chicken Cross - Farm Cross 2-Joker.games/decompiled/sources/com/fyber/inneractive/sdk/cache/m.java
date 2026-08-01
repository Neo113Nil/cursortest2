package com.fyber.inneractive.sdk.cache;

/* loaded from: classes4.dex */
public final class m implements a {

    /* renamed from: a, reason: collision with root package name */
    public final String f5208a;
    public final String b;

    public m(String str) {
        this.f5208a = str;
        this.b = String.format("template_%d.html", Integer.valueOf(str.hashCode()));
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final Object a(String str) {
        return str;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String b() {
        return this.b;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String c() {
        return this.b;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final boolean d() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final /* bridge */ /* synthetic */ void a(Object obj) {
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String a() {
        return this.f5208a;
    }
}
