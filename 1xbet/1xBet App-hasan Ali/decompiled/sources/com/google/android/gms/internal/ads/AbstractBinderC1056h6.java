package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.h6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1056h6 extends E5 implements InterfaceC1101i6 {
    public AbstractBinderC1056h6() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC0966f6 c0921e6;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                c0921e6 = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                c0921e6 = queryLocalInterface instanceof InterfaceC0966f6 ? (InterfaceC0966f6) queryLocalInterface : new C0921e6(readStrongBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd", 0);
            }
            F5.b(parcel);
            n0(c0921e6);
        } else if (i == 2) {
            parcel.readInt();
            F5.b(parcel);
        } else {
            if (i != 3) {
                return false;
            }
            C0387u0 c0387u0 = (C0387u0) F5.a(parcel, C0387u0.CREATOR);
            F5.b(parcel);
            e2(c0387u0);
        }
        parcel2.writeNoException();
        return true;
    }
}
