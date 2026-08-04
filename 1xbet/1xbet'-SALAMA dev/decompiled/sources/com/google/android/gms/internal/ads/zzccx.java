package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzccx implements zzfx {
    private final zzfx zza;
    private final long zzb;
    private final zzfx zzc;
    private long zzd;
    private Uri zze;

    public zzccx(zzfx zzfxVar, int i7, zzfx zzfxVar2) {
        this.zza = zzfxVar;
        this.zzb = i7;
        this.zzc = zzfxVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i7, int i8) {
        int i9;
        long j = this.zzd;
        long j3 = this.zzb;
        if (j < j3) {
            int iZza = this.zza.zza(bArr, i7, (int) Math.min(i8, j3 - j));
            long j7 = this.zzd + ((long) iZza);
            this.zzd = j7;
            i9 = iZza;
            j = j7;
        } else {
            i9 = 0;
        }
        if (j < this.zzb) {
            return i9;
        }
        int iZza2 = this.zzc.zza(bArr, i7 + i9, i8 - i9);
        int i10 = i9 + iZza2;
        this.zzd += (long) iZza2;
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final long zzb(zzgc zzgcVar) {
        zzgc zzgcVar2;
        this.zze = zzgcVar.zza;
        long j = zzgcVar.zze;
        long j3 = this.zzb;
        zzgc zzgcVar3 = null;
        if (j >= j3) {
            zzgcVar2 = null;
        } else {
            long j7 = zzgcVar.zzf;
            long jMin = j3 - j;
            if (j7 != -1) {
                jMin = Math.min(j7, jMin);
            }
            zzgcVar2 = new zzgc(zzgcVar.zza, j, jMin, null);
        }
        long j8 = zzgcVar.zzf;
        if (j8 == -1 || zzgcVar.zze + j8 > this.zzb) {
            long jMax = Math.max(this.zzb, zzgcVar.zze);
            long j9 = zzgcVar.zzf;
            zzgcVar3 = new zzgc(zzgcVar.zza, jMax, j9 != -1 ? Math.min(j9, (zzgcVar.zze + j9) - this.zzb) : -1L, null);
        }
        long jZzb = zzgcVar2 != null ? this.zza.zzb(zzgcVar2) : 0L;
        long jZzb2 = zzgcVar3 != null ? this.zzc.zzb(zzgcVar3) : 0L;
        this.zzd = zzgcVar.zze;
        if (jZzb == -1 || jZzb2 == -1) {
            return -1L;
        }
        return jZzb + jZzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzd() {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final Map zze() {
        return zzfwk.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzf(zzgx zzgxVar) {
    }
}
