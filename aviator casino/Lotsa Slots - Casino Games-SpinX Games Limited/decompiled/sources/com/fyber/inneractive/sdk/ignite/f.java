package com.fyber.inneractive.sdk.ignite;

/* loaded from: classes3.dex */
public final class f implements com.fyber.inneractive.sdk.network.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3775a;

    public f(java.lang.String str) {
        this.f3775a = str;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(java.lang.Object obj, java.lang.Exception exc, boolean z) {
        java.lang.String str = (java.lang.String) obj;
        com.fyber.inneractive.sdk.util.IAlog.a("Hit Request: Hitting URL finished: %s", this.f3775a);
        if (exc == null) {
            com.fyber.inneractive.sdk.util.IAlog.a("Hit Request: Hitting URL response code: %s", str);
        } else {
            com.fyber.inneractive.sdk.util.IAlog.a("Hit Request: Hitting URL failed: %s", exc);
        }
    }
}
