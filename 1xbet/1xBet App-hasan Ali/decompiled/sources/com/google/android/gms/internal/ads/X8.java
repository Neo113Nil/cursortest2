package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class X8 extends D5 implements Y8 {
    @Override // com.google.android.gms.internal.ads.Y8
    public final void q3(U8 u8, String str) {
        Parcel N5 = N();
        F5.e(N5, u8);
        N5.writeString(str);
        d1(N5, 1);
    }
}
