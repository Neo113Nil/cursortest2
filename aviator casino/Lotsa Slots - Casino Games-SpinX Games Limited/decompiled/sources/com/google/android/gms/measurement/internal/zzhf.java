package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzhf {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzhg zza;
    private final java.lang.String zzb;
    private boolean zzc;
    private java.lang.String zzd;

    public zzhf(com.google.android.gms.measurement.internal.zzhg zzhgVar, java.lang.String str, java.lang.String str2) {
        java.util.Objects.requireNonNull(zzhgVar);
        this.zza = zzhgVar;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zzb = str;
    }

    public final java.lang.String zza() {
        if (!this.zzc) {
            this.zzc = true;
            com.google.android.gms.measurement.internal.zzhg zzhgVar = this.zza;
            this.zzd = zzhgVar.zzd().getString(this.zzb, null);
        }
        return this.zzd;
    }

    public final void zzb(java.lang.String str) {
        android.content.SharedPreferences.Editor edit = this.zza.zzd().edit();
        edit.putString(this.zzb, str);
        edit.apply();
        this.zzd = str;
    }
}
