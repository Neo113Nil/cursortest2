package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.em, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0945em implements InterfaceC1434pi, InterfaceC0764aj {

    /* renamed from: k, reason: collision with root package name */
    public final Context f13332k;

    /* renamed from: l, reason: collision with root package name */
    public final C1482ql f13333l;

    public C0945em(Context context, C1482ql c1482ql) {
        this.f13332k = context;
        this.f13333l = c1482ql;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1434pi
    public final void B0(Sq sq) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1434pi
    public final void D(C1428pc c1428pc) {
        c(this.f13332k);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0764aj
    public final void a(String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0764aj
    public final void b(a3.u uVar) {
        c(this.f13332k);
    }

    public final void c(Context context) {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8910u4)).booleanValue()) {
            AbstractC0613Id.f9539a.execute(new Kw(29, this, context));
        }
    }
}
