package com.google.firebase.auth;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;

/* loaded from: classes2.dex */
public class GoogleAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<GoogleAuthCredential> CREATOR = new E(11);

    /* renamed from: a, reason: collision with root package name */
    public final String f11875a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11876b;

    public GoogleAuthCredential(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        }
        if (str2 != null && str2.length() == 0) {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
        this.f11875a = str;
        this.f11876b = str2;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String j() {
        return "google.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String k() {
        return "google.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential m() {
        return new GoogleAuthCredential(this.f11875a, this.f11876b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        D.s0(parcel, 1, this.f11875a, false);
        D.s0(parcel, 2, this.f11876b, false);
        D.z0(x02, parcel);
    }
}
