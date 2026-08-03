package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.external.InneractiveAdRequest f3855a;
    public java.util.HashMap b;

    public r0(com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.serverapi.d dVar) {
        this.f3855a = inneractiveAdRequest;
    }

    public final void a(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        this.b.put(str, str2);
    }
}
