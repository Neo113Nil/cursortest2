package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzj {
    private final java.util.Map zza = new java.util.HashMap();
    private final java.util.Map zzb = new java.util.HashMap();
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzdzq zzd;
    private final java.util.concurrent.ExecutorService zze;

    zzj(android.content.Context context, com.google.android.gms.internal.ads.zzdzq zzdzqVar, java.util.concurrent.ExecutorService executorService) {
        this.zzc = context;
        this.zzd = zzdzqVar;
        this.zze = executorService;
    }

    private final void zzh(final boolean z) {
        java.util.Map map = this.zzb;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z);
        if (map.containsKey(valueOf)) {
            return;
        }
        map.put(valueOf, new java.util.ArrayList());
        this.zze.submit(new java.lang.Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.ads.nonagon.signalgeneration.zzj.this.zzf(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final synchronized void zze(boolean z, boolean z2) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        bundle.putBoolean("accept_3p_cookie", z);
        java.util.Map map = this.zza;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z);
        com.google.android.gms.ads.nonagon.signalgeneration.zzl zzlVar = (com.google.android.gms.ads.nonagon.signalgeneration.zzl) map.get(valueOf);
        int i = 0;
        if (z2 && zzlVar != null) {
            i = zzlVar.zzd() + 1;
        }
        com.google.android.gms.ads.nonagon.signalgeneration.zzl zzlVar2 = (com.google.android.gms.ads.nonagon.signalgeneration.zzl) map.get(valueOf);
        final com.google.android.gms.ads.nonagon.signalgeneration.zzk zzkVar = new com.google.android.gms.ads.nonagon.signalgeneration.zzk(this, z, i, zzlVar2 == null ? null : java.lang.Boolean.valueOf(zzlVar2.zze()), this.zzd);
        final com.google.android.gms.ads.AdRequest build = new com.google.android.gms.ads.AdRequest.Builder().addNetworkExtrasBundle(com.google.ads.mediation.admob.AdMobAdapter.class, bundle).build();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmy)).booleanValue()) {
            this.zze.submit(new java.util.concurrent.Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzh
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ java.lang.Object call() {
                    return com.google.android.gms.ads.nonagon.signalgeneration.zzj.this.zzg(build, zzkVar);
                }
            });
        } else {
            com.google.android.gms.ads.query.QueryInfo.generate(this.zzc, com.google.android.gms.ads.AdFormat.BANNER, build, zzkVar);
        }
    }

    private final void zzj(com.google.android.gms.ads.nonagon.signalgeneration.zzl zzlVar, android.util.Pair pair, boolean z) {
        zzlVar.zzf();
        com.google.android.gms.ads.query.QueryInfo zza = zzlVar.zza();
        if (zza != null) {
            ((com.google.android.gms.ads.query.QueryInfoGenerationCallback) pair.first).onSuccess(zza);
        } else {
            ((com.google.android.gms.ads.query.QueryInfoGenerationCallback) pair.first).onFailure(zzlVar.zzb());
        }
        com.google.android.gms.internal.ads.zzdzq zzdzqVar = this.zzd;
        android.util.Pair[] pairArr = new android.util.Pair[7];
        pairArr[0] = new android.util.Pair("se", "query_g");
        pairArr[1] = new android.util.Pair(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, com.google.android.gms.ads.AdFormat.BANNER.name());
        pairArr[2] = new android.util.Pair("rtype", java.lang.Integer.toString(6));
        pairArr[3] = new android.util.Pair("scar", "true");
        pairArr[4] = new android.util.Pair("lat_ms", java.lang.Long.toString(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - ((java.lang.Long) pair.second).longValue()));
        pairArr[5] = new android.util.Pair("sgpc_h", java.lang.Boolean.toString(z));
        pairArr[6] = new android.util.Pair("sgpc_rs", java.lang.Boolean.toString(zzlVar.zza() != null));
        com.google.android.gms.ads.nonagon.signalgeneration.zzv.zze(zzdzqVar, null, "sgpcr", pairArr);
    }

    public final synchronized void zza() {
        zzh(true);
        zzh(false);
    }

    public final synchronized void zzb(final java.lang.Object obj, com.google.android.gms.ads.query.QueryInfoGenerationCallback queryInfoGenerationCallback) {
        final android.util.Pair pair = new android.util.Pair(queryInfoGenerationCallback, java.lang.Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
        com.google.android.gms.internal.ads.zzcfr.zzf.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.ads.nonagon.signalgeneration.zzj.this.zzd(obj, pair);
            }
        });
    }

    final synchronized void zzc(final boolean z, com.google.android.gms.ads.nonagon.signalgeneration.zzl zzlVar) {
        java.util.Map map = this.zza;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z);
        com.google.android.gms.ads.nonagon.signalgeneration.zzl zzlVar2 = (com.google.android.gms.ads.nonagon.signalgeneration.zzl) map.get(valueOf);
        if (zzlVar2 == null || zzlVar2.zzc() || zzlVar2.zza() == null || zzlVar.zza() != null) {
            map.put(valueOf, zzlVar);
        }
        long longValue = (zzlVar.zza() != null ? (java.lang.Long) com.google.android.gms.internal.ads.zzbkv.zzf.zze() : (java.lang.Long) com.google.android.gms.internal.ads.zzbkv.zzg.zze()).longValue();
        final boolean z2 = zzlVar.zza() == null;
        com.google.android.gms.internal.ads.zzcfr.zzd.schedule(new java.lang.Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.ads.nonagon.signalgeneration.zzj.this.zze(z, z2);
            }
        }, longValue, java.util.concurrent.TimeUnit.SECONDS);
        java.util.Map map2 = this.zzb;
        java.util.List list = (java.util.List) map2.get(valueOf);
        map2.put(valueOf, new java.util.ArrayList());
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                zzj(zzlVar, (android.util.Pair) it.next(), false);
            }
        }
    }

    final /* synthetic */ void zzd(java.lang.Object obj, android.util.Pair pair) {
        boolean z = false;
        if (obj instanceof android.webkit.WebView) {
            android.webkit.CookieManager zza = com.google.android.gms.ads.internal.zzt.zzf().zza(this.zzc);
            if (zza != null) {
                z = zza.acceptThirdPartyCookies((android.webkit.WebView) obj);
            }
        }
        java.util.Map map = this.zza;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z);
        com.google.android.gms.ads.nonagon.signalgeneration.zzl zzlVar = (com.google.android.gms.ads.nonagon.signalgeneration.zzl) map.get(valueOf);
        if (zzlVar != null && !zzlVar.zzc()) {
            zzj(zzlVar, pair, true);
            return;
        }
        java.util.Map map2 = this.zzb;
        java.util.List list = (java.util.List) map2.get(valueOf);
        if (list == null) {
            list = new java.util.ArrayList();
            map2.put(valueOf, list);
        }
        list.add(pair);
    }

    final /* synthetic */ void zzf(boolean z) {
        zze(z, false);
    }

    final /* synthetic */ java.lang.Object zzg(com.google.android.gms.ads.AdRequest adRequest, com.google.android.gms.ads.nonagon.signalgeneration.zzk zzkVar) {
        com.google.android.gms.ads.query.QueryInfo.generate(this.zzc, com.google.android.gms.ads.AdFormat.BANNER, adRequest, zzkVar);
        return true;
    }
}
