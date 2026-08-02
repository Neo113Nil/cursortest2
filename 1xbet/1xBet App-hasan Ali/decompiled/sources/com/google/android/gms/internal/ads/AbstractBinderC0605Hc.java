package com.google.android.gms.internal.ads;

import Q2.C0370l0;
import Q2.InterfaceC0374n0;
import Q2.InterfaceC0383s0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* renamed from: com.google.android.gms.internal.ads.Hc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0605Hc extends E5 implements InterfaceC0612Ic {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f9408k = 0;

    public AbstractBinderC0605Hc() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC0661Pc interfaceC0661Pc = null;
        InterfaceC0661Pc interfaceC0661Pc2 = null;
        C0370l0 c0370l0 = null;
        C0668Qc c0668Qc = null;
        InterfaceC0633Lc interfaceC0633Lc = null;
        switch (i) {
            case 1:
                Q2.X0 x02 = (Q2.X0) F5.a(parcel, Q2.X0.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    interfaceC0661Pc = queryLocalInterface instanceof InterfaceC0661Pc ? (InterfaceC0661Pc) queryLocalInterface : new C0647Nc(readStrongBinder);
                }
                F5.b(parcel);
                f1(x02, interfaceC0661Pc);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    interfaceC0633Lc = queryLocalInterface2 instanceof InterfaceC0633Lc ? (InterfaceC0633Lc) queryLocalInterface2 : new C0619Jc(readStrongBinder2, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback", 0);
                }
                F5.b(parcel);
                V2(interfaceC0633Lc);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean n5 = n();
                parcel2.writeNoException();
                ClassLoader classLoader = F5.f8654a;
                parcel2.writeInt(n5 ? 1 : 0);
                return true;
            case 4:
                String b3 = b();
                parcel2.writeNoException();
                parcel2.writeString(b3);
                return true;
            case 5:
                InterfaceC2360a h1 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                L0(h1);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    c0668Qc = queryLocalInterface3 instanceof C0668Qc ? (C0668Qc) queryLocalInterface3 : new C0668Qc(readStrongBinder3, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener", 0);
                }
                F5.b(parcel);
                t2(c0668Qc);
                parcel2.writeNoException();
                return true;
            case 7:
                C0696Uc c0696Uc = (C0696Uc) F5.a(parcel, C0696Uc.CREATOR);
                F5.b(parcel);
                U2(c0696Uc);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
                    c0370l0 = queryLocalInterface4 instanceof C0370l0 ? (C0370l0) queryLocalInterface4 : new C0370l0(readStrongBinder4, "com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener", 0);
                }
                F5.b(parcel);
                p2(c0370l0);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle d5 = d();
                parcel2.writeNoException();
                F5.d(parcel2, d5);
                return true;
            case 10:
                InterfaceC2360a h12 = BinderC2361b.h1(parcel.readStrongBinder());
                ClassLoader classLoader2 = F5.f8654a;
                boolean z3 = parcel.readInt() != 0;
                F5.b(parcel);
                z2(h12, z3);
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC0591Fc j5 = j();
                parcel2.writeNoException();
                F5.e(parcel2, j5);
                return true;
            case 12:
                InterfaceC0383s0 i5 = i();
                parcel2.writeNoException();
                F5.e(parcel2, i5);
                return true;
            case 13:
                InterfaceC0374n0 u32 = Q2.Q0.u3(parcel.readStrongBinder());
                F5.b(parcel);
                q0(u32);
                parcel2.writeNoException();
                return true;
            case 14:
                Q2.X0 x03 = (Q2.X0) F5.a(parcel, Q2.X0.CREATOR);
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    interfaceC0661Pc2 = queryLocalInterface5 instanceof InterfaceC0661Pc ? (InterfaceC0661Pc) queryLocalInterface5 : new C0647Nc(readStrongBinder5);
                }
                F5.b(parcel);
                V1(x03, interfaceC0661Pc2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean f = F5.f(parcel);
                F5.b(parcel);
                t0(f);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
