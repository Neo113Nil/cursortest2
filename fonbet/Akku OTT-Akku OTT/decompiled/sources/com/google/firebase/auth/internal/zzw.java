package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzw implements Parcelable.Creator<zzx> {
    @Override // android.os.Parcelable.Creator
    public final zzx createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        String str = null;
        boolean z2 = false;
        String str2 = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = b.g(parcel, readInt);
            } else if (c == 2) {
                str2 = b.g(parcel, readInt);
            } else if (c != 3) {
                b.y(parcel, readInt);
            } else {
                z2 = b.m(parcel, readInt);
            }
        }
        b.l(parcel, z);
        return new zzx(str, str2, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzx[] newArray(int i) {
        return new zzx[i];
    }
}
