package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
public final class zzcdi implements com.google.android.gms.internal.ads.zzcdn {
    public static final /* synthetic */ int zzb = 0;
    private static final java.util.List zzc = java.util.Collections.synchronizedList(new java.util.ArrayList());
    boolean zza;
    private final com.google.android.gms.internal.ads.zziij zzd;
    private final java.util.LinkedHashMap zze;
    private final android.content.Context zzh;
    private final com.google.android.gms.internal.ads.zzcdk zzi;
    private final java.util.List zzf = new java.util.ArrayList();
    private final java.util.List zzg = new java.util.ArrayList();
    private final java.lang.Object zzj = new java.lang.Object();
    private java.util.HashSet zzk = new java.util.HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzcdi(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzcdk zzcdkVar, java.lang.String str, com.google.android.gms.internal.ads.zzcdj zzcdjVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzcdkVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new java.util.LinkedHashMap();
        this.zzi = zzcdkVar;
        java.util.Iterator it = zzcdkVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((java.lang.String) it.next()).toLowerCase(java.util.Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(java.util.Locale.ENGLISH));
        com.google.android.gms.internal.ads.zziij zzg = com.google.android.gms.internal.ads.zzikn.zzg();
        zzg.zzn(9);
        if (str != null) {
            zzg.zzb(str);
            zzg.zzc(str);
        }
        com.google.android.gms.internal.ads.zziik zzc2 = com.google.android.gms.internal.ads.zziil.zzc();
        java.lang.String str2 = this.zzi.zza;
        if (str2 != null) {
            zzc2.zza(str2);
        }
        zzg.zzd((com.google.android.gms.internal.ads.zziil) zzc2.zzbu());
        com.google.android.gms.internal.ads.zzijz zzc3 = com.google.android.gms.internal.ads.zzika.zzc();
        zzc3.zzc(com.google.android.gms.common.wrappers.Wrappers.packageManager(this.zzh).isCallerInstantApp());
        java.lang.String str3 = versionInfoParcel.afmaVersion;
        if (str3 != null) {
            zzc3.zza(str3);
        }
        long apkVersion = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zzc3.zzb(apkVersion);
        }
        zzg.zzk((com.google.android.gms.internal.ads.zzika) zzc3.zzbu());
        this.zzd = zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final com.google.android.gms.internal.ads.zzcdk zza() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzb(java.lang.String str) {
        synchronized (this.zzj) {
            if (str == null) {
                this.zzd.zzi();
            } else {
                this.zzd.zzh(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final boolean zzc() {
        return this.zzi.zzc && !this.zzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    @Override // com.google.android.gms.internal.ads.zzcdn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(android.view.View view) {
        android.graphics.Bitmap bitmap;
        boolean isDrawingCacheEnabled;
        if (this.zzi.zzc && !this.zzl) {
            com.google.android.gms.ads.internal.zzt.zzc();
            final android.graphics.Bitmap bitmap2 = null;
            if (view != null) {
                try {
                    isDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    android.graphics.Bitmap drawingCache = view.getDrawingCache();
                    bitmap = drawingCache != null ? android.graphics.Bitmap.createBitmap(drawingCache) : null;
                } catch (java.lang.RuntimeException e) {
                    e = e;
                    bitmap = null;
                }
                try {
                    view.setDrawingCacheEnabled(isDrawingCacheEnabled);
                } catch (java.lang.RuntimeException e2) {
                    e = e2;
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to capture the web view", e);
                    if (bitmap != null) {
                    }
                    if (bitmap2 != null) {
                    }
                }
                if (bitmap != null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width != 0 && height != 0) {
                            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(view.getWidth(), view.getHeight(), android.graphics.Bitmap.Config.RGB_565);
                            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap2 = createBitmap;
                        }
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Width or height of view is zero");
                    } catch (java.lang.RuntimeException e3) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to capture the webview", e3);
                    }
                } else {
                    bitmap2 = bitmap;
                }
            }
            if (bitmap2 != null) {
                com.google.android.gms.internal.ads.zzcdm.zza("Failed to capture the webview bitmap.");
                return;
            }
            this.zzl = true;
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcdh
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzcdi.this.zzg(bitmap2);
                }
            };
            if (android.os.Looper.getMainLooper().getThread() != java.lang.Thread.currentThread()) {
                runnable.run();
            } else {
                com.google.android.gms.internal.ads.zzcfr.zza.execute(runnable);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zze(java.lang.String str, java.util.Map map, int i) {
        synchronized (this.zzj) {
            if (i == 3) {
                this.zzm = true;
            }
            java.util.LinkedHashMap linkedHashMap = this.zze;
            if (linkedHashMap.containsKey(str)) {
                if (i == 3) {
                    ((com.google.android.gms.internal.ads.zzijx) linkedHashMap.get(str)).zze(4);
                }
                return;
            }
            com.google.android.gms.internal.ads.zzijx zze = com.google.android.gms.internal.ads.zzijy.zze();
            int zza = com.google.android.gms.internal.ads.zzijw.zza(i);
            if (zza != 0) {
                zze.zze(zza);
            }
            zze.zza(linkedHashMap.size());
            zze.zzb(str);
            com.google.android.gms.internal.ads.zziiw zzc2 = com.google.android.gms.internal.ads.zziiz.zzc();
            if (!this.zzk.isEmpty() && map != null) {
                for (java.util.Map.Entry entry : map.entrySet()) {
                    java.lang.String str2 = entry.getKey() != null ? (java.lang.String) entry.getKey() : "";
                    java.lang.String str3 = entry.getValue() != null ? (java.lang.String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(java.util.Locale.ENGLISH))) {
                        com.google.android.gms.internal.ads.zziiu zzc3 = com.google.android.gms.internal.ads.zziiv.zzc();
                        zzc3.zza(com.google.android.gms.internal.ads.zzida.zzx(str2));
                        zzc3.zzb(com.google.android.gms.internal.ads.zzida.zzx(str3));
                        zzc2.zza((com.google.android.gms.internal.ads.zziiv) zzc3.zzbu());
                    }
                }
            }
            zze.zzc((com.google.android.gms.internal.ads.zziiz) zzc2.zzbu());
            linkedHashMap.put(str, zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzf() {
        synchronized (this.zzj) {
            this.zze.keySet();
            com.google.common.util.concurrent.ListenableFuture zza = com.google.android.gms.internal.ads.zzhbw.zza(java.util.Collections.emptyMap());
            com.google.android.gms.internal.ads.zzhbe zzhbeVar = new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzcde
                @Override // com.google.android.gms.internal.ads.zzhbe
                public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                    return com.google.android.gms.internal.ads.zzcdi.this.zzh((java.util.Map) obj);
                }
            };
            com.google.android.gms.internal.ads.zzhcg zzhcgVar = com.google.android.gms.internal.ads.zzcfr.zzh;
            com.google.common.util.concurrent.ListenableFuture zzj = com.google.android.gms.internal.ads.zzhbw.zzj(zza, zzhbeVar, zzhcgVar);
            com.google.common.util.concurrent.ListenableFuture zzi = com.google.android.gms.internal.ads.zzhbw.zzi(zzj, 10L, java.util.concurrent.TimeUnit.SECONDS, com.google.android.gms.internal.ads.zzcfr.zzd);
            com.google.android.gms.internal.ads.zzhbw.zzr(zzj, new com.google.android.gms.internal.ads.zzcdd(this, zzi), zzhcgVar);
            zzc.add(zzi);
        }
    }

    final /* synthetic */ void zzg(android.graphics.Bitmap bitmap) {
        com.google.android.gms.internal.ads.zzicz zzC = com.google.android.gms.internal.ads.zzida.zzC();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 0, zzC);
        synchronized (this.zzj) {
            com.google.android.gms.internal.ads.zziij zziijVar = this.zzd;
            com.google.android.gms.internal.ads.zzijr zzc2 = com.google.android.gms.internal.ads.zzijt.zzc();
            zzc2.zzb(zzC.zza());
            zzc2.zza(androidx.media3.common.MimeTypes.IMAGE_PNG);
            zzc2.zzc(2);
            zziijVar.zzj((com.google.android.gms.internal.ads.zzijt) zzc2.zzbu());
        }
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzh(java.util.Map map) {
        int length;
        com.google.android.gms.internal.ads.zzijx zzijxVar;
        com.google.common.util.concurrent.ListenableFuture zzk;
        if (map != null) {
            try {
                for (java.lang.String str : map.keySet()) {
                    org.json.JSONArray optJSONArray = new org.json.JSONObject((java.lang.String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        java.lang.Object obj = this.zzj;
                        synchronized (obj) {
                            length = optJSONArray.length();
                            synchronized (obj) {
                                zzijxVar = (com.google.android.gms.internal.ads.zzijx) this.zze.get(str);
                            }
                        }
                        if (zzijxVar == null) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 50);
                            sb.append("Cannot find the corresponding resource object for ");
                            sb.append(str);
                            com.google.android.gms.internal.ads.zzcdm.zza(sb.toString());
                        } else {
                            for (int i = 0; i < length; i++) {
                                zzijxVar.zzd(optJSONArray.getJSONObject(i).getString("threat_type"));
                            }
                            this.zza = (length > 0) | this.zza;
                        }
                    }
                }
            } catch (org.json.JSONException e) {
                if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbky.zza.zze()).booleanValue()) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get SafeBrowsing metadata", e);
                }
                return com.google.android.gms.internal.ads.zzhbw.zzc(new java.lang.Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z = this.zza;
        if (!(z && this.zzi.zzg) && (!(this.zzm && this.zzi.zzf) && (z || !this.zzi.zzd))) {
            return com.google.android.gms.internal.ads.zzhbw.zza(null);
        }
        synchronized (this.zzj) {
            java.util.Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                this.zzd.zzf((com.google.android.gms.internal.ads.zzijy) ((com.google.android.gms.internal.ads.zzijx) it.next()).zzbu());
            }
            com.google.android.gms.internal.ads.zziij zziijVar = this.zzd;
            zziijVar.zzl(this.zzf);
            zziijVar.zzm(this.zzg);
            if (com.google.android.gms.internal.ads.zzcdm.zzb()) {
                java.lang.String zza = zziijVar.zza();
                java.lang.String zzg = zziijVar.zzg();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(zza).length() + 38 + java.lang.String.valueOf(zzg).length() + 15);
                sb2.append("Sending SB report\n  url: ");
                sb2.append(zza);
                sb2.append("\n  clickUrl: ");
                sb2.append(zzg);
                sb2.append("\n  resources: \n");
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(sb2.toString());
                for (com.google.android.gms.internal.ads.zzijy zzijyVar : zziijVar.zze()) {
                    sb3.append("    [");
                    sb3.append(zzijyVar.zzd());
                    sb3.append("] ");
                    sb3.append(zzijyVar.zzc());
                }
                com.google.android.gms.internal.ads.zzcdm.zza(sb3.toString());
            }
            com.google.common.util.concurrent.ListenableFuture zzb2 = new com.google.android.gms.ads.internal.util.zzbl(this.zzh).zzb(1, this.zzi.zzb, null, ((com.google.android.gms.internal.ads.zzikn) zziijVar.zzbu()).zzaN());
            if (com.google.android.gms.internal.ads.zzcdm.zzb()) {
                zzb2.addListener(com.google.android.gms.internal.ads.zzcdg.zza, com.google.android.gms.internal.ads.zzcfr.zza);
            }
            zzk = com.google.android.gms.internal.ads.zzhbw.zzk(zzb2, com.google.android.gms.internal.ads.zzcdf.zza, com.google.android.gms.internal.ads.zzcfr.zzh);
        }
        return zzk;
    }
}
