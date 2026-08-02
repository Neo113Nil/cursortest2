package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* renamed from: com.google.android.gms.internal.ads.Kb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0625Kb extends E5 implements InterfaceC0632Lb {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f10151k = 0;

    public AbstractBinderC0625Kb() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Bundle bundle = (Bundle) F5.a(parcel, Bundle.CREATOR);
                F5.b(parcel);
                z0(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel2.writeNoException();
                return true;
            case 3:
                w();
                parcel2.writeNoException();
                return true;
            case 4:
                t();
                parcel2.writeNoException();
                return true;
            case 5:
                n();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle2 = (Bundle) F5.a(parcel, Bundle.CREATOR);
                F5.b(parcel);
                Y0(bundle2);
                parcel2.writeNoException();
                F5.d(parcel2, bundle2);
                return true;
            case 7:
                u();
                parcel2.writeNoException();
                return true;
            case 8:
                l();
                parcel2.writeNoException();
                return true;
            case 9:
                v();
                parcel2.writeNoException();
                return true;
            case 10:
                e();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean n22 = n2();
                parcel2.writeNoException();
                ClassLoader classLoader = F5.f8654a;
                parcel2.writeInt(n22 ? 1 : 0);
                return true;
            case 12:
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                Intent intent = (Intent) F5.a(parcel, Intent.CREATOR);
                F5.b(parcel);
                Z1(readInt, readInt2, intent);
                parcel2.writeNoException();
                return true;
            case 13:
                InterfaceC2360a h1 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                m2(h1);
                parcel2.writeNoException();
                return true;
            case 14:
                J();
                parcel2.writeNoException();
                return true;
            case 15:
                int readInt3 = parcel.readInt();
                String[] createStringArray = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                F5.b(parcel);
                I2(readInt3, createStringArray, createIntArray);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
