package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class zzqs implements zzci {
    private final zzoz<zzci> zza;
    private final zznk zzb;
    private final zznk zzc;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzci
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= 5) {
            this.zzc.zza();
            throw new GeneralSecurityException("tag too short");
        }
        for (zzpb<zzci> zzpbVar : this.zza.zza(Arrays.copyOf(bArr, 5))) {
            try {
                zzpbVar.zzd().zza(bArr, bArr2);
                this.zzc.zza(zzpbVar.zza(), bArr2.length);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        for (zzpb<zzci> zzpbVar2 : this.zza.zze()) {
            try {
                zzpbVar2.zzd().zza(bArr, bArr2);
                this.zzc.zza(zzpbVar2.zza(), bArr2.length);
                return;
            } catch (GeneralSecurityException unused2) {
            }
        }
        this.zzc.zza();
        throw new GeneralSecurityException("invalid MAC");
    }

    private zzqs(zzoz<zzci> zzozVar) {
        this.zza = zzozVar;
        if (!zzozVar.zzf()) {
            zznk zznkVar = zznr.zza;
            this.zzb = zznkVar;
            this.zzc = zznkVar;
        } else {
            zznl zznlVarZza = zzny.zzb().zza();
            zznn zznnVarZza = zznr.zza(zzozVar);
            this.zzb = zznlVarZza.zza(zznnVarZza, "mac", "compute");
            this.zzc = zznlVarZza.zza(zznnVarZza, "mac", "verify");
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzci
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        try {
            byte[] bArrZza = this.zza.zzb().zzd().zza(bArr);
            this.zzb.zza(this.zza.zzb().zza(), bArr.length);
            return bArrZza;
        } catch (GeneralSecurityException e7) {
            this.zzb.zza();
            throw e7;
        }
    }
}
