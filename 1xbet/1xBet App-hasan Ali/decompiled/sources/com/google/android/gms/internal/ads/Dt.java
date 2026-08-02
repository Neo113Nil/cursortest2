package com.google.android.gms.internal.ads;

import android.os.Parcel;
import s3.BinderC2361b;

/* loaded from: classes.dex */
public final class Dt extends D5 implements Et {
    @Override // com.google.android.gms.internal.ads.Et
    public final void B(int i) {
        Parcel N5 = N();
        N5.writeInt(i);
        d1(N5, 7);
    }

    @Override // com.google.android.gms.internal.ads.Et
    public final void H0(int i) {
        Parcel N5 = N();
        N5.writeInt(i);
        d1(N5, 6);
    }

    @Override // com.google.android.gms.internal.ads.Et
    public final void c() {
        d1(N(), 3);
    }

    @Override // com.google.android.gms.internal.ads.Et
    public final void k0() {
        Parcel N5 = N();
        N5.writeIntArray(null);
        d1(N5, 4);
    }

    @Override // com.google.android.gms.internal.ads.Et
    public final void w2(byte[] bArr) {
        Parcel N5 = N();
        N5.writeByteArray(bArr);
        d1(N5, 5);
    }

    @Override // com.google.android.gms.internal.ads.Et
    public final void y2(BinderC2361b binderC2361b, String str) {
        Parcel N5 = N();
        F5.e(N5, binderC2361b);
        N5.writeString(str);
        N5.writeString(null);
        d1(N5, 8);
    }
}
