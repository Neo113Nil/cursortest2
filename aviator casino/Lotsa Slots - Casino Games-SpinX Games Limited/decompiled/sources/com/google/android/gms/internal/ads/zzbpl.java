package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzbpl implements com.google.android.gms.internal.ads.zzbpq {
    static final /* synthetic */ com.google.android.gms.internal.ads.zzbpl zza = new com.google.android.gms.internal.ads.zzbpl();

    private /* synthetic */ zzbpl() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcmg zzcmgVar = (com.google.android.gms.internal.ads.zzcmg) obj;
        com.google.android.gms.internal.ads.zzbpq zzbpqVar = com.google.android.gms.internal.ads.zzbpp.zza;
        java.lang.String str = (java.lang.String) map.get("u");
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from httpTrack GMSG.");
            return;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzg)).booleanValue() && str.isEmpty()) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("URL is empty from httpTrack GMSG.");
        } else {
            com.google.android.gms.internal.ads.zzckl zzcklVar = (com.google.android.gms.internal.ads.zzckl) zzcmgVar;
            new com.google.android.gms.ads.internal.util.zzbt(zzcmgVar.getContext(), ((com.google.android.gms.internal.ads.zzcmo) zzcmgVar).zzs().afmaVersion, str, null, zzcklVar.zzC() != null ? zzcklVar.zzC().zzax : null).zzb();
        }
    }
}
