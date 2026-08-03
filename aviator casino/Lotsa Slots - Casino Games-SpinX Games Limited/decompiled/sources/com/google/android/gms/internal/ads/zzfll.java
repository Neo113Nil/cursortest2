package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfll {
    private final com.google.android.gms.internal.ads.zzfkf zza;
    private final com.google.android.gms.internal.ads.zzfki zzb;
    private final com.google.android.gms.internal.ads.zzfsc zzc;
    private final com.google.android.gms.internal.ads.zzfru zzd;
    private final com.google.android.gms.internal.ads.zzfqg zze;
    private final com.google.android.gms.internal.ads.zzctj zzf;

    public zzfll(com.google.android.gms.internal.ads.zzfsc zzfscVar, com.google.android.gms.internal.ads.zzfru zzfruVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzfki zzfkiVar, com.google.android.gms.internal.ads.zzctj zzctjVar, com.google.android.gms.internal.ads.zzfqg zzfqgVar) {
        this.zza = zzfkfVar;
        this.zzb = zzfkiVar;
        this.zzc = zzfscVar;
        this.zzd = zzfruVar;
        this.zzf = zzctjVar;
        this.zze = zzfqgVar;
    }

    public final void zza(java.util.List list, com.google.android.gms.internal.ads.zzdfg zzdfgVar) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            zzc((java.lang.String) it.next(), 2, zzdfgVar);
        }
    }

    public final void zzb(java.util.List list, int i) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.google.android.gms.internal.ads.zzhbw.zzr((((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlw)).booleanValue() && com.google.android.gms.internal.ads.zzctj.zzc(str)) ? this.zzf.zzb(str, com.google.android.gms.ads.internal.client.zzay.zzh()) : com.google.android.gms.internal.ads.zzhbw.zza(str), new com.google.android.gms.internal.ads.zzflk(this, i), com.google.android.gms.internal.ads.zzcfr.zza);
        }
    }

    public final void zzc(java.lang.String str, int i, com.google.android.gms.internal.ads.zzdfg zzdfgVar) {
        com.google.android.gms.internal.ads.zzfkf zzfkfVar = this.zza;
        if (zzfkfVar.zzai) {
            this.zzd.zza(str, this.zzb.zzb, i);
            return;
        }
        this.zzc.zzb(str, zzfkfVar.zzax, this.zze, zzdfgVar);
    }
}
