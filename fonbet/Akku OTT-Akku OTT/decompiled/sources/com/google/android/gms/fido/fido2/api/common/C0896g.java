package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import com.google.android.gms.internal.fido.zzgf;
import com.google.android.gms.internal.fido.zzgx;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.fido.fido2.api.common.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0896g extends AbstractC0902j {

    @NonNull
    public static final Parcelable.Creator<C0896g> CREATOR = new x0();

    @NonNull
    public final zzgx a;

    @NonNull
    public final zzgx b;

    @NonNull
    public final zzgx c;

    @NonNull
    public final zzgx d;

    @Nullable
    public final zzgx e;

    public C0896g(@NonNull byte[] bArr, @NonNull byte[] bArr2, @NonNull byte[] bArr3, @NonNull byte[] bArr4, @Nullable byte[] bArr5) {
        C0875q.g(bArr);
        zzgx zzl = zzgx.zzl(bArr, 0, bArr.length);
        C0875q.g(bArr2);
        zzgx zzl2 = zzgx.zzl(bArr2, 0, bArr2.length);
        C0875q.g(bArr3);
        zzgx zzl3 = zzgx.zzl(bArr3, 0, bArr3.length);
        C0875q.g(bArr4);
        zzgx zzl4 = zzgx.zzl(bArr4, 0, bArr4.length);
        zzgx zzl5 = bArr5 == null ? null : zzgx.zzl(bArr5, 0, bArr5.length);
        C0875q.g(zzl);
        this.a = zzl;
        C0875q.g(zzl2);
        this.b = zzl2;
        C0875q.g(zzl3);
        this.c = zzl3;
        C0875q.g(zzl4);
        this.d = zzl4;
        this.e = zzl5;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C0896g)) {
            return false;
        }
        C0896g c0896g = (C0896g) obj;
        return C0874p.a(this.a, c0896g.a) && C0874p.a(this.b, c0896g.b) && C0874p.a(this.c, c0896g.c) && C0874p.a(this.d, c0896g.d) && C0874p.a(this.e, c0896g.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.e}))});
    }

    @NonNull
    public final JSONObject l() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", Base64Utils.encodeUrlSafeNoPadding(this.b.zzm()));
            jSONObject.put("authenticatorData", Base64Utils.encodeUrlSafeNoPadding(this.c.zzm()));
            jSONObject.put("signature", Base64Utils.encodeUrlSafeNoPadding(this.d.zzm()));
            zzgx zzgxVar = this.e;
            if (zzgxVar == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", Base64Utils.encodeUrlSafeNoPadding(zzgxVar == null ? null : zzgxVar.zzm()));
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e);
        }
    }

    @NonNull
    public final String toString() {
        zzbi zza = zzbj.zza(this);
        zzgf zzf = zzgf.zzf();
        byte[] zzm = this.a.zzm();
        zza.zzb("keyHandle", zzf.zzg(zzm, 0, zzm.length));
        zzgf zzf2 = zzgf.zzf();
        byte[] zzm2 = this.b.zzm();
        zza.zzb("clientDataJSON", zzf2.zzg(zzm2, 0, zzm2.length));
        zzgf zzf3 = zzgf.zzf();
        byte[] zzm3 = this.c.zzm();
        zza.zzb("authenticatorData", zzf3.zzg(zzm3, 0, zzm3.length));
        zzgf zzf4 = zzgf.zzf();
        byte[] zzm4 = this.d.zzm();
        zza.zzb("signature", zzf4.zzg(zzm4, 0, zzm4.length));
        zzgx zzgxVar = this.e;
        byte[] zzm5 = zzgxVar == null ? null : zzgxVar.zzm();
        if (zzm5 != null) {
            zza.zzb("userHandle", zzgf.zzf().zzg(zzm5, 0, zzm5.length));
        }
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.c(parcel, 2, this.a.zzm(), false);
        com.google.android.gms.common.internal.safeparcel.c.c(parcel, 3, this.b.zzm(), false);
        com.google.android.gms.common.internal.safeparcel.c.c(parcel, 4, this.c.zzm(), false);
        com.google.android.gms.common.internal.safeparcel.c.c(parcel, 5, this.d.zzm(), false);
        zzgx zzgxVar = this.e;
        com.google.android.gms.common.internal.safeparcel.c.c(parcel, 6, zzgxVar == null ? null : zzgxVar.zzm(), false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
