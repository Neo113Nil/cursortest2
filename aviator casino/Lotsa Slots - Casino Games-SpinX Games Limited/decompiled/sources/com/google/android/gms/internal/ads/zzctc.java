package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzctc implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfsc zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzv zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzctj zzd;

    zzctc(com.google.android.gms.internal.ads.zzctj zzctjVar, com.google.android.gms.internal.ads.zzfsc zzfscVar, java.lang.String str, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        this.zza = zzfscVar;
        this.zzb = str;
        this.zzc = zzvVar;
        java.util.Objects.requireNonNull(zzctjVar);
        this.zzd = zzctjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(final java.lang.Throwable th) {
        final com.google.android.gms.internal.ads.zzfsc zzfscVar = this.zza;
        final java.lang.String str = this.zzb;
        final com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zzc;
        this.zzd.zzj().zza(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzctb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean booleanValue = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlK)).booleanValue();
                java.lang.Throwable th2 = th;
                com.google.android.gms.internal.ads.zzctc zzctcVar = com.google.android.gms.internal.ads.zzctc.this;
                if (booleanValue) {
                    com.google.android.gms.internal.ads.zzctj zzctjVar = zzctcVar.zzd;
                    zzctjVar.zzb = com.google.android.gms.internal.ads.zzbzy.zzc(zzctjVar.zzi());
                    zzctjVar.zzb.zzh(th2, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    com.google.android.gms.internal.ads.zzctj zzctjVar2 = zzctcVar.zzd;
                    zzctjVar2.zza = com.google.android.gms.internal.ads.zzbzy.zza(zzctjVar2.zzi());
                    zzctjVar2.zza.zzh(th2, "AttributionReportingSampled.registerSourceAndPingClickUrl");
                }
                com.google.android.gms.ads.internal.util.client.zzv zzvVar2 = zzvVar;
                zzfscVar.zzb(str, zzvVar2, null, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        final com.google.android.gms.internal.ads.zzfsc zzfscVar = this.zza;
        final java.lang.String str = (java.lang.String) obj;
        final com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zzc;
        this.zzd.zzj().zza(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcta
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzfsc.this.zzb(str, zzvVar, null, null);
            }
        });
    }
}
