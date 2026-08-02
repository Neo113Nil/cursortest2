package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzki implements zzbo {
    private final zzoz<zzbo> zza;
    private final zznk zzb;

    public zzki(zzoz<zzbo> zzozVar) {
        this.zza = zzozVar;
        if (zzozVar.zzf()) {
            this.zzb = zzny.zzb().zza().zza(zznr.zza(zzozVar), "hybrid_decrypt", "decrypt");
        } else {
            this.zzb = zznr.zza;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbo
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 5) {
            for (zzpb<zzbo> zzpbVar : this.zza.zza(Arrays.copyOfRange(bArr, 0, 5))) {
                try {
                    byte[] zza = zzpbVar.zzd().zza(bArr, bArr2);
                    this.zzb.zza(zzpbVar.zza(), bArr.length);
                    return zza;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (zzpb<zzbo> zzpbVar2 : this.zza.zza(zzbj.zza)) {
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
