package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class SignInPassword extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInPassword> CREATOR = new Z2.a(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11004b;

    public SignInPassword(String str, String str2) {
        D.j(str, "Account identifier cannot be null");
        String strTrim = str.trim();
        D.f(strTrim, "Account identifier cannot be empty");
        this.f11003a = strTrim;
        D.e(str2);
        this.f11004b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInPassword)) {
            return false;
        }
        SignInPassword signInPassword = (SignInPassword) obj;
        return D.m(this.f11003a, signInPassword.f11003a) && D.m(this.f11004b, signInPassword.f11004b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11003a, this.f11004b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.s0(parcel, 1, this.f11003a, false);
        Y4.D.s0(parcel, 2, this.f11004b, false);
        Y4.D.z0(iX0, parcel);
    }
}
