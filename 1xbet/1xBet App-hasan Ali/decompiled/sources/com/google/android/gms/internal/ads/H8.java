package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import s3.InterfaceC2360a;

/* loaded from: classes.dex */
public final class H8 extends D5 implements I8 {
    public H8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage", 0);
    }

    @Override // com.google.android.gms.internal.ads.I8
    public final Uri b() {
        Parcel Y4 = Y(N(), 2);
        Uri uri = (Uri) F5.a(Y4, Uri.CREATOR);
        Y4.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.I8
    public final InterfaceC2360a c() {
        return L1.a.q(Y(N(), 1));
    }

    @Override // com.google.android.gms.internal.ads.I8
    public final double d() {
        Parcel Y4 = Y(N(), 3);
        double readDouble = Y4.readDouble();
        Y4.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.I8
    public final int i() {
        Parcel Y4 = Y(N(), 5);
        int readInt = Y4.readInt();
        Y4.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.I8
    public final int j() {
        Parcel Y4 = Y(N(), 4);
        int readInt = Y4.readInt();
        Y4.recycle();
        return readInt;
    }
}
