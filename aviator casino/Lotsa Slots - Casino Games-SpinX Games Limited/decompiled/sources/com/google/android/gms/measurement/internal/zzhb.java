package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzhb {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzhg zza;
    private final java.lang.String zzb;
    private final boolean zzc;
    private boolean zzd;
    private boolean zze;

    public zzhb(com.google.android.gms.measurement.internal.zzhg zzhgVar, java.lang.String str, boolean z) {
        java.util.Objects.requireNonNull(zzhgVar);
        this.zza = zzhgVar;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = z;
    }

    public final boolean zza() {
        if (!this.zzd) {
            this.zzd = true;
            com.google.android.gms.measurement.internal.zzhg zzhgVar = this.zza;
            this.zze = zzhgVar.zzd().getBoolean(this.zzb, this.zzc);
        }
        return this.zze;
    }

    public final void zzb(boolean z) {
        android.content.SharedPreferences.Editor edit = this.zza.zzd().edit();
        edit.putBoolean(this.zzb, z);
        edit.apply();
        this.zze = z;
    }
}
