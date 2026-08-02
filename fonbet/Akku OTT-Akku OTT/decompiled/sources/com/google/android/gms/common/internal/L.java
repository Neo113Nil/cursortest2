package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes4.dex */
public final class L implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        Account account = null;
        int i = 0;
        int i2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
            } else if (c == 2) {
                account = (Account) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, Account.CREATOR);
            } else if (c == 3) {
                i2 = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
            } else if (c != 4) {
                com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
            } else {
                googleSignInAccount = (GoogleSignInAccount) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, GoogleSignInAccount.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new K(i, account, i2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new K[i];
    }
}
