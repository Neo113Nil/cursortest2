package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new E(8);

    /* renamed from: a, reason: collision with root package name */
    public final String f11051a;

    /* renamed from: b, reason: collision with root package name */
    public final GoogleSignInOptions f11052b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        D.e(str);
        this.f11051a = str;
        this.f11052b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f11051a.equals(signInConfiguration.f11051a)) {
            GoogleSignInOptions googleSignInOptions = signInConfiguration.f11052b;
            GoogleSignInOptions googleSignInOptions2 = this.f11052b;
            if (googleSignInOptions2 == null) {
                if (googleSignInOptions == null) {
                    return true;
                }
            } else if (googleSignInOptions2.equals(googleSignInOptions)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = 31 * 1;
        String str = this.f11051a;
        int hashCode = 31 * (i7 + (str == null ? 0 : str.hashCode()));
        GoogleSignInOptions googleSignInOptions = this.f11052b;
        return hashCode + (googleSignInOptions != null ? googleSignInOptions.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        Y4.D.s0(parcel, 2, this.f11051a, false);
        Y4.D.r0(parcel, 5, this.f11052b, i7, false);
        Y4.D.z0(x02, parcel);
    }
}
