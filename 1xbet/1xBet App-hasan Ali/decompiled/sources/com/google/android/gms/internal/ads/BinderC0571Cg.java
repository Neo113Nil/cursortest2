package com.google.android.gms.internal.ads;

import Q2.InterfaceC0374n0;
import Q2.InterfaceC0383s0;
import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* renamed from: com.google.android.gms.internal.ads.Cg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0571Cg extends E5 implements InterfaceC0966f6 {

    /* renamed from: k, reason: collision with root package name */
    public final C0563Bg f8044k;

    /* renamed from: l, reason: collision with root package name */
    public final Q2.K f8045l;

    /* renamed from: m, reason: collision with root package name */
    public final C0904dq f8046m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8047n;

    /* renamed from: o, reason: collision with root package name */
    public final C1482ql f8048o;

    public BinderC0571Cg(C0563Bg c0563Bg, Q2.K k5, C0904dq c0904dq, C1482ql c1482ql) {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        this.f8047n = ((Boolean) Q2.r.f5053d.f5056c.a(F7.f8701I0)).booleanValue();
        this.f8044k = c0563Bg;
        this.f8045l = k5;
        this.f8046m = c0904dq;
        this.f8048o = c1482ql;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0966f6
    public final void R0(InterfaceC2360a interfaceC2360a, InterfaceC1189k6 interfaceC1189k6) {
        try {
            this.f8046m.f13177n.set(interfaceC1189k6);
            this.f8044k.c((Activity) BinderC2361b.t1(interfaceC2360a), this.f8047n);
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0966f6
    public final InterfaceC0383s0 c() {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.q6)).booleanValue()) {
            return this.f8044k.f;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC1189k6 c1144j6;
        switch (i) {
            case 2:
                parcel2.writeNoException();
                F5.e(parcel2, this.f8045l);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                }
                F5.b(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                InterfaceC2360a h1 = BinderC2361b.h1(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    c1144j6 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    c1144j6 = queryLocalInterface instanceof InterfaceC1189k6 ? (InterfaceC1189k6) queryLocalInterface : new C1144j6(readStrongBinder2, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback", 0);
                }
                F5.b(parcel);
                R0(h1, c1144j6);
                parcel2.writeNoException();
                return true;
            case 5:
                InterfaceC0383s0 c5 = c();
                parcel2.writeNoException();
                F5.e(parcel2, c5);
                return true;
            case 6:
                boolean f = F5.f(parcel);
                F5.b(parcel);
                this.f8047n = f;
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC0374n0 u32 = Q2.Q0.u3(parcel.readStrongBinder());
                F5.b(parcel);
                m3.v.c("setOnPaidEventListener must be called on the main UI thread.");
                C0904dq c0904dq = this.f8046m;
                if (c0904dq != null) {
                    try {
                        if (!u32.c()) {
                            this.f8048o.b();
                        }
                    } catch (RemoteException e3) {
                        U2.j.e("Error in making CSI ping for reporting paid event callback", e3);
                    }
                    c0904dq.f13180q.set(u32);
                }
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
