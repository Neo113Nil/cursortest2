package Q2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.C1011g6;
import com.google.android.gms.internal.ads.C1639u7;
import com.google.android.gms.internal.ads.C1832yc;
import com.google.android.gms.internal.ads.E5;
import com.google.android.gms.internal.ads.F5;
import com.google.android.gms.internal.ads.InterfaceC0667Qb;
import com.google.android.gms.internal.ads.InterfaceC0674Rb;
import com.google.android.gms.internal.ads.InterfaceC1101i6;
import com.google.android.gms.internal.ads.N7;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* loaded from: classes.dex */
public abstract class J extends E5 implements K {
    public J() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC0392x interfaceC0392x = null;
        W w5 = null;
        A a5 = null;
        InterfaceC0374n0 interfaceC0374n0 = null;
        InterfaceC1101i6 interfaceC1101i6 = null;
        C1832yc c1832yc = null;
        U u5 = null;
        InterfaceC0386u interfaceC0386u = null;
        N7 n7 = null;
        Q q5 = null;
        switch (i) {
            case 1:
                InterfaceC2360a m5 = m();
                parcel2.writeNoException();
                F5.e(parcel2, m5);
                return true;
            case 2:
                v();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean X4 = X();
                parcel2.writeNoException();
                ClassLoader classLoader = F5.f8654a;
                parcel2.writeInt(X4 ? 1 : 0);
                return true;
            case 4:
                X0 x02 = (X0) F5.a(parcel, X0.CREATOR);
                F5.b(parcel);
                boolean v02 = v0(x02);
                parcel2.writeNoException();
                parcel2.writeInt(v02 ? 1 : 0);
                return true;
            case 5:
                j1();
                parcel2.writeNoException();
                return true;
            case 6:
                D();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    interfaceC0392x = queryLocalInterface instanceof InterfaceC0392x ? (InterfaceC0392x) queryLocalInterface : new C0388v(readStrongBinder);
                }
                F5.b(parcel);
                O0(interfaceC0392x);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    q5 = queryLocalInterface2 instanceof Q ? (Q) queryLocalInterface2 : new P(readStrongBinder2);
                }
                F5.b(parcel);
                h3(q5);
                parcel2.writeNoException();
                return true;
            case 9:
                u1();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                e0();
                parcel2.writeNoException();
                return true;
            case 12:
                a1 f = f();
                parcel2.writeNoException();
                F5.d(parcel2, f);
                return true;
            case 13:
                a1 a1Var = (a1) F5.a(parcel, a1.CREATOR);
                F5.b(parcel);
                w0(a1Var);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    boolean z3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener") instanceof InterfaceC0667Qb;
                }
                F5.b(parcel);
                G();
                parcel2.writeNoException();
                return true;
            case 15:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    boolean z5 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener") instanceof InterfaceC0674Rb;
                }
                parcel.readString();
                F5.b(parcel);
                Z();
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String A3 = A();
                parcel2.writeNoException();
                parcel2.writeString(A3);
                return true;
            case 19:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                    n7 = queryLocalInterface3 instanceof N7 ? (N7) queryLocalInterface3 : new N7(readStrongBinder5, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener", 0);
                }
                F5.b(parcel);
                N0(n7);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    interfaceC0386u = queryLocalInterface4 instanceof InterfaceC0386u ? (InterfaceC0386u) queryLocalInterface4 : new C0384t(readStrongBinder6, "com.google.android.gms.ads.internal.client.IAdClickListener", 0);
                }
                F5.b(parcel);
                H2(interfaceC0386u);
                parcel2.writeNoException();
                return true;
            case C1639u7.zzm /* 21 */:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    u5 = queryLocalInterface5 instanceof U ? (U) queryLocalInterface5 : new U(readStrongBinder7);
                }
                F5.b(parcel);
                P0(u5);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean f5 = F5.f(parcel);
                F5.b(parcel);
                m3(f5);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean S22 = S2();
                parcel2.writeNoException();
                ClassLoader classLoader2 = F5.f8654a;
                parcel2.writeInt(S22 ? 1 : 0);
                return true;
            case 24:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    c1832yc = queryLocalInterface6 instanceof C1832yc ? (C1832yc) queryLocalInterface6 : new C1832yc(readStrongBinder8);
                }
                F5.b(parcel);
                b3(c1832yc);
                parcel2.writeNoException();
                return true;
            case 25:
                parcel.readString();
                F5.b(parcel);
                R();
                parcel2.writeNoException();
                return true;
            case 26:
                InterfaceC0391w0 o5 = o();
                parcel2.writeNoException();
                F5.e(parcel2, o5);
                return true;
            case 29:
                V0 v03 = (V0) F5.a(parcel, V0.CREATOR);
                F5.b(parcel);
                F1(v03);
                parcel2.writeNoException();
                return true;
            case 30:
                F5.b(parcel);
                P();
                parcel2.writeNoException();
                return true;
            case 31:
                String t5 = t();
                parcel2.writeNoException();
                parcel2.writeString(t5);
                return true;
            case 32:
                Q h3 = h();
                parcel2.writeNoException();
                F5.e(parcel2, h3);
                return true;
            case 33:
                InterfaceC0392x e3 = e();
                parcel2.writeNoException();
                F5.e(parcel2, e3);
                return true;
            case 34:
                boolean f6 = F5.f(parcel);
                F5.b(parcel);
                U1(f6);
                parcel2.writeNoException();
                return true;
            case 35:
                String w6 = w();
                parcel2.writeNoException();
                parcel2.writeString(w6);
                return true;
            case 36:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    boolean z6 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener") instanceof N;
                }
                F5.b(parcel);
                c0();
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle j5 = j();
                parcel2.writeNoException();
                F5.d(parcel2, j5);
                return true;
            case 38:
                parcel.readString();
                F5.b(parcel);
                d0();
                parcel2.writeNoException();
                return true;
            case 39:
                d1 d1Var = (d1) F5.a(parcel, d1.CREATOR);
                F5.b(parcel);
                K1(d1Var);
                parcel2.writeNoException();
                return true;
            case 40:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
                    interfaceC1101i6 = queryLocalInterface7 instanceof InterfaceC1101i6 ? (InterfaceC1101i6) queryLocalInterface7 : new C1011g6(readStrongBinder10, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback", 0);
                }
                F5.b(parcel);
                P2(interfaceC1101i6);
                parcel2.writeNoException();
                return true;
            case 41:
                InterfaceC0383s0 k5 = k();
                parcel2.writeNoException();
                F5.e(parcel2, k5);
                return true;
            case 42:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    interfaceC0374n0 = queryLocalInterface8 instanceof InterfaceC0374n0 ? (InterfaceC0374n0) queryLocalInterface8 : new C0372m0(readStrongBinder11);
                }
                F5.b(parcel);
                G1(interfaceC0374n0);
                parcel2.writeNoException();
                return true;
            case 43:
                X0 x03 = (X0) F5.a(parcel, X0.CREATOR);
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    a5 = queryLocalInterface9 instanceof A ? (A) queryLocalInterface9 : new C0394y(readStrongBinder12, "com.google.android.gms.ads.internal.client.IAdLoadCallback", 0);
                }
                F5.b(parcel);
                b2(x03, a5);
                parcel2.writeNoException();
                return true;
            case 44:
                InterfaceC2360a h1 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                n3(h1);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder13.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    w5 = queryLocalInterface10 instanceof W ? (W) queryLocalInterface10 : new V(readStrongBinder13, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback", 0);
                }
                F5.b(parcel);
                X0(w5);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean o22 = o2();
                parcel2.writeNoException();
                ClassLoader classLoader3 = F5.f8654a;
                parcel2.writeInt(o22 ? 1 : 0);
                return true;
        }
    }
}
