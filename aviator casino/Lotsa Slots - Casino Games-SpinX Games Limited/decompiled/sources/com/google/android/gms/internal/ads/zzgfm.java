package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgfm implements com.google.android.gms.internal.ads.zzgfh, com.google.android.gms.internal.ads.zzgfd, com.google.android.gms.internal.ads.zzgfs {
    private static final com.google.android.gms.internal.ads.zzihr zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzgel zzc;
    private final java.util.concurrent.ExecutorService zzd;
    private final com.google.android.gms.internal.ads.zzgee zze;
    private final boolean zzf;
    private final java.lang.String zzg;
    private final long zzh;
    private final long zzi;
    private final double zzj;
    private final java.lang.String zzk;
    private final long zzl;
    private final java.util.concurrent.atomic.AtomicBoolean zzm = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.lang.Object zzn = new java.lang.Object();
    private final java.lang.Object zzo = new java.lang.Object();
    private final java.lang.Object zzp = new java.lang.Object();
    private final com.google.android.gms.internal.ads.zzawp zzq = com.google.android.gms.internal.ads.zzawq.zza();
    private final java.util.List zzr = new java.util.ArrayList();
    private boolean zzs = false;
    private final java.util.HashMap zzt = new java.util.HashMap();
    private final int zzu;

    static {
        com.google.android.gms.internal.ads.zzihq zzc = com.google.android.gms.internal.ads.zzihr.zzc();
        zzc.zza(17);
        zza = (com.google.android.gms.internal.ads.zzihr) zzc.zzbu();
    }

    public zzgfm(android.content.Context context, com.google.android.gms.internal.ads.zzgel zzgelVar, java.util.concurrent.ExecutorService executorService, com.google.android.gms.internal.ads.zzgee zzgeeVar, java.util.Random random, java.lang.String str, long j, long j2, double d, java.lang.String str2, int i, long j3) {
        this.zzb = context;
        this.zzc = zzgelVar;
        this.zzd = executorService;
        this.zze = zzgeeVar;
        this.zzg = str;
        this.zzh = j;
        this.zzi = j2;
        this.zzj = d;
        this.zzk = str2;
        this.zzu = i;
        this.zzl = j3;
        this.zzf = random.nextDouble() < d;
    }

    @Override // com.google.android.gms.internal.ads.zzgfd
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return com.google.android.gms.internal.ads.zzhbw.zze(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzgfk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzgfm.this.zzg();
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    public final void zzb(int i, long j, java.lang.Throwable th, java.lang.String str) {
        long longValue;
        java.lang.Long valueOf;
        if (this.zzf) {
            synchronized (this.zzo) {
                java.util.List list = this.zzr;
                synchronized (this.zzp) {
                    java.util.HashMap hashMap = this.zzt;
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i);
                    java.lang.Long l = (java.lang.Long) hashMap.get(valueOf2);
                    if (l == null) {
                        l = 0L;
                    }
                    longValue = l.longValue() + 1;
                    valueOf = java.lang.Long.valueOf(longValue);
                    hashMap.put(valueOf2, valueOf);
                }
                valueOf.getClass();
                list.add(new com.google.android.gms.internal.ads.zzgfj(i, j, th, str, longValue));
                if (!this.zzs) {
                    this.zzs = true;
                    this.zzc.zza(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzgfl
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            com.google.android.gms.internal.ads.zzgfm.this.zze();
                        }
                    }, this.zzi);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfs
    public final void zzc(com.google.android.gms.internal.ads.zzgfr zzgfrVar) {
        synchronized (this.zzn) {
            this.zzq.zzj(zzgfrVar.zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfs
    public final void zzd(java.util.List list) {
        synchronized (this.zzn) {
            this.zzq.zzm(list);
        }
    }

    final void zze() {
        com.google.android.gms.internal.ads.zzawp zzawpVar;
        com.google.android.gms.internal.ads.zzgwm zzq;
        java.lang.String str;
        synchronized (this.zzn) {
            zzawpVar = (com.google.android.gms.internal.ads.zzawp) this.zzq.clone();
        }
        synchronized (this.zzo) {
            java.util.List list = this.zzr;
            zzq = com.google.android.gms.internal.ads.zzgwm.zzq(list);
            list.clear();
            this.zzs = false;
        }
        int size = zzq.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            com.google.android.gms.internal.ads.zzgfj zzgfjVar = (com.google.android.gms.internal.ads.zzgfj) zzq.get(i);
            if (i2 >= this.zzh) {
                zzf((com.google.android.gms.internal.ads.zzawq) zzawpVar.zzbu());
                zzawpVar.zzb();
                i2 = 0;
            }
            com.google.android.gms.internal.ads.zzaxh zza2 = com.google.android.gms.internal.ads.zzaxi.zza();
            zza2.zza(zzgfjVar.zza);
            zza2.zzb(zzgfjVar.zzb);
            zza2.zze(zzgfjVar.zze);
            java.lang.String str2 = zzgfjVar.zzd;
            if (str2 != null) {
                zza2.zzf(str2);
            }
            java.lang.Throwable th = zzgfjVar.zzc;
            zza2.zzg(th == null ? 2 : 3);
            if (th != null) {
                zza2.zzc(th.getClass().getName());
                try {
                    java.io.StringWriter stringWriter = new java.io.StringWriter();
                    try {
                        java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
                        try {
                            th.printStackTrace(printWriter);
                            str = stringWriter.toString();
                            printWriter.close();
                            stringWriter.close();
                        } catch (java.lang.Throwable th2) {
                            try {
                                printWriter.close();
                            } catch (java.lang.Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (java.lang.Throwable th4) {
                        try {
                            stringWriter.close();
                        } catch (java.lang.Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (java.io.IOException unused) {
                    str = "";
                }
                zza2.zzd(str);
            }
            zzawpVar.zza((com.google.android.gms.internal.ads.zzaxi) zza2.zzbu());
            i++;
            i2++;
        }
        if (i2 > 0) {
            zzf((com.google.android.gms.internal.ads.zzawq) zzawpVar.zzbu());
            zzawpVar.zzb();
        }
    }

    protected final void zzf(com.google.android.gms.internal.ads.zzawq zzawqVar) {
        try {
            com.google.android.gms.internal.ads.zzbdp zza2 = com.google.android.gms.internal.ads.zzbdq.zza();
            zza2.zzb(zza);
            com.google.android.gms.internal.ads.zzbdn zza3 = com.google.android.gms.internal.ads.zzbdo.zza();
            zza3.zza(zzawqVar);
            zza2.zza((com.google.android.gms.internal.ads.zzbdo) zza3.zzbu());
            this.zze.zzb(this.zzg, ((com.google.android.gms.internal.ads.zzbdq) zza2.zzbu()).zzaN(), com.unity3d.ads.gatewayclient.CommonGatewayClient.HEADER_PROTOBUF);
        } catch (java.lang.RuntimeException unused) {
        }
    }

    final /* synthetic */ void zzg() {
        int i;
        if (!this.zzf || this.zzm.getAndSet(true)) {
            return;
        }
        android.content.Context context = this.zzb;
        java.lang.String str = this.zzk;
        int i2 = this.zzu;
        double d = this.zzj;
        long j = this.zzl;
        java.util.Locale locale = java.util.Locale.getDefault();
        int zzb = com.google.android.gms.internal.ads.zzbdv.zzb(com.google.android.gms.internal.ads.zzgde.zza(i2));
        com.google.android.gms.internal.ads.zzawp zza2 = com.google.android.gms.internal.ads.zzawq.zza();
        zza2.zzc(android.os.Build.VERSION.SDK_INT);
        zza2.zzd(android.os.Build.MODEL);
        zza2.zze(locale.getLanguage());
        zza2.zzf(locale.getCountry());
        zza2.zzi(str);
        zza2.zzo(zzb);
        zza2.zzp(3);
        zza2.zzg(context.getPackageName());
        zza2.zzl(j);
        if (d > 0.0d) {
            zza2.zzk((int) (1.0d / d));
        }
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        try {
            zza2.zzh(packageManager.getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (java.lang.Exception unused) {
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                i = 5;
            } else if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                i = 4;
            } else if (packageManager.hasSystemFeature("android.hardware.type.pc")) {
                i = 7;
            } else {
                android.app.UiModeManager uiModeManager = (android.app.UiModeManager) context.getSystemService("uimode");
                i = (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) ? 2 : 6;
            }
            zza2.zzn(i);
        } catch (java.lang.RuntimeException unused2) {
        }
        com.google.android.gms.internal.ads.zzawq zzawqVar = (com.google.android.gms.internal.ads.zzawq) zza2.zzbu();
        synchronized (this.zzn) {
            this.zzq.zzbo(zzawqVar);
        }
    }
}
