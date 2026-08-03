package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzpi {
    private final long zza;
    private final com.google.android.gms.internal.measurement.zzib zzb;
    private final java.lang.String zzc;
    private final java.util.Map zzd;
    private final com.google.android.gms.measurement.internal.zzlr zze;
    private final long zzf;
    private final long zzg;
    private final long zzh;
    private final int zzi;

    /* synthetic */ zzpi(long j, com.google.android.gms.internal.measurement.zzib zzibVar, java.lang.String str, java.util.Map map, com.google.android.gms.measurement.internal.zzlr zzlrVar, long j2, long j3, long j4, int i, byte[] bArr) {
        this.zza = j;
        this.zzb = zzibVar;
        this.zzc = str;
        this.zzd = map;
        this.zze = zzlrVar;
        this.zzf = j2;
        this.zzg = j3;
        this.zzh = j4;
        this.zzi = i;
    }

    public final com.google.android.gms.measurement.internal.zzos zza() {
        return new com.google.android.gms.measurement.internal.zzos(this.zzc, this.zzd, this.zze, null);
    }

    public final com.google.android.gms.measurement.internal.zzol zzb() {
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.util.Map.Entry entry : this.zzd.entrySet()) {
            bundle.putString((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        long j = this.zza;
        com.google.android.gms.internal.measurement.zzib zzibVar = this.zzb;
        java.lang.String str = this.zzc;
        com.google.android.gms.measurement.internal.zzlr zzlrVar = this.zze;
        return new com.google.android.gms.measurement.internal.zzol(j, zzibVar.zzcc(), str, bundle, zzlrVar.zza(), this.zzg, "");
    }

    public final long zzc() {
        return this.zza;
    }

    public final com.google.android.gms.internal.measurement.zzib zzd() {
        return this.zzb;
    }

    public final java.lang.String zze() {
        return this.zzc;
    }

    public final com.google.android.gms.measurement.internal.zzlr zzf() {
        return this.zze;
    }

    public final long zzg() {
        return this.zzf;
    }

    public final long zzh() {
        return this.zzh;
    }

    public final int zzi() {
        return this.zzi;
    }
}
