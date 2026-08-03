package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeqn implements com.google.android.gms.internal.ads.zzelu {
    private final com.google.android.gms.internal.ads.zzerr zza;
    private final com.google.android.gms.internal.ads.zzdxc zzb;

    zzeqn(com.google.android.gms.internal.ads.zzerr zzerrVar, com.google.android.gms.internal.ads.zzdxc zzdxcVar) {
        this.zza = zzerrVar;
        this.zzb = zzdxcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelu
    public final com.google.android.gms.internal.ads.zzelv zza(java.lang.String str, org.json.JSONObject jSONObject) throws com.google.android.gms.internal.ads.zzflf {
        com.google.android.gms.internal.ads.zzbxb zzbxbVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcp)).booleanValue()) {
            try {
                zzbxbVar = this.zzb.zzb(str);
            } catch (android.os.RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Coundn't create RTB adapter: ", e);
                zzbxbVar = null;
            }
        } else {
            zzbxbVar = this.zza.zzb(str);
        }
        if (zzbxbVar == null) {
            return null;
        }
        return new com.google.android.gms.internal.ads.zzelv(zzbxbVar, new com.google.android.gms.internal.ads.zzenh(), str);
    }
}
