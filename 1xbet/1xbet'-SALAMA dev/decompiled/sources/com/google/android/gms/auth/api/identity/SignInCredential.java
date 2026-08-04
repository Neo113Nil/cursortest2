package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class SignInCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInCredential> CREATOR = new Z2.a(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Uri f10998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f10999f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f11000x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f11001y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final PublicKeyCredential f11002z;

    public SignInCredential(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, PublicKeyCredential publicKeyCredential) {
        D.e(str);
        this.f10994a = str;
        this.f10995b = str2;
        this.f10996c = str3;
        this.f10997d = str4;
        this.f10998e = uri;
        this.f10999f = str5;
        this.f11000x = str6;
        this.f11001y = str7;
        this.f11002z = publicKeyCredential;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        return D.m(this.f10994a, signInCredential.f10994a) && D.m(this.f10995b, signInCredential.f10995b) && D.m(this.f10996c, signInCredential.f10996c) && D.m(this.f10997d, signInCredential.f10997d) && D.m(this.f10998e, signInCredential.f10998e) && D.m(this.f10999f, signInCredential.f10999f) && D.m(this.f11000x, signInCredential.f11000x) && D.m(this.f11001y, signInCredential.f11001y) && D.m(this.f11002z, signInCredential.f11002z);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10994a, this.f10995b, this.f10996c, this.f10997d, this.f10998e, this.f10999f, this.f11000x, this.f11001y, this.f11002z});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.s0(parcel, 1, this.f10994a, false);
        Y4.D.s0(parcel, 2, this.f10995b, false);
        Y4.D.s0(parcel, 3, this.f10996c, false);
        Y4.D.s0(parcel, 4, this.f10997d, false);
        Y4.D.r0(parcel, 5, this.f10998e, i7, false);
        Y4.D.s0(parcel, 6, this.f10999f, false);
        Y4.D.s0(parcel, 7, this.f11000x, false);
        Y4.D.s0(parcel, 8, this.f11001y, false);
        Y4.D.r0(parcel, 9, this.f11002z, i7, false);
        Y4.D.z0(iX0, parcel);
    }
}
