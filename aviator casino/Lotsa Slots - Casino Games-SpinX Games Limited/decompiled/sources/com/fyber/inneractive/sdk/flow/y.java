package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f3767a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ com.fyber.inneractive.sdk.util.g1 c;
    public final /* synthetic */ com.fyber.inneractive.sdk.util.g d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ com.fyber.inneractive.sdk.click.o f;
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.b0 g;

    public y(com.fyber.inneractive.sdk.flow.b0 b0Var, android.content.Context context, java.lang.String str, com.fyber.inneractive.sdk.util.g1 g1Var, com.fyber.inneractive.sdk.util.g gVar, boolean z, com.fyber.inneractive.sdk.click.o oVar) {
        this.g = b0Var;
        this.f3767a = context;
        this.b = str;
        this.c = g1Var;
        this.d = gVar;
        this.e = z;
        this.f = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.a(this.f3767a, this.b, this.c, this.d, this.e, this.f);
    }
}
