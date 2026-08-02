package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzbth implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int a02 = Q0.a.a0(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < a02) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                iBinder = Q0.a.M(readInt, parcel);
            } else if (c3 != 2) {
                Q0.a.X(readInt, parcel);
            } else {
                iBinder2 = Q0.a.M(readInt, parcel);
            }
        }
        Q0.a.y(a02, parcel);
        return new zzbtg(iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbtg[i7];
    }
}
