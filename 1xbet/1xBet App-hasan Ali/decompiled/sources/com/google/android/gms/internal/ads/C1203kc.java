package com.google.android.gms.internal.ads;

import T2.C0438p;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.kc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1203kc extends D5 implements InterfaceC1293mc {
    public C1203kc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener", 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1293mc
    public final void C2(C0438p c0438p) {
        Parcel N5 = N();
        F5.c(N5, c0438p);
        d1(N5, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1293mc
    public final void M2(ParcelFileDescriptor parcelFileDescriptor, C1428pc c1428pc) {
        Parcel N5 = N();
        F5.c(N5, parcelFileDescriptor);
        F5.c(N5, c1428pc);
        d1(N5, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1293mc
    public final void h0(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel N5 = N();
        F5.c(N5, parcelFileDescriptor);
        d1(N5, 1);
    }
}
