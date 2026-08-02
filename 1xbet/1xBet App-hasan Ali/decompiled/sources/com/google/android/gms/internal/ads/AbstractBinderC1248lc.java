package com.google.android.gms.internal.ads;

import T2.C0438p;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.lc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1248lc extends E5 implements InterfaceC1293mc {
    public AbstractBinderC1248lc() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) F5.a(parcel, ParcelFileDescriptor.CREATOR);
            F5.b(parcel);
            h0(parcelFileDescriptor);
        } else if (i == 2) {
            C0438p c0438p = (C0438p) F5.a(parcel, C0438p.CREATOR);
            F5.b(parcel);
            C2(c0438p);
        } else {
            if (i != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) F5.a(parcel, ParcelFileDescriptor.CREATOR);
            C1428pc c1428pc = (C1428pc) F5.a(parcel, C1428pc.CREATOR);
            F5.b(parcel);
            M2(parcelFileDescriptor2, c1428pc);
        }
        parcel2.writeNoException();
        return true;
    }
}
