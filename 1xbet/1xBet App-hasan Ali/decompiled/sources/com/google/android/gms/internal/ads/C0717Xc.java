package com.google.android.gms.internal.ads;

import Q2.C0349b;
import Q2.C0375o;
import Q2.C0379q;
import android.content.Context;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Xc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0717Xc {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0612Ic f12199a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f12200b;

    /* renamed from: c, reason: collision with root package name */
    public final BinderC0710Wc f12201c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12202d = System.currentTimeMillis();

    public C0717Xc(Context context, String str) {
        this.f12200b = context.getApplicationContext();
        C0375o c0375o = C0379q.f.f5049b;
        BinderC0610Ia binderC0610Ia = new BinderC0610Ia();
        c0375o.getClass();
        this.f12199a = (InterfaceC0612Ic) new C0349b(context, str, binderC0610Ia).d(context, false);
        this.f12201c = new BinderC0710Wc();
    }

    public static void a(Context context, String str, J2.h hVar, Zl zl) {
        m3.v.f("Context cannot be null.", context);
        m3.v.f("AdUnitId cannot be null.", str);
        m3.v.c("#008 Must be called on the main UI thread.");
        F7.a(context);
        if (((Boolean) AbstractC0968f8.f13462k.s()).booleanValue()) {
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.La)).booleanValue()) {
                U2.c.f5860b.execute(new K2.e(context, str, hVar, zl, 10));
                return;
            }
        }
        new C0717Xc(context, str).b(hVar.f2711a, zl);
    }

    public final void b(Q2.A0 a02, Zl zl) {
        try {
            InterfaceC0612Ic interfaceC0612Ic = this.f12199a;
            if (interfaceC0612Ic != null) {
                a02.f4898j = this.f12202d;
                interfaceC0612Ic.V1(Q2.Z0.a(this.f12200b, a02), new BinderC0689Tc(zl, this, 1));
            }
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        }
    }
}
