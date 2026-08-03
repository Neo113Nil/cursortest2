package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeii extends com.google.android.gms.internal.ads.zzcap {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzhcg zzb;
    private final com.google.android.gms.internal.ads.zzeiq zzc;
    private final com.google.android.gms.internal.ads.zzcrq zzd;
    private final java.util.ArrayDeque zze;
    private final com.google.android.gms.internal.ads.zzfqj zzf;
    private final com.google.android.gms.internal.ads.zzcbl zzg;

    public zzeii(android.content.Context context, com.google.android.gms.internal.ads.zzhcg zzhcgVar, com.google.android.gms.internal.ads.zzcbl zzcblVar, com.google.android.gms.internal.ads.zzcrq zzcrqVar, com.google.android.gms.internal.ads.zzeiq zzeiqVar, java.util.ArrayDeque arrayDeque, com.google.android.gms.internal.ads.zzein zzeinVar, com.google.android.gms.internal.ads.zzfqj zzfqjVar) {
        com.google.android.gms.internal.ads.zzbiq.zza(context);
        this.zza = context;
        this.zzb = zzhcgVar;
        this.zzg = zzcblVar;
        this.zzc = zzeiqVar;
        this.zzd = zzcrqVar;
        this.zze = arrayDeque;
        this.zzf = zzfqjVar;
    }

    private static com.google.common.util.concurrent.ListenableFuture zzm(final com.google.android.gms.internal.ads.zzcbd zzcbdVar, com.google.android.gms.internal.ads.zzfpk zzfpkVar, final com.google.android.gms.internal.ads.zzfdm zzfdmVar) {
        com.google.android.gms.internal.ads.zzhbe zzhbeVar = new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzehw
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzfdm.this.zzc().zza(com.google.android.gms.ads.internal.client.zzay.zza().zzo((android.os.Bundle) obj), zzcbdVar.zzm);
            }
        };
        return zzfpkVar.zza(com.google.android.gms.internal.ads.zzfpe.GMS_SIGNALS, com.google.android.gms.internal.ads.zzhbw.zza(zzcbdVar.zza)).zzc(zzhbeVar).zzb(com.google.android.gms.internal.ads.zzehx.zza).zzi();
    }

    private static com.google.common.util.concurrent.ListenableFuture zzn(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzfpk zzfpkVar, com.google.android.gms.internal.ads.zzbui zzbuiVar, com.google.android.gms.internal.ads.zzfqg zzfqgVar, com.google.android.gms.internal.ads.zzfpw zzfpwVar) {
        com.google.android.gms.internal.ads.zzbty zza = zzbuiVar.zza("AFMA_getAdDictionary", com.google.android.gms.internal.ads.zzbuf.zza, com.google.android.gms.internal.ads.zzeic.zza);
        com.google.android.gms.internal.ads.zzfqf.zzb(listenableFuture, zzfpwVar);
        com.google.android.gms.internal.ads.zzfor zzi = zzfpkVar.zza(com.google.android.gms.internal.ads.zzfpe.BUILD_URL, listenableFuture).zzc(zza).zzi();
        com.google.android.gms.internal.ads.zzfqf.zzf(zzi, zzfqgVar, zzfpwVar);
        return zzi;
    }

    private final void zzo(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzcau zzcauVar, com.google.android.gms.internal.ads.zzcbd zzcbdVar) {
        com.google.android.gms.internal.ads.zzhbw.zzr(com.google.android.gms.internal.ads.zzhbw.zzj(listenableFuture, new com.google.android.gms.internal.ads.zzhbe(this) { // from class: com.google.android.gms.internal.ads.zzeia
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzhbw.zza(com.google.android.gms.internal.ads.zzflz.zza((java.io.InputStream) obj));
            }
        }, com.google.android.gms.internal.ads.zzcfr.zza), new com.google.android.gms.internal.ads.zzeht(this, zzcbdVar, zzcauVar), com.google.android.gms.internal.ads.zzcfr.zzh);
    }

    private final synchronized void zzp() {
        int intValue = ((java.lang.Long) com.google.android.gms.internal.ads.zzbkx.zzb.zze()).intValue();
        while (true) {
            java.util.ArrayDeque arrayDeque = this.zze;
            if (arrayDeque.size() >= intValue) {
                arrayDeque.removeFirst();
            }
        }
    }

    private final synchronized void zzq(com.google.android.gms.internal.ads.zzeid zzeidVar) {
        zzp();
        this.zze.addLast(zzeidVar);
    }

    private final synchronized com.google.android.gms.internal.ads.zzeid zzr(java.lang.String str) {
        java.util.Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzeid zzeidVar = (com.google.android.gms.internal.ads.zzeid) it.next();
            if (zzeidVar.zzc.equals(str)) {
                it.remove();
                return zzeidVar;
            }
        }
        return null;
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(final com.google.android.gms.internal.ads.zzcbd zzcbdVar, int i) {
        com.google.android.gms.internal.ads.zzeid zzr;
        com.google.android.gms.internal.ads.zzfor zzi;
        com.google.android.gms.internal.ads.zzbtz zzr2 = com.google.android.gms.ads.internal.zzt.zzr();
        android.content.Context context = this.zza;
        com.google.android.gms.internal.ads.zzbui zza = zzr2.zza(context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage(), this.zzf);
        com.google.android.gms.internal.ads.zzfdm zzy = this.zzd.zzy(zzcbdVar, i);
        com.google.android.gms.internal.ads.zzbty zza2 = zza.zza("google.afma.response.normalize", com.google.android.gms.internal.ads.zzeif.zzd, com.google.android.gms.internal.ads.zzbuf.zzb);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkx.zza.zze()).booleanValue()) {
            zzr = zzr(zzcbdVar.zzh);
            if (zzr == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            java.lang.String str = zzcbdVar.zzj;
            zzr = null;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        }
        com.google.android.gms.internal.ads.zzeid zzeidVar = zzr;
        com.google.android.gms.internal.ads.zzfpw zzn = zzeidVar == null ? com.google.android.gms.internal.ads.zzfpw.CC.zzn(context, 9) : zzeidVar.zzd;
        com.google.android.gms.internal.ads.zzfqg zzf = zzy.zzf();
        zzf.zzb(zzcbdVar.zza.getStringArrayList("ad_types"));
        com.google.android.gms.internal.ads.zzeip zzeipVar = new com.google.android.gms.internal.ads.zzeip(zzcbdVar.zzg, zzf, zzn);
        com.google.android.gms.internal.ads.zzeim zzeimVar = new com.google.android.gms.internal.ads.zzeim(context, zzcbdVar.zzb.afmaVersion, this.zzg, i, null);
        com.google.android.gms.internal.ads.zzfpk zze = zzy.zze();
        com.google.android.gms.internal.ads.zzfpw zzn2 = com.google.android.gms.internal.ads.zzfpw.CC.zzn(context, 11);
        if (zzeidVar == null) {
            final com.google.common.util.concurrent.ListenableFuture zzm = zzm(zzcbdVar, zze, zzy);
            final com.google.common.util.concurrent.ListenableFuture zzn3 = zzn(zzm, zze, zza, zzf, zzn);
            com.google.android.gms.internal.ads.zzfpw zzn4 = com.google.android.gms.internal.ads.zzfpw.CC.zzn(context, 10);
            final com.google.android.gms.internal.ads.zzfor zzi2 = zze.zzb(com.google.android.gms.internal.ads.zzfpe.HTTP, zzn3, zzm).zza(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzeib
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ java.lang.Object call() {
                    android.os.Bundle bundle;
                    com.google.android.gms.internal.ads.zzcbf zzcbfVar = (com.google.android.gms.internal.ads.zzcbf) com.google.common.util.concurrent.ListenableFuture.this.get();
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcN)).booleanValue() && (bundle = zzcbdVar.zzm) != null) {
                        bundle.putLong(com.google.android.gms.internal.ads.zzdyu.GET_AD_DICTIONARY_SDKCORE_START.zza(), zzcbfVar.zzj());
                        bundle.putLong(com.google.android.gms.internal.ads.zzdyu.GET_AD_DICTIONARY_SDKCORE_END.zza(), zzcbfVar.zzk());
                    }
                    return new com.google.android.gms.internal.ads.zzeio((org.json.JSONObject) zzm.get(), zzcbfVar);
                }
            }).zzb(zzeipVar).zzb(com.google.android.gms.internal.ads.zzfqf.zzc(zzn4)).zzb(zzeimVar).zzi();
            com.google.android.gms.internal.ads.zzfqf.zzd(zzi2, zzf, zzn4);
            com.google.android.gms.internal.ads.zzfqf.zzb(zzi2, zzn2);
            zzi = zze.zzb(com.google.android.gms.internal.ads.zzfpe.PRE_PROCESS, zzm, zzn3, zzi2).zza(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzehu
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ java.lang.Object call() {
                    android.os.Bundle bundle;
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcN)).booleanValue() && (bundle = com.google.android.gms.internal.ads.zzcbd.this.zzm) != null) {
                        bundle.putLong(com.google.android.gms.internal.ads.zzdyu.HTTP_RESPONSE_READY.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
                    }
                    return new com.google.android.gms.internal.ads.zzeif((com.google.android.gms.internal.ads.zzeil) zzi2.get(), (org.json.JSONObject) zzm.get(), (com.google.android.gms.internal.ads.zzcbf) zzn3.get());
                }
            }).zzc(zza2).zzi();
        } else {
            com.google.android.gms.internal.ads.zzeio zzeioVar = new com.google.android.gms.internal.ads.zzeio(zzeidVar.zzb, zzeidVar.zza);
            com.google.android.gms.internal.ads.zzfpw zzn5 = com.google.android.gms.internal.ads.zzfpw.CC.zzn(context, 10);
            final com.google.android.gms.internal.ads.zzfor zzi3 = zze.zza(com.google.android.gms.internal.ads.zzfpe.HTTP, com.google.android.gms.internal.ads.zzhbw.zza(zzeioVar)).zzb(zzeipVar).zzb(com.google.android.gms.internal.ads.zzfqf.zzc(zzn5)).zzb(zzeimVar).zzi();
            com.google.android.gms.internal.ads.zzfqf.zzd(zzi3, zzf, zzn5);
            final com.google.common.util.concurrent.ListenableFuture zza3 = com.google.android.gms.internal.ads.zzhbw.zza(zzeidVar);
            com.google.android.gms.internal.ads.zzfqf.zzb(zzi3, zzn2);
            zzi = zze.zzb(com.google.android.gms.internal.ads.zzfpe.PRE_PROCESS, zzi3, zza3).zza(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzehv
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ java.lang.Object call() {
                    com.google.android.gms.internal.ads.zzeil zzeilVar = (com.google.android.gms.internal.ads.zzeil) com.google.common.util.concurrent.ListenableFuture.this.get();
                    com.google.common.util.concurrent.ListenableFuture listenableFuture = zza3;
                    return new com.google.android.gms.internal.ads.zzeif(zzeilVar, ((com.google.android.gms.internal.ads.zzeid) listenableFuture.get()).zzb, ((com.google.android.gms.internal.ads.zzeid) listenableFuture.get()).zza);
                }
            }).zzc(zza2).zzi();
        }
        com.google.android.gms.internal.ads.zzfqf.zzd(zzi, zzf, zzn2);
        return zzi;
    }

    public final com.google.common.util.concurrent.ListenableFuture zzc(final com.google.android.gms.internal.ads.zzcbd zzcbdVar, int i) {
        if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkx.zza.zze()).booleanValue()) {
            return com.google.android.gms.internal.ads.zzhbw.zzc(new java.lang.Exception("Split request is disabled."));
        }
        com.google.android.gms.internal.ads.zzfmu zzfmuVar = zzcbdVar.zzi;
        if (zzfmuVar == null) {
            return com.google.android.gms.internal.ads.zzhbw.zzc(new java.lang.Exception("Pool configuration missing from request."));
        }
        if (zzfmuVar.zzc == 0 || zzfmuVar.zzd == 0) {
            return com.google.android.gms.internal.ads.zzhbw.zzc(new java.lang.Exception("Caching is disabled."));
        }
        android.content.Context context = this.zza;
        com.google.android.gms.internal.ads.zzbui zza = com.google.android.gms.ads.internal.zzt.zzr().zza(context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage(), this.zzf);
        com.google.android.gms.internal.ads.zzfdm zzy = this.zzd.zzy(zzcbdVar, i);
        com.google.android.gms.internal.ads.zzfpk zze = zzy.zze();
        final com.google.common.util.concurrent.ListenableFuture zzm = zzm(zzcbdVar, zze, zzy);
        com.google.android.gms.internal.ads.zzfqg zzf = zzy.zzf();
        final com.google.android.gms.internal.ads.zzfpw zzn = com.google.android.gms.internal.ads.zzfpw.CC.zzn(context, 9);
        final com.google.common.util.concurrent.ListenableFuture zzn2 = zzn(zzm, zze, zza, zzf, zzn);
        return zze.zzb(com.google.android.gms.internal.ads.zzfpe.GET_URL_AND_CACHE_KEY, zzm, zzn2).zza(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzehy
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzeii.this.zzl(zzn2, zzm, zzcbdVar, zzn);
            }
        }).zzi();
    }

    public final com.google.common.util.concurrent.ListenableFuture zzd(java.lang.String str) {
        if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkx.zza.zze()).booleanValue()) {
            return com.google.android.gms.internal.ads.zzhbw.zzc(new java.lang.Exception("Split request is disabled."));
        }
        com.google.android.gms.internal.ads.zzehs zzehsVar = new com.google.android.gms.internal.ads.zzehs(this);
        if (zzr(str) != null) {
            return com.google.android.gms.internal.ads.zzhbw.zza(zzehsVar);
        }
        java.lang.String.valueOf(str);
        return com.google.android.gms.internal.ads.zzhbw.zzc(new java.lang.Exception("URL to be removed not found for cache key: ".concat(java.lang.String.valueOf(str))));
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zze(com.google.android.gms.internal.ads.zzcbd zzcbdVar, com.google.android.gms.internal.ads.zzcau zzcauVar) {
        android.os.Bundle bundle;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcN)).booleanValue() && (bundle = zzcbdVar.zzm) != null) {
            bundle.putLong(com.google.android.gms.internal.ads.zzdyu.SERVICE_CONNECTED.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        com.google.common.util.concurrent.ListenableFuture zzb = zzb(zzcbdVar, android.os.Binder.getCallingUid());
        zzo(zzb, zzcauVar, zzcbdVar);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkq.zzi.zze()).booleanValue()) {
            final com.google.android.gms.internal.ads.zzeiq zzeiqVar = this.zzc;
            java.util.Objects.requireNonNull(zzeiqVar);
            zzb.addListener(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzeih
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzeiq.this.zza();
                }
            }, this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzf(com.google.android.gms.internal.ads.zzcbd zzcbdVar, com.google.android.gms.internal.ads.zzcau zzcauVar) {
        android.os.Bundle bundle;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcN)).booleanValue() && (bundle = zzcbdVar.zzm) != null) {
            bundle.putLong(com.google.android.gms.internal.ads.zzdyu.SERVICE_CONNECTED.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzo(zzk(zzcbdVar, android.os.Binder.getCallingUid()), zzcauVar, zzcbdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzg(com.google.android.gms.internal.ads.zzcbd zzcbdVar, com.google.android.gms.internal.ads.zzcau zzcauVar) {
        zzo(zzc(zzcbdVar, android.os.Binder.getCallingUid()), zzcauVar, zzcbdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzh(java.lang.String str, com.google.android.gms.internal.ads.zzcau zzcauVar) {
        zzo(zzd(str), zzcauVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzi(java.lang.String str) throws android.os.RemoteException {
        int callingUid = android.os.Binder.getCallingUid();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpA)).booleanValue()) {
            java.lang.String str2 = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpB);
            if (str2.isEmpty()) {
                return;
            }
            java.lang.Iterable<java.lang.String> zzd = com.google.android.gms.internal.ads.zzgty.zza(com.google.android.gms.internal.ads.zzgsx.zzc(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA)).zzd(str2);
            com.google.android.gms.ads.internal.util.zze.zza("AdRequestServiceImpl: Preconnecting");
            for (java.lang.String str3 : zzd) {
                android.content.Context context = this.zza;
                com.google.android.gms.internal.ads.zzeim zzeimVar = new com.google.android.gms.internal.ads.zzeim(context, str, this.zzg, callingUid, "HEAD");
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put(com.google.common.net.HttpHeaders.USER_AGENT, com.google.android.gms.ads.internal.zzt.zzc().zze(context, str));
                com.google.android.gms.internal.ads.zzeik zzeikVar = new com.google.android.gms.internal.ads.zzeik(str3, 30000, hashMap, new byte[0], "", false);
                try {
                    com.google.android.gms.internal.ads.zzeik zzeikVar2 = zzeikVar;
                    com.google.android.gms.internal.ads.zzeil zza = zzeimVar.zza(zzeikVar);
                    com.google.android.gms.internal.ads.zzeil zzeilVar = zza;
                    if (zza.zza != 200) {
                        int i = zza.zza;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 32);
                        sb.append("Unexpected preconnect response: ");
                        sb.append(i);
                        throw new android.os.RemoteException(sb.toString());
                    }
                } catch (java.lang.Exception e) {
                    throw new android.os.RemoteException(e.getMessage());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzj(com.google.android.gms.internal.ads.zzcam zzcamVar, com.google.android.gms.internal.ads.zzcav zzcavVar) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzblf.zza.zze()).booleanValue()) {
            this.zzd.zzF();
            java.lang.String str = zzcamVar.zza;
            com.google.android.gms.internal.ads.zzhbw.zzr(com.google.android.gms.internal.ads.zzhbw.zza(null), new com.google.android.gms.internal.ads.zzehr(this, zzcavVar, zzcamVar), com.google.android.gms.internal.ads.zzcfr.zzh);
        } else {
            try {
                zzcavVar.zze("", zzcamVar);
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
            }
        }
    }

    public final com.google.common.util.concurrent.ListenableFuture zzk(final com.google.android.gms.internal.ads.zzcbd zzcbdVar, int i) {
        com.google.android.gms.internal.ads.zzbtz zzr = com.google.android.gms.ads.internal.zzt.zzr();
        android.content.Context context = this.zza;
        com.google.android.gms.internal.ads.zzbui zza = zzr.zza(context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage(), this.zzf);
        if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbld.zza.zze()).booleanValue()) {
            return com.google.android.gms.internal.ads.zzhbw.zzc(new java.lang.Exception("Signal collection disabled."));
        }
        com.google.android.gms.internal.ads.zzfdm zzy = this.zzd.zzy(zzcbdVar, i);
        final com.google.android.gms.internal.ads.zzfcn zzd = zzy.zzd();
        com.google.android.gms.internal.ads.zzbty zza2 = zza.zza("google.afma.request.getSignals", com.google.android.gms.internal.ads.zzbuf.zza, com.google.android.gms.internal.ads.zzbuf.zzb);
        com.google.android.gms.internal.ads.zzfpw zzn = com.google.android.gms.internal.ads.zzfpw.CC.zzn(context, 22);
        com.google.android.gms.internal.ads.zzfpk zze = zzy.zze();
        com.google.android.gms.internal.ads.zzfpe zzfpeVar = com.google.android.gms.internal.ads.zzfpe.GET_SIGNALS;
        android.os.Bundle bundle = zzcbdVar.zza;
        com.google.android.gms.internal.ads.zzfor zzi = zze.zza(zzfpeVar, com.google.android.gms.internal.ads.zzhbw.zza(bundle)).zzb(com.google.android.gms.internal.ads.zzfqf.zzc(zzn)).zzc(new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzehz
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzfcn.this.zza(com.google.android.gms.ads.internal.client.zzay.zza().zzo((android.os.Bundle) obj), zzcbdVar.zzm);
            }
        }).zzj(com.google.android.gms.internal.ads.zzfpe.JS_SIGNALS).zzc(zza2).zzi();
        com.google.android.gms.internal.ads.zzfqg zzf = zzy.zzf();
        zzf.zzb(bundle.getStringArrayList("ad_types"));
        zzf.zzd(bundle.getBundle("extras"));
        com.google.android.gms.internal.ads.zzfqf.zze(zzi, zzf, zzn);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkq.zzj.zze()).booleanValue()) {
            final com.google.android.gms.internal.ads.zzeiq zzeiqVar = this.zzc;
            java.util.Objects.requireNonNull(zzeiqVar);
            zzi.addListener(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzeig
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzeiq.this.zza();
                }
            }, this.zzb);
        }
        return zzi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ java.io.InputStream zzl(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.common.util.concurrent.ListenableFuture listenableFuture2, com.google.android.gms.internal.ads.zzcbd zzcbdVar, com.google.android.gms.internal.ads.zzfpw zzfpwVar) {
        java.lang.String zzi = ((com.google.android.gms.internal.ads.zzcbf) listenableFuture.get()).zzi();
        zzq(new com.google.android.gms.internal.ads.zzeid((com.google.android.gms.internal.ads.zzcbf) listenableFuture.get(), (org.json.JSONObject) listenableFuture2.get(), zzcbdVar.zzh, zzi, zzfpwVar));
        return new java.io.ByteArrayInputStream(zzi.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }
}
