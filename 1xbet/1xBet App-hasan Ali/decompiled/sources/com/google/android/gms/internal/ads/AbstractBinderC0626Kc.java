package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Kc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0626Kc extends E5 implements InterfaceC0633Lc {
    public AbstractBinderC0626Kc() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC0591Fc c0583Ec;
        switch (i) {
            case 1:
                h();
                break;
            case 2:
                f();
                break;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c0583Ec = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    c0583Ec = queryLocalInterface instanceof InterfaceC0591Fc ? (InterfaceC0591Fc) queryLocalInterface : new C0583Ec(readStrongBinder);
                }
                F5.b(parcel);
                z1(c0583Ec);
                break;
            case 4:
                int readInt = parcel.readInt();
                F5.b(parcel);
                f0(readInt);
                break;
            case 5:
                C0387u0 c0387u0 = (C0387u0) F5.a(parcel, C0387u0.CREATOR);
                F5.b(parcel);
                J0(c0387u0);
                break;
            case 6:
                c();
                break;
            case 7:
                b();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
