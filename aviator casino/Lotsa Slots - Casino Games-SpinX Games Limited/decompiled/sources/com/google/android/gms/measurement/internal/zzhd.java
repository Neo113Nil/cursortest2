package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzhd {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzhg zza;
    private final java.lang.String zzb;
    private final long zzc;
    private boolean zzd;
    private long zze;

    public zzhd(com.google.android.gms.measurement.internal.zzhg zzhgVar, java.lang.String str, long j) {
        java.util.Objects.requireNonNull(zzhgVar);
        this.zza = zzhgVar;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = j;
    }

    public final long zza() {
        if (!this.zzd) {
            this.zzd = true;
            com.google.android.gms.measurement.internal.zzhg zzhgVar = this.zza;
            this.zze = zzhgVar.zzd().getLong(this.zzb, this.zzc);
        }
        return this.zze;
    }

    public final void zzb(long j) {
        android.content.SharedPreferences.Editor edit = this.zza.zzd().edit();
        edit.putLong(this.zzb, j);
        edit.apply();
        this.zze = j;
    }
}
