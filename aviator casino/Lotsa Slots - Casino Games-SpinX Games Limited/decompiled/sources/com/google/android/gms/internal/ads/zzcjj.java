package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcjj extends com.google.android.gms.internal.ads.zzcja implements com.google.android.gms.internal.ads.zzchd {
    public static final /* synthetic */ int zzd = 0;
    private com.google.android.gms.internal.ads.zzche zze;
    private java.lang.String zzf;
    private boolean zzg;
    private boolean zzh;
    private com.google.android.gms.internal.ads.zzcis zzi;
    private long zzj;
    private long zzk;

    public zzcjj(com.google.android.gms.internal.ads.zzchn zzchnVar, com.google.android.gms.internal.ads.zzchm zzchmVar) {
        super(zzchnVar);
        com.google.android.gms.internal.ads.zzckc zzckcVar = new com.google.android.gms.internal.ads.zzckc(zzchnVar.getContext(), zzchmVar, (com.google.android.gms.internal.ads.zzchn) this.zzc.get(), null);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("ExoPlayerAdapter initialized.");
        this.zze = zzckcVar;
        zzckcVar.zzs(this);
    }

    protected static final java.lang.String zzc(java.lang.String str) {
        java.lang.String zzg = com.google.android.gms.ads.internal.util.client.zzf.zzg(str);
        java.lang.String.valueOf(zzg);
        return "cache:".concat(java.lang.String.valueOf(zzg));
    }

    private final void zzd(long j) {
        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcjh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzcjj.this.zzb();
            }
        }, j);
    }

    private static java.lang.String zzx(java.lang.String str, java.lang.Exception exc) {
        java.lang.String canonicalName = exc.getClass().getCanonicalName();
        java.lang.String message = exc.getMessage();
        int length = java.lang.String.valueOf(canonicalName).length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 1 + length + 1 + java.lang.String.valueOf(message).length());
        sb.append(str);
        sb.append(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING);
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzcja, com.google.android.gms.common.api.Releasable
    public final void release() {
        com.google.android.gms.internal.ads.zzche zzcheVar = this.zze;
        if (zzcheVar != null) {
            zzcheVar.zzs(null);
            this.zze.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzD() {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache onRenderedFirstFrame");
    }

    public final com.google.android.gms.internal.ads.zzche zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzs(null);
        com.google.android.gms.internal.ads.zzche zzcheVar = this.zze;
        this.zze = null;
        return zzcheVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [com.google.android.gms.internal.ads.zzcja, com.google.android.gms.internal.ads.zzcjj] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [com.google.android.gms.internal.ads.zzcjj] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.android.gms.internal.ads.zzbio] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v8, types: [long] */
    /* JADX WARN: Type inference failed for: r5v9 */
    final /* synthetic */ void zzb() {
        java.lang.String str;
        com.google.android.gms.internal.ads.zzcjj zzcjjVar;
        com.google.android.gms.internal.ads.zzcjj zzcjjVar2;
        long longValue;
        long intValue;
        com.google.android.gms.internal.ads.zzcjj zzcjjVar3;
        long j;
        long j2;
        java.lang.String str2;
        long j3;
        java.lang.String zzc = zzc(this.zzf);
        java.lang.String str3 = "error";
        try {
            longValue = ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzal)).longValue() * 1000;
            intValue = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzw)).intValue();
            com.google.android.gms.internal.ads.zzbih zzbihVar = com.google.android.gms.internal.ads.zzbiq.zzcB;
            str = com.google.android.gms.ads.internal.client.zzba.zzc();
            zzcjjVar = ((java.lang.Boolean) str.zzd(zzbihVar)).booleanValue();
            try {
            } catch (java.lang.Throwable th) {
                th = th;
            }
        } catch (java.lang.Exception e) {
            e = e;
            str = zzc;
            zzcjjVar = this;
        }
        synchronized (this) {
            try {
                str = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj;
                if (str <= longValue) {
                    try {
                        if (this.zzg) {
                            throw new java.io.IOException("Abort requested before buffering finished. ");
                        }
                        if (!this.zzh) {
                            if (!this.zze.zzB()) {
                                throw new java.io.IOException("ExoPlayer was released during preloading.");
                            }
                            long zzH = this.zze.zzH();
                            if (zzH > 0) {
                                long zzN = this.zze.zzN();
                                if (zzN != this.zzk) {
                                    try {
                                        j2 = intValue;
                                        str2 = zzc;
                                        try {
                                            zzm(this.zzf, zzc, zzN, zzH, zzN > 0, zzcjjVar != 0 ? this.zze.zzI() : -1L, zzcjjVar != 0 ? this.zze.zzJ() : -1L, zzcjjVar != 0 ? this.zze.zzK() : -1L, com.google.android.gms.internal.ads.zzche.zzP(), com.google.android.gms.internal.ads.zzche.zzQ());
                                            zzcjjVar = this;
                                            j = zzN;
                                            try {
                                                zzcjjVar.zzk = j;
                                                j3 = zzH;
                                                zzcjjVar = zzcjjVar;
                                            } catch (java.lang.Throwable th2) {
                                                th = th2;
                                                str = str2;
                                                throw th;
                                            }
                                        } catch (java.lang.Throwable th3) {
                                            th = th3;
                                            zzcjjVar = this;
                                            str = str2;
                                            throw th;
                                        }
                                    } catch (java.lang.Throwable th4) {
                                        th = th4;
                                        str2 = zzc;
                                        zzcjjVar = this;
                                    }
                                } else {
                                    j = zzN;
                                    j2 = intValue;
                                    str2 = zzc;
                                    zzcjjVar = this;
                                    j3 = zzH;
                                }
                                if (j >= j3) {
                                    zzcjjVar.zzp(zzcjjVar.zzf, str2, j3);
                                    zzcjjVar2 = zzcjjVar;
                                } else {
                                    long zzO = zzcjjVar.zze.zzO();
                                    zzcjjVar3 = zzcjjVar;
                                    if (zzO >= j2) {
                                        zzcjjVar3 = zzcjjVar;
                                        if (j > 0) {
                                            zzcjjVar2 = zzcjjVar;
                                        }
                                    }
                                }
                            } else {
                                zzcjjVar3 = this;
                            }
                            zzcjjVar3.zzd(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzam)).longValue());
                            return;
                        }
                        zzcjjVar2 = this;
                        com.google.android.gms.ads.internal.zzt.zzB().zzd(zzcjjVar2.zzi);
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        str3 = "Timeout reached. Limit: ";
                    }
                } else {
                    str = zzc;
                    zzcjjVar = this;
                    try {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(longValue).length() + 27);
                        sb.append("Timeout reached. Limit: ");
                        sb.append(longValue);
                        sb.append(" ms");
                        throw new java.io.IOException(sb.toString());
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        str3 = "downloadTimeout";
                    }
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                str = zzc;
                zzcjjVar = this;
            }
            try {
                throw th;
            } catch (java.lang.Exception e2) {
                e = e2;
                java.lang.String str4 = str3;
                java.lang.String str5 = zzcjjVar.zzf;
                java.lang.String message = e.getMessage();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(str5).length() + 34 + java.lang.String.valueOf(message).length());
                sb2.append("Failed to preload url ");
                sb2.append(str5);
                sb2.append(" Exception: ");
                sb2.append(message);
                java.lang.String sb3 = sb2.toString();
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(sb3);
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "VideoStreamExoPlayerCache.preload");
                release();
                zzcjjVar.zzq(zzcjjVar.zzf, str, str4, zzx(str4, e));
                zzcjjVar2 = zzcjjVar;
                com.google.android.gms.ads.internal.zzt.zzB().zzd(zzcjjVar2.zzi);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcja
    public final boolean zze(java.lang.String str) {
        return zzf(str, new java.lang.String[]{str});
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0166, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzcja] */
    /* JADX WARN: Type inference failed for: r5v10, types: [int] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.StringBuilder] */
    @Override // com.google.android.gms.internal.ads.zzcja
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzf(java.lang.String str, java.lang.String[] strArr) {
        ?? r6;
        java.lang.String str2;
        ?? r5;
        com.google.android.gms.common.util.Clock clock;
        long j;
        long j2;
        java.lang.String str3;
        java.lang.String str4;
        long j3;
        ?? r1;
        long j4;
        java.lang.String str5;
        long j5;
        long j6;
        com.google.android.gms.internal.ads.zzcjj zzcjjVar = this;
        java.lang.String str6 = str;
        zzcjjVar.zzf = str6;
        java.lang.String str7 = "error";
        java.lang.String zzc = zzc(str);
        java.lang.String str8 = " ms";
        java.lang.String str9 = "Timeout reached. Limit: ";
        try {
            android.net.Uri[] uriArr = new android.net.Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = android.net.Uri.parse(strArr[i]);
            }
            zzcjjVar.zze.zzq(uriArr, zzcjjVar.zzb);
            com.google.android.gms.internal.ads.zzchn zzchnVar = (com.google.android.gms.internal.ads.zzchn) zzcjjVar.zzc.get();
            if (zzchnVar != null) {
                zzchnVar.zzt(zzc, zzcjjVar);
            }
            com.google.android.gms.common.util.Clock zzk = com.google.android.gms.ads.internal.zzt.zzk();
            long currentTimeMillis = zzk.currentTimeMillis();
            long longValue = ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzam)).longValue();
            long longValue2 = ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzal)).longValue() * 1000;
            long intValue = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzw)).intValue();
            boolean booleanValue = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcB)).booleanValue();
            long j7 = -1;
            long j8 = longValue2;
            while (true) {
                synchronized (this) {
                    try {
                        if (zzk.currentTimeMillis() - currentTimeMillis > j8) {
                            long j9 = j8;
                            java.lang.String str10 = str8;
                            java.lang.String str11 = str9;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(j9).length() + 27);
                            sb.append(str11);
                            sb.append(j9);
                            sb.append(str10);
                            throw new java.io.IOException(sb.toString());
                        }
                        if (zzcjjVar.zzg) {
                            throw new java.io.IOException("Abort requested before buffering finished. ");
                        }
                        if (zzcjjVar.zzh) {
                            break;
                        }
                        if (!zzcjjVar.zze.zzB()) {
                            throw new java.io.IOException("ExoPlayer was released during preloading.");
                        }
                        java.lang.String str12 = str8;
                        java.lang.String str13 = str9;
                        long zzH = zzcjjVar.zze.zzH();
                        if (zzH > 0) {
                            long zzN = zzcjjVar.zze.zzN();
                            if (zzN != j7) {
                                try {
                                    j = intValue;
                                    j2 = j8;
                                    long j10 = zzH;
                                    j4 = longValue;
                                    clock = zzk;
                                    str3 = str13;
                                    str4 = str12;
                                    str5 = zzc;
                                    try {
                                        zzm(str, zzc, zzN, j10, zzN > 0, booleanValue ? zzcjjVar.zze.zzI() : -1L, booleanValue ? zzcjjVar.zze.zzJ() : -1L, booleanValue ? zzcjjVar.zze.zzK() : -1L, com.google.android.gms.internal.ads.zzche.zzP(), com.google.android.gms.internal.ads.zzche.zzQ());
                                        j6 = zzN;
                                        j5 = zzH;
                                        r6 = j10;
                                    } catch (java.lang.Throwable th) {
                                        th = th;
                                        r5 = this;
                                        r6 = str;
                                        str2 = str5;
                                        try {
                                            throw th;
                                        } catch (java.lang.Exception e) {
                                            e = e;
                                            java.lang.String str14 = str7;
                                            java.lang.String message = e.getMessage();
                                            ?? sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 34 + java.lang.String.valueOf(message).length());
                                            sb2.append("Failed to preload url ");
                                            sb2.append(r6);
                                            sb2.append(" Exception: ");
                                            sb2.append(message);
                                            java.lang.String sb3 = sb2.toString();
                                            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                                            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb3);
                                            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "VideoStreamExoPlayerCache.preload");
                                            release();
                                            r5.zzq(r6, str2, str14, zzx(str14, e));
                                            return false;
                                        }
                                    }
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    str5 = zzc;
                                }
                            } else {
                                clock = zzk;
                                j = intValue;
                                j2 = j8;
                                j4 = longValue;
                                str5 = zzc;
                                str3 = str13;
                                str4 = str12;
                                j5 = zzH;
                                j6 = j7;
                                r6 = j8;
                            }
                            r5 = (zzN > j5 ? 1 : (zzN == j5 ? 0 : -1));
                            if (r5 >= 0) {
                                zzp(str, str5, j5);
                            } else {
                                try {
                                    com.google.android.gms.internal.ads.zzcjj zzcjjVar2 = this;
                                    r6 = str;
                                    str2 = str5;
                                    if (zzcjjVar2.zze.zzO() < j || zzN <= 0) {
                                        j3 = j4;
                                        r1 = j6;
                                        r5 = zzcjjVar2;
                                    }
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    throw th;
                                }
                            }
                        } else {
                            clock = zzk;
                            j = intValue;
                            j2 = j8;
                            r6 = str6;
                            str2 = zzc;
                            r5 = zzcjjVar;
                            str3 = str13;
                            str4 = str12;
                            j3 = longValue;
                            r1 = j7;
                        }
                        try {
                            try {
                                r5.wait(j3);
                            } catch (java.lang.InterruptedException unused) {
                                throw new java.io.IOException("Wait interrupted.");
                            }
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            str7 = r1;
                            throw th;
                        }
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        r6 = str6;
                        str2 = zzc;
                        r5 = zzcjjVar;
                    }
                }
                str9 = str3;
                longValue = j3;
                zzcjjVar = r5;
                str6 = r6;
                zzc = str2;
                str8 = str4;
                intValue = j;
                j8 = j2;
                zzk = clock;
                j7 = r1;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
            r6 = str6;
            str2 = zzc;
            r5 = zzcjjVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcja
    public final boolean zzg(java.lang.String str, java.lang.String[] strArr, com.google.android.gms.internal.ads.zzcis zzcisVar) {
        this.zzf = str;
        this.zzi = zzcisVar;
        java.lang.String zzc = zzc(str);
        try {
            android.net.Uri[] uriArr = new android.net.Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = android.net.Uri.parse(strArr[i]);
            }
            this.zze.zzq(uriArr, this.zzb);
            com.google.android.gms.internal.ads.zzchn zzchnVar = (com.google.android.gms.internal.ads.zzchn) this.zzc.get();
            if (zzchnVar != null) {
                zzchnVar.zzt(zzc, this);
            }
            this.zzj = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            this.zzk = -1L;
            zzd(0L);
            return true;
        } catch (java.lang.Exception e) {
            java.lang.String message = e.getMessage();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 34 + java.lang.String.valueOf(message).length());
            sb.append("Failed to preload url ");
            sb.append(str);
            sb.append(" Exception: ");
            sb.append(message);
            java.lang.String sb2 = sb.toString();
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(str, zzc, "error", zzx("error", e));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcja
    public final void zzh(int i) {
        this.zze.zzG(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcja
    public final void zzi(int i) {
        this.zze.zzF(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcja
    public final void zzj(int i) {
        this.zze.zzy(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcja
    public final void zzk(int i) {
        this.zze.zzz(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcja
    public final void zzl() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        java.lang.String str = this.zzf;
        if (str != null) {
            zzq(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzr(final boolean z, final long j) {
        final com.google.android.gms.internal.ads.zzchn zzchnVar = (com.google.android.gms.internal.ads.zzchn) this.zzc.get();
        if (zzchnVar != null) {
            com.google.android.gms.internal.ads.zzcfr.zzf.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcji
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i = com.google.android.gms.internal.ads.zzcjj.zzd;
                    com.google.android.gms.internal.ads.zzchn.this.zzu(z, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzs(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzt(int i, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzu(java.lang.String str, java.lang.Exception exc) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache error", exc);
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzv(java.lang.String str, java.lang.Exception exc) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache exception", exc);
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "VideoStreamExoPlayerCache.onException");
    }
}
