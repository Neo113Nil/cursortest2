package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzcx implements zzbg {
    private final zzoz<zzbg> zza;
    private final zznk zzb;
    private final zznk zzc;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 5) {
            for (zzpb<zzbg> zzpbVar : this.zza.zza(Arrays.copyOf(bArr, 5))) {
                try {
                    byte[] zza = zzpbVar.zzd().zza(bArr, bArr2);
                    this.zzc.zza(zzpbVar.zza(), bArr.length);
                    return zza;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (zzpb<zzbg> zzpbVar2 : this.zza.zza(zzbj.zza)) {
            try {
                byte[] zza2 = zzpbVar2.zzd().zza(bArr, bArr2);
                this.zzc.zza(zzpbVar2.zza(), bArr.length);
                return zza2;
            } catch (GeneralSecurityException unused2) {
            }
        }
        this.zzc.zza();
        throw new GeneralSecurityException("decryption failed");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        try {
            byte[] zzb = this.zza.zzb().zzd().zzb(bArr, bArr2);
            this.zzb.zza(this.zza.zzb().zza(), bArr.length);
            return zzb;
        } catch (GeneralSecurityException e7) {
            this.zzb.zza();
            throw e7;
        }
    }

    private zzcx(zzoz<zzbg> zzozVar) {
        this.zza = zzozVar;
        if (!zzozVar.zzf()) {
            zznk zznkVar = zznr.zza;
            this.zzb = zznkVar;
            this.zzc = zznkVar;
        } else {
            zznl zza = zzny.zzb().zza();
            zznn zza2 = zznr.zza(zzozVar);
            this.zzb = zza.zza(zza2, "aead", "encrypt");
            this.zzc = zza.zza(zza2, "aead", "decrypt");
        }
    }
}
