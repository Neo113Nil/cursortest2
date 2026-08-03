package com.fyber.inneractive.sdk.cache;

/* loaded from: classes3.dex */
public final class g implements com.fyber.inneractive.sdk.network.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.cache.k f3553a;

    public g(com.fyber.inneractive.sdk.cache.k kVar) {
        this.f3553a = kVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(java.lang.Object obj, java.lang.Exception exc, boolean z) {
        java.lang.String str = (java.lang.String) obj;
        if (str != null) {
            this.f3553a.b = str;
        }
    }
}
