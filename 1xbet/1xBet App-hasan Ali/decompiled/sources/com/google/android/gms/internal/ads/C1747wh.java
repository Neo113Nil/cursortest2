package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.wh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1747wh implements InterfaceC1434pi, InterfaceC0764aj {

    /* renamed from: k, reason: collision with root package name */
    public final Context f16134k;

    /* renamed from: l, reason: collision with root package name */
    public final Wq f16135l;

    /* renamed from: m, reason: collision with root package name */
    public final U2.a f16136m;

    /* renamed from: n, reason: collision with root package name */
    public final T2.I f16137n;

    /* renamed from: o, reason: collision with root package name */
    public final Kl f16138o;

    /* renamed from: p, reason: collision with root package name */
    public final Nr f16139p;

    public C1747wh(Context context, Wq wq, U2.a aVar, T2.I i, Kl kl, Nr nr) {
        this.f16134k = context;
        this.f16135l = wq;
        this.f16136m = aVar;
        this.f16137n = i;
        this.f16138o = kl;
        this.f16139p = nr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1434pi
    public final void B0(Sq sq) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1434pi
    public final void D(C1428pc c1428pc) {
        c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0764aj
    public final void a(String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0764aj
    public final void b(a3.u uVar) {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8765T3)).booleanValue()) {
            c();
        }
    }

    public final void c() {
        String str;
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8760S3)).booleanValue()) {
            Wq wq = this.f16135l;
            C0552Ad t5 = this.f16137n.t();
            E4.a aVar = P2.o.f4767B.f4777k;
            if (t5 != null) {
                aVar.getClass();
                str = t5.f7597d;
            } else {
                str = null;
            }
            aVar.g(this.f16134k, this.f16136m, false, t5, str, wq.f, null, this.f16139p, null, null);
        }
        this.f16138o.b();
    }
}
