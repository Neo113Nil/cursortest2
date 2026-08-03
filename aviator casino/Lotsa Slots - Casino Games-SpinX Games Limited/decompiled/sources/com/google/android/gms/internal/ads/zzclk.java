package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
public final class zzclk {
    public static final com.google.android.gms.internal.ads.zzcku zza(final android.content.Context context, final com.google.android.gms.internal.ads.zzcne zzcneVar, final java.lang.String str, final boolean z, final boolean z2, final com.google.android.gms.internal.ads.zzbap zzbapVar, final com.google.android.gms.internal.ads.zzbjx zzbjxVar, final com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzbjf zzbjfVar, final com.google.android.gms.ads.internal.zzn zznVar, final com.google.android.gms.ads.internal.zza zzaVar, final com.google.android.gms.internal.ads.zzbhp zzbhpVar, final com.google.android.gms.internal.ads.zzfkf zzfkfVar, final com.google.android.gms.internal.ads.zzfki zzfkiVar, final com.google.android.gms.internal.ads.zzekr zzekrVar, final com.google.android.gms.internal.ads.zzflc zzflcVar, final com.google.android.gms.internal.ads.zzdzl zzdzlVar) throws com.google.android.gms.internal.ads.zzclj {
        com.google.android.gms.internal.ads.zzbiq.zza(context);
        try {
            final com.google.android.gms.internal.ads.zzbjf zzbjfVar2 = null;
            com.google.android.gms.internal.ads.zzgub zzgubVar = new com.google.android.gms.internal.ads.zzgub(context, zzcneVar, str, z, z2, zzbapVar, zzbjxVar, versionInfoParcel, zzbjfVar2, zznVar, zzaVar, zzbhpVar, zzfkfVar, zzfkiVar, zzflcVar, zzdzlVar, zzekrVar) { // from class: com.google.android.gms.internal.ads.zzclg
                private final /* synthetic */ android.content.Context zza;
                private final /* synthetic */ com.google.android.gms.internal.ads.zzcne zzb;
                private final /* synthetic */ java.lang.String zzc;
                private final /* synthetic */ boolean zzd;
                private final /* synthetic */ boolean zze;
                private final /* synthetic */ com.google.android.gms.internal.ads.zzbap zzf;
                private final /* synthetic */ com.google.android.gms.internal.ads.zzbjx zzg;
                private final /* synthetic */ com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzh;
                private final /* synthetic */ com.google.android.gms.ads.internal.zzn zzi;
                private final /* synthetic */ com.google.android.gms.ads.internal.zza zzj;
                private final /* synthetic */ com.google.android.gms.internal.ads.zzbhp zzk;
                private final /* synthetic */ com.google.android.gms.internal.ads.zzfkf zzl;
                private final /* synthetic */ com.google.android.gms.internal.ads.zzfki zzm;
                private final /* synthetic */ com.google.android.gms.internal.ads.zzflc zzn;
                private final /* synthetic */ com.google.android.gms.internal.ads.zzdzl zzo;
                private final /* synthetic */ com.google.android.gms.internal.ads.zzekr zzp;

                {
                    this.zzi = zznVar;
                    this.zzj = zzaVar;
                    this.zzk = zzbhpVar;
                    this.zzl = zzfkfVar;
                    this.zzm = zzfkiVar;
                    this.zzn = zzflcVar;
                    this.zzo = zzdzlVar;
                    this.zzp = zzekrVar;
                }

                @Override // com.google.android.gms.internal.ads.zzgub
                public final /* synthetic */ java.lang.Object zza() {
                    com.google.android.gms.internal.ads.zzcne zzcneVar2 = this.zzb;
                    java.lang.String str2 = this.zzc;
                    boolean z3 = this.zzd;
                    boolean z4 = this.zze;
                    com.google.android.gms.internal.ads.zzekr zzekrVar2 = this.zzp;
                    com.google.android.gms.internal.ads.zzdzl zzdzlVar2 = this.zzo;
                    com.google.android.gms.ads.internal.zzn zznVar2 = this.zzi;
                    com.google.android.gms.ads.internal.zza zzaVar2 = this.zzj;
                    com.google.android.gms.internal.ads.zzbhp zzbhpVar2 = this.zzk;
                    com.google.android.gms.internal.ads.zzfkf zzfkfVar2 = this.zzl;
                    com.google.android.gms.internal.ads.zzfki zzfkiVar2 = this.zzm;
                    com.google.android.gms.internal.ads.zzflc zzflcVar2 = this.zzn;
                    com.google.android.gms.internal.ads.zzbap zzbapVar2 = this.zzf;
                    com.google.android.gms.internal.ads.zzbjx zzbjxVar2 = this.zzg;
                    com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel2 = this.zzh;
                    android.content.Context context2 = this.zza;
                    try {
                        android.net.TrafficStats.setThreadStatsTag(264);
                        int i = com.google.android.gms.internal.ads.zzclx.zza;
                        com.google.android.gms.internal.ads.zzclq zzclqVar = new com.google.android.gms.internal.ads.zzclq(new com.google.android.gms.internal.ads.zzclx(new com.google.android.gms.internal.ads.zzcmw(context2), zzcneVar2, str2, z3, z4, zzbapVar2, zzbjxVar2, versionInfoParcel2, null, zznVar2, zzaVar2, zzbhpVar2, zzfkfVar2, zzfkiVar2, zzflcVar2), zzdzlVar2);
                        zzclqVar.setWebViewClient(com.google.android.gms.ads.internal.zzt.zzf().zzb(zzclqVar, zzbhpVar2, z4, zzekrVar2));
                        zzclqVar.setWebChromeClient(new com.google.android.gms.internal.ads.zzckt(zzclqVar));
                        return zzclqVar;
                    } finally {
                        android.net.TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
            try {
                android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                java.lang.Object zza = zzgubVar.zza();
                android.os.StrictMode.setThreadPolicy(threadPolicy);
                return (com.google.android.gms.internal.ads.zzcku) zza;
            } catch (java.lang.Throwable th) {
                android.os.StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            throw new com.google.android.gms.internal.ads.zzclj("Webview initialization failed.", th2);
        }
    }

    public static final com.google.common.util.concurrent.ListenableFuture zzb(final android.content.Context context, final com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, final java.lang.String str, final com.google.android.gms.internal.ads.zzbap zzbapVar, final com.google.android.gms.ads.internal.zza zzaVar, final com.google.android.gms.internal.ads.zzekr zzekrVar, final com.google.android.gms.internal.ads.zzflc zzflcVar, final com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        return com.google.android.gms.internal.ads.zzhbw.zzf(new com.google.android.gms.internal.ads.zzhbd() { // from class: com.google.android.gms.internal.ads.zzcli
            @Override // com.google.android.gms.internal.ads.zzhbd
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza() {
                com.google.android.gms.ads.internal.zzt.zzd();
                android.content.Context context2 = context;
                com.google.android.gms.internal.ads.zzcne zzb = com.google.android.gms.internal.ads.zzcne.zzb();
                com.google.android.gms.ads.internal.zza zzaVar2 = zzaVar;
                com.google.android.gms.internal.ads.zzbhp zza = com.google.android.gms.internal.ads.zzbhp.zza();
                com.google.android.gms.internal.ads.zzekr zzekrVar2 = zzekrVar;
                com.google.android.gms.internal.ads.zzflc zzflcVar2 = zzflcVar;
                com.google.android.gms.internal.ads.zzdzl zzdzlVar2 = zzdzlVar;
                com.google.android.gms.internal.ads.zzcku zza2 = com.google.android.gms.internal.ads.zzclk.zza(context2, zzb, "", false, false, zzbapVar, null, versionInfoParcel, null, null, zzaVar2, zza, null, null, zzekrVar2, zzflcVar2, zzdzlVar2);
                final com.google.android.gms.internal.ads.zzcfv zza3 = com.google.android.gms.internal.ads.zzcfv.zza(zza2);
                zza2.zzP().zzG(new com.google.android.gms.internal.ads.zzcmq() { // from class: com.google.android.gms.internal.ads.zzclh
                    @Override // com.google.android.gms.internal.ads.zzcmq
                    public final /* synthetic */ void zza(boolean z, int i, java.lang.String str2, java.lang.String str3) {
                        com.google.android.gms.internal.ads.zzcfv.this.zzb();
                    }
                });
                zza2.loadUrl(str);
                return zza3;
            }
        }, com.google.android.gms.internal.ads.zzcfr.zzf);
    }
}
