package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzm implements Parcelable.Creator<zzl> {
    @Override // android.os.Parcelable.Creator
    public final zzl createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        zzj zzjVar = null;
        int i = 1;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = b.t(parcel, readInt);
            } else if (c == 2) {
                zzjVar = (zzj) b.f(parcel, readInt, zzj.CREATOR);
            } else if (c == 3) {
                iBinder = b.s(parcel, readInt);
            } else if (c != 4) {
                b.y(parcel, readInt);
            } else {
                iBinder2 = b.s(parcel, readInt);
            }
        }
        b.l(parcel, z);
        return new zzl(i, zzjVar, iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzl[] newArray(int i) {
        return new zzl[i];
    }
}
