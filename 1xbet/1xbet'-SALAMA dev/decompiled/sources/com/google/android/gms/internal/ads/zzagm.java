package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzagm implements zzau {
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    public zzagm(long j, long j3, long j7, long j8, long j9) {
        this.zza = j;
        this.zzb = j3;
        this.zzc = j7;
        this.zzd = j8;
        this.zze = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagm.class == obj.getClass()) {
            zzagm zzagmVar = (zzagm) obj;
            if (this.zza == zzagmVar.zza && this.zzb == zzagmVar.zzb && this.zzc == zzagmVar.zzc && this.zzd == zzagmVar.zzd && this.zze == zzagmVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.zza;
        int i7 = (int) (j ^ (j >>> 32));
        long j3 = this.zze;
        long j7 = this.zzd;
        long j8 = this.zzc;
        long j9 = this.zzb;
        return ((((((((i7 + 527) * 31) + ((int) ((j9 >>> 32) ^ j9))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.zza + ", photoSize=" + this.zzb + ", photoPresentationTimestampUs=" + this.zzc + ", videoStartPosition=" + this.zzd + ", videoSize=" + this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final /* synthetic */ void zza(zzar zzarVar) {
    }
}
