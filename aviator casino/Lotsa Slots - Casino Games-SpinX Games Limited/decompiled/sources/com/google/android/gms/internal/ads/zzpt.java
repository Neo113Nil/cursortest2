package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzpt {
    final /* synthetic */ com.google.android.gms.internal.ads.zzpu zza;
    private final java.lang.String zzb;
    private int zzc;
    private long zzd;
    private com.google.android.gms.internal.ads.zzxk zze;
    private boolean zzf;
    private boolean zzg;

    public zzpt(com.google.android.gms.internal.ads.zzpu zzpuVar, java.lang.String str, int i, com.google.android.gms.internal.ads.zzxk zzxkVar) {
        java.util.Objects.requireNonNull(zzpuVar);
        this.zza = zzpuVar;
        this.zzb = str;
        this.zzc = i;
        this.zzd = zzxkVar == null ? -1L : zzxkVar.zzd;
        if (zzxkVar == null || !zzxkVar.zzb()) {
            return;
        }
        this.zze = zzxkVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r9.zza()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(com.google.android.gms.internal.ads.zzbf zzbfVar, com.google.android.gms.internal.ads.zzbf zzbfVar2) {
        int i = this.zzc;
        if (i < zzbfVar.zza()) {
            com.google.android.gms.internal.ads.zzpu zzpuVar = this.zza;
            zzbfVar.zzb(i, zzpuVar.zzj(), 0L);
            for (int i2 = zzpuVar.zzj().zzn; i2 <= zzpuVar.zzj().zzo; i2++) {
                int zze = zzbfVar2.zze(zzbfVar.zzf(i2));
                if (zze != -1) {
                    i = zzbfVar2.zzd(zze, zzpuVar.zzk(), false).zzc;
                    break;
                }
            }
            i = -1;
        }
        this.zzc = i;
        if (i == -1) {
            return false;
        }
        com.google.android.gms.internal.ads.zzxk zzxkVar = this.zze;
        return zzxkVar == null || zzbfVar2.zze(zzxkVar.zza) != -1;
    }

    public final boolean zzb(int i, com.google.android.gms.internal.ads.zzxk zzxkVar) {
        if (zzxkVar != null) {
            long j = zzxkVar.zzd;
            if (j != -1) {
                com.google.android.gms.internal.ads.zzxk zzxkVar2 = this.zze;
                return zzxkVar2 == null ? !zzxkVar.zzb() && j == this.zzd : j == zzxkVar2.zzd && zzxkVar.zzb == zzxkVar2.zzb && zzxkVar.zzc == zzxkVar2.zzc;
            }
        }
        return i == this.zzc;
    }

    public final void zzc(int i, com.google.android.gms.internal.ads.zzxk zzxkVar) {
        if (this.zzd == -1 && i == this.zzc && zzxkVar != null) {
            com.google.android.gms.internal.ads.zzpu zzpuVar = this.zza;
            long j = zzxkVar.zzd;
            if (j >= zzpuVar.zzi()) {
                this.zzd = j;
            }
        }
    }

    public final boolean zzd(com.google.android.gms.internal.ads.zznn zznnVar) {
        com.google.android.gms.internal.ads.zzxk zzxkVar = zznnVar.zzd;
        if (zzxkVar == null) {
            return this.zzc != zznnVar.zzc;
        }
        long j = this.zzd;
        if (j == -1) {
            return false;
        }
        long j2 = zzxkVar.zzd;
        if (j2 > j) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        com.google.android.gms.internal.ads.zzbf zzbfVar = zznnVar.zzb;
        int zze = zzbfVar.zze(zzxkVar.zza);
        int zze2 = zzbfVar.zze(this.zze.zza);
        com.google.android.gms.internal.ads.zzxk zzxkVar2 = this.zze;
        if (j2 < zzxkVar2.zzd || zze < zze2) {
            return false;
        }
        if (zze > zze2) {
            return true;
        }
        if (!zzxkVar.zzb()) {
            int i = zzxkVar.zze;
            return i == -1 || i > zzxkVar2.zzb;
        }
        int i2 = zzxkVar.zzb;
        int i3 = zzxkVar.zzc;
        int i4 = zzxkVar2.zzb;
        if (i2 <= i4) {
            return i2 == i4 && i3 > zzxkVar2.zzc;
        }
        return true;
    }

    final /* synthetic */ java.lang.String zze() {
        return this.zzb;
    }

    final /* synthetic */ int zzf() {
        return this.zzc;
    }

    final /* synthetic */ long zzg() {
        return this.zzd;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzxk zzh() {
        return this.zze;
    }

    final /* synthetic */ boolean zzi() {
        return this.zzf;
    }

    final /* synthetic */ void zzj(boolean z) {
        this.zzf = true;
    }

    final /* synthetic */ boolean zzk() {
        return this.zzg;
    }

    final /* synthetic */ void zzl(boolean z) {
        this.zzg = true;
    }
}
