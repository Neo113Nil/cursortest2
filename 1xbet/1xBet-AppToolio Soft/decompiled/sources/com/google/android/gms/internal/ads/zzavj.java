package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzavs;
import com.google.android.gms.internal.ads.zzawe;
import com.google.android.gms.internal.ads.zzaxc;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzavj implements zzayn {
    private final String zzdic;
    private final int zzdid;
    private zzawe zzdie;
    private zzavo zzdif;
    private int zzdig;

    zzavj(zzaxn zzaxnVar) throws GeneralSecurityException {
        this.zzdic = zzaxnVar.zzyw();
        if (this.zzdic.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzawg zzt = zzawg.zzt(zzaxnVar.zzyx());
                this.zzdie = (zzawe) zzauo.zzb(zzaxnVar);
                this.zzdid = zzt.getKeySize();
                return;
            } catch (zzbbu e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        }
        if (!this.zzdic.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            String valueOf = String.valueOf(this.zzdic);
            throw new GeneralSecurityException(valueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(valueOf) : new String("unsupported AEAD DEM key type: "));
        }
        try {
            zzavq zzj = zzavq.zzj(zzaxnVar.zzyx());
            this.zzdif = (zzavo) zzauo.zzb(zzaxnVar);
            this.zzdig = zzj.zzwr().getKeySize();
            this.zzdid = this.zzdig + zzj.zzws().getKeySize();
        } catch (zzbbu e2) {
            throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e2);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.ads.zzayn
    public final zzatz zzi(byte[] bArr) throws GeneralSecurityException {
        zzavo zzadi;
        if (bArr.length != this.zzdid) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        }
        if (this.zzdic.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            zzadi = zzawe.zzxk().zza((zzawe.zza) this.zzdie).zzs(zzbah.zzc(bArr, 0, this.zzdid)).zzadi();
        } else {
            if (!this.zzdic.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                throw new GeneralSecurityException("unknown DEM key type");
            }
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.zzdig);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.zzdig, this.zzdid);
            zzavs zzadi2 = zzavs.zzww().zza((zzavs.zza) this.zzdif.zzwn()).zzm(zzbah.zzo(copyOfRange)).zzadi();
            zzadi = zzavo.zzwp().zzal(this.zzdif.getVersion()).zzb(zzadi2).zzb(zzaxc.zzyn().zza((zzaxc.zza) this.zzdif.zzwo()).zzaf(zzbah.zzo(copyOfRange2)).zzadi()).zzadi();
        }
        return (zzatz) zzauo.zzb(this.zzdic, zzadi);
    }

    @Override // com.google.android.gms.internal.ads.zzayn
    public final int zzwm() {
        return this.zzdid;
    }
}
