package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzap extends com.google.android.gms.internal.ads.zzcel {
    protected static final java.util.List zza = new java.util.ArrayList(java.util.Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    protected static final java.util.List zzb = new java.util.ArrayList(java.util.Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final java.util.List zzc = new java.util.ArrayList(java.util.Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    protected static final java.util.List zzd = new java.util.ArrayList(java.util.Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    private final java.util.List zzB;
    private final java.util.List zzC;
    private final java.util.List zzD;
    private final java.util.List zzE;
    private final com.google.android.gms.internal.ads.zzbjv zzI;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzj zzJ;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zza zzK;
    private final com.google.android.gms.internal.ads.zzcnj zzf;
    private android.content.Context zzg;
    private final com.google.android.gms.internal.ads.zzbap zzh;
    private final com.google.android.gms.internal.ads.zzflc zzi;
    private final com.google.android.gms.internal.ads.zzflx zzj;
    private final com.google.android.gms.internal.ads.zzhcg zzk;
    private final java.util.concurrent.ScheduledExecutorService zzl;
    private com.google.android.gms.internal.ads.zzbzt zzm;
    private final com.google.android.gms.internal.ads.zzdzq zzp;
    private final com.google.android.gms.internal.ads.zzfsc zzq;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzy;
    private java.lang.String zzz;
    private android.graphics.Point zzn = new android.graphics.Point();
    private android.graphics.Point zzo = new android.graphics.Point();
    private final java.util.concurrent.atomic.AtomicInteger zzx = new java.util.concurrent.atomic.AtomicInteger(0);
    private final java.util.concurrent.atomic.AtomicBoolean zzF = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicBoolean zzG = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicInteger zzH = new java.util.concurrent.atomic.AtomicInteger(0);
    private final boolean zzr = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzik)).booleanValue();
    private final boolean zzs = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzij)).booleanValue();
    private final boolean zzt = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzim)).booleanValue();
    private final boolean zzu = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzio)).booleanValue();
    private final java.lang.String zzv = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzin);
    private final java.lang.String zzw = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzip);
    private final java.lang.String zzA = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziq);

    zzap(com.google.android.gms.internal.ads.zzcnj zzcnjVar, android.content.Context context, com.google.android.gms.internal.ads.zzbap zzbapVar, com.google.android.gms.internal.ads.zzflx zzflxVar, com.google.android.gms.internal.ads.zzhcg zzhcgVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzdzq zzdzqVar, com.google.android.gms.internal.ads.zzfsc zzfscVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzbjv zzbjvVar, com.google.android.gms.internal.ads.zzflc zzflcVar, com.google.android.gms.ads.nonagon.signalgeneration.zzj zzjVar, com.google.android.gms.ads.nonagon.signalgeneration.zza zzaVar) {
        java.util.List list;
        this.zzf = zzcnjVar;
        this.zzg = context;
        this.zzh = zzbapVar;
        this.zzi = zzflcVar;
        this.zzj = zzflxVar;
        this.zzk = zzhcgVar;
        this.zzl = scheduledExecutorService;
        this.zzp = zzdzqVar;
        this.zzq = zzfscVar;
        this.zzy = versionInfoParcel;
        this.zzI = zzbjvVar;
        this.zzJ = zzjVar;
        this.zzK = zzaVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzir)).booleanValue()) {
            this.zzB = zzaa((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzis));
            this.zzC = zzaa((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzit));
            this.zzD = zzaa((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziu));
            list = zzaa((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziv));
        } else {
            this.zzB = zza;
            this.zzC = zzb;
            this.zzD = zzc;
            list = zzd;
        }
        this.zzE = list;
    }

    static final /* synthetic */ android.net.Uri zzQ(android.net.Uri uri, java.lang.String str) {
        return !android.text.TextUtils.isEmpty(str) ? zzZ(uri, "nas", str) : uri;
    }

    private final void zzR(final java.util.List list, final com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbzq zzbzqVar, boolean z) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziA)).booleanValue()) {
            try {
                zzbzqVar.zzf("The updating URL feature is not enabled.");
                return;
            } catch (android.os.RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
                return;
            }
        }
        com.google.android.gms.internal.ads.zzhcg zzhcgVar = this.zzk;
        com.google.common.util.concurrent.ListenableFuture zzc2 = zzhcgVar.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzad
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.ads.nonagon.signalgeneration.zzap.this.zzo(list, iObjectWrapper);
            }
        });
        if (zzY()) {
            zzc2 = com.google.android.gms.internal.ads.zzhbw.zzj(zzc2, new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaf
                @Override // com.google.android.gms.internal.ads.zzhbe
                public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                    return com.google.android.gms.ads.nonagon.signalgeneration.zzap.this.zzp((java.util.ArrayList) obj);
                }
            }, zzhcgVar);
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Asset view map is empty.");
        }
        com.google.android.gms.internal.ads.zzhbw.zzr(zzc2, new com.google.android.gms.ads.nonagon.signalgeneration.zzz(this, zzbzqVar, z), this.zzf.zzb());
    }

    private final void zzS(java.util.List list, final com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbzq zzbzqVar, boolean z) {
        com.google.common.util.concurrent.ListenableFuture zzc2;
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziA)).booleanValue()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The updating URL feature is not enabled.");
            try {
                zzbzqVar.zzf("The updating URL feature is not enabled.");
                return;
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
                return;
            }
        }
        java.util.Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (zzd((android.net.Uri) it.next())) {
                i2++;
            }
        }
        if (i2 > 1) {
            java.lang.String valueOf = java.lang.String.valueOf(list);
            java.lang.String.valueOf(valueOf);
            java.lang.String valueOf2 = java.lang.String.valueOf(valueOf);
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Multiple google urls found: ".concat(valueOf2));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final android.net.Uri uri = (android.net.Uri) it2.next();
            if (zzd(uri)) {
                com.google.android.gms.internal.ads.zzhcg zzhcgVar = this.zzk;
                zzc2 = zzhcgVar.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzag
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ java.lang.Object call() {
                        return com.google.android.gms.ads.nonagon.signalgeneration.zzap.this.zzq(uri, iObjectWrapper);
                    }
                });
                if (zzY()) {
                    zzc2 = com.google.android.gms.internal.ads.zzhbw.zzj(zzc2, new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzah
                        @Override // com.google.android.gms.internal.ads.zzhbe
                        public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                            return com.google.android.gms.ads.nonagon.signalgeneration.zzap.this.zzr((android.net.Uri) obj);
                        }
                    }, zzhcgVar);
                } else {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Asset view map is empty.");
                }
            } else {
                java.lang.String valueOf3 = java.lang.String.valueOf(uri);
                java.lang.String.valueOf(valueOf3);
                java.lang.String valueOf4 = java.lang.String.valueOf(valueOf3);
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Not a Google URL: ".concat(valueOf4));
                zzc2 = com.google.android.gms.internal.ads.zzhbw.zza(uri);
            }
            arrayList.add(zzc2);
        }
        com.google.android.gms.internal.ads.zzhbw.zzr(com.google.android.gms.internal.ads.zzhbw.zzm(arrayList), new com.google.android.gms.ads.nonagon.signalgeneration.zzaa(this, zzbzqVar, z), this.zzf.zzb());
    }

    private final void zzT() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkX)).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzla)).booleanValue()) {
                return;
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzle)).booleanValue() && this.zzF.getAndSet(true)) {
                return;
            }
            zzx();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzU, reason: merged with bridge method [inline-methods] */
    public final void zzx() {
        com.google.common.util.concurrent.ListenableFuture zzc2;
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkv.zze.zze()).booleanValue()) {
            this.zzJ.zza();
            return;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmy)).booleanValue()) {
            zzc2 = com.google.android.gms.internal.ads.zzhbw.zzf(new com.google.android.gms.internal.ads.zzhbd() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzai
                @Override // com.google.android.gms.internal.ads.zzhbd
                public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza() {
                    return com.google.android.gms.ads.nonagon.signalgeneration.zzap.this.zzs();
                }
            }, com.google.android.gms.internal.ads.zzcfr.zza);
        } else {
            try {
                zzc2 = zzW(this.zzg, null, com.google.android.gms.ads.AdFormat.BANNER.name(), null, null, new android.os.Bundle()).zza();
            } catch (java.lang.NullPointerException e) {
                zzc2 = com.google.android.gms.internal.ads.zzhbw.zzc(e);
            }
        }
        com.google.android.gms.internal.ads.zzhbw.zzr(zzc2, new com.google.android.gms.ads.nonagon.signalgeneration.zzab(this), this.zzf.zzb());
    }

    private static boolean zzV(android.net.Uri uri, java.util.List list, java.util.List list2) {
        java.lang.String host = uri.getHost();
        java.lang.String path = uri.getPath();
        if (host != null && path != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((java.lang.String) it.next())) {
                    java.util.Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((java.lang.String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzx zzW(android.content.Context context, java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, android.os.Bundle bundle) {
        char c;
        com.google.android.gms.internal.ads.zzfkx zzfkxVar = new com.google.android.gms.internal.ads.zzfkx();
        if ("REWARDED".equals(str2)) {
            zzfkxVar.zzj().zza(2);
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            zzfkxVar.zzj().zza(3);
        }
        com.google.android.gms.ads.nonagon.signalgeneration.zzw zzr = this.zzf.zzr();
        com.google.android.gms.internal.ads.zzdca zzdcaVar = new com.google.android.gms.internal.ads.zzdca();
        zzdcaVar.zza(context);
        if (str == null) {
            str = "adUnitId";
        }
        zzfkxVar.zzg(str);
        if (zzmVar == null) {
            zzmVar = new com.google.android.gms.ads.internal.client.zzn().zza();
        }
        zzfkxVar.zza(zzmVar);
        if (zzrVar == null) {
            switch (str2.hashCode()) {
                case -1999289321:
                    if (str2.equals("NATIVE")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -428325382:
                    if (str2.equals("APP_OPEN_AD")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 543046670:
                    if (str2.equals("REWARDED")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1854800829:
                    if (str2.equals("REWARDED_INTERSTITIAL")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1951953708:
                    if (str2.equals(com.ironsource.mediationsdk.j.f6439a)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            zzrVar = c != 0 ? (c == 1 || c == 2) ? com.google.android.gms.ads.internal.client.zzr.zzc() : c != 3 ? c != 4 ? new com.google.android.gms.ads.internal.client.zzr() : com.google.android.gms.ads.internal.client.zzr.zzd() : com.google.android.gms.ads.internal.client.zzr.zzb() : new com.google.android.gms.ads.internal.client.zzr(context, com.google.android.gms.ads.AdSize.BANNER);
        }
        zzfkxVar.zzc(zzrVar);
        zzfkxVar.zzu(true);
        zzfkxVar.zzv(bundle);
        zzdcaVar.zzb(zzfkxVar.zzB());
        zzr.zzc(zzdcaVar.zze());
        com.google.android.gms.ads.nonagon.signalgeneration.zzas zzasVar = new com.google.android.gms.ads.nonagon.signalgeneration.zzas();
        zzasVar.zza(str2);
        zzr.zzb(new com.google.android.gms.ads.nonagon.signalgeneration.zzat(zzasVar, null));
        new com.google.android.gms.internal.ads.zzdiq();
        return zzr.zza();
    }

    private final com.google.common.util.concurrent.ListenableFuture zzX(final java.lang.String str) {
        final com.google.android.gms.internal.ads.zzdux[] zzduxVarArr = new com.google.android.gms.internal.ads.zzdux[1];
        com.google.common.util.concurrent.ListenableFuture zzb2 = this.zzj.zzb();
        com.google.android.gms.internal.ads.zzhbe zzhbeVar = new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzan
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.ads.nonagon.signalgeneration.zzap.this.zzu(zzduxVarArr, str, (com.google.android.gms.internal.ads.zzdux) obj);
            }
        };
        com.google.android.gms.internal.ads.zzhcg zzhcgVar = this.zzk;
        com.google.common.util.concurrent.ListenableFuture zzj = com.google.android.gms.internal.ads.zzhbw.zzj(zzb2, zzhbeVar, zzhcgVar);
        zzj.addListener(new java.lang.Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzae
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.ads.nonagon.signalgeneration.zzap.this.zzv(zzduxVarArr);
            }
        }, zzhcgVar);
        return (com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzg((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzk((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzi(com.google.android.gms.internal.ads.zzhbo.zzw(zzj), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziB)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.zzl), com.google.android.gms.ads.nonagon.signalgeneration.zzal.zza, zzhcgVar), java.lang.Exception.class, com.google.android.gms.ads.nonagon.signalgeneration.zzam.zza, zzhcgVar);
    }

    private final boolean zzY() {
        java.util.Map map;
        com.google.android.gms.internal.ads.zzbzt zzbztVar = this.zzm;
        return (zzbztVar == null || (map = zzbztVar.zzb) == null || map.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.net.Uri zzZ(android.net.Uri uri, java.lang.String str, java.lang.String str2) {
        java.lang.String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = indexOf + 1;
        return android.net.Uri.parse(uri2.substring(0, i) + str + com.ironsource.X3.j.b + str2 + com.ironsource.X3.j.c + uri2.substring(i));
    }

    private static final java.util.List zzaa(java.lang.String str) {
        java.lang.String[] split = android.text.TextUtils.split(str, ",");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str2 : split) {
            if (!com.google.android.gms.internal.ads.zzgua.zzc(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzfqg zzy(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzceq zzceqVar) {
        if (!com.google.android.gms.internal.ads.zzfqj.zza() || !((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            com.google.android.gms.internal.ads.zzfqg zzb2 = ((com.google.android.gms.ads.nonagon.signalgeneration.zzx) com.google.android.gms.internal.ads.zzhbw.zzs(listenableFuture)).zzb();
            zzb2.zzb(new java.util.ArrayList(java.util.Collections.singletonList(zzceqVar.zzb)));
            com.google.android.gms.ads.internal.client.zzm zzmVar = zzceqVar.zzd;
            zzb2.zzc(zzmVar == null ? "" : zzmVar.zzp);
            zzb2.zzd(zzmVar.zzm);
            return zzb2;
        } catch (java.util.concurrent.ExecutionException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdzq zzA() {
        return this.zzp;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfsc zzB() {
        return this.zzq;
    }

    final /* synthetic */ boolean zzC() {
        return this.zzr;
    }

    final /* synthetic */ boolean zzD() {
        return this.zzs;
    }

    final /* synthetic */ boolean zzE() {
        return this.zzt;
    }

    final /* synthetic */ boolean zzF() {
        return this.zzu;
    }

    final /* synthetic */ java.lang.String zzG() {
        return this.zzv;
    }

    final /* synthetic */ java.lang.String zzH() {
        return this.zzw;
    }

    final /* synthetic */ java.util.concurrent.atomic.AtomicInteger zzI() {
        return this.zzx;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzJ() {
        return this.zzy;
    }

    final /* synthetic */ java.lang.String zzK() {
        return this.zzz;
    }

    final /* synthetic */ void zzL(java.lang.String str) {
        this.zzz = str;
    }

    final /* synthetic */ java.lang.String zzM() {
        return this.zzA;
    }

    final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean zzN() {
        return this.zzG;
    }

    final /* synthetic */ java.util.concurrent.atomic.AtomicInteger zzO() {
        return this.zzH;
    }

    final boolean zzc(android.net.Uri uri) {
        return zzV(uri, this.zzD, this.zzE);
    }

    final boolean zzd(android.net.Uri uri) {
        return zzV(uri, this.zzB, this.zzC);
    }

    @Override // com.google.android.gms.internal.ads.zzcem
    public final void zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, final com.google.android.gms.internal.ads.zzceq zzceqVar, com.google.android.gms.internal.ads.zzcej zzcejVar) {
        com.google.common.util.concurrent.ListenableFuture zza2;
        com.google.common.util.concurrent.ListenableFuture zzc2;
        com.google.common.util.concurrent.ListenableFuture listenableFuture;
        final android.os.Bundle bundle = new android.os.Bundle();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcN)).booleanValue()) {
            bundle.putLong(com.google.android.gms.internal.ads.zzdyu.PUBLIC_API_CALL.zza(), zzceqVar.zzd.zzz);
            bundle.putLong(com.google.android.gms.internal.ads.zzdyu.DYNAMITE_ENTER.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        this.zzg = (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdi)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzay.zzc();
        }
        com.google.android.gms.internal.ads.zzfpw zzn = com.google.android.gms.internal.ads.zzfpw.CC.zzn(this.zzg, 22);
        zzn.zza();
        if ("UNKNOWN".equals(zzceqVar.zzb)) {
            java.util.List arrayList = new java.util.ArrayList();
            com.google.android.gms.internal.ads.zzbih zzbihVar = com.google.android.gms.internal.ads.zzbiq.zziz;
            if (!((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).isEmpty()) {
                arrayList = java.util.Arrays.asList(((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).split(","));
            }
            if (arrayList.contains(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(zzceqVar.zzd))) {
                listenableFuture = com.google.android.gms.internal.ads.zzhbw.zzc(new java.lang.IllegalArgumentException("Unknown format is no longer supported."));
                zzc2 = com.google.android.gms.internal.ads.zzhbw.zzc(new java.lang.IllegalArgumentException("Unknown format is no longer supported."));
                com.google.android.gms.internal.ads.zzhbw.zzr(zzc2, new com.google.android.gms.ads.nonagon.signalgeneration.zzy(this, listenableFuture, zzceqVar, zzcejVar, zzn), this.zzf.zzb());
            }
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmy)).booleanValue()) {
            com.google.android.gms.internal.ads.zzhcg zzhcgVar = com.google.android.gms.internal.ads.zzcfr.zza;
            zza2 = zzhcgVar.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzao
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ java.lang.Object call() {
                    return com.google.android.gms.ads.nonagon.signalgeneration.zzap.this.zzn(zzceqVar, bundle);
                }
            });
            try {
                zzc2 = com.google.android.gms.internal.ads.zzhbw.zzj(zza2, com.google.android.gms.ads.nonagon.signalgeneration.zzac.zza, zzhcgVar);
            } catch (java.lang.NullPointerException e) {
                zzc2 = com.google.android.gms.internal.ads.zzhbw.zzc(e);
            }
        } else {
            com.google.android.gms.ads.nonagon.signalgeneration.zzx zzW = zzW(this.zzg, zzceqVar.zza, zzceqVar.zzb, zzceqVar.zzc, zzceqVar.zzd, bundle);
            zza2 = com.google.android.gms.internal.ads.zzhbw.zza(zzW);
            try {
                zzc2 = zzW.zza();
            } catch (java.lang.NullPointerException e2) {
                zzc2 = com.google.android.gms.internal.ads.zzhbw.zzc(e2);
            }
        }
        listenableFuture = zza2;
        com.google.android.gms.internal.ads.zzhbw.zzr(zzc2, new com.google.android.gms.ads.nonagon.signalgeneration.zzy(this, listenableFuture, zzceqVar, zzcejVar, zzn), this.zzf.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcem
    public final void zzf(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziA)).booleanValue()) {
            android.view.MotionEvent motionEvent = (android.view.MotionEvent) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
            com.google.android.gms.internal.ads.zzbzt zzbztVar = this.zzm;
            this.zzn = com.google.android.gms.ads.internal.util.zzbs.zzh(motionEvent, zzbztVar == null ? null : zzbztVar.zza);
            if (motionEvent.getAction() == 0) {
                this.zzo = this.zzn;
            }
            android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent);
            obtain.setLocation(this.zzn.x, this.zzn.y);
            this.zzh.zzc(obtain);
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcem
    public final void zzg(java.util.List list, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbzq zzbzqVar) {
        zzR(list, iObjectWrapper, zzbzqVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcem
    public final void zzh(java.util.List list, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbzq zzbzqVar) {
        zzS(list, iObjectWrapper, zzbzqVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcem
    public final void zzi(com.google.android.gms.internal.ads.zzbzt zzbztVar) {
        this.zzm = zzbztVar;
        this.zzj.zza(1);
    }

    @Override // com.google.android.gms.internal.ads.zzcem
    public final void zzj(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkW)).booleanValue()) {
            com.google.android.gms.internal.ads.zzbih zzbihVar = com.google.android.gms.internal.ads.zzbiq.zziy;
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
                zzT();
            }
            android.webkit.WebView webView = (android.webkit.WebView) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
            if (webView == null) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("The webView cannot be null.");
                return;
            }
            com.google.android.gms.ads.nonagon.signalgeneration.zza zzaVar = this.zzK;
            com.google.android.gms.ads.nonagon.signalgeneration.zze zzeVar = new com.google.android.gms.ads.nonagon.signalgeneration.zze(webView, zzaVar, com.google.android.gms.internal.ads.zzcfr.zzf);
            webView.addJavascriptInterface(new com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface(webView, this.zzh, this.zzp, this.zzq, this.zzi, this.zzJ, zzaVar, zzeVar), "gmaSdk");
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlg)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzm();
            }
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkv.zzc.zze()).booleanValue()) {
                zzaVar.zza(webView);
                if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkv.zzd.zze()).booleanValue()) {
                    zzeVar.zza();
                }
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
                zzT();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcem
    public final void zzk(java.util.List list, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbzq zzbzqVar) {
        zzR(list, iObjectWrapper, zzbzqVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcem
    public final void zzl(java.util.List list, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbzq zzbzqVar) {
        zzS(list, iObjectWrapper, zzbzqVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcem
    public final com.google.android.gms.dynamic.IObjectWrapper zzm(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2, java.lang.String str, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper3) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlk)).booleanValue()) {
            return com.google.android.gms.dynamic.ObjectWrapper.wrap(null);
        }
        android.content.Context context = (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        androidx.browser.customtabs.CustomTabsClient customTabsClient = (androidx.browser.customtabs.CustomTabsClient) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper2);
        androidx.browser.customtabs.CustomTabsCallback customTabsCallback = (androidx.browser.customtabs.CustomTabsCallback) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper3);
        com.google.android.gms.internal.ads.zzbjv zzbjvVar = this.zzI;
        zzbjvVar.zza(context, customTabsClient, str, customTabsCallback);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkv.zze.zze()).booleanValue()) {
            this.zzJ.zza();
        }
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkv.zzc.zze()).booleanValue()) {
            this.zzK.zza(null);
        }
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(zzbjvVar.zzb());
    }

    final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzx zzn(com.google.android.gms.internal.ads.zzceq zzceqVar, android.os.Bundle bundle) {
        return zzW(this.zzg, zzceqVar.zza, zzceqVar.zzb, zzceqVar.zzc, zzceqVar.zzd, bundle);
    }

    final /* synthetic */ java.util.ArrayList zzo(java.util.List list, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        com.google.android.gms.internal.ads.zzbap zzbapVar = this.zzh;
        java.lang.String zzj = zzbapVar.zzb() != null ? zzbapVar.zzb().zzj(this.zzg, (android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), null) : "";
        if (android.text.TextUtils.isEmpty(zzj)) {
            throw new java.lang.Exception("Failed to get view signals.");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.net.Uri uri = (android.net.Uri) it.next();
            if (zzc(uri)) {
                arrayList.add(zzZ(uri, "ms", zzj));
            } else {
                java.lang.String valueOf = java.lang.String.valueOf(uri);
                java.lang.String.valueOf(valueOf);
                java.lang.String valueOf2 = java.lang.String.valueOf(valueOf);
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Not a Google URL: ".concat(valueOf2));
                arrayList.add(uri);
            }
        }
        if (arrayList.isEmpty()) {
            throw new java.lang.Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzp(final java.util.ArrayList arrayList) {
        return com.google.android.gms.internal.ads.zzhbw.zzk(zzX("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaj
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.gms.ads.nonagon.signalgeneration.zzap.this.zzt(arrayList, (java.lang.String) obj);
            }
        }, this.zzk);
    }

    final /* synthetic */ android.net.Uri zzq(android.net.Uri uri, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        com.google.android.gms.internal.ads.zzflc zzflcVar;
        try {
            uri = (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zznw)).booleanValue() || (zzflcVar = this.zzi) == null) ? this.zzh.zzd(uri, this.zzg, (android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), null) : zzflcVar.zza(uri, this.zzg, (android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), null);
        } catch (com.google.android.gms.internal.ads.zzbaq e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new java.lang.Exception("Failed to append spam signals to click url.");
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzr(final android.net.Uri uri) {
        return com.google.android.gms.internal.ads.zzhbw.zzk(zzX("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new com.google.android.gms.internal.ads.zzgta(this) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzak
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzQ(uri, (java.lang.String) obj);
            }
        }, this.zzk);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzs() {
        try {
            return zzW(this.zzg, null, com.google.android.gms.ads.AdFormat.BANNER.name(), null, null, new android.os.Bundle()).zza();
        } catch (java.lang.NullPointerException e) {
            return com.google.android.gms.internal.ads.zzhbw.zzc(e);
        }
    }

    final /* synthetic */ java.util.ArrayList zzt(java.util.List list, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.net.Uri uri = (android.net.Uri) it.next();
            if (!zzc(uri) || android.text.TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(zzZ(uri, "nas", str));
            }
        }
        return arrayList;
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzu(com.google.android.gms.internal.ads.zzdux[] zzduxVarArr, java.lang.String str, com.google.android.gms.internal.ads.zzdux zzduxVar) {
        zzduxVarArr[0] = zzduxVar;
        android.content.Context context = this.zzg;
        com.google.android.gms.internal.ads.zzbzt zzbztVar = this.zzm;
        java.util.Map map = zzbztVar.zzb;
        org.json.JSONObject zze2 = com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map, zzbztVar.zza, null);
        org.json.JSONObject zzb2 = com.google.android.gms.ads.internal.util.zzbs.zzb(this.zzg, this.zzm.zza);
        org.json.JSONObject zzc2 = com.google.android.gms.ads.internal.util.zzbs.zzc(this.zzm.zza);
        org.json.JSONObject zzd2 = com.google.android.gms.ads.internal.util.zzbs.zzd(this.zzg, this.zzm.zza);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("asset_view_signal", zze2);
        jSONObject.put("ad_view_signal", zzb2);
        jSONObject.put("scroll_view_signal", zzc2);
        jSONObject.put("lock_screen_signal", zzd2);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", com.google.android.gms.ads.internal.util.zzbs.zzf(null, this.zzg, this.zzo, this.zzn));
        }
        return zzduxVar.zzc(str, jSONObject);
    }

    final /* synthetic */ void zzv(com.google.android.gms.internal.ads.zzdux[] zzduxVarArr) {
        com.google.android.gms.internal.ads.zzdux zzduxVar = zzduxVarArr[0];
        if (zzduxVar != null) {
            this.zzj.zzc(com.google.android.gms.internal.ads.zzhbw.zza(zzduxVar));
        }
    }

    final /* synthetic */ void zzw(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzd((android.net.Uri) it.next())) {
                this.zzx.getAndIncrement();
                return;
            }
        }
    }

    final /* synthetic */ android.content.Context zzz() {
        return this.zzg;
    }
}
