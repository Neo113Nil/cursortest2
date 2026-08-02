package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Ec, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0583Ec extends D5 implements InterfaceC0591Fc {
    public C0583Ec(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem", 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0591Fc
    public final int b() {
        Parcel Y4 = Y(N(), 2);
        int readInt = Y4.readInt();
        Y4.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0591Fc
    public final String c() {
        Parcel Y4 = Y(N(), 1);
        String readString = Y4.readString();
        Y4.recycle();
        return readString;
    }
}
