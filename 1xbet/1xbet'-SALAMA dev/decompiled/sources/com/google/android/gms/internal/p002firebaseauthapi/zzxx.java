package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.EllipticCurve;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzxx implements zzbo {
    private final ECPrivateKey zza;
    private final zzxz zzb;
    private final String zzc;
    private final byte[] zzd;
    private final zzyd zze;
    private final zzkw zzf;
    private final byte[] zzg;

    private zzxx(ECPrivateKey eCPrivateKey, byte[] bArr, String str, zzyd zzydVar, zzkw zzkwVar, byte[] bArr2) {
        this.zza = eCPrivateKey;
        this.zzb = new zzxz(eCPrivateKey);
        this.zzd = bArr;
        this.zzc = str;
        this.zze = zzydVar;
        this.zzf = zzkwVar;
        this.zzg = bArr2;
    }

    public static zzbo zza(zzjs zzjsVar) throws NoSuchAlgorithmException {
        ECPrivateKey eCPrivateKeyZza = zzyb.zza((zzya) zzxw.zza.zza(zzjsVar.zzc().zzd()), zzmj.zza(zzjsVar.zze().zza(zzbq.zza())));
        byte[] bArrZzb = new byte[0];
        if (zzjsVar.zzc().zzh() != null) {
            bArrZzb = zzjsVar.zzc().zzh().zzb();
        }
        return new zzxx(eCPrivateKeyZza, bArrZzb, zzxw.zza(zzjsVar.zzc().zze()), (zzyd) zzxw.zzb.zza(zzjsVar.zzc().zzf()), zzks.zza(zzjsVar.zzc()), zzjsVar.zzg().zzb());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    /* JADX WARN: Code duplicated, block: B:17:0x0057  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbo
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i7;
        int i8;
        if (zzpr.zza(this.zzg, bArr)) {
            int length = this.zzg.length;
            EllipticCurve curve = this.zza.getParams().getCurve();
            zzyd zzydVar = this.zze;
            int iZza = zzyb.zza(curve);
            int iOrdinal = zzydVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new GeneralSecurityException("unknown EC point format");
                    }
                    i7 = iZza * 2;
                }
                i8 = i7 + length;
                if (bArr.length >= i8) {
                    return this.zzf.zza(this.zzb.zza(Arrays.copyOfRange(bArr, length, i8), this.zzc, this.zzd, bArr2, this.zzf.zza(), this.zze), bArr, i8);
                }
                throw new GeneralSecurityException("ciphertext too short");
            }
            iZza *= 2;
            i7 = iZza + 1;
            i8 = i7 + length;
            if (bArr.length >= i8) {
                return this.zzf.zza(this.zzb.zza(Arrays.copyOfRange(bArr, length, i8), this.zzc, this.zzd, bArr2, this.zzf.zza(), this.zze), bArr, i8);
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
    }
}
