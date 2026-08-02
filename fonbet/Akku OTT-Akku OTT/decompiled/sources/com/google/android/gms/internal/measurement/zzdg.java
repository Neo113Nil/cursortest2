package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzdg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        String str = null;
        int i = 0;
        Intent intent = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = b.t(parcel, readInt);
            } else if (c == 2) {
                str = b.g(parcel, readInt);
            } else if (c != 3) {
                b.y(parcel, readInt);
            } else {
                intent = (Intent) b.f(parcel, readInt, Intent.CREATOR);
            }
        }
        b.l(parcel, z);
        return new zzdf(i, str, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdf[i];
    }
}
