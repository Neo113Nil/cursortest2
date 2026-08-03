package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzbz {
    private final java.util.Map zza = new java.util.HashMap();
    private final java.util.List zzb = new java.util.ArrayList();
    private final android.content.Context zzc;

    zzbz(android.content.Context context) {
        this.zzc = context;
    }

    public final void zza() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlP)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            final java.util.Map zzx = com.google.android.gms.ads.internal.util.zzs.zzx((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlU));
            java.util.Iterator it = zzx.keySet().iterator();
            while (it.hasNext()) {
                zzc((java.lang.String) it.next());
            }
            zzb(new com.google.android.gms.ads.internal.util.zzbx() { // from class: com.google.android.gms.ads.internal.util.zzby
                @Override // com.google.android.gms.ads.internal.util.zzbx
                public final /* synthetic */ void zza(android.content.SharedPreferences sharedPreferences, java.lang.String str, java.lang.String str2) {
                    java.util.Map map = zzx;
                    if (map.containsKey(str) && ((java.util.Set) map.get(str)).contains(str2)) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzo().zzy(false);
                    }
                }
            });
        }
    }

    final synchronized void zzb(com.google.android.gms.ads.internal.util.zzbx zzbxVar) {
        this.zzb.add(zzbxVar);
    }

    final synchronized void zzc(java.lang.String str) {
        java.util.Map map = this.zza;
        if (map.containsKey(str)) {
            return;
        }
        android.content.SharedPreferences defaultSharedPreferences = java.util.Objects.equals(str, "__default__") ? android.preference.PreferenceManager.getDefaultSharedPreferences(this.zzc) : this.zzc.getSharedPreferences(str, 0);
        com.google.android.gms.ads.internal.util.zzbw zzbwVar = new com.google.android.gms.ads.internal.util.zzbw(this, str);
        map.put(str, zzbwVar);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzbwVar);
    }

    final /* synthetic */ java.util.List zzd() {
        return this.zzb;
    }
}
