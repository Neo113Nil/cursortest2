package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzebw {
    private final android.content.Context zzf;
    private final java.lang.ref.WeakReference zzg;
    private final com.google.android.gms.internal.ads.zzdxc zzh;
    private final java.util.concurrent.Executor zzi;
    private final java.util.concurrent.Executor zzj;
    private final java.util.concurrent.ScheduledExecutorService zzk;
    private final com.google.android.gms.internal.ads.zzdzw zzl;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzm;
    private final com.google.android.gms.internal.ads.zzdjx zzo;
    private final com.google.android.gms.internal.ads.zzfqj zzp;
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;
    private final com.google.android.gms.internal.ads.zzcfw zze = new com.google.android.gms.internal.ads.zzcfw();
    private final java.util.Map zzn = new java.util.concurrent.ConcurrentHashMap();
    private boolean zzq = true;
    private final long zzd = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();

    public zzebw(java.util.concurrent.Executor executor, android.content.Context context, java.lang.ref.WeakReference weakReference, java.util.concurrent.Executor executor2, com.google.android.gms.internal.ads.zzdxc zzdxcVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzdzw zzdzwVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzdjx zzdjxVar, com.google.android.gms.internal.ads.zzfqj zzfqjVar) {
        this.zzh = zzdxcVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdzwVar;
        this.zzm = versionInfoParcel;
        this.zzo = zzdjxVar;
        this.zzp = zzfqjVar;
        zzm("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    private final synchronized com.google.common.util.concurrent.ListenableFuture zzu() {
        java.lang.String zzd = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd();
        if (!android.text.TextUtils.isEmpty(zzd)) {
            return com.google.android.gms.internal.ads.zzhbw.zza(zzd);
        }
        final com.google.android.gms.internal.ads.zzcfw zzcfwVar = new com.google.android.gms.internal.ads.zzcfw();
        com.google.android.gms.ads.internal.zzt.zzh().zzo().zzk(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzebp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzebw.this.zzg(zzcfwVar);
            }
        });
        return zzcfwVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzv, reason: merged with bridge method [inline-methods] */
    public final void zzm(java.lang.String str, boolean z, java.lang.String str2, int i) {
        this.zzn.put(str, new com.google.android.gms.internal.ads.zzbrp(str, z, i, str2));
    }

    public final void zza() {
        this.zzq = false;
    }

    public final void zzb(final com.google.android.gms.internal.ads.zzbrw zzbrwVar) {
        this.zze.addListener(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzebv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    zzbrwVar.zzb(com.google.android.gms.internal.ads.zzebw.this.zzd());
                } catch (android.os.RemoteException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
                }
            }
        }, this.zzj);
    }

    public final void zzc() {
        if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkw.zza.zze()).booleanValue()) {
            if (this.zzm.clientJarVersion >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcy)).intValue() && this.zzq) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    if (this.zza) {
                        return;
                    }
                    this.zzl.zze();
                    this.zzo.zze();
                    com.google.android.gms.internal.ads.zzcfw zzcfwVar = this.zze;
                    java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzebo
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            com.google.android.gms.internal.ads.zzebw.this.zzf();
                        }
                    };
                    java.util.concurrent.Executor executor = this.zzi;
                    zzcfwVar.addListener(runnable, executor);
                    this.zza = true;
                    com.google.common.util.concurrent.ListenableFuture zzu = zzu();
                    this.zzk.schedule(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzebq
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            com.google.android.gms.internal.ads.zzebw.this.zzh();
                        }
                    }, ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcA)).longValue(), java.util.concurrent.TimeUnit.SECONDS);
                    com.google.android.gms.internal.ads.zzhbw.zzr(zzu, new com.google.android.gms.internal.ads.zzebm(this), executor);
                    return;
                }
            }
        }
        if (this.zza) {
            return;
        }
        zzm("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zze.zzc(false);
        this.zza = true;
        this.zzb = true;
    }

    public final java.util.List zzd() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Map map = this.zzn;
        for (java.lang.String str : map.keySet()) {
            com.google.android.gms.internal.ads.zzbrp zzbrpVar = (com.google.android.gms.internal.ads.zzbrp) map.get(str);
            arrayList.add(new com.google.android.gms.internal.ads.zzbrp(str, zzbrpVar.zzb, zzbrpVar.zzc, zzbrpVar.zzd));
        }
        return arrayList;
    }

    public final boolean zze() {
        return this.zzb;
    }

    final /* synthetic */ void zzf() {
        this.zzl.zzf();
        this.zzo.zzf();
        this.zzb = true;
    }

    final /* synthetic */ void zzg(final com.google.android.gms.internal.ads.zzcfw zzcfwVar) {
        this.zzi.execute(new java.lang.Runnable(this) { // from class: com.google.android.gms.internal.ads.zzebu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                java.lang.String zzd = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd();
                boolean isEmpty = android.text.TextUtils.isEmpty(zzd);
                com.google.android.gms.internal.ads.zzcfw zzcfwVar2 = zzcfwVar;
                if (isEmpty) {
                    zzcfwVar2.zzd(new java.lang.Exception());
                } else {
                    zzcfwVar2.zzc(zzd);
                }
            }
        });
    }

    final /* synthetic */ void zzh() {
        synchronized (this) {
            if (this.zzc) {
                return;
            }
            zzm("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzd));
            this.zzl.zzc("com.google.android.gms.ads.MobileAds", "timeout");
            this.zzo.zzc("com.google.android.gms.ads.MobileAds", "timeout");
            this.zze.zzd(new java.lang.Exception());
        }
    }

    final /* synthetic */ void zzi(java.lang.Object obj, com.google.android.gms.internal.ads.zzcfw zzcfwVar, java.lang.String str, long j, com.google.android.gms.internal.ads.zzfpw zzfpwVar) {
        synchronized (obj) {
            if (!zzcfwVar.isDone()) {
                zzm(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - j));
                this.zzl.zzc(str, "timeout");
                this.zzo.zzc(str, "timeout");
                com.google.android.gms.internal.ads.zzfqj zzfqjVar = this.zzp;
                zzfpwVar.zzk(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.MSG_TIMEOUT);
                zzfpwVar.zzd(false);
                zzfqjVar.zzb(zzfpwVar.zzm());
                zzcfwVar.zzc(false);
            }
        }
    }

    final /* synthetic */ java.lang.Object zzj(com.google.android.gms.internal.ads.zzfpw zzfpwVar) {
        this.zze.zzc(true);
        zzfpwVar.zzd(true);
        this.zzp.zzb(zzfpwVar.zzm());
        return null;
    }

    final /* synthetic */ void zzk(java.lang.String str, com.google.android.gms.internal.ads.zzbrt zzbrtVar, com.google.android.gms.internal.ads.zzflw zzflwVar, java.util.List list) {
        try {
            try {
                if (java.util.Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    zzbrtVar.zze();
                    return;
                }
                android.content.Context context = (android.content.Context) this.zzg.get();
                if (context == null) {
                    context = this.zzf;
                }
                zzflwVar.zzA(context, zzbrtVar, list);
            } catch (android.os.RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            }
        } catch (android.os.RemoteException e2) {
            throw new com.google.android.gms.internal.ads.zzguh(e2);
        } catch (com.google.android.gms.internal.ads.zzflf unused) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 74);
            sb.append("Failed to initialize adapter. ");
            sb.append(str);
            sb.append(" does not implement the initialize() method.");
            zzbrtVar.zzf(sb.toString());
        }
    }

    final /* synthetic */ void zzl(java.lang.String str) {
        android.content.Context context = this.zzf;
        int i = 5;
        final com.google.android.gms.internal.ads.zzfpw zzn = com.google.android.gms.internal.ads.zzfpw.CC.zzn(context, 5);
        zzn.zza();
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            org.json.JSONObject jSONObject = new org.json.JSONObject(str).getJSONObject("initializer_settings").getJSONObject(com.helpshift.proactive.InAppViewConstants.CONFIG);
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final java.lang.String next = keys.next();
                final com.google.android.gms.internal.ads.zzfpw zzn2 = com.google.android.gms.internal.ads.zzfpw.CC.zzn(context, i);
                zzn2.zza();
                zzn2.zzi(next);
                final java.lang.Object obj = new java.lang.Object();
                final com.google.android.gms.internal.ads.zzcfw zzcfwVar = new com.google.android.gms.internal.ads.zzcfw();
                com.google.common.util.concurrent.ListenableFuture zzi = com.google.android.gms.internal.ads.zzhbw.zzi(zzcfwVar, ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcz)).longValue(), java.util.concurrent.TimeUnit.SECONDS, this.zzk);
                this.zzl.zza(next);
                this.zzo.zza(next);
                final long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                android.content.Context context2 = context;
                org.json.JSONObject jSONObject2 = jSONObject;
                zzi.addListener(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzebr
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.internal.ads.zzebw.this.zzi(obj, zzcfwVar, next, elapsedRealtime, zzn2);
                    }
                }, this.zzi);
                arrayList.add(zzi);
                final com.google.android.gms.internal.ads.zzebn zzebnVar = new com.google.android.gms.internal.ads.zzebn(this, obj, next, elapsedRealtime, zzn2, zzcfwVar);
                org.json.JSONObject optJSONObject = jSONObject2.optJSONObject(next);
                final java.util.ArrayList arrayList2 = new java.util.ArrayList();
                if (optJSONObject != null) {
                    try {
                        org.json.JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        int i2 = 0;
                        while (i2 < jSONArray.length()) {
                            org.json.JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                            java.lang.String optString = jSONObject3.optString("format", "");
                            org.json.JSONObject optJSONObject2 = jSONObject3.optJSONObject("data");
                            android.os.Bundle bundle = new android.os.Bundle();
                            if (optJSONObject2 != null) {
                                java.util.Iterator<java.lang.String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    java.lang.String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            org.json.JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new com.google.android.gms.internal.ads.zzbrz(optString, bundle));
                            i2++;
                            jSONArray = jSONArray2;
                        }
                    } catch (org.json.JSONException unused) {
                    }
                }
                zzm(next, false, "", 0);
                try {
                    final com.google.android.gms.internal.ads.zzflw zza = this.zzh.zza(next, new org.json.JSONObject());
                    this.zzj.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzebt
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            com.google.android.gms.internal.ads.zzebw.this.zzk(next, zzebnVar, zza, arrayList2);
                        }
                    });
                } catch (com.google.android.gms.internal.ads.zzflf e) {
                    try {
                        java.lang.String str2 = "Failed to create Adapter.";
                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoy)).booleanValue()) {
                            java.lang.String message = e.getMessage();
                            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(message).length() + 26);
                            sb.append("Failed to create Adapter.");
                            sb.append(io.ktor.sse.ServerSentEventKt.SPACE);
                            sb.append(message);
                            str2 = sb.toString();
                        }
                        zzebnVar.zzf(str2);
                    } catch (android.os.RemoteException e2) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
                    }
                }
                jSONObject = jSONObject2;
                context = context2;
                i = 5;
            }
            com.google.android.gms.internal.ads.zzhbw.zzn(arrayList).zza(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzebs
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ java.lang.Object call() {
                    com.google.android.gms.internal.ads.zzebw.this.zzj(zzn);
                    return null;
                }
            }, this.zzi);
        } catch (org.json.JSONException e3) {
            com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e3);
            this.zzo.zzd("MalformedJson");
            this.zzl.zzd("MalformedJson");
            this.zze.zzd(e3);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e3, "AdapterInitializer.updateAdapterStatus");
            com.google.android.gms.internal.ads.zzfqj zzfqjVar = this.zzp;
            zzn.zzj(e3);
            zzn.zzd(false);
            zzfqjVar.zzb(zzn.zzm());
        }
    }

    final /* synthetic */ void zzn(boolean z) {
        this.zzc = true;
    }

    final /* synthetic */ long zzo() {
        return this.zzd;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzcfw zzp() {
        return this.zze;
    }

    final /* synthetic */ java.util.concurrent.Executor zzq() {
        return this.zzi;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdzw zzr() {
        return this.zzl;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdjx zzs() {
        return this.zzo;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfqj zzt() {
        return this.zzp;
    }
}
