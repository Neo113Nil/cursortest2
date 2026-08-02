package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public class SignInPassword extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInPassword> CREATOR = new Z2.a(14);

    /* renamed from: a, reason: collision with root package name */
    public final String f11003a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11004b;

    public SignInPassword(String str, String str2) {
        D.j(str, "Account identifier cannot be null");
        String trim = str.trim();
        D.f(trim, "Account identifier cannot be empty");
        this.f11003a = trim;
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
        int x02 = Y4.D.x0(20293, parcel);
        Y4.D.s0(parcel, 1, this.f11003a, false);
        Y4.D.s0(parcel, 2, this.f11004b, false);
        Y4.D.z0(x02, parcel);
    }
}
