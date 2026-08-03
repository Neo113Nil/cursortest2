package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzadv {
    private long zza;
    private long zzb;
    private double zzc;
    private android.util.Range zzd;

    public zzadv(float f) {
        android.util.Range range = new android.util.Range(java.lang.Double.valueOf(0.0d), java.lang.Double.valueOf(1.0d));
        this.zzd = range;
        this.zzc = ((java.lang.Double) range.getUpper()).doubleValue();
        this.zza = -9223372036854775807L;
        this.zzb = -9223372036854775807L;
    }

    public final void zza(long j, long j2) {
        double doubleValue;
        com.google.android.gms.internal.ads.zzgtj.zza(j != -9223372036854775807L);
        com.google.android.gms.internal.ads.zzgtj.zza(j2 != -9223372036854775807L);
        long j3 = this.zza;
        if (j3 != -9223372036854775807L) {
            if (this.zzb != -9223372036854775807L && j != j3) {
                doubleValue = (j2 - r4) / (j - j3);
                this.zzc = (this.zzc * 0.800000011920929d) + (((java.lang.Double) this.zzd.clamp(java.lang.Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d);
                this.zza = j;
                this.zzb = j2;
            }
        }
        doubleValue = ((java.lang.Double) this.zzd.getUpper()).doubleValue();
        this.zzc = (this.zzc * 0.800000011920929d) + (((java.lang.Double) this.zzd.clamp(java.lang.Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d);
        this.zza = j;
        this.zzb = j2;
    }

    public final long zzb(long j) {
        if (this.zza == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (long) (this.zzb + ((j - r0) * this.zzc));
    }

    public final void zzc(float f) {
        com.google.android.gms.internal.ads.zzgtj.zza(f > 0.0f);
        this.zzd = new android.util.Range(java.lang.Double.valueOf(0.0d), java.lang.Double.valueOf(1.0d / f));
        zzd();
    }

    public final void zzd() {
        this.zzc = ((java.lang.Double) this.zzd.getUpper()).doubleValue();
        this.zza = -9223372036854775807L;
        this.zzb = -9223372036854775807L;
    }
}
