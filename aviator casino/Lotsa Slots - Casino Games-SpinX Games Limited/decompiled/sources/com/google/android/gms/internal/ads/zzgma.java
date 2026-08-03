package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgma implements com.google.android.gms.internal.ads.zzglb {
    private final com.google.android.gms.internal.ads.zzgfs zza;
    private final com.google.android.gms.internal.ads.zzgox zzb;
    private final com.google.android.gms.internal.ads.zzgoe zzc;
    private final java.util.concurrent.ExecutorService zzd;
    private final com.google.android.gms.internal.ads.zzgpc zze;
    private final com.google.android.gms.internal.ads.zzgqh zzf;
    private final java.lang.Object zzg = new java.lang.Object();
    private final java.lang.String zzh;
    private final long zzi;
    private final long zzj;
    private final boolean zzk;
    private final boolean zzl;
    private com.google.android.gms.internal.ads.zzglz zzm;

    zzgma(com.google.android.gms.internal.ads.zzgfs zzgfsVar, com.google.android.gms.internal.ads.zzinj zzinjVar, com.google.android.gms.internal.ads.zzgox zzgoxVar, com.google.android.gms.internal.ads.zzgoe zzgoeVar, com.google.android.gms.internal.ads.zzgpc zzgpcVar, com.google.android.gms.internal.ads.zzgqh zzgqhVar, com.google.android.gms.internal.ads.zzgdf zzgdfVar, java.util.concurrent.ExecutorService executorService) {
        this.zza = zzgfsVar;
        this.zzb = zzgoxVar;
        this.zzc = zzgoeVar;
        this.zzd = executorService;
        this.zze = zzgpcVar;
        this.zzf = zzgqhVar;
        this.zzh = zzgdfVar.zzd();
        this.zzi = zzgdfVar.zzm();
        this.zzj = zzgdfVar.zzl();
        this.zzk = zzgdfVar.zzb();
        this.zzl = zzgdfVar.zzc();
    }

    private final com.google.common.util.concurrent.ListenableFuture zzs() {
        return com.google.android.gms.internal.ads.zzhbw.zzk(this.zzc.zzf(), new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzglu
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzgma.this.zzo((byte[]) obj);
                return null;
            }
        }, com.google.android.gms.internal.ads.zzhcn.zza());
    }

    private final void zzt(com.google.android.gms.internal.ads.zzaux zzauxVar, byte[] bArr, boolean z) {
        com.google.android.gms.internal.ads.zzgqf zza = this.zzf.zza(20102);
        try {
            try {
                zza.zza();
                synchronized (this.zzg) {
                    this.zzm = com.google.android.gms.internal.ads.zzglz.zza(zzauxVar, bArr, z);
                }
                zza.zzc();
            } catch (com.google.android.gms.internal.ads.zzauv e) {
                e = e;
                zza.zzb(e);
                throw new com.google.android.gms.internal.ads.zzglc(2, e);
            } catch (com.google.android.gms.internal.ads.zzauz e2) {
                e = e2;
                zza.zzb(e);
                throw new com.google.android.gms.internal.ads.zzglc(2, e);
            } catch (java.lang.Throwable th) {
                zza.zzb(th);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            zza.zzc();
            throw th2;
        }
    }

    private final java.lang.String zzu(java.util.Map map) throws com.google.android.gms.internal.ads.zzauz, com.google.android.gms.internal.ads.zzauv {
        java.lang.String zzb;
        com.google.android.gms.internal.ads.zzgqh zzgqhVar = this.zzf;
        try {
            zzgqhVar.zza(20110).zza();
            synchronized (this.zzg) {
                com.google.android.gms.internal.ads.zzglz zzglzVar = this.zzm;
                if (zzglzVar == null) {
                    zzgqhVar.zzb(20109);
                    zzb = "";
                } else {
                    zzb = zzglzVar.zzb(map);
                }
            }
            return zzb;
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzglb
    public final java.lang.String zza() {
        synchronized (this.zzg) {
            com.google.android.gms.internal.ads.zzglz zzglzVar = this.zzm;
            if (zzglzVar == null) {
                return "3.878096153.-1";
            }
            return zzglzVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzglb
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        if (this.zzl) {
            return zzs();
        }
        com.google.android.gms.internal.ads.zzhbo zzw = com.google.android.gms.internal.ads.zzhbo.zzw(this.zzc.zzb());
        java.util.concurrent.ExecutorService executorService = this.zzd;
        return (com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzh((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzj((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzg(zzw, java.lang.Throwable.class, com.google.android.gms.internal.ads.zzgly.zza, executorService), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzglo
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzgma.this.zzi((com.google.android.gms.internal.ads.zzgfq) obj);
            }
        }, executorService), java.lang.Throwable.class, new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzglp
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzgma.this.zzj((java.lang.Throwable) obj);
            }
        }, com.google.android.gms.internal.ads.zzhcn.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzglb
    public final com.google.common.util.concurrent.ListenableFuture zzc(final android.content.Context context) {
        return com.google.android.gms.internal.ads.zzhbw.zzd(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzglq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzgma.this.zzk(context);
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzglb
    public final com.google.common.util.concurrent.ListenableFuture zzd(final android.content.Context context, java.lang.String str, final android.view.View view, final android.app.Activity activity) {
        final java.lang.String str2 = null;
        return com.google.android.gms.internal.ads.zzhbw.zzd(new java.util.concurrent.Callable(context, str2, view, activity) { // from class: com.google.android.gms.internal.ads.zzglr
            private final /* synthetic */ android.content.Context zzb;
            private final /* synthetic */ android.view.View zzc;
            private final /* synthetic */ android.app.Activity zzd;

            {
                this.zzc = view;
                this.zzd = activity;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzgma.this.zzl(this.zzb, null, this.zzc, this.zzd);
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzglb
    public final com.google.common.util.concurrent.ListenableFuture zze(final android.content.Context context, final java.lang.String str, final android.view.View view, android.app.Activity activity) {
        final android.app.Activity activity2 = null;
        return com.google.android.gms.internal.ads.zzhbw.zzd(new java.util.concurrent.Callable(context, str, view, activity2) { // from class: com.google.android.gms.internal.ads.zzgls
            private final /* synthetic */ android.content.Context zzb;
            private final /* synthetic */ java.lang.String zzc;
            private final /* synthetic */ android.view.View zzd;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzgma.this.zzm(this.zzb, this.zzc, this.zzd, null);
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzglb
    public final void zzf(android.view.InputEvent inputEvent) {
        try {
            synchronized (this.zzg) {
                com.google.android.gms.internal.ads.zzglz zzglzVar = this.zzm;
                if (zzglzVar != null) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("evt", inputEvent);
                    zzglzVar.zzc(hashMap);
                } else {
                    this.zzf.zzb(20105);
                }
            }
        } catch (com.google.android.gms.internal.ads.zzauv | com.google.android.gms.internal.ads.zzauz e) {
            this.zzf.zzd(20104, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzglb
    public final int zzg() {
        return 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzh(java.util.Map map) {
        java.lang.String str;
        com.google.android.gms.internal.ads.zzgqf zza;
        java.lang.String str2;
        map.put("v", this.zzh);
        com.google.common.util.concurrent.ListenableFuture listenableFuture = (com.google.common.util.concurrent.ListenableFuture) map.get("gs");
        com.google.common.util.concurrent.ListenableFuture listenableFuture2 = (com.google.common.util.concurrent.ListenableFuture) map.get("ai");
        byte[] bArr = null;
        long j = -1;
        if (listenableFuture != null) {
            zza = this.zzf.zza(20107);
            try {
                try {
                    zza.zza();
                    com.google.android.gms.internal.ads.zzaym zzaymVar = (com.google.android.gms.internal.ads.zzaym) listenableFuture.get(this.zzj, java.util.concurrent.TimeUnit.MILLISECONDS);
                    if (zzaymVar != null) {
                        bArr = zzaymVar.zzh().zzaN();
                        str = zzaymVar.zzb().length() > 1 ? zzaymVar.zzb() : androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST;
                        try {
                            if (zzaymVar.zzc()) {
                                j = zzaymVar.zzd();
                            }
                        } catch (java.lang.ClassCastException e) {
                            e = e;
                            zza.zzb(e);
                            zza.zzc();
                            if (str.equals(androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST)) {
                            }
                            map.put("int", str);
                            if (bArr != null) {
                            }
                            map.put("gv", java.lang.Long.valueOf(j));
                        } catch (java.lang.InterruptedException e2) {
                            e = e2;
                            zza.zzb(e);
                            zza.zzc();
                            if (str.equals(androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST)) {
                            }
                            map.put("int", str);
                            if (bArr != null) {
                            }
                            map.put("gv", java.lang.Long.valueOf(j));
                        } catch (java.util.concurrent.ExecutionException e3) {
                            e = e3;
                            java.lang.Throwable cause = e.getCause();
                            if (cause != null) {
                                e = cause;
                            }
                            zza.zzb(e);
                            zza.zzc();
                            if (str.equals(androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST)) {
                            }
                            map.put("int", str);
                            if (bArr != null) {
                            }
                            map.put("gv", java.lang.Long.valueOf(j));
                        } catch (java.util.concurrent.TimeoutException e4) {
                            e = e4;
                            zza.zzb(e);
                            zza.zzc();
                            if (str.equals(androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST)) {
                            }
                            map.put("int", str);
                            if (bArr != null) {
                            }
                            map.put("gv", java.lang.Long.valueOf(j));
                        }
                    } else {
                        str = androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST;
                    }
                } finally {
                }
            } catch (java.lang.ClassCastException e5) {
                e = e5;
                str = androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST;
                zza.zzb(e);
                zza.zzc();
                if (str.equals(androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST)) {
                    zza = this.zzf.zza(20108);
                    try {
                        try {
                            zza.zza();
                            str2 = (java.lang.String) listenableFuture2.get(this.zzi, java.util.concurrent.TimeUnit.MILLISECONDS);
                            if (true != com.google.android.gms.internal.ads.zzgua.zzc(str2)) {
                            }
                        } catch (java.lang.ClassCastException e6) {
                            e = e6;
                            zza.zzb(e);
                        } catch (java.lang.InterruptedException e7) {
                            e = e7;
                            zza.zzb(e);
                        } catch (java.util.concurrent.ExecutionException e8) {
                            e = e8;
                            java.lang.Throwable cause2 = e.getCause();
                            if (cause2 != null) {
                                e = cause2;
                            }
                            zza.zzb(e);
                        } catch (java.util.concurrent.TimeoutException e9) {
                            e = e9;
                            zza.zzb(e);
                        }
                    } finally {
                    }
                }
                map.put("int", str);
                if (bArr != null) {
                }
                map.put("gv", java.lang.Long.valueOf(j));
            } catch (java.lang.InterruptedException e10) {
                e = e10;
                str = androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST;
                zza.zzb(e);
                zza.zzc();
                if (str.equals(androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST)) {
                }
                map.put("int", str);
                if (bArr != null) {
                }
                map.put("gv", java.lang.Long.valueOf(j));
            } catch (java.util.concurrent.ExecutionException e11) {
                e = e11;
                str = androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST;
            } catch (java.util.concurrent.TimeoutException e12) {
                e = e12;
                str = androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST;
                zza.zzb(e);
                zza.zzc();
                if (str.equals(androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST)) {
                }
                map.put("int", str);
                if (bArr != null) {
                }
                map.put("gv", java.lang.Long.valueOf(j));
            }
            zza.zzc();
        } else {
            str = androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST;
        }
        if (str.equals(androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST) && listenableFuture2 != null) {
            zza = this.zzf.zza(20108);
            zza.zza();
            str2 = (java.lang.String) listenableFuture2.get(this.zzi, java.util.concurrent.TimeUnit.MILLISECONDS);
            if (true != com.google.android.gms.internal.ads.zzgua.zzc(str2)) {
                str = str2;
            }
        }
        map.put("int", str);
        if (bArr != null) {
            map.put("att", bArr);
        }
        map.put("gv", java.lang.Long.valueOf(j));
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzi(com.google.android.gms.internal.ads.zzgfq zzgfqVar) {
        if (zzgfqVar != null) {
            this.zza.zzd(zzgfqVar.zzd());
        }
        if (this.zzb.zzb(zzgfqVar)) {
            return com.google.android.gms.internal.ads.zzhbw.zzk(this.zzc.zze(), new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzglt
                @Override // com.google.android.gms.internal.ads.zzgta
                public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                    com.google.android.gms.internal.ads.zzgma.this.zzn((byte[]) obj);
                    return null;
                }
            }, com.google.android.gms.internal.ads.zzhcn.zza());
        }
        this.zzf.zzb(20103);
        throw new com.google.android.gms.internal.ads.zzglc(1);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzj(java.lang.Throwable th) {
        return this.zzk ? zzs() : com.google.android.gms.internal.ads.zzhbw.zzc(th);
    }

    final /* synthetic */ java.lang.String zzk(final android.content.Context context) {
        final java.util.HashMap hashMap = new java.util.HashMap();
        this.zzf.zzf(20106, new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzglv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzgma.this.zzp(hashMap, context);
            }
        });
        java.lang.String zzu = zzu(hashMap);
        hashMap.clear();
        return zzu;
    }

    final /* synthetic */ java.lang.String zzl(final android.content.Context context, java.lang.String str, final android.view.View view, final android.app.Activity activity) {
        final java.util.HashMap hashMap = new java.util.HashMap();
        final java.lang.String str2 = null;
        this.zzf.zzf(20106, new java.lang.Runnable(hashMap, context, view, activity, str2) { // from class: com.google.android.gms.internal.ads.zzglw
            private final /* synthetic */ java.util.Map zzb;
            private final /* synthetic */ android.content.Context zzc;
            private final /* synthetic */ android.view.View zzd;
            private final /* synthetic */ android.app.Activity zze;

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzgma.this.zzq(this.zzb, this.zzc, this.zzd, this.zze, null);
            }
        });
        java.lang.String zzu = zzu(hashMap);
        hashMap.clear();
        return zzu;
    }

    final /* synthetic */ java.lang.String zzm(final android.content.Context context, final java.lang.String str, final android.view.View view, android.app.Activity activity) {
        final java.util.HashMap hashMap = new java.util.HashMap();
        final android.app.Activity activity2 = null;
        this.zzf.zzf(20106, new java.lang.Runnable(hashMap, context, view, activity2, str) { // from class: com.google.android.gms.internal.ads.zzglx
            private final /* synthetic */ java.util.Map zzb;
            private final /* synthetic */ android.content.Context zzc;
            private final /* synthetic */ android.view.View zzd;
            private final /* synthetic */ java.lang.String zze;

            {
                this.zze = str;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzgma.this.zzr(this.zzb, this.zzc, this.zzd, null, this.zze);
            }
        });
        java.lang.String zzu = zzu(hashMap);
        hashMap.clear();
        return zzu;
    }

    final /* synthetic */ java.lang.Void zzn(byte[] bArr) {
        zzt(com.google.android.gms.internal.ads.zzgmd.zzc(), bArr, false);
        return null;
    }

    final /* synthetic */ java.lang.Void zzo(byte[] bArr) {
        zzt(com.google.android.gms.internal.ads.zzgmd.zzc(), bArr, true);
        return null;
    }

    final /* synthetic */ void zzp(java.util.Map map, android.content.Context context) {
        map.putAll(this.zze.zzb());
        zzh(map);
        map.put(com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_FEMALE, "q");
        map.put("ctx", context);
    }

    final /* synthetic */ void zzq(java.util.Map map, android.content.Context context, android.view.View view, android.app.Activity activity, java.lang.String str) {
        map.putAll(this.zze.zzc(context, view));
        zzh(map);
        map.put(com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_FEMALE, "v");
        map.put("ctx", context);
        map.put(com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, view);
        map.put("act", activity);
        map.put("bds", null);
    }

    final /* synthetic */ void zzr(java.util.Map map, android.content.Context context, android.view.View view, android.app.Activity activity, java.lang.String str) {
        map.putAll(this.zze.zzd());
        zzh(map);
        map.put(com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_FEMALE, "c");
        map.put("ctx", context);
        map.put(com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, view);
        map.put("act", null);
        map.put("bds", str);
    }
}
