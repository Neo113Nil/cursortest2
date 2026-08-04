package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzev implements zzau {
    public final long zza;
    public final long zzb;
    public final long zzc;

    public zzev(long j, long j3, long j7) {
        this.zza = j;
        this.zzb = j3;
        this.zzc = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzev)) {
            return false;
        }
        zzev zzevVar = (zzev) obj;
        return this.zza == zzevVar.zza && this.zzb == zzevVar.zzb && this.zzc == zzevVar.zzc;
    }

    public final int hashCode() {
        long j = this.zza;
        int i7 = (int) (j ^ (j >>> 32));
        long j3 = this.zzb;
        return ((((i7 + 527) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.zza + ", modification time=" + this.zzb + ", timescale=" + this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final /* synthetic */ void zza(zzar zzarVar) {
    }
}
