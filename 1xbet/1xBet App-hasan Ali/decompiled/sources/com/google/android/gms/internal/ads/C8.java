package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class C8 extends D5 implements E8 {
    public C8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo", 0);
    }

    @Override // com.google.android.gms.internal.ads.E8
    public final String f() {
        Parcel Y4 = Y(N(), 2);
        String readString = Y4.readString();
        Y4.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.E8
    public final ArrayList g() {
        Parcel Y4 = Y(N(), 3);
        ArrayList readArrayList = Y4.readArrayList(F5.f8654a);
        Y4.recycle();
        return readArrayList;
    }
}
