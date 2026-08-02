package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import s3.BinderC2361b;

/* loaded from: classes.dex */
public final class Gl implements InterfaceC1886zl {

    /* renamed from: a, reason: collision with root package name */
    public final long f9251a;

    /* renamed from: b, reason: collision with root package name */
    public final C1529ro f9252b;

    /* renamed from: c, reason: collision with root package name */
    public final Iq f9253c;

    public Gl(long j5, Context context, C1529ro c1529ro, C0554Af c0554Af, String str) {
        this.f9251a = j5;
        this.f9252b = c1529ro;
        this.f9253c = (Iq) ((CD) new C1390oj(c0554Af.f7646b, context, str).f14828m).d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1886zl
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1886zl
    public final void b(Q2.X0 x02) {
        try {
            this.f9253c.f1(x02, new El(this));
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1886zl
    public final void i() {
        Iq iq = this.f9253c;
        try {
            iq.V2(new Fl(this));
            iq.L0(new BinderC2361b(null));
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        }
    }
}
