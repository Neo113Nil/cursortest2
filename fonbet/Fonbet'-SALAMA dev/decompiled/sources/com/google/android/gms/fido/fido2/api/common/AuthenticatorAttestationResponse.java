package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import com.google.android.gms.internal.fido.zzch;
import java.util.Arrays;
import t3.l;

/* loaded from: classes.dex */
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = new l(2);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f11430a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f11431b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f11432c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f11433d;

    public AuthenticatorAttestationResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        D.i(bArr);
        this.f11430a = bArr;
        D.i(bArr2);
        this.f11431b = bArr2;
        D.i(bArr3);
        this.f11432c = bArr3;
        D.i(strArr);
        this.f11433d = strArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        return Arrays.equals(this.f11430a, authenticatorAttestationResponse.f11430a) && Arrays.equals(this.f11431b, authenticatorAttestationResponse.f11431b) && Arrays.equals(this.f11432c, authenticatorAttestationResponse.f11432c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f11430a)), Integer.valueOf(Arrays.hashCode(this.f11431b)), Integer.valueOf(Arrays.hashCode(this.f11432c))});
    }

    public final String toString() {
        zzam zza = zzan.zza(this);
        zzch zzf = zzch.zzf();
        byte[] bArr = this.f11430a;
        zza.zzb("keyHandle", zzf.zzg(bArr, 0, bArr.length));
        zzch zzf2 = zzch.zzf();
        byte[] bArr2 = this.f11431b;
        zza.zzb("clientDataJSON", zzf2.zzg(bArr2, 0, bArr2.length));
        zzch zzf3 = zzch.zzf();
        byte[] bArr3 = this.f11432c;
        zza.zzb("attestationObject", zzf3.zzg(bArr3, 0, bArr3.length));
        zza.zzb("transports", Arrays.toString(this.f11433d));
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        Y4.D.l0(parcel, 2, this.f11430a, false);
        Y4.D.l0(parcel, 3, this.f11431b, false);
        Y4.D.l0(parcel, 4, this.f11432c, false);
        Y4.D.t0(parcel, 5, this.f11433d, false);
        Y4.D.z0(x02, parcel);
    }
}
