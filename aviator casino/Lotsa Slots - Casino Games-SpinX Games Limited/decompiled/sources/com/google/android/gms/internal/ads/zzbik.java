package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbik implements com.google.android.gms.internal.ads.zzblg {
    final /* synthetic */ android.content.SharedPreferences zza;

    zzbik(com.google.android.gms.internal.ads.zzbio zzbioVar, android.content.SharedPreferences sharedPreferences) {
        this.zza = sharedPreferences;
        java.util.Objects.requireNonNull(zzbioVar);
    }

    @Override // com.google.android.gms.internal.ads.zzblg
    public final java.lang.Boolean zza(java.lang.String str, boolean z) {
        try {
            return java.lang.Boolean.valueOf(this.zza.getBoolean(str, z));
        } catch (java.lang.ClassCastException unused) {
            return java.lang.Boolean.valueOf(this.zza.getString(str, java.lang.String.valueOf(z)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblg
    public final java.lang.Long zzb(java.lang.String str, long j) {
        try {
            return java.lang.Long.valueOf(this.zza.getLong(str, j));
        } catch (java.lang.ClassCastException unused) {
            return java.lang.Long.valueOf(this.zza.getInt(str, (int) j));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblg
    public final java.lang.Double zzc(java.lang.String str, double d) {
        try {
            return java.lang.Double.valueOf(this.zza.getFloat(str, (float) d));
        } catch (java.lang.ClassCastException unused) {
            return java.lang.Double.valueOf(this.zza.getString(str, java.lang.String.valueOf(d)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblg
    public final java.lang.String zzd(java.lang.String str, java.lang.String str2) {
        return this.zza.getString(str, str2);
    }
}
