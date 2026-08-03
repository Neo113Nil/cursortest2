package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzpd {
    private final com.google.android.gms.measurement.internal.zzpf zza;
    private int zzb = 1;
    private long zzc = zzd();

    public zzpd(com.google.android.gms.measurement.internal.zzpf zzpfVar) {
        this.zza = zzpfVar;
    }

    private final long zzd() {
        com.google.android.gms.measurement.internal.zzpf zzpfVar = this.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzpfVar);
        long longValue = ((java.lang.Long) com.google.android.gms.measurement.internal.zzfx.zzu.zzb(null)).longValue();
        long longValue2 = ((java.lang.Long) com.google.android.gms.measurement.internal.zzfx.zzv.zzb(null)).longValue();
        for (int i = 1; i < this.zzb; i++) {
            longValue += longValue;
            if (longValue >= longValue2) {
                break;
            }
        }
        return zzpfVar.zzaZ().currentTimeMillis() + java.lang.Math.min(longValue, longValue2);
    }

    public final void zza() {
        this.zzb++;
        this.zzc = zzd();
    }

    public final boolean zzb() {
        return this.zza.zzaZ().currentTimeMillis() >= this.zzc;
    }

    final /* synthetic */ long zzc() {
        return this.zzc;
    }
}
