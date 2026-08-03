package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdxc {
    private final com.google.android.gms.internal.ads.zzflu zza;
    private final com.google.android.gms.internal.ads.zzdwz zzb;

    zzdxc(com.google.android.gms.internal.ads.zzflu zzfluVar, com.google.android.gms.internal.ads.zzdwz zzdwzVar) {
        this.zza = zzfluVar;
        this.zzb = zzdwzVar;
    }

    public final com.google.android.gms.internal.ads.zzflw zza(java.lang.String str, org.json.JSONObject jSONObject) throws com.google.android.gms.internal.ads.zzflf {
        com.google.android.gms.internal.ads.zzbvf zzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzb = new com.google.android.gms.internal.ads.zzbwd(new com.google.ads.mediation.admob.AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzb = new com.google.android.gms.internal.ads.zzbwd(new com.google.android.gms.internal.ads.zzbxu());
            } else {
                com.google.android.gms.internal.ads.zzbvc zzd = zzd();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        java.lang.String string = jSONObject.getString("class_name");
                        zzb = zzd.zzc(string) ? zzd.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : zzd.zzd(string) ? zzd.zzb(string) : zzd.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (org.json.JSONException e) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Invalid custom event.", e);
                    }
                }
                zzb = zzd.zzb(str);
            }
            com.google.android.gms.internal.ads.zzflw zzflwVar = new com.google.android.gms.internal.ads.zzflw(zzb);
            this.zzb.zza(str, zzflwVar);
            return zzflwVar;
        } catch (java.lang.Throwable th) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkL)).booleanValue()) {
                this.zzb.zza(str, null);
            }
            throw new com.google.android.gms.internal.ads.zzflf(th);
        }
    }

    public final com.google.android.gms.internal.ads.zzbxb zzb(java.lang.String str) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbxb zze = zzd().zze(str);
        this.zzb.zzb(str, zze);
        return zze;
    }

    public final boolean zzc() {
        return this.zza.zzd() != null;
    }

    final com.google.android.gms.internal.ads.zzbvc zzd() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbvc zzd = this.zza.zzd();
        if (zzd != null) {
            return zzd;
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Unexpected call to adapter creator.");
        throw new android.os.RemoteException();
    }
}
