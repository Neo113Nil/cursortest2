package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzjb implements zzbl {
    private final zzoz<zzbl> zza;
    private final zznk zzb;

    public zzjb(zzoz<zzbl> zzozVar) {
        this.zza = zzozVar;
        if (!zzozVar.zzf()) {
            this.zzb = zznr.zza;
            return;
        }
        zznl zza = zzny.zzb().zza();
        zznn zza2 = zznr.zza(zzozVar);
        zza.zza(zza2, "daead", "encrypt");
        this.zzb = zza.zza(zza2, "daead", "decrypt");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbl
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 5) {
            for (zzpb<zzbl> zzpbVar : this.zza.zza(Arrays.copyOf(bArr, 5))) {
                try {
                    byte[] zza = zzpbVar.zzd().zza(bArr, bArr2);
                    this.zzb.zza(zzpbVar.zza(), bArr.length);
                    return zza;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (zzpb<zzbl> zzpbVar2 : this.zza.zza(zzbj.zza)) {
            try {
                byte[] zza2 = zzpbVar2.zzd().zza(bArr, bArr2);
                this.zzb.zza(zzpbVar2.zza(), bArr.length);
                return zza2;
            } catch (GeneralSecurityException unused2) {
            }
        }
        this.zzb.zza();
        throw new GeneralSecurityException("decryption failed");
    }
}
