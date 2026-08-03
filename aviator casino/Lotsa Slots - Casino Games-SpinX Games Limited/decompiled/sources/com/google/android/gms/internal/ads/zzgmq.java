package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgmq implements com.google.android.gms.internal.ads.zzgme {
    private final android.content.Context zza;
    private final java.util.concurrent.ExecutorService zzb;
    private final com.google.android.gms.internal.ads.zzgee zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;
    private final com.google.android.gms.internal.ads.zzgqh zzf;
    private final com.google.android.gms.internal.ads.zzgms zzg;
    private final int zzh;

    zzgmq(android.content.Context context, java.util.concurrent.ExecutorService executorService, com.google.android.gms.internal.ads.zzgdf zzgdfVar, com.google.android.gms.internal.ads.zzgee zzgeeVar, com.google.android.gms.internal.ads.zzgqh zzgqhVar, com.google.android.gms.internal.ads.zzgms zzgmsVar) {
        this.zza = context;
        this.zzb = executorService;
        this.zzc = zzgeeVar;
        this.zzf = zzgqhVar;
        this.zzg = zzgmsVar;
        this.zzd = zzgdfVar.zzd();
        this.zzh = com.google.android.gms.internal.ads.zzbdv.zzb(com.google.android.gms.internal.ads.zzgde.zza(zzgdfVar.zzI()));
        this.zze = zzgdfVar.zzk().zzc();
    }

    private static com.google.android.gms.internal.ads.zzgfo zze(int i) {
        com.google.android.gms.internal.ads.zzgfn zzd = com.google.android.gms.internal.ads.zzgfo.zzd();
        zzd.zzd(i);
        return (com.google.android.gms.internal.ads.zzgfo) zzd.zzbu();
    }

    @Override // com.google.android.gms.internal.ads.zzgme
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        int i;
        com.google.android.gms.internal.ads.zzbdj zza = com.google.android.gms.internal.ads.zzbdk.zza();
        byte[] zza2 = com.google.android.gms.internal.ads.zzava.zza();
        com.google.android.gms.internal.ads.zzida zzidaVar = com.google.android.gms.internal.ads.zzida.zza;
        zza.zza(com.google.android.gms.internal.ads.zzida.zzt(zza2, 0, zza2.length));
        zza.zzb(android.os.Build.VERSION.SDK_INT);
        zza.zzc(android.os.Build.MODEL);
        android.content.Context context = this.zza;
        zza.zzd(context.getPackageName());
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            i = -1;
        }
        com.google.android.gms.internal.ads.zzgee zzgeeVar = this.zzc;
        com.google.android.gms.internal.ads.zzgqh zzgqhVar = this.zzf;
        zza.zze(i);
        zza.zzf(this.zzd);
        zza.zzg(3);
        zza.zzh(this.zzh);
        com.google.android.gms.internal.ads.zzhbo zzhboVar = (com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzg((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzg((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzk(com.google.android.gms.internal.ads.zzhbo.zzw(zzgeeVar.zza(android.net.Uri.parse(this.zze).buildUpon().appendQueryParameter("aspq", com.google.android.gms.internal.ads.zzgea.zza(((com.google.android.gms.internal.ads.zzbdk) zza.zzbu()).zzaN(), true)).build().toString())), new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzgmp
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzgmq.this.zzb((com.google.android.gms.internal.ads.zzged) obj);
            }
        }, this.zzb), java.net.UnknownHostException.class, new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzgmn
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzgmq.this.zzc((java.net.UnknownHostException) obj);
            }
        }, com.google.android.gms.internal.ads.zzhcn.zza()), java.net.SocketException.class, new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzgmo
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzgmq.this.zzd((java.net.SocketException) obj);
            }
        }, com.google.android.gms.internal.ads.zzhcn.zza());
        zzgqhVar.zze(20002, zzhboVar);
        return zzhboVar;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzgfo zzb(com.google.android.gms.internal.ads.zzged zzgedVar) {
        com.google.android.gms.internal.ads.zzgfo zze;
        if (zzgedVar.zza() != 200) {
            this.zzf.zzc(20003, new java.lang.String(com.google.android.gms.internal.ads.zzava.zza(), java.nio.charset.StandardCharsets.UTF_8));
            return zze(7);
        }
        try {
            java.lang.String zzb = zzgedVar.zzb();
            if (android.text.TextUtils.isEmpty(zzb)) {
                this.zzf.zzb(20004);
                zze = zze(8);
            } else {
                com.google.android.gms.internal.ads.zzbdm zzc = com.google.android.gms.internal.ads.zzbdm.zzc(com.google.android.gms.internal.ads.zzgea.zzb(zzb, true), com.google.android.gms.internal.ads.zzido.zzb());
                if (zzc.zza().zzc() && zzc.zza().zza()) {
                    if (this.zzg.zza(zzc)) {
                        com.google.android.gms.internal.ads.zzgfn zzd = com.google.android.gms.internal.ads.zzgfo.zzd();
                        com.google.android.gms.internal.ads.zzgfp zzg = com.google.android.gms.internal.ads.zzgfq.zzg();
                        zzg.zzb(zzc.zza().zzb());
                        zzg.zzd(zzc.zzb());
                        zzd.zza((com.google.android.gms.internal.ads.zzgfq) zzg.zzbu());
                        zzd.zzb(zzc.zza().zzd());
                        zzd.zzd(2);
                        zze = (com.google.android.gms.internal.ads.zzgfo) zzd.zzbu();
                    } else {
                        this.zzf.zzb(20006);
                        zze = zze(12);
                    }
                }
                this.zzf.zzb(20004);
                zze = zze(8);
            }
            return zze;
        } catch (java.lang.Throwable th) {
            this.zzf.zzd(20005, th);
            return zze(6);
        }
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzgfo zzc(java.net.UnknownHostException unknownHostException) {
        this.zzf.zzb(20007);
        return zze(13);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzgfo zzd(java.net.SocketException socketException) {
        this.zzf.zzb(20008);
        return zze(13);
    }
}
