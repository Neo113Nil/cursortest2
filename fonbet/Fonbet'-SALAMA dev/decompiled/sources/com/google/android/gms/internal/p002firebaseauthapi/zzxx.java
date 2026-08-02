package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzjp;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.EllipticCurve;
import java.util.Arrays;

/* loaded from: classes.dex */
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

    public static zzbo zza(zzjs zzjsVar) {
        ECPrivateKey zza = zzyb.zza(zzxw.zza.zza((zzmm<zzya, zzjp.zzc>) zzjsVar.zzc().zzd()), zzmj.zza(zzjsVar.zze().zza(zzbq.zza())));
        byte[] bArr = new byte[0];
        if (zzjsVar.zzc().zzh() != null) {
            bArr = zzjsVar.zzc().zzh().zzb();
        }
        return new zzxx(zza, bArr, zzxw.zza(zzjsVar.zzc().zze()), zzxw.zzb.zza((zzmm<zzyd, zzjp.zze>) zzjsVar.zzc().zzf()), zzks.zza(zzjsVar.zzc()), zzjsVar.zzg().zzb());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        int i7;
        int i8;
        if (zzpr.zza(this.zzg, bArr)) {
            int length = this.zzg.length;
            EllipticCurve curve = this.zza.getParams().getCurve();
            zzyd zzydVar = this.zze;
            int zza = zzyb.zza(curve);
            int ordinal = zzydVar.ordinal();
            if (ordinal == 0) {
                zza *= 2;
            } else if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new GeneralSecurityException("unknown EC point format");
                }
                i7 = zza * 2;
                i8 = i7 + length;
                if (bArr.length < i8) {
                    return this.zzf.zza(this.zzb.zza(Arrays.copyOfRange(bArr, length, i8), this.zzc, this.zzd, bArr2, this.zzf.zza(), this.zze), bArr, i8);
                }
                throw new GeneralSecurityException("ciphertext too short");
            }
            i7 = zza + 1;
            i8 = i7 + length;
            if (bArr.length < i8) {
            }
        } else {
            throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
        }
    }
}
