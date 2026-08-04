package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class zzyz implements zzci {
    private static final byte[] zza = {0};
    private final zzrq zzb;
    private final int zzc;
    private final byte[] zzd;
    private final byte[] zze;

    private zzyz(zzpq zzpqVar) {
        this.zzb = new zzyv(zzpqVar.zze().zza(zzbq.zza()));
        this.zzc = zzpqVar.zzc().zzb();
        this.zzd = zzpqVar.zzd().zzb();
        if (!zzpqVar.zzc().zze().equals(zzpx.zzb.zzc)) {
            this.zze = new byte[0];
        } else {
            byte[] bArr = zza;
            this.zze = Arrays.copyOf(bArr, bArr.length);
        }
    }

    public static zzci zza(zzpq zzpqVar) {
        return new zzyz(zzpqVar);
    }

    public static zzci zza(zzqd zzqdVar) {
        return new zzyz(zzqdVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzci
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!MessageDigest.isEqual(zza(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzci
    public final byte[] zza(byte[] bArr) {
        byte[] bArr2 = this.zze;
        if (bArr2.length > 0) {
            return zzxv.zza(this.zzd, this.zzb.zza(zzxv.zza(bArr, bArr2), this.zzc));
        }
        return zzxv.zza(this.zzd, this.zzb.zza(bArr, this.zzc));
    }

    private zzyz(zzqd zzqdVar) {
        this.zzb = new zzyx("HMAC".concat(String.valueOf(zzqdVar.zzc().zze())), new SecretKeySpec(zzqdVar.zze().zza(zzbq.zza()), "HMAC"));
        this.zzc = zzqdVar.zzc().zzb();
        this.zzd = zzqdVar.zzd().zzb();
        if (zzqdVar.zzc().zzf().equals(zzqk.zzb.zzc)) {
            byte[] bArr = zza;
            this.zze = Arrays.copyOf(bArr, bArr.length);
        } else {
            this.zze = new byte[0];
        }
    }

    public zzyz(zzrq zzrqVar, int i7) throws InvalidAlgorithmParameterException {
        this.zzb = zzrqVar;
        this.zzc = i7;
        this.zzd = new byte[0];
        this.zze = new byte[0];
        if (i7 >= 10) {
            zzrqVar.zza(new byte[0], i7);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }
}
