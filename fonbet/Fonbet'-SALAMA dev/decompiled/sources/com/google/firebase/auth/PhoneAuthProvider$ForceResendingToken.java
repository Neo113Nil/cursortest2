package com.google.firebase.auth;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public class PhoneAuthProvider$ForceResendingToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PhoneAuthProvider$ForceResendingToken> CREATOR = new E(19);

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        D.z0(D.x0(20293, parcel), parcel);
    }
}
