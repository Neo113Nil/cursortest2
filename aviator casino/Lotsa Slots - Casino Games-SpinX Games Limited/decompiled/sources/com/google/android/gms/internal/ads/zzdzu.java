package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public class zzdzu {
    protected final java.util.Map zza;
    protected final android.content.Context zzb;
    protected final java.util.concurrent.Executor zzc;
    protected final com.google.android.gms.ads.internal.util.client.zzu zzd;
    protected final boolean zze;
    private final com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder zzf;
    private final boolean zzg;
    private final java.util.concurrent.atomic.AtomicBoolean zzh;
    private final java.util.concurrent.atomic.AtomicReference zzi;

    protected zzdzu(java.util.concurrent.Executor executor, com.google.android.gms.ads.internal.util.client.zzu zzuVar, com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder csiUrlBuilder, android.content.Context context) {
        this.zza = new java.util.HashMap();
        this.zzh = new java.util.concurrent.atomic.AtomicBoolean();
        this.zzi = new java.util.concurrent.atomic.AtomicReference(new android.os.Bundle());
        this.zzc = executor;
        this.zzd = zzuVar;
        this.zze = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcI)).booleanValue();
        this.zzf = csiUrlBuilder;
        this.zzg = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhU)).booleanValue();
        this.zzb = context;
    }

    private final void zza(java.util.Map map) {
        if (map == null || map.isEmpty()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Empty or null paramMap.");
            return;
        }
        if (!this.zzh.getAndSet(true)) {
            final java.lang.String str = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlV);
            this.zzi.set(com.google.android.gms.ads.internal.util.zzac.zzc(this.zzb, str, new android.content.SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.ads.zzdzs
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final /* synthetic */ void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str2) {
                    com.google.android.gms.internal.ads.zzdzu.this.zzg(str, sharedPreferences, str2);
                }
            }));
        }
        android.os.Bundle bundle = (android.os.Bundle) this.zzi.get();
        for (java.lang.String str2 : bundle.keySet()) {
            map.put(str2, java.lang.String.valueOf(bundle.get(str2)));
        }
    }

    public final void zzb(java.util.Map map) {
        if (map.isEmpty()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Empty paramMap.");
            return;
        }
        zza(map);
        final java.lang.String generateUrl = this.zzf.generateUrl(map);
        com.google.android.gms.ads.internal.util.zze.zza(generateUrl);
        boolean parseBoolean = java.lang.Boolean.parseBoolean((java.lang.String) map.get("scar"));
        if (this.zze) {
            if (!parseBoolean || this.zzg) {
                this.zzc.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdzt
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.internal.ads.zzdzu.this.zzd.zzc(generateUrl, null);
                    }
                });
            }
        }
    }

    protected final java.lang.String zzc(java.util.Map map) {
        return this.zzf.generateUrl(map);
    }

    public final java.util.concurrent.ConcurrentHashMap zzd() {
        return new java.util.concurrent.ConcurrentHashMap(this.zza);
    }

    public final com.google.android.gms.ads.internal.util.client.zzt zze(java.util.Map map) {
        if (map.isEmpty()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Empty paramMap.");
            return com.google.android.gms.ads.internal.util.client.zzt.SUCCESS;
        }
        java.lang.String generateUrl = this.zzf.generateUrl(map);
        com.google.android.gms.ads.internal.util.zze.zza(generateUrl);
        return this.zzd.zzc(generateUrl, null);
    }

    public final void zzf(java.util.Map map) {
        if (map.isEmpty()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Empty paramMap.");
            return;
        }
        zza(map);
        final java.lang.String generateUrl = this.zzf.generateUrl(map);
        com.google.android.gms.ads.internal.util.zze.zza(generateUrl);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoG)).booleanValue() || this.zze) {
            this.zzc.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdzr
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzdzu.this.zzd.zzc(generateUrl, null);
                }
            });
        }
    }

    final /* synthetic */ void zzg(java.lang.String str, android.content.SharedPreferences sharedPreferences, java.lang.String str2) {
        this.zzi.set(com.google.android.gms.ads.internal.util.zzac.zzb(this.zzb, str));
    }
}
