package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import com.google.android.gms.internal.fido.zzgf;
import com.google.android.gms.internal.fido.zzgj;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzhj;
import com.google.android.gms.internal.fido.zzhm;
import com.google.android.gms.internal.fido.zzho;
import com.google.android.gms.internal.fido.zzhp;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.fido.fido2.api.common.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0898h extends AbstractC0902j {

    @NonNull
    public static final Parcelable.Creator<C0898h> CREATOR = new y0();

    @NonNull
    public final zzgx a;

    @NonNull
    public final zzgx b;

    @NonNull
    public final zzgx c;

    @NonNull
    public final String[] d;

    public C0898h(@NonNull byte[] bArr, @NonNull byte[] bArr2, @NonNull byte[] bArr3, @NonNull String[] strArr) {
        C0875q.g(bArr);
        zzgx zzl = zzgx.zzl(bArr, 0, bArr.length);
        C0875q.g(bArr2);
        zzgx zzl2 = zzgx.zzl(bArr2, 0, bArr2.length);
        C0875q.g(bArr3);
        zzgx zzl3 = zzgx.zzl(bArr3, 0, bArr3.length);
        C0875q.g(zzl);
        this.a = zzl;
        C0875q.g(zzl2);
        this.b = zzl2;
        C0875q.g(zzl3);
        this.c = zzl3;
        C0875q.g(strArr);
        this.d = strArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C0898h)) {
            return false;
        }
        C0898h c0898h = (C0898h) obj;
        return C0874p.a(this.a, c0898h.a) && C0874p.a(this.b, c0898h.b) && C0874p.a(this.c, c0898h.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c}))});
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01f2 A[Catch: JSONException -> 0x001b, TRY_LEAVE, TryCatch #5 {JSONException -> 0x001b, blocks: (B:3:0x0004, B:5:0x000d, B:8:0x0022, B:9:0x002f, B:10:0x0036, B:12:0x0039, B:14:0x0043, B:16:0x004e, B:17:0x0049, B:20:0x0051, B:22:0x005a, B:24:0x0062, B:26:0x0074, B:27:0x007c, B:29:0x0080, B:31:0x0092, B:33:0x00b0, B:34:0x00c8, B:39:0x00ee, B:45:0x01de, B:47:0x01f2, B:50:0x010d, B:52:0x011f, B:57:0x0133, B:60:0x0155, B:62:0x016b, B:64:0x0171, B:65:0x018b, B:66:0x0190, B:67:0x0191, B:68:0x0196, B:73:0x01a1, B:75:0x01b1, B:77:0x01bf, B:78:0x01d2, B:79:0x01d7, B:80:0x01d8, B:81:0x01dd, B:82:0x01fc, B:83:0x0201, B:86:0x0202, B:87:0x0209, B:88:0x020a, B:89:0x020f, B:93:0x0213, B:94:0x021a, B:96:0x021d, B:97:0x0224, B:99:0x0225, B:100:0x022c, B:101:0x022f, B:102:0x0236, B:104:0x0237, B:105:0x023e, B:109:0x0242, B:110:0x0249), top: B:2:0x0004, inners: #2, #3, #4 }] */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject l() {
        byte[] zza;
        String[] strArr = this.d;
        try {
            JSONObject jSONObject = new JSONObject();
            zzgx zzgxVar = this.b;
            if (zzgxVar != null) {
                jSONObject.put("clientDataJSON", Base64Utils.encodeUrlSafeNoPadding(zzgxVar.zzm()));
            }
            zzgx zzgxVar2 = this.c;
            if (zzgxVar2 != null) {
                jSONObject.put("attestationObject", Base64Utils.encodeUrlSafeNoPadding(zzgxVar2.zzm()));
            }
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < strArr.length; i++) {
                if (strArr[i].equals("cable")) {
                    jSONArray.put(i, "hybrid");
                } else {
                    jSONArray.put(i, strArr[i]);
                }
            }
            jSONObject.put("transports", jSONArray);
            try {
                try {
                    zzhp zzhpVar = (zzhp) zzhp.zzj(zzgxVar2.zzm()).zzh().zzc().get(zzhp.zzi("authData"));
                    if (zzhpVar == null) {
                        throw new IllegalArgumentException("attestation object missing authData");
                    }
                    zzgx zzc = zzhpVar.zze().zzc();
                    ByteBuffer zzi = zzc.zzi();
                    try {
                        zzi.position(zzi.position() + 32);
                        if ((zzi.get() & 64) == 0) {
                            throw new IllegalArgumentException("authData does not include credential data");
                        }
                        zzi.position(zzi.position() + 4);
                        zzi.position(zzi.position() + 16);
                        zzi.position(zzi.position() + zzi.getShort());
                        try {
                            zzhm zzh = zzhp.zzk(zzc.zzg(zzi.position(), zzc.zzd()).zzh()).zzh();
                            zzhp zzhpVar2 = (zzhp) zzh.zzc().get(zzhp.zzg(3L));
                            zzhp zzhpVar3 = (zzhp) zzh.zzc().get(zzhp.zzg(1L));
                            if (zzhpVar2 == null || zzhpVar3 == null) {
                                throw new IllegalArgumentException("COSE key missing required fields");
                            }
                            try {
                                long zzc2 = zzhpVar2.zzf().zzc();
                                long zzc3 = zzhpVar3.zzf().zzc();
                                if (zzc3 != 1) {
                                    if (zzc3 == 2) {
                                        zzc3 = 2;
                                    }
                                    zza = null;
                                    jSONObject.put("authenticatorData", Base64Utils.encodeUrlSafeNoPadding(zzc.zzm()));
                                    jSONObject.put("publicKeyAlgorithm", zzc2);
                                    if (zza != null) {
                                        jSONObject.put("publicKey", Base64Utils.encodeUrlSafeNoPadding(zza));
                                    }
                                    return jSONObject;
                                }
                                zzhp zzhpVar4 = (zzhp) zzh.zzc().get(zzhp.zzg(-1L));
                                if (zzhpVar4 == null) {
                                    throw new IllegalArgumentException("COSE key missing required fields");
                                }
                                long zzc4 = zzhpVar4.zzf().zzc();
                                if (zzc3 == 2 && zzc4 == 1) {
                                    zzhp zzhpVar5 = (zzhp) zzh.zzc().get(zzhp.zzg(-2L));
                                    zzhp zzhpVar6 = (zzhp) zzh.zzc().get(zzhp.zzg(-3L));
                                    if (zzhpVar5 == null || zzhpVar6 == null) {
                                        throw new IllegalArgumentException("COSE key missing required fields");
                                    }
                                    zzgx zzc5 = zzhpVar5.zze().zzc();
                                    zzgx zzc6 = zzhpVar6.zze().zzc();
                                    if (zzc5.zzd() != 32 || zzc6.zzd() != 32) {
                                        throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                    }
                                    zza = zzgj.zza(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), zzc5.zzm(), zzc6.zzm());
                                } else {
                                    if (zzc3 == 1 && zzc4 == 6) {
                                        zzhp zzhpVar7 = (zzhp) zzh.zzc().get(zzhp.zzg(-2L));
                                        if (zzhpVar7 == null) {
                                            throw new IllegalArgumentException("COSE key missing required fields");
                                        }
                                        zzgx zzc7 = zzhpVar7.zze().zzc();
                                        if (zzc7.zzd() != 32) {
                                            throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                        }
                                        zza = zzgj.zza(Base64.decode("MCowBQYDK2VwAyEA", 0), zzc7.zzm());
                                    }
                                    zza = null;
                                }
                                jSONObject.put("authenticatorData", Base64Utils.encodeUrlSafeNoPadding(zzc.zzm()));
                                jSONObject.put("publicKeyAlgorithm", zzc2);
                                if (zza != null) {
                                }
                                return jSONObject;
                            } catch (zzho e) {
                                throw new IllegalArgumentException("COSE key ill-formed", e);
                            }
                        } catch (zzhj e2) {
                            e = e2;
                            throw new IllegalArgumentException("failed to parse COSE key", e);
                        } catch (zzho e3) {
                            e = e3;
                            throw new IllegalArgumentException("failed to parse COSE key", e);
                        }
                    } catch (IllegalArgumentException e4) {
                        throw new IllegalArgumentException("ill-formed authenticator data", e4);
                    }
                } catch (zzho e5) {
                    throw new IllegalArgumentException("authData value has wrong type", e5);
                }
            } catch (zzhj e6) {
                e = e6;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            } catch (zzho e7) {
                e = e7;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            }
        } catch (JSONException e8) {
            throw new RuntimeException("Error encoding AuthenticatorAttestationResponse to JSON object", e8);
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
        zza.zzb("attestationObject", zzf3.zzg(zzm3, 0, zzm3.length));
        zza.zzb("transports", Arrays.toString(this.d));
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.c(parcel, 2, this.a.zzm(), false);
        com.google.android.gms.common.internal.safeparcel.c.c(parcel, 3, this.b.zzm(), false);
        com.google.android.gms.common.internal.safeparcel.c.c(parcel, 4, this.c.zzm(), false);
        com.google.android.gms.common.internal.safeparcel.c.m(parcel, 5, this.d, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
