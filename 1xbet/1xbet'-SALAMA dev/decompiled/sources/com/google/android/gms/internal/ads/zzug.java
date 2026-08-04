package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzug implements zzfx {
    private final zzfx zza;
    private final int zzb;
    private final zzuf zzc;
    private final byte[] zzd;
    private int zze;

    public zzug(zzfx zzfxVar, int i7, zzuf zzufVar) {
        zzcv.zzd(i7 > 0);
        this.zza = zzfxVar;
        this.zzb = i7;
        this.zzc = zzufVar;
        this.zzd = new byte[1];
        this.zze = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i7, int i8) {
        int i9 = this.zze;
        if (i9 == 0) {
            int i10 = 0;
            if (this.zza.zza(this.zzd, 0, 1) != -1) {
                int i11 = (this.zzd[0] & 255) << 4;
                if (i11 != 0) {
                    byte[] bArr2 = new byte[i11];
                    int i12 = i11;
                    while (i12 > 0) {
                        int iZza = this.zza.zza(bArr2, i10, i12);
                        if (iZza != -1) {
                            i10 += iZza;
                            i12 -= iZza;
                        }
                    }
                    while (i11 > 0) {
                        int i13 = i11 - 1;
                        if (bArr2[i13] != 0) {
                            break;
                        }
                        i11 = i13;
                    }
                    if (i11 > 0) {
                        this.zzc.zza(new zzed(bArr2, i11));
                    }
                }
                i9 = this.zzb;
                this.zze = i9;
            }
            return -1;
        }
        int iZza2 = this.zza.zza(bArr, i7, Math.min(i9, i8));
        if (iZza2 != -1) {
            this.zze -= iZza2;
        }
        return iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final long zzb(zzgc zzgcVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final Map zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzf(zzgx zzgxVar) {
        zzgxVar.getClass();
        this.zza.zzf(zzgxVar);
    }
}
