package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes4.dex */
public final class G implements Parcelable.Creator<C0931j> {
    @Override // android.os.Parcelable.Creator
    public final C0931j createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        Status status = null;
        C0932k c0932k = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                status = (Status) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, Status.CREATOR);
            } else if (c != 2) {
                com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
            } else {
                c0932k = (C0932k) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, C0932k.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new C0931j(status, c0932k);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C0931j[] newArray(int i) {
        return new C0931j[i];
    }
}
