package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzcea {
    static com.google.android.gms.internal.ads.zzcea zzi;

    public static synchronized com.google.android.gms.internal.ads.zzcea zzb(android.content.Context context) {
        synchronized (com.google.android.gms.internal.ads.zzcea.class) {
            com.google.android.gms.internal.ads.zzcea zzceaVar = zzi;
            if (zzceaVar != null) {
                return zzceaVar;
            }
            android.content.Context applicationContext = context.getApplicationContext();
            com.google.android.gms.internal.ads.zzbiq.zza(applicationContext);
            com.google.android.gms.ads.internal.util.zzg zzo = com.google.android.gms.ads.internal.zzt.zzh().zzo();
            zzo.zza(applicationContext);
            com.google.android.gms.internal.ads.zzcdu zzcduVar = new com.google.android.gms.internal.ads.zzcdu(null);
            zzcduVar.zza(applicationContext);
            zzcduVar.zzb(com.google.android.gms.ads.internal.zzt.zzk());
            zzcduVar.zzc(zzo);
            zzcduVar.zzd(com.google.android.gms.ads.internal.zzt.zzD());
            com.google.android.gms.internal.ads.zzcea zze = zzcduVar.zze();
            zzi = zze;
            ((com.google.android.gms.internal.ads.zzcdo) ((com.google.android.gms.internal.ads.zzcdv) zze).zzc.zzb()).zza();
            final com.google.android.gms.internal.ads.zzcef zzcefVar = (com.google.android.gms.internal.ads.zzcef) ((com.google.android.gms.internal.ads.zzcdv) zzi).zzh.zzb();
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbf)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                final java.util.Map zzx = com.google.android.gms.ads.internal.util.zzs.zzx((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbg));
                java.util.Iterator it = zzx.keySet().iterator();
                while (it.hasNext()) {
                    zzcefVar.zzb((java.lang.String) it.next());
                }
                zzcefVar.zza(new com.google.android.gms.internal.ads.zzced() { // from class: com.google.android.gms.internal.ads.zzcee
                    @Override // com.google.android.gms.internal.ads.zzced
                    public final /* synthetic */ void zza(android.content.SharedPreferences sharedPreferences, java.lang.String str, java.lang.String str2) {
                        com.google.android.gms.internal.ads.zzcef.this.zzc(zzx, sharedPreferences, str, str2);
                    }
                });
            }
            return zzi;
        }
    }

    abstract com.google.android.gms.internal.ads.zzcds zza();
}
