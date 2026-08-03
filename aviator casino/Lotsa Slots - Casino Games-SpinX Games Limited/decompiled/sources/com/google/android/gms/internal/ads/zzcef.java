package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcef {
    private final java.util.Map zza = new java.util.HashMap();
    private final java.util.List zzb = new java.util.ArrayList();
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzcds zzd;

    zzcef(android.content.Context context, com.google.android.gms.internal.ads.zzcds zzcdsVar) {
        this.zzc = context;
        this.zzd = zzcdsVar;
    }

    final synchronized void zza(com.google.android.gms.internal.ads.zzced zzcedVar) {
        this.zzb.add(zzcedVar);
    }

    final synchronized void zzb(java.lang.String str) {
        java.util.Map map = this.zza;
        if (map.containsKey(str)) {
            return;
        }
        android.content.SharedPreferences defaultSharedPreferences = java.util.Objects.equals(str, "__default__") ? android.preference.PreferenceManager.getDefaultSharedPreferences(this.zzc) : this.zzc.getSharedPreferences(str, 0);
        com.google.android.gms.internal.ads.zzcec zzcecVar = new com.google.android.gms.internal.ads.zzcec(this, str);
        map.put(str, zzcecVar);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzcecVar);
    }

    final /* synthetic */ void zzc(java.util.Map map, android.content.SharedPreferences sharedPreferences, java.lang.String str, java.lang.String str2) {
        if (map.containsKey(str) && ((java.util.Set) map.get(str)).contains(str2)) {
            this.zzd.zzb();
        }
    }

    final /* synthetic */ java.util.List zzd() {
        return this.zzb;
    }
}
