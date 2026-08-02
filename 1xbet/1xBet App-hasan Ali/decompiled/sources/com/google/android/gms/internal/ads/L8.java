package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* loaded from: classes.dex */
public abstract class L8 extends E5 implements N8 {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f10326k = 0;

    public L8() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        G8 f8;
        switch (i) {
            case 1:
                String readString = parcel.readString();
                InterfaceC2360a h1 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                I1(readString, h1);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString2 = parcel.readString();
                F5.b(parcel);
                InterfaceC2360a E5 = E(readString2);
                parcel2.writeNoException();
                F5.e(parcel2, E5);
                return true;
            case 3:
                InterfaceC2360a h12 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                d2(h12);
                parcel2.writeNoException();
                return true;
            case 4:
                p();
                parcel2.writeNoException();
                return true;
            case 5:
                BinderC2361b.h1(parcel.readStrongBinder());
                parcel.readInt();
                F5.b(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                InterfaceC2360a h13 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                L2(h13);
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC2360a h14 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                i0(h14);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    f8 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    f8 = queryLocalInterface instanceof G8 ? (G8) queryLocalInterface : new F8(readStrongBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent", 0);
                }
                F5.b(parcel);
                K0(f8);
                parcel2.writeNoException();
                return true;
            case 9:
                InterfaceC2360a h15 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                g1(h15);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
