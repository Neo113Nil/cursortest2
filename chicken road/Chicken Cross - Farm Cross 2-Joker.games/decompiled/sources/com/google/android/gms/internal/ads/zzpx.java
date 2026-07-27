package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzpx {
    final /* synthetic */ zzpy zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzxo zze;
    private boolean zzf;
    private boolean zzg;

    public zzpx(zzpy zzpyVar, String str, int i, zzxo zzxoVar) {
        Objects.requireNonNull(zzpyVar);
        this.zza = zzpyVar;
        this.zzb = str;
        this.zzc = i;
        this.zzd = zzxoVar == null ? -1L : zzxoVar.zzd;
        if (zzxoVar == null || !zzxoVar.zzb()) {
            return;
        }
        this.zze = zzxoVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r9.zza()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(zzbf zzbfVar, zzbf zzbfVar2) {
        int i = this.zzc;
        if (i < zzbfVar.zza()) {
            zzpy zzpyVar = this.zza;
            zzbfVar.zzb(i, zzpyVar.zzj(), 0L);
            for (int i2 = zzpyVar.zzj().zzn; i2 <= zzpyVar.zzj().zzo; i2++) {
                int zze = zzbfVar2.zze(zzbfVar.zzf(i2));
                if (zze != -1) {
                    i = zzbfVar2.zzd(zze, zzpyVar.zzk(), false).zzc;
                    break;
                }
            }
            i = -1;
        }
        this.zzc = i;
        if (i == -1) {
            return false;
        }
        zzxo zzxoVar = this.zze;
        return zzxoVar == null || zzbfVar2.zze(zzxoVar.zza) != -1;
    }

    public final boolean zzb(int i, zzxo zzxoVar) {
        if (zzxoVar != null) {
            long j = zzxoVar.zzd;
            if (j != -1) {
                zzxo zzxoVar2 = this.zze;
                return zzxoVar2 == null ? !zzxoVar.zzb() && j == this.zzd : j == zzxoVar2.zzd && zzxoVar.zzb == zzxoVar2.zzb && zzxoVar.zzc == zzxoVar2.zzc;
            }
        }
        return i == this.zzc;
    }

    public final void zzc(int i, zzxo zzxoVar) {
        if (this.zzd == -1 && i == this.zzc && zzxoVar != null) {
            zzpy zzpyVar = this.zza;
            long j = zzxoVar.zzd;
            if (j >= zzpyVar.zzi()) {
                this.zzd = j;
            }
        }
    }

    public final boolean zzd(zznr zznrVar) {
        zzxo zzxoVar = zznrVar.zzd;
        if (zzxoVar == null) {
            return this.zzc != zznrVar.zzc;
        }
        long j = this.zzd;
        if (j == -1) {
            return false;
        }
        long j2 = zzxoVar.zzd;
        if (j2 > j) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzbf zzbfVar = zznrVar.zzb;
        int zze = zzbfVar.zze(zzxoVar.zza);
        int zze2 = zzbfVar.zze(this.zze.zza);
        zzxo zzxoVar2 = this.zze;
        if (j2 < zzxoVar2.zzd || zze < zze2) {
            return false;
        }
        if (zze > zze2) {
            return true;
        }
        if (!zzxoVar.zzb()) {
            int i = zzxoVar.zze;
            return i == -1 || i > zzxoVar2.zzb;
        }
        int i2 = zzxoVar.zzb;
        int i3 = zzxoVar.zzc;
        int i4 = zzxoVar2.zzb;
        if (i2 <= i4) {
            return i2 == i4 && i3 > zzxoVar2.zzc;
        }
        return true;
    }

    final /* synthetic */ String zze() {
        return this.zzb;
    }

    final /* synthetic */ int zzf() {
        return this.zzc;
    }

    final /* synthetic */ long zzg() {
        return this.zzd;
    }

    final /* synthetic */ zzxo zzh() {
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
