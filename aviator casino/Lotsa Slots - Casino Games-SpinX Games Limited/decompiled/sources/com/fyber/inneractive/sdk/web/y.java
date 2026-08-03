package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class y implements android.content.DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4365a;
    public final /* synthetic */ com.fyber.inneractive.sdk.web.i0 b;

    public y(com.fyber.inneractive.sdk.web.i0 i0Var, java.lang.String str) {
        this.b = i0Var;
        this.f4365a = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        com.fyber.inneractive.sdk.web.i0 i0Var = this.b;
        java.lang.String str = this.f4365a;
        i0Var.getClass();
        new java.io.File(android.os.Environment.getExternalStorageDirectory(), "Pictures").mkdirs();
        com.fyber.inneractive.sdk.flow.x xVar = i0Var.s;
        com.fyber.inneractive.sdk.config.IAConfigManager.N.r.a(new com.fyber.inneractive.sdk.network.b1(new com.fyber.inneractive.sdk.web.x(i0Var), str, xVar != null ? xVar.c : null));
    }
}
