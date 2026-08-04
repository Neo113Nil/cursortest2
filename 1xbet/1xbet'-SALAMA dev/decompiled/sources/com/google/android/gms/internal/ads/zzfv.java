package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class zzfv extends zzfq {
    private zzgc zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzfv() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        int i9 = this.zzd;
        if (i9 == 0) {
            return -1;
        }
        int iMin = Math.min(i8, i9);
        byte[] bArr2 = this.zzb;
        int i10 = zzen.zza;
        System.arraycopy(bArr2, this.zzc, bArr, i7, iMin);
        this.zzc += iMin;
        this.zzd -= iMin;
        zzg(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final long zzb(zzgc zzgcVar) throws zzaz, zzfy {
        zzi(zzgcVar);
        this.zza = zzgcVar;
        Uri uriNormalizeScheme = zzgcVar.zza.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        zzcv.zze("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i7 = zzen.zza;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw zzaz.zzb("Unexpected URI format: ".concat(String.valueOf(uriNormalizeScheme)), null);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.zzb = Base64.decode(str, 0);
            } catch (IllegalArgumentException e7) {
                throw zzaz.zzb("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e7);
            }
        } else {
            this.zzb = URLDecoder.decode(str, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j = zzgcVar.zze;
        int length = this.zzb.length;
        if (j > length) {
            this.zzb = null;
            throw new zzfy(2008);
        }
        int i8 = (int) j;
        this.zzc = i8;
        int i9 = length - i8;
        this.zzd = i9;
        long j3 = zzgcVar.zzf;
        if (j3 != -1) {
            this.zzd = (int) Math.min(i9, j3);
        }
        zzj(zzgcVar);
        long j7 = zzgcVar.zzf;
        return j7 != -1 ? j7 : this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final Uri zzc() {
        zzgc zzgcVar = this.zza;
        if (zzgcVar != null) {
            return zzgcVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzd() {
        if (this.zzb != null) {
            this.zzb = null;
            zzh();
        }
        this.zza = null;
    }
}
