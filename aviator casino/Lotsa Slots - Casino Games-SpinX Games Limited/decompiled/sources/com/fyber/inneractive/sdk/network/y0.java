package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class y0 implements com.fyber.inneractive.sdk.network.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3863a;
    public final /* synthetic */ long b;

    public y0(java.lang.String str, long j) {
        this.f3863a = str;
        this.b = j;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(java.lang.Object obj, java.lang.Exception exc, boolean z) {
        java.lang.String str = (java.lang.String) obj;
        com.fyber.inneractive.sdk.util.IAlog.a("Hit Request: Hitting URL finished: %s", this.f3863a);
        if (exc == null) {
            com.fyber.inneractive.sdk.util.IAlog.a("Hit Request: Hitting URL response code: %s", str);
        } else {
            com.fyber.inneractive.sdk.util.IAlog.a("Hit Request: Hitting URL failed: %s", exc);
        }
        com.fyber.inneractive.sdk.util.IAlog.a("Hit Request: Url hit took %s millis", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.b));
    }
}
