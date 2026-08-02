package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new Z2.a(27);

    /* renamed from: a, reason: collision with root package name */
    public final int f11340a;

    /* renamed from: b, reason: collision with root package name */
    public final Account f11341b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11342c;

    /* renamed from: d, reason: collision with root package name */
    public final GoogleSignInAccount f11343d;

    public zat(int i7, Account account, int i8, GoogleSignInAccount googleSignInAccount) {
        this.f11340a = i7;
        this.f11341b = account;
        this.f11342c = i8;
        this.f11343d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        Y4.D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11340a);
        Y4.D.r0(parcel, 2, this.f11341b, i7, false);
        Y4.D.B0(parcel, 3, 4);
        parcel.writeInt(this.f11342c);
        Y4.D.r0(parcel, 4, this.f11343d, i7, false);
        Y4.D.z0(x02, parcel);
    }
}
