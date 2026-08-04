package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import java.util.Arrays;
import p140t3.f;
import p140t3.l;

/* JADX INFO: loaded from: classes.dex */
public class AuthenticatorErrorResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorErrorResponse> CREATOR = new l(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ErrorCode f11434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11436c;

    public AuthenticatorErrorResponse(int i7, String str, int i8) {
        try {
            this.f11434a = ErrorCode.a(i7);
            this.f11435b = str;
            this.f11436c = i8;
        } catch (f e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorErrorResponse)) {
            return false;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
        return D.m(this.f11434a, authenticatorErrorResponse.f11434a) && D.m(this.f11435b, authenticatorErrorResponse.f11435b) && D.m(Integer.valueOf(this.f11436c), Integer.valueOf(authenticatorErrorResponse.f11436c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11434a, this.f11435b, Integer.valueOf(this.f11436c)});
    }

    public final String toString() {
        zzam zzamVarZza = zzan.zza(this);
        zzamVarZza.zza("errorCode", this.f11434a.f11449a);
        String str = this.f11435b;
        if (str != null) {
            zzamVarZza.zzb("errorMessage", str);
        }
        return zzamVarZza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        int i8 = this.f11434a.f11449a;
        Y4.D.B0(parcel, 2, 4);
        parcel.writeInt(i8);
        Y4.D.s0(parcel, 3, this.f11435b, false);
        Y4.D.B0(parcel, 4, 4);
        parcel.writeInt(this.f11436c);
        Y4.D.z0(iX0, parcel);
    }
}
