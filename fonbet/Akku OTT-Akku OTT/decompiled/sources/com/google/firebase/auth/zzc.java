package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.firebase.auth.PhoneAuthProvider;

/* loaded from: classes4.dex */
public final class zzc implements Parcelable.Creator<PhoneAuthProvider.ForceResendingToken> {
    @Override // android.os.Parcelable.Creator
    public final PhoneAuthProvider.ForceResendingToken createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        while (parcel.dataPosition() < z) {
            b.y(parcel, parcel.readInt());
        }
        b.l(parcel, z);
        return new PhoneAuthProvider.ForceResendingToken();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PhoneAuthProvider.ForceResendingToken[] newArray(int i) {
        return new PhoneAuthProvider.ForceResendingToken[i];
    }
}
