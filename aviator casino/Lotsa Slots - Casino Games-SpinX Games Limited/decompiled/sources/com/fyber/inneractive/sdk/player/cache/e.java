package com.fyber.inneractive.sdk.player.cache;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f3869a;
    public final long[] b;
    public boolean c;
    public com.fyber.inneractive.sdk.player.cache.d d;
    public final /* synthetic */ com.fyber.inneractive.sdk.player.cache.g e;

    public e(com.fyber.inneractive.sdk.player.cache.g gVar, java.lang.String str) {
        this.e = gVar;
        this.f3869a = str;
        this.b = new long[gVar.g];
    }

    public final java.io.File a(int i) {
        return new java.io.File(this.e.f3870a, this.f3869a + "." + i);
    }

    public final java.io.File b(int i) {
        return new java.io.File(this.e.f3870a, this.f3869a + "." + i + ".tmp");
    }
}
