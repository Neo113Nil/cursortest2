package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfbq implements com.google.android.gms.internal.ads.zzfck {
    public static final /* synthetic */ int zzb = 0;
    private static final com.google.android.gms.internal.ads.zzfbr zzc = new com.google.android.gms.internal.ads.zzfbr(new org.json.JSONArray().toString(), new android.os.Bundle(), "");
    final java.lang.String zza;
    private final com.google.android.gms.internal.ads.zzhcg zzd;
    private final java.util.concurrent.ScheduledExecutorService zze;
    private final com.google.android.gms.internal.ads.zzerw zzf;
    private final android.content.Context zzg;
    private final com.google.android.gms.internal.ads.zzfky zzh;
    private final com.google.android.gms.internal.ads.zzerr zzi;
    private final com.google.android.gms.internal.ads.zzdxc zzj;
    private final com.google.android.gms.internal.ads.zzeby zzk;

    zzfbq(com.google.android.gms.internal.ads.zzhcg zzhcgVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, java.lang.String str, com.google.android.gms.internal.ads.zzerw zzerwVar, android.content.Context context, com.google.android.gms.internal.ads.zzfky zzfkyVar, com.google.android.gms.internal.ads.zzerr zzerrVar, com.google.android.gms.internal.ads.zzdxc zzdxcVar, com.google.android.gms.internal.ads.zzeby zzebyVar) {
        this.zzd = zzhcgVar;
        this.zze = scheduledExecutorService;
        this.zza = str;
        this.zzf = zzerwVar;
        this.zzg = context;
        this.zzh = zzfkyVar;
        this.zzi = zzerrVar;
        this.zzj = zzdxcVar;
        this.zzk = zzebyVar;
    }

    private final void zzf(java.util.List list, java.util.Map map) {
        java.util.Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzesa zzesaVar = (com.google.android.gms.internal.ads.zzesa) ((java.util.Map.Entry) it.next()).getValue();
            java.lang.String str = zzesaVar.zza;
            list.add(zzh(str, java.util.Collections.singletonList(zzesaVar.zze), zzg(str), zzesaVar.zzb, zzesaVar.zzc));
        }
    }

    private final android.os.Bundle zzg(java.lang.String str) {
        android.os.Bundle bundle = this.zzh.zzd.zzm;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final com.google.android.gms.internal.ads.zzhbo zzh(final java.lang.String str, final java.util.List list, final android.os.Bundle bundle, final boolean z, final boolean z2) {
        com.google.android.gms.internal.ads.zzhbd zzhbdVar = new com.google.android.gms.internal.ads.zzhbd() { // from class: com.google.android.gms.internal.ads.zzfbl
            @Override // com.google.android.gms.internal.ads.zzhbd
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza() {
                return com.google.android.gms.internal.ads.zzfbq.this.zzd(str, list, bundle, z, z2);
            }
        };
        com.google.android.gms.internal.ads.zzhcg zzhcgVar = this.zzd;
        com.google.android.gms.internal.ads.zzhbo zzw = com.google.android.gms.internal.ads.zzhbo.zzw(com.google.android.gms.internal.ads.zzhbw.zzf(zzhbdVar, zzhcgVar));
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzck)).booleanValue()) {
            zzw = (com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzi(zzw, ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcd)).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.zze);
        }
        return (com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzg(zzw, java.lang.Throwable.class, new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzfbm
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                java.lang.Throwable th = (java.lang.Throwable) obj;
                int i = com.google.android.gms.internal.ads.zzfbq.zzb;
                java.lang.String str2 = str;
                java.lang.String.valueOf(str2);
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Error calling adapter: ".concat(java.lang.String.valueOf(str2)));
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoA)).booleanValue()) {
                    com.google.android.gms.internal.ads.zzcfd zzh = com.google.android.gms.ads.internal.zzt.zzh();
                    java.lang.String.valueOf(str2);
                    zzh.zzh(th, "rtbSignal.fetchRtbJsonInfo-".concat(java.lang.String.valueOf(str2)));
                    return null;
                }
                com.google.android.gms.internal.ads.zzcfd zzh2 = com.google.android.gms.ads.internal.zzt.zzh();
                java.lang.String.valueOf(str2);
                zzh2.zzg(th, "rtbSignal.fetchRtbJsonInfo-".concat(java.lang.String.valueOf(str2)));
                return null;
            }
        }, zzhcgVar);
    }

    private final void zzi(com.google.android.gms.internal.ads.zzbxb zzbxbVar, android.os.Bundle bundle, java.util.List list, com.google.android.gms.internal.ads.zzerz zzerzVar) throws android.os.RemoteException {
        zzbxbVar.zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzg), this.zza, bundle, (android.os.Bundle) list.get(0), this.zzh.zzf, zzerzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        com.google.android.gms.internal.ads.zzfky zzfkyVar = this.zzh;
        if (zzfkyVar.zzs) {
            if (!java.util.Arrays.asList(((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcq)).split(",")).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(zzfkyVar.zzd)))) {
                return com.google.android.gms.internal.ads.zzhbw.zza(zzc);
            }
        }
        return com.google.android.gms.internal.ads.zzhbw.zzf(new com.google.android.gms.internal.ads.zzhbd() { // from class: com.google.android.gms.internal.ads.zzfbo
            @Override // com.google.android.gms.internal.ads.zzhbd
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza() {
                return com.google.android.gms.internal.ads.zzfbq.this.zzc();
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 32;
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc() {
        final java.lang.String str;
        java.lang.String lowerCase = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmp)).booleanValue() ? this.zzh.zzg.toLowerCase(java.util.Locale.ROOT) : this.zzh.zzg;
        final android.os.Bundle zzg = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzco)).booleanValue() ? this.zzk.zzg() : new android.os.Bundle();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfd)).booleanValue()) {
            int zzk = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzk();
            str = zzk != 1 ? zzk != 2 ? "EMPTY" : "INVALID" : "VALID";
        } else {
            str = "";
        }
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        org.json.JSONArray jSONArray = this.zzh.zzw;
        if (jSONArray != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i);
                    org.json.JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
                    java.lang.String string = (optJSONArray == null || optJSONArray.length() <= 0) ? "" : optJSONArray.getString(0);
                    if (!android.text.TextUtils.isEmpty(string)) {
                        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("data");
                        android.os.Bundle bundle = new android.os.Bundle();
                        if (optJSONObject != null) {
                            java.util.Iterator<java.lang.String> keys = optJSONObject.keys();
                            while (keys.hasNext()) {
                                java.lang.String next = keys.next();
                                bundle.putString(next, optJSONObject.optString(next, ""));
                            }
                        }
                        hashMap.put(string, new com.google.android.gms.internal.ads.zzesa(string, true, true, false, bundle));
                    }
                } catch (org.json.JSONException e) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(new org.json.JSONException("Malformed RTB adapter config."), "RecursiveRtbAdapterMap.parseAdapters");
                    com.google.android.gms.ads.internal.util.zze.zzb("Malformed RTB adapter config.", e);
                }
            }
            zzf(arrayList, hashMap);
        } else if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcx)).booleanValue()) {
            zzf(arrayList, this.zzf.zzd(this.zza, lowerCase));
        } else {
            com.google.android.gms.internal.ads.zzerw zzerwVar = this.zzf;
            for (java.util.Map.Entry entry : zzerwVar.zzc(this.zza, lowerCase).entrySet()) {
                java.lang.String str2 = (java.lang.String) entry.getKey();
                arrayList.add(zzh(str2, (java.util.List) entry.getValue(), zzg(str2), true, true));
            }
            zzf(arrayList, zzerwVar.zzb());
        }
        return com.google.android.gms.internal.ads.zzhbw.zzp(arrayList).zza(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzfbk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                int i2 = com.google.android.gms.internal.ads.zzfbq.zzb;
                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                for (com.google.common.util.concurrent.ListenableFuture listenableFuture : arrayList) {
                    if (((org.json.JSONObject) listenableFuture.get()) != null) {
                        jSONArray2.put(listenableFuture.get());
                    }
                }
                java.lang.String str3 = str;
                android.os.Bundle bundle2 = zzg;
                if (jSONArray2.length() != 0) {
                    return new com.google.android.gms.internal.ads.zzfbr(jSONArray2.toString(), bundle2, str3);
                }
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfd)).booleanValue()) {
                    return new com.google.android.gms.internal.ads.zzfbr(new org.json.JSONArray().toString(), bundle2, str3);
                }
                return null;
            }
        }, this.zzd);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(3:5|(2:7|(1:9)(1:12))(3:13|(1:15)|(2:17|(1:19)(1:20))(1:21))|10))|22|23|(0)(0)|10) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002b, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002c, code lost:
    
        com.google.android.gms.ads.internal.util.zze.zzb("Couldn't create RTB adapter : ", r13);
        r13 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzd(java.lang.String str, final java.util.List list, final android.os.Bundle bundle, boolean z, boolean z2) {
        com.google.android.gms.internal.ads.zzbxb zzbxbVar;
        final com.google.android.gms.internal.ads.zzcfw zzcfwVar = new com.google.android.gms.internal.ads.zzcfw();
        if (z2) {
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcp)).booleanValue()) {
                com.google.android.gms.internal.ads.zzerr zzerrVar = this.zzi;
                zzerrVar.zza(str);
                zzbxbVar = zzerrVar.zzb(str);
                if (zzbxbVar != null) {
                    if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcf)).booleanValue()) {
                        throw null;
                    }
                    com.google.android.gms.internal.ads.zzerz.zzd(str, zzcfwVar);
                } else {
                    final com.google.android.gms.internal.ads.zzerz zzerzVar = new com.google.android.gms.internal.ads.zzerz(str, zzbxbVar, zzcfwVar, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzck)).booleanValue()) {
                        this.zze.schedule(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfbp
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                com.google.android.gms.internal.ads.zzerz.this.zzc();
                            }
                        }, ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcd)).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
                    }
                    if (z) {
                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcr)).booleanValue()) {
                            final com.google.android.gms.internal.ads.zzbxb zzbxbVar2 = zzbxbVar;
                            this.zzd.zza(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfbn
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    com.google.android.gms.internal.ads.zzfbq.this.zze(zzbxbVar2, bundle, list, zzerzVar, zzcfwVar);
                                }
                            });
                        } else {
                            zzi(zzbxbVar, bundle, list, zzerzVar);
                        }
                    } else {
                        zzerzVar.zzb();
                    }
                }
                return zzcfwVar;
            }
        }
        zzbxbVar = this.zzj.zzb(str);
        if (zzbxbVar != null) {
        }
        return zzcfwVar;
    }

    final /* synthetic */ void zze(com.google.android.gms.internal.ads.zzbxb zzbxbVar, android.os.Bundle bundle, java.util.List list, com.google.android.gms.internal.ads.zzerz zzerzVar, com.google.android.gms.internal.ads.zzcfw zzcfwVar) {
        try {
            zzi(zzbxbVar, bundle, list, zzerzVar);
        } catch (android.os.RemoteException e) {
            zzcfwVar.zzd(e);
        }
    }
}
