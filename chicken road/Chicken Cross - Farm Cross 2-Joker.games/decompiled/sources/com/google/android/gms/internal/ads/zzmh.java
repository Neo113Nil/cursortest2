package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzmh {
    public final zzxo zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    zzmh(zzxo zzxoVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        zzguk.zza(!z4 || z2);
        if (z3 && !z2) {
            z5 = false;
        }
        zzguk.zza(z5);
        this.zza = zzxoVar;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = j4;
        this.zzf = false;
        this.zzg = z2;
        this.zzh = z3;
        this.zzi = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzmh zzmhVar = (zzmh) obj;
            if (this.zzb == zzmhVar.zzb && this.zzd == zzmhVar.zzd && this.zze == zzmhVar.zze && this.zzg == zzmhVar.zzg && this.zzh == zzmhVar.zzh && this.zzi == zzmhVar.zzi && Objects.equals(this.zza, zzmhVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        long j = this.zze;
        return (((((((((((hashCode * 31) + ((int) this.zzb)) * 31) + ((int) this.zzd)) * 31) + ((int) j)) * 961) + (this.zzg ? 1 : 0)) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0);
    }

    public final zzmh zza(long j, long j2) {
        return (j == this.zzb && j2 == this.zzc) ? this : new zzmh(this.zza, j, j2, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }

    public final zzmh zzb(long j) {
        return j == this.zzd ? this : new zzmh(this.zza, this.zzb, this.zzc, j, this.zze, false, this.zzg, this.zzh, this.zzi);
    }
}
