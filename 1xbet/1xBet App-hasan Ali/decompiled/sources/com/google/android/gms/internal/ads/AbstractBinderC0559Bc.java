package com.google.android.gms.internal.ads;

import android.os.Parcel;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* renamed from: com.google.android.gms.internal.ads.Bc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0559Bc extends E5 implements InterfaceC0567Cc {
    public AbstractBinderC0559Bc() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                InterfaceC2360a h1 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                c3(h1);
                break;
            case 2:
                BinderC2361b.h1(parcel.readStrongBinder());
                parcel.readInt();
                F5.b(parcel);
                o1();
                break;
            case 3:
                InterfaceC2360a h12 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                V0(h12);
                break;
            case 4:
                InterfaceC2360a h13 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                H1(h13);
                break;
            case 5:
                InterfaceC2360a h14 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                f2(h14);
                break;
            case 6:
                InterfaceC2360a h15 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                W1(h15);
                break;
            case 7:
                InterfaceC2360a h16 = BinderC2361b.h1(parcel.readStrongBinder());
                C0575Dc c0575Dc = (C0575Dc) F5.a(parcel, C0575Dc.CREATOR);
                F5.b(parcel);
                u2(h16, c0575Dc);
                break;
            case 8:
                InterfaceC2360a h17 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                zze(h17);
                break;
            case 9:
                InterfaceC2360a h18 = BinderC2361b.h1(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                F5.b(parcel);
                p1(h18, readInt);
                break;
            case 10:
                BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                W2();
                break;
            case 11:
                InterfaceC2360a h19 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                Q(h19);
                break;
            case 12:
                F5.b(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
