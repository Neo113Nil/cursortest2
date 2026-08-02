package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes4.dex */
public final class K extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<K> CREATOR = new L();
    public final int a;
    public final Account b;
    public final int c;

    @Nullable
    public final GoogleSignInAccount d;

    public K(int i, Account account, int i2, @Nullable GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 2, this.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 4, this.d, i, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
