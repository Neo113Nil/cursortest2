package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdzw {
    private final java.lang.String zze;
    private final com.google.android.gms.internal.ads.zzdzq zzf;
    private final java.util.List zzb = new java.util.ArrayList();
    private boolean zzc = false;
    private boolean zzd = false;
    private final com.google.android.gms.ads.internal.util.zzg zza = com.google.android.gms.ads.internal.zzt.zzh().zzo();

    public zzdzw(java.lang.String str, com.google.android.gms.internal.ads.zzdzq zzdzqVar) {
        this.zze = str;
        this.zzf = zzdzqVar;
    }

    private final java.util.Map zzg() {
        java.util.Map zza = this.zzf.zza();
        zza.put("tms", java.lang.Long.toString(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime(), 10));
        zza.put(com.unity3d.services.ads.gmascar.utils.ScarConstants.TOKEN_ID_KEY, this.zza.zzx() ? "" : this.zze);
        return zza;
    }

    public final synchronized void zza(java.lang.String str) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcK)).booleanValue()) {
            java.util.Map zzg = zzg();
            zzg.put("action", "adapter_init_started");
            zzg.put("ancn", str);
            this.zzb.add(zzg);
        }
    }

    public final synchronized void zzb(java.lang.String str) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcK)).booleanValue()) {
            java.util.Map zzg = zzg();
            zzg.put("action", "adapter_init_finished");
            zzg.put("ancn", str);
            this.zzb.add(zzg);
        }
    }

    public final synchronized void zzc(java.lang.String str, java.lang.String str2) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcK)).booleanValue()) {
            java.util.Map zzg = zzg();
            zzg.put("action", "adapter_init_finished");
            zzg.put("ancn", str);
            zzg.put("rqe", str2);
            this.zzb.add(zzg);
        }
    }

    public final synchronized void zzd(java.lang.String str) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcK)).booleanValue()) {
            java.util.Map zzg = zzg();
            zzg.put("action", "aaia");
            zzg.put("aair", "MalformedJson");
            this.zzb.add(zzg);
        }
    }

    public final synchronized void zze() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcK)).booleanValue() && !this.zzc) {
            java.util.Map zzg = zzg();
            zzg.put("action", "init_started");
            this.zzb.add(zzg);
            this.zzc = true;
        }
    }

    public final synchronized void zzf() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcK)).booleanValue() && !this.zzd) {
            java.util.Map zzg = zzg();
            zzg.put("action", "init_finished");
            java.util.List list = this.zzb;
            list.add(zzg);
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                this.zzf.zzb((java.util.Map) it.next());
            }
            this.zzd = true;
        }
    }
}
