package com.google.android.gms.internal.ads;

import Q2.C0349b;
import Q2.C0375o;
import Q2.C0379q;
import android.content.Context;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Rc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0675Rc {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0612Ic f11422a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f11423b;

    /* renamed from: c, reason: collision with root package name */
    public final BinderC0710Wc f11424c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11425d;

    public C0675Rc(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        C0375o c0375o = C0379q.f.f5049b;
        BinderC0610Ia binderC0610Ia = new BinderC0610Ia();
        c0375o.getClass();
        InterfaceC0612Ic interfaceC0612Ic = (InterfaceC0612Ic) new C0349b(context, str, binderC0610Ia).d(context, false);
        BinderC0710Wc binderC0710Wc = new BinderC0710Wc();
        this.f11425d = System.currentTimeMillis();
        this.f11423b = applicationContext.getApplicationContext();
        this.f11422a = interfaceC0612Ic;
        this.f11424c = binderC0710Wc;
    }

    public static void a(Context context, String str, J2.h hVar, Zl zl) {
        m3.v.f("Context cannot be null.", context);
        m3.v.f("AdUnitId cannot be null.", str);
        m3.v.c("#008 Must be called on the main UI thread.");
        F7.a(context);
        if (((Boolean) AbstractC0968f8.f13462k.s()).booleanValue()) {
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.La)).booleanValue()) {
                U2.c.f5860b.execute(new K2.e(context, str, hVar, zl, 9));
                return;
            }
        }
        U2.j.d("Loading on UI thread");
        new C0675Rc(context, str).b(hVar.f2711a, zl);
    }

    public final void b(Q2.A0 a02, Zl zl) {
        try {
            InterfaceC0612Ic interfaceC0612Ic = this.f11422a;
            if (interfaceC0612Ic != null) {
                a02.f4898j = this.f11425d;
                interfaceC0612Ic.f1(Q2.Z0.a(this.f11423b, a02), new BinderC0689Tc(zl, this, 0));
            }
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        }
    }
}
