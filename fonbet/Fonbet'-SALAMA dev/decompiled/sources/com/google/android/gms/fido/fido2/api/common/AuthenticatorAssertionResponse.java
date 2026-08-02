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
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAssertionResponse> CREATOR = new l(1);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f11425a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f11426b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f11427c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f11428d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f11429e;

    public AuthenticatorAssertionResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        D.i(bArr);
        this.f11425a = bArr;
        D.i(bArr2);
        this.f11426b = bArr2;
        D.i(bArr3);
        this.f11427c = bArr3;
        D.i(bArr4);
        this.f11428d = bArr4;
        this.f11429e = bArr5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
        return Arrays.equals(this.f11425a, authenticatorAssertionResponse.f11425a) && Arrays.equals(this.f11426b, authenticatorAssertionResponse.f11426b) && Arrays.equals(this.f11427c, authenticatorAssertionResponse.f11427c) && Arrays.equals(this.f11428d, authenticatorAssertionResponse.f11428d) && Arrays.equals(this.f11429e, authenticatorAssertionResponse.f11429e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f11425a)), Integer.valueOf(Arrays.hashCode(this.f11426b)), Integer.valueOf(Arrays.hashCode(this.f11427c)), Integer.valueOf(Arrays.hashCode(this.f11428d)), Integer.valueOf(Arrays.hashCode(this.f11429e))});
    }

    public final String toString() {
        zzam zza = zzan.zza(this);
        zzch zzf = zzch.zzf();
        byte[] bArr = this.f11425a;
        zza.zzb("keyHandle", zzf.zzg(bArr, 0, bArr.length));
        zzch zzf2 = zzch.zzf();
        byte[] bArr2 = this.f11426b;
        zza.zzb("clientDataJSON", zzf2.zzg(bArr2, 0, bArr2.length));
        zzch zzf3 = zzch.zzf();
        byte[] bArr3 = this.f11427c;
        zza.zzb("authenticatorData", zzf3.zzg(bArr3, 0, bArr3.length));
        zzch zzf4 = zzch.zzf();
        byte[] bArr4 = this.f11428d;
        zza.zzb("signature", zzf4.zzg(bArr4, 0, bArr4.length));
        byte[] bArr5 = this.f11429e;
        if (bArr5 != null) {
            zza.zzb("userHandle", zzch.zzf().zzg(bArr5, 0, bArr5.length));
        }
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        Y4.D.l0(parcel, 2, this.f11425a, false);
        Y4.D.l0(parcel, 3, this.f11426b, false);
        Y4.D.l0(parcel, 4, this.f11427c, false);
        Y4.D.l0(parcel, 5, this.f11428d, false);
        Y4.D.l0(parcel, 6, this.f11429e, false);
        Y4.D.z0(x02, parcel);
    }
}
