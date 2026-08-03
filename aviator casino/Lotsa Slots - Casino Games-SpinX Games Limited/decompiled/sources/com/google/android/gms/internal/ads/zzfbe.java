package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfbe implements com.google.android.gms.internal.ads.zzfck {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzhcg zzb;
    private final com.google.android.gms.internal.ads.zzfky zzc;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzd;

    zzfbe(android.content.Context context, com.google.android.gms.internal.ads.zzhcg zzhcgVar, com.google.android.gms.internal.ads.zzfky zzfkyVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzhcgVar;
        this.zzc = zzfkyVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return this.zzb.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzfbd
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzfbe.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 53;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdW)).booleanValue() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        r1 = com.google.android.gms.internal.ads.zzgck.zzh(r0).zzi(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeh)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bb, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdX)).booleanValue() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d1, code lost:
    
        r4 = com.google.android.gms.internal.ads.zzgcl.zzh(r0);
        r0 = com.google.android.gms.internal.ads.zzgch.zza(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ed, code lost:
    
        if (r9.zzd.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzed)).intValue()) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ef, code lost:
    
        r2 = r4.zzi(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzei)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
        r3 = r0.zzc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0113, code lost:
    
        r6 = r0.zze();
        r4 = r2;
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cf, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdZ)).booleanValue() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0054, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdY)).booleanValue() != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ com.google.android.gms.internal.ads.zzfbf zzc() {
        try {
            android.content.Context context = this.zza;
            boolean zza = this.zzc.zza();
            com.google.android.gms.internal.ads.zzgcg zzgcgVar = new com.google.android.gms.internal.ads.zzgcg();
            com.google.android.gms.internal.ads.zzgcg zzgcgVar2 = new com.google.android.gms.internal.ads.zzgcg();
            boolean z = true;
            if (zza) {
                if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzea)).booleanValue()) {
                    return new com.google.android.gms.internal.ads.zzfbf(true);
                }
            }
            if (!zza) {
            }
            if (zza) {
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzee)).booleanValue()) {
                if (this.zzd.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzed)).intValue()) {
                    com.google.android.gms.internal.ads.zzgcl.zzh(context).zzj();
                }
            }
            if (!zza) {
            }
            if (zza) {
            }
            com.google.android.gms.internal.ads.zzgcg zzgcgVar3 = zzgcgVar2;
            boolean z2 = true;
            boolean z3 = true;
            return new com.google.android.gms.internal.ads.zzfbf(zzgcgVar, zzgcgVar3, z2, z3, zza);
        } catch (java.io.IOException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "PerAppIdSignal");
            return new com.google.android.gms.internal.ads.zzfbf(this.zzc.zza());
        }
    }
}
