package com.google.android.gms.internal.ads;

import android.os.Parcel;
import s3.BinderC2361b;

/* loaded from: classes.dex */
public final class Ft extends E5 implements Et {
    public Ft() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.Et
    public final void B(int i) {
    }

    @Override // com.google.android.gms.internal.ads.Et
    public final void H0(int i) {
    }

    @Override // com.google.android.gms.internal.ads.Et
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                BinderC2361b.h1(parcel.readStrongBinder());
                parcel.readString();
                F5.b(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                F5.b(parcel);
                break;
            case 5:
                parcel.createByteArray();
                F5.b(parcel);
                break;
            case 6:
                parcel.readInt();
                F5.b(parcel);
                break;
            case 7:
                parcel.readInt();
                F5.b(parcel);
                break;
            case 8:
                BinderC2361b.h1(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                F5.b(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Et
    public final void w2(byte[] bArr) {
    }

    @Override // com.google.android.gms.internal.ads.Et
    public final void k0() {
    }

    @Override // com.google.android.gms.internal.ads.Et
    public final void y2(BinderC2361b binderC2361b, String str) {
    }
}
