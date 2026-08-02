package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzao implements Parcelable.Creator<PhoneAuthCredential> {
    @Override // android.os.Parcelable.Creator
    public final PhoneAuthCredential createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z2 = false;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = b.g(parcel, readInt);
            } else if (c == 2) {
                str2 = b.g(parcel, readInt);
            } else if (c == 4) {
                str3 = b.g(parcel, readInt);
            } else if (c == 5) {
                z2 = b.m(parcel, readInt);
            } else if (c != 6) {
                b.y(parcel, readInt);
            } else {
                str4 = b.g(parcel, readInt);
            }
        }
        b.l(parcel, z);
        return new PhoneAuthCredential(str, str2, str3, z2, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PhoneAuthCredential[] newArray(int i) {
        return new PhoneAuthCredential[i];
    }
}
