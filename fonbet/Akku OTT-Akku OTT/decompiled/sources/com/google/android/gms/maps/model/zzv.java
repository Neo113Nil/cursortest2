package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzv implements Parcelable.Creator<TileOverlayOptions> {
    @Override // android.os.Parcelable.Creator
    public final TileOverlayOptions createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        IBinder iBinder = null;
        boolean z2 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z3 = true;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                iBinder = b.s(parcel, readInt);
            } else if (c == 3) {
                z2 = b.m(parcel, readInt);
            } else if (c == 4) {
                f = b.q(parcel, readInt);
            } else if (c == 5) {
                z3 = b.m(parcel, readInt);
            } else if (c != 6) {
                b.y(parcel, readInt);
            } else {
                f2 = b.q(parcel, readInt);
            }
        }
        b.l(parcel, z);
        return new TileOverlayOptions(iBinder, z2, f, z3, f2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TileOverlayOptions[] newArray(int i) {
        return new TileOverlayOptions[i];
    }
}
