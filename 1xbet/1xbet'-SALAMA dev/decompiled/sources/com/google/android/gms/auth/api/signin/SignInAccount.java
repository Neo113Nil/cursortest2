package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p025d3.d;

/* JADX INFO: loaded from: classes.dex */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new d(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GoogleSignInAccount f11046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11047c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f11046b = googleSignInAccount;
        D.f(str, "8.3 and 8.4 SDKs require non-null email");
        this.f11045a = str;
        D.f(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.f11047c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.s0(parcel, 4, this.f11045a, false);
        Y4.D.r0(parcel, 7, this.f11046b, i7, false);
        Y4.D.s0(parcel, 8, this.f11047c, false);
        Y4.D.z0(iX0, parcel);
    }
}
