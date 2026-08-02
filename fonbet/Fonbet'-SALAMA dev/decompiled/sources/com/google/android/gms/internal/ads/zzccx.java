package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
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
            int zza = this.zza.zza(bArr, i7, (int) Math.min(i8, j3 - j));
            long j7 = this.zzd + zza;
            this.zzd = j7;
            i9 = zza;
            j = j7;
        } else {
            i9 = 0;
        }
        if (j < this.zzb) {
            return i9;
        }
        int zza2 = this.zzc.zza(bArr, i7 + i9, i8 - i9);
        int i10 = i9 + zza2;
        this.zzd += zza2;
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
            long j8 = j3 - j;
            if (j7 != -1) {
                j8 = Math.min(j7, j8);
            }
            zzgcVar2 = new zzgc(zzgcVar.zza, j, j8, null);
        }
        long j9 = zzgcVar.zzf;
        if (j9 == -1 || zzgcVar.zze + j9 > this.zzb) {
            long max = Math.max(this.zzb, zzgcVar.zze);
            long j10 = zzgcVar.zzf;
            zzgcVar3 = new zzgc(zzgcVar.zza, max, j10 != -1 ? Math.min(j10, (zzgcVar.zze + j10) - this.zzb) : -1L, null);
        }
        long zzb = zzgcVar2 != null ? this.zza.zzb(zzgcVar2) : 0L;
        long zzb2 = zzgcVar3 != null ? this.zzc.zzb(zzgcVar3) : 0L;
        this.zzd = zzgcVar.zze;
        if (zzb == -1 || zzb2 == -1) {
            return -1L;
        }
        return zzb + zzb2;
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
