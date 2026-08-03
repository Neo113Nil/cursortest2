package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class x implements com.fyber.inneractive.sdk.network.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.web.i0 f4364a;

    public x(com.fyber.inneractive.sdk.web.i0 i0Var) {
        this.f4364a = i0Var;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(java.lang.Object obj, java.lang.Exception exc, boolean z) {
        java.lang.String str = (java.lang.String) obj;
        if (exc != null || android.text.TextUtils.isEmpty(str)) {
            com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.inneractive.sdk.web.w(this));
            return;
        }
        com.fyber.inneractive.sdk.web.i0 i0Var = this.f4364a;
        if (com.fyber.inneractive.sdk.util.o.a(i0Var.b) != null) {
            com.fyber.inneractive.sdk.web.a0 a0Var = new com.fyber.inneractive.sdk.web.a0(str);
            android.media.MediaScannerConnection mediaScannerConnection = new android.media.MediaScannerConnection(com.fyber.inneractive.sdk.util.o.a(i0Var.b).getApplicationContext(), a0Var);
            a0Var.b = mediaScannerConnection;
            mediaScannerConnection.connect();
        }
    }
}
