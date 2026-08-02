package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzj implements Parcelable.Creator<PatternItem> {
    @Override // android.os.Parcelable.Creator
    public final PatternItem createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        int i = 0;
        Float f = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = b.t(parcel, readInt);
            } else if (c != 3) {
                b.y(parcel, readInt);
            } else {
                f = b.r(parcel, readInt);
            }
        }
        b.l(parcel, z);
        return new PatternItem(i, f);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PatternItem[] newArray(int i) {
        return new PatternItem[i];
    }
}
