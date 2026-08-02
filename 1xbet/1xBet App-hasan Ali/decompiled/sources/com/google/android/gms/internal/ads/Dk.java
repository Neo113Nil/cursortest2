package com.google.android.gms.internal.ads;

import Q2.C0358f0;
import Q2.InterfaceC0362h0;
import Q2.InterfaceC0374n0;
import Q2.InterfaceC0383s0;
import Q2.InterfaceC0391w0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* loaded from: classes.dex */
public final class Dk extends E5 implements InterfaceC1192k9 {

    /* renamed from: k, reason: collision with root package name */
    public final String f8356k;

    /* renamed from: l, reason: collision with root package name */
    public final Cj f8357l;

    /* renamed from: m, reason: collision with root package name */
    public final Gj f8358m;

    /* renamed from: n, reason: collision with root package name */
    public final C1482ql f8359n;

    public Dk(String str, Cj cj, Gj gj, C1482ql c1482ql) {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
        this.f8356k = str;
        this.f8357l = cj;
        this.f8358m = gj;
        this.f8359n = c1482ql;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1192k9
    public final String A() {
        return this.f8358m.c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1192k9
    public final void K2(Bundle bundle) {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.zc)).booleanValue()) {
            Cj cj = this.f8357l;
            InterfaceC0677Re R4 = cj.f8059k.R();
            if (R4 == null) {
                U2.j.f("Video webview is null");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                for (String str : bundle.keySet()) {
                    jSONObject.put(str, bundle.get(str));
                }
                cj.f8058j.execute(new RunnableC1566sg(R4, jSONObject, 1));
            } catch (JSONException e3) {
                U2.j.g("Error reading event signals", e3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1192k9
    public final double b() {
        return this.f8358m.v();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1192k9
    public final E8 e() {
        return this.f8358m.L();
    }

    public final void e0() {
        Cj cj = this.f8357l;
        synchronized (cj) {
            E5 e5 = cj.f8069u;
            if (e5 == null) {
                U2.j.d("Ad should be associated with an ad view before calling recordCustomClickGesture()");
            } else {
                cj.f8058j.execute(new P2.f(3, cj, e5 instanceof Mj));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1192k9
    public final InterfaceC0383s0 f() {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.q6)).booleanValue()) {
            return this.f8357l.f;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1192k9
    public final InterfaceC0391w0 g() {
        return this.f8358m.J();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1192k9
    public final I8 k() {
        return this.f8358m.N();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1192k9
    public final InterfaceC2360a l() {
        return new BinderC2361b(this.f8357l);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1192k9
    public final String m() {
        return this.f8358m.W();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1192k9
    public final String n() {
        return this.f8358m.X();
    }

    public final boolean n2() {
        boolean j5;
        Cj cj = this.f8357l;
        synchronized (cj) {
            j5 = cj.f8060l.j();
        }
        return j5;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1192k9
    public final InterfaceC2360a o() {
        return this.f8358m.U();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1192k9
    public final String r() {
        return this.f8358m.Y();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1192k9
    public final String s() {
        return this.f8358m.b();
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        C1104i9 c1104i9 = null;
        C0358f0 c0358f0 = null;
        switch (i) {
            case 2:
                String b3 = this.f8358m.b();
                parcel2.writeNoException();
                parcel2.writeString(b3);
                return true;
            case 3:
                List f = this.f8358m.f();
                parcel2.writeNoException();
                parcel2.writeList(f);
                return true;
            case 4:
                String X4 = this.f8358m.X();
                parcel2.writeNoException();
                parcel2.writeString(X4);
                return true;
            case 5:
                I8 N5 = this.f8358m.N();
                parcel2.writeNoException();
                F5.e(parcel2, N5);
                return true;
            case 6:
                String Y4 = this.f8358m.Y();
                parcel2.writeNoException();
                parcel2.writeString(Y4);
                return true;
            case 7:
                String W4 = this.f8358m.W();
                parcel2.writeNoException();
                parcel2.writeString(W4);
                return true;
            case 8:
                double v4 = this.f8358m.v();
                parcel2.writeNoException();
                parcel2.writeDouble(v4);
                return true;
            case 9:
                String d5 = this.f8358m.d();
                parcel2.writeNoException();
                parcel2.writeString(d5);
                return true;
            case 10:
                String c5 = this.f8358m.c();
                parcel2.writeNoException();
                parcel2.writeString(c5);
                return true;
            case 11:
                InterfaceC0391w0 J = this.f8358m.J();
                parcel2.writeNoException();
                F5.e(parcel2, J);
                return true;
            case 12:
                String str = this.f8356k;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 13:
                v();
                parcel2.writeNoException();
                return true;
            case 14:
                E8 L5 = this.f8358m.L();
                parcel2.writeNoException();
                F5.e(parcel2, L5);
                return true;
            case 15:
                Bundle bundle = (Bundle) F5.a(parcel, Bundle.CREATOR);
                F5.b(parcel);
                this.f8357l.f(bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) F5.a(parcel, Bundle.CREATOR);
                F5.b(parcel);
                boolean o5 = this.f8357l.o(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(o5 ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) F5.a(parcel, Bundle.CREATOR);
                F5.b(parcel);
                this.f8357l.i(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                InterfaceC2360a l5 = l();
                parcel2.writeNoException();
                F5.e(parcel2, l5);
                return true;
            case 19:
                InterfaceC2360a U4 = this.f8358m.U();
                parcel2.writeNoException();
                F5.e(parcel2, U4);
                return true;
            case 20:
                Bundle E5 = this.f8358m.E();
                parcel2.writeNoException();
                F5.d(parcel2, E5);
                return true;
            case C1639u7.zzm /* 21 */:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    c1104i9 = queryLocalInterface instanceof C1104i9 ? (C1104i9) queryLocalInterface : new C1104i9(readStrongBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener", 0);
                }
                F5.b(parcel);
                w3(c1104i9);
                parcel2.writeNoException();
                return true;
            case 22:
                this.f8357l.B();
                parcel2.writeNoException();
                return true;
            case 23:
                List y5 = y();
                parcel2.writeNoException();
                parcel2.writeList(y5);
                return true;
            case 24:
                boolean x32 = x3();
                parcel2.writeNoException();
                ClassLoader classLoader = F5.f8654a;
                parcel2.writeInt(x32 ? 1 : 0);
                return true;
            case 25:
                InterfaceC0362h0 u32 = Q2.H0.u3(parcel.readStrongBinder());
                F5.b(parcel);
                y3(u32);
                parcel2.writeNoException();
                return true;
            case 26:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
                    c0358f0 = queryLocalInterface2 instanceof C0358f0 ? (C0358f0) queryLocalInterface2 : new C0358f0(readStrongBinder2, "com.google.android.gms.ads.internal.client.IMuteThisAdListener", 0);
                }
                F5.b(parcel);
                v3(c0358f0);
                parcel2.writeNoException();
                return true;
            case 27:
                u3();
                parcel2.writeNoException();
                return true;
            case 28:
                e0();
                parcel2.writeNoException();
                return true;
            case 29:
                G8 a5 = this.f8357l.f8054C.a();
                parcel2.writeNoException();
                F5.e(parcel2, a5);
                return true;
            case 30:
                boolean n22 = n2();
                parcel2.writeNoException();
                ClassLoader classLoader2 = F5.f8654a;
                parcel2.writeInt(n22 ? 1 : 0);
                return true;
            case 31:
                InterfaceC0383s0 f5 = f();
                parcel2.writeNoException();
                F5.e(parcel2, f5);
                return true;
            case 32:
                InterfaceC0374n0 u33 = Q2.Q0.u3(parcel.readStrongBinder());
                F5.b(parcel);
                try {
                    if (!u33.c()) {
                        this.f8359n.b();
                    }
                } catch (RemoteException e3) {
                    U2.j.e("Error in making CSI ping for reporting paid event callback", e3);
                }
                Cj cj = this.f8357l;
                synchronized (cj) {
                    cj.f8055D.f9120k.set(u33);
                }
                parcel2.writeNoException();
                return true;
            case 33:
                Bundle bundle4 = (Bundle) F5.a(parcel, Bundle.CREATOR);
                F5.b(parcel);
                K2(bundle4);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1192k9
    public final List u() {
        return this.f8358m.f();
    }

    public final void u3() {
        Cj cj = this.f8357l;
        synchronized (cj) {
            cj.f8060l.F();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1192k9
    public final void v() {
        this.f8357l.x();
    }

    public final void v3(C0358f0 c0358f0) {
        Cj cj = this.f8357l;
        synchronized (cj) {
            cj.f8060l.m(c0358f0);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1192k9
    public final String w() {
        return this.f8358m.d();
    }

    public final void w3(C1104i9 c1104i9) {
        Cj cj = this.f8357l;
        synchronized (cj) {
            cj.f8060l.l(c1104i9);
        }
    }

    public final boolean x3() {
        List list;
        Gj gj = this.f8358m;
        synchronized (gj) {
            list = gj.f;
        }
        return (list.isEmpty() || gj.K() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1192k9
    public final List y() {
        List list;
        Gj gj = this.f8358m;
        synchronized (gj) {
            list = gj.f;
        }
        return (list.isEmpty() || gj.K() == null) ? Collections.EMPTY_LIST : this.f8358m.g();
    }

    public final void y3(InterfaceC0362h0 interfaceC0362h0) {
        Cj cj = this.f8357l;
        synchronized (cj) {
            cj.f8060l.k(interfaceC0362h0);
        }
    }
}
