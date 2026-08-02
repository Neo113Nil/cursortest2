package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzau implements Parcelable.Creator<UserProfileChangeRequest> {
    @Override // android.os.Parcelable.Creator
    public final UserProfileChangeRequest createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        String str = null;
        boolean z2 = false;
        boolean z3 = false;
        String str2 = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = b.g(parcel, readInt);
            } else if (c == 3) {
                str2 = b.g(parcel, readInt);
            } else if (c == 4) {
                z2 = b.m(parcel, readInt);
            } else if (c != 5) {
                b.y(parcel, readInt);
            } else {
                z3 = b.m(parcel, readInt);
            }
        }
        b.l(parcel, z);
        return new UserProfileChangeRequest(str, str2, z2, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ UserProfileChangeRequest[] newArray(int i) {
        return new UserProfileChangeRequest[i];
    }
}
