package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Oa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0652Oa extends E5 implements InterfaceC0659Pa {
    public AbstractBinderC0652Oa() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static InterfaceC0659Pa u3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof InterfaceC0659Pa ? (InterfaceC0659Pa) queryLocalInterface : new C0645Na(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC0591Fc c0583Ec;
        switch (i) {
            case 1:
                b();
                break;
            case 2:
                c();
                break;
            case 3:
                int readInt = parcel.readInt();
                F5.b(parcel);
                B(readInt);
                break;
            case 4:
                m();
                break;
            case 5:
                r();
                break;
            case 6:
                n();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                }
                F5.b(parcel);
                break;
            case 8:
                l();
                break;
            case 9:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                F5.b(parcel);
                A1(readString, readString2);
                break;
            case 10:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    boolean z3 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd") instanceof U8;
                }
                parcel.readString();
                F5.b(parcel);
                break;
            case 11:
                J();
                break;
            case 12:
                parcel.readString();
                F5.b(parcel);
                break;
            case 13:
                I0();
                break;
            case 14:
                C0575Dc c0575Dc = (C0575Dc) F5.a(parcel, C0575Dc.CREATOR);
                F5.b(parcel);
                W0(c0575Dc);
                break;
            case 15:
                F();
                break;
            case 16:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 == null) {
                    c0583Ec = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    c0583Ec = queryLocalInterface instanceof InterfaceC0591Fc ? (InterfaceC0591Fc) queryLocalInterface : new C0583Ec(readStrongBinder3);
                }
                F5.b(parcel);
                w1(c0583Ec);
                break;
            case 17:
                int readInt2 = parcel.readInt();
                F5.b(parcel);
                n1(readInt2);
                break;
            case 18:
                u();
                break;
            case 19:
                F5.b(parcel);
                break;
            case 20:
                v();
                break;
            case C1639u7.zzm /* 21 */:
                String readString3 = parcel.readString();
                F5.b(parcel);
                M0(readString3);
                break;
            case 22:
                int readInt3 = parcel.readInt();
                String readString4 = parcel.readString();
                F5.b(parcel);
                D2(readString4, readInt3);
                break;
            case 23:
                C0387u0 c0387u0 = (C0387u0) F5.a(parcel, C0387u0.CREATOR);
                F5.b(parcel);
                a3(c0387u0);
                break;
            case 24:
                C0387u0 c0387u02 = (C0387u0) F5.a(parcel, C0387u0.CREATOR);
                F5.b(parcel);
                v2(c0387u02);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
