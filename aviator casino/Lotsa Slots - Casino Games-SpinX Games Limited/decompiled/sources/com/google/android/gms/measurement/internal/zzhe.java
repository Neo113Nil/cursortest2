package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzhe {
    final java.lang.String zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzhg zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final long zze;

    /* synthetic */ zzhe(com.google.android.gms.measurement.internal.zzhg zzhgVar, java.lang.String str, long j, byte[] bArr) {
        java.util.Objects.requireNonNull(zzhgVar);
        this.zzb = zzhgVar;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty("health_monitor");
        com.google.android.gms.common.internal.Preconditions.checkArgument(j > 0);
        this.zza = "health_monitor:start";
        this.zzc = "health_monitor:count";
        this.zzd = "health_monitor:value";
        this.zze = j;
    }

    private final void zzc() {
        com.google.android.gms.measurement.internal.zzhg zzhgVar = this.zzb;
        zzhgVar.zzg();
        long currentTimeMillis = zzhgVar.zzu.zzaZ().currentTimeMillis();
        android.content.SharedPreferences.Editor edit = zzhgVar.zzd().edit();
        edit.remove(this.zzc);
        edit.remove(this.zzd);
        edit.putLong(this.zza, currentTimeMillis);
        edit.apply();
    }

    private final long zzd() {
        return this.zzb.zzd().getLong(this.zza, 0L);
    }

    public final void zza(java.lang.String str, long j) {
        com.google.android.gms.measurement.internal.zzhg zzhgVar = this.zzb;
        zzhgVar.zzg();
        if (zzd() == 0) {
            zzc();
        }
        if (str == null) {
            str = "";
        }
        android.content.SharedPreferences zzd = zzhgVar.zzd();
        java.lang.String str2 = this.zzc;
        long j2 = zzd.getLong(str2, 0L);
        if (j2 <= 0) {
            android.content.SharedPreferences.Editor edit = zzhgVar.zzd().edit();
            edit.putString(this.zzd, str);
            edit.putLong(str2, 1L);
            edit.apply();
            return;
        }
        long nextLong = zzhgVar.zzu.zzk().zzf().nextLong() & Long.MAX_VALUE;
        long j3 = j2 + 1;
        long j4 = Long.MAX_VALUE / j3;
        android.content.SharedPreferences.Editor edit2 = zzhgVar.zzd().edit();
        if (nextLong < j4) {
            edit2.putString(this.zzd, str);
        }
        edit2.putLong(str2, j3);
        edit2.apply();
    }

    public final android.util.Pair zzb() {
        long abs;
        com.google.android.gms.measurement.internal.zzhg zzhgVar = this.zzb;
        zzhgVar.zzg();
        zzhgVar.zzg();
        long zzd = zzd();
        if (zzd == 0) {
            zzc();
            abs = 0;
        } else {
            abs = java.lang.Math.abs(zzd - zzhgVar.zzu.zzaZ().currentTimeMillis());
        }
        long j = this.zze;
        if (abs < j) {
            return null;
        }
        if (abs > j + j) {
            zzc();
            return null;
        }
        java.lang.String string = zzhgVar.zzd().getString(this.zzd, null);
        long j2 = zzhgVar.zzd().getLong(this.zzc, 0L);
        zzc();
        return (string == null || j2 <= 0) ? com.google.android.gms.measurement.internal.zzhg.zza : new android.util.Pair(string, java.lang.Long.valueOf(j2));
    }
}
