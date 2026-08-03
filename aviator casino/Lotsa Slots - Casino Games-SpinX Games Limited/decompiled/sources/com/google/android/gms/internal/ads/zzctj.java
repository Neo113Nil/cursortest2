package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzctj {
    com.google.android.gms.internal.ads.zzcaa zza;
    com.google.android.gms.internal.ads.zzcaa zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final com.google.android.gms.internal.ads.zzelo zze;
    private final com.google.android.gms.internal.ads.zzdwn zzf;
    private final com.google.android.gms.internal.ads.zzhcg zzg;
    private final java.util.concurrent.Executor zzh;
    private final java.util.concurrent.ScheduledExecutorService zzi;

    zzctj(android.content.Context context, com.google.android.gms.ads.internal.util.zzg zzgVar, com.google.android.gms.internal.ads.zzelo zzeloVar, com.google.android.gms.internal.ads.zzdwn zzdwnVar, com.google.android.gms.internal.ads.zzhcg zzhcgVar, com.google.android.gms.internal.ads.zzhcg zzhcgVar2, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.zzc = context;
        this.zzd = zzgVar;
        this.zze = zzeloVar;
        this.zzf = zzdwnVar;
        this.zzg = zzhcgVar;
        this.zzh = zzhcgVar2;
        this.zzi = scheduledExecutorService;
    }

    public static boolean zzc(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((java.lang.CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlD));
    }

    private final com.google.common.util.concurrent.ListenableFuture zzk(final java.lang.String str, final android.view.InputEvent inputEvent, java.util.Random random) {
        try {
            if (!str.contains((java.lang.CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlD)) || this.zzd.zzx()) {
                return com.google.android.gms.internal.ads.zzhbw.zza(str);
            }
            final android.net.Uri.Builder buildUpon = android.net.Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlE), java.lang.String.valueOf(random.nextInt(Integer.MAX_VALUE)));
            if (inputEvent != null) {
                return (com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzh((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzj(com.google.android.gms.internal.ads.zzhbo.zzw(this.zze.zza()), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzctd
                    @Override // com.google.android.gms.internal.ads.zzhbe
                    public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                        return com.google.android.gms.internal.ads.zzctj.this.zze(buildUpon, str, inputEvent, (java.lang.Integer) obj);
                    }
                }, this.zzh), java.lang.Throwable.class, new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzcte
                    @Override // com.google.android.gms.internal.ads.zzhbe
                    public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                        return com.google.android.gms.internal.ads.zzctj.this.zzf(buildUpon, (java.lang.Throwable) obj);
                    }
                }, this.zzg);
            }
            buildUpon.appendQueryParameter((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlF), "11");
            return com.google.android.gms.internal.ads.zzhbw.zza(buildUpon.toString());
        } catch (java.lang.Exception e) {
            return com.google.android.gms.internal.ads.zzhbw.zzc(e);
        }
    }

    public final void zza(java.lang.String str, com.google.android.gms.internal.ads.zzfsc zzfscVar, java.util.Random random, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.google.android.gms.internal.ads.zzhbw.zzr(com.google.android.gms.internal.ads.zzhbw.zzi(zzk(str, this.zzf.zzb(), random), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlJ)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.zzi), new com.google.android.gms.internal.ads.zzctc(this, zzfscVar, str, zzvVar), this.zzg);
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(final java.lang.String str, java.util.Random random) {
        return android.text.TextUtils.isEmpty(str) ? com.google.android.gms.internal.ads.zzhbw.zza(str) : com.google.android.gms.internal.ads.zzhbw.zzh(zzk(str, this.zzf.zzb(), random), java.lang.Throwable.class, new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzcti
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzctj.this.zzd(str, (java.lang.Throwable) obj);
            }
        }, this.zzg);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzd(java.lang.String str, final java.lang.Throwable th) {
        this.zzg.zza(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcth
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzctj.this.zzh(th);
            }
        });
        return com.google.android.gms.internal.ads.zzhbw.zza(str);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zze(final android.net.Uri.Builder builder, java.lang.String str, android.view.InputEvent inputEvent, java.lang.Integer num) {
        if (num.intValue() != 1) {
            builder.appendQueryParameter((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlF), "10");
            return com.google.android.gms.internal.ads.zzhbw.zza(builder.toString());
        }
        android.net.Uri.Builder buildUpon = builder.build().buildUpon();
        buildUpon.appendQueryParameter((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlG), "1");
        buildUpon.appendQueryParameter((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlF), "12");
        if (str.contains((java.lang.CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlH))) {
            buildUpon.authority((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlI));
        }
        return (com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzj(com.google.android.gms.internal.ads.zzhbo.zzw(this.zze.zzb(buildUpon.build(), inputEvent)), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzctf
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                java.lang.String str2 = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlF);
                android.net.Uri.Builder builder2 = builder;
                builder2.appendQueryParameter(str2, "12");
                return com.google.android.gms.internal.ads.zzhbw.zza(builder2.toString());
            }
        }, this.zzh);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzf(android.net.Uri.Builder builder, final java.lang.Throwable th) {
        this.zzg.zza(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzctg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzctj.this.zzg(th);
            }
        });
        builder.appendQueryParameter((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlF), "9");
        return com.google.android.gms.internal.ads.zzhbw.zza(builder.toString());
    }

    final /* synthetic */ void zzg(java.lang.Throwable th) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlK)).booleanValue()) {
            com.google.android.gms.internal.ads.zzcaa zzc = com.google.android.gms.internal.ads.zzbzy.zzc(this.zzc);
            this.zzb = zzc;
            zzc.zzh(th, "AttributionReporting");
        } else {
            com.google.android.gms.internal.ads.zzcaa zza = com.google.android.gms.internal.ads.zzbzy.zza(this.zzc);
            this.zza = zza;
            zza.zzh(th, "AttributionReportingSampled");
        }
    }

    final /* synthetic */ void zzh(java.lang.Throwable th) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlK)).booleanValue()) {
            com.google.android.gms.internal.ads.zzcaa zzc = com.google.android.gms.internal.ads.zzbzy.zzc(this.zzc);
            this.zzb = zzc;
            zzc.zzh(th, "AttributionReporting.getUpdatedUrlAndRegisterSource");
        } else {
            com.google.android.gms.internal.ads.zzcaa zza = com.google.android.gms.internal.ads.zzbzy.zza(this.zzc);
            this.zza = zza;
            zza.zzh(th, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
        }
    }

    final /* synthetic */ android.content.Context zzi() {
        return this.zzc;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzhcg zzj() {
        return this.zzg;
    }
}
