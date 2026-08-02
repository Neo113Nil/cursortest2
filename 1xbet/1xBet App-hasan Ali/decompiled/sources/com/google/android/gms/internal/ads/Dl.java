package com.google.android.gms.internal.ads;

import android.content.Context;
import s3.BinderC2361b;

/* loaded from: classes.dex */
public final class Dl implements InterfaceC1886zl {

    /* renamed from: a, reason: collision with root package name */
    public final long f8360a;

    /* renamed from: b, reason: collision with root package name */
    public final Ho f8361b;

    public Dl(long j5, Context context, C1529ro c1529ro, C0554Af c0554Af, String str) {
        this.f8360a = j5;
        C0554Af c0554Af2 = c0554Af.f7646b;
        Q2.a1 a1Var = new Q2.a1();
        str.getClass();
        Ho ho = (Ho) ((CD) new U4(c0554Af2, context, str, a1Var).f11722l).d();
        this.f8361b = ho;
        ho.O0(new Cl(this, c1529ro));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1886zl
    public final void a() {
        this.f8361b.v();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1886zl
    public final void b(Q2.X0 x02) {
        this.f8361b.v0(x02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1886zl
    public final void i() {
        this.f8361b.n3(new BinderC2361b(null));
    }
}
