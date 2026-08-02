package com.google.android.gms.internal.ads;

import Q2.C0365j;
import Q2.C0375o;
import Q2.C0379q;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import s3.BinderC2361b;

/* renamed from: com.google.android.gms.internal.ads.ca, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0844ca extends V2.a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12997a;

    /* renamed from: b, reason: collision with root package name */
    public final Q2.Z0 f12998b;

    /* renamed from: c, reason: collision with root package name */
    public final Q2.K f12999c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13000d;

    public C0844ca(Context context, String str) {
        BinderC0610Ia binderC0610Ia = new BinderC0610Ia();
        this.f13000d = System.currentTimeMillis();
        this.f12997a = context;
        this.f12998b = Q2.Z0.f4973k;
        C0375o c0375o = C0379q.f.f5049b;
        Q2.a1 a1Var = new Q2.a1();
        c0375o.getClass();
        this.f12999c = (Q2.K) new C0365j(c0375o, context, a1Var, str, binderC0610Ia).d(context, false);
    }

    @Override // V2.a
    public final void b(Activity activity) {
        if (activity == null) {
            U2.j.i("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            Q2.K k5 = this.f12999c;
            if (k5 != null) {
                k5.n3(new BinderC2361b(activity));
            }
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        }
    }

    public final void c(Q2.A0 a02, J2.u uVar) {
        try {
            Q2.K k5 = this.f12999c;
            if (k5 != null) {
                a02.f4898j = this.f13000d;
                Q2.Z0 z02 = this.f12998b;
                Context context = this.f12997a;
                z02.getClass();
                k5.b2(Q2.Z0.a(context, a02), new Q2.W0(uVar, this));
            }
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
            uVar.b(new J2.m(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }
}
