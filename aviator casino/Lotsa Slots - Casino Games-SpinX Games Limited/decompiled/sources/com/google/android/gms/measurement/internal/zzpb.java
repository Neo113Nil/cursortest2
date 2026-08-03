package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzpb {
    com.google.android.gms.internal.measurement.zzid zza;
    java.util.List zzb;
    java.util.List zzc;
    long zzd;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzpf zze;

    /* synthetic */ zzpb(com.google.android.gms.measurement.internal.zzpf zzpfVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzpfVar);
        this.zze = zzpfVar;
    }

    private static final long zzb(com.google.android.gms.internal.measurement.zzhs zzhsVar) {
        return ((zzhsVar.zzf() / 1000) / 60) / 60;
    }

    public final boolean zza(long j, com.google.android.gms.internal.measurement.zzhs zzhsVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzhsVar);
        if (this.zzc == null) {
            this.zzc = new java.util.ArrayList();
        }
        if (this.zzb == null) {
            this.zzb = new java.util.ArrayList();
        }
        if (!this.zzc.isEmpty() && zzb((com.google.android.gms.internal.measurement.zzhs) this.zzc.get(0)) != zzb(zzhsVar)) {
            return false;
        }
        long zzcn = this.zzd + zzhsVar.zzcn();
        com.google.android.gms.measurement.internal.zzpf zzpfVar = this.zze;
        if (!zzpfVar.zzd().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzbe)) {
            zzpfVar.zzd();
            if (zzcn >= com.google.android.gms.measurement.internal.zzal.zzG()) {
                return false;
            }
        } else if (!this.zzc.isEmpty()) {
            zzpfVar.zzd();
            if (zzcn >= com.google.android.gms.measurement.internal.zzal.zzG()) {
                return false;
            }
        }
        this.zzd = zzcn;
        this.zzc.add(zzhsVar);
        this.zzb.add(java.lang.Long.valueOf(j));
        int size = this.zzc.size();
        zzpfVar.zzd();
        return size < java.lang.Math.max(1, ((java.lang.Integer) com.google.android.gms.measurement.internal.zzfx.zzj.zzb(null)).intValue());
    }
}
