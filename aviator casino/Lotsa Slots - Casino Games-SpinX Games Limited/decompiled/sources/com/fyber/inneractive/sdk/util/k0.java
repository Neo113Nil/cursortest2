package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public final class k0 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f4296a;
    public final /* synthetic */ com.fyber.inneractive.sdk.util.n0 b;

    public k0(com.fyber.inneractive.sdk.util.n0 n0Var, android.content.Context context) {
        this.b = n0Var;
        this.f4296a = context;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.b.b(this.f4296a);
        return true;
    }
}
