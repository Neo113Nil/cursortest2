package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbbs {
    private static final java.lang.String zzc = "zzbbs";
    protected final android.content.Context zza;
    private java.util.concurrent.ExecutorService zzd;
    private dalvik.system.DexClassLoader zze;
    private com.google.android.gms.internal.ads.zzbax zzf;
    private byte[] zzg;
    private final boolean zzj;
    private com.google.android.gms.internal.ads.zzbas zzm;
    private com.google.android.gms.internal.ads.zzbaj zzn;
    private final java.util.Map zzo;
    private com.google.android.gms.internal.ads.zzbbl zzq;
    private volatile com.google.android.gms.ads.identifier.AdvertisingIdClient zzh = null;
    private volatile boolean zzi = false;
    private volatile com.google.android.gms.internal.ads.zzaym zzk = null;
    private java.util.concurrent.Future zzl = null;
    protected boolean zzb = false;
    private boolean zzp = false;

    private zzbbs(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.zzj = applicationContext != null;
        context = applicationContext != null ? applicationContext : context;
        this.zza = context;
        this.zzo = new java.util.HashMap();
        if (this.zzq != null) {
            return;
        }
        this.zzq = new com.google.android.gms.internal.ads.zzbbl(context);
    }

    public static com.google.android.gms.internal.ads.zzbbs zza(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z, com.google.android.gms.internal.ads.zzbas zzbasVar) {
        com.google.android.gms.internal.ads.zzbax zzbaxVar;
        byte[] zzb;
        com.google.android.gms.internal.ads.zzbbs zzbbsVar = new com.google.android.gms.internal.ads.zzbbs(context);
        try {
            zzbbsVar.zzd = java.util.concurrent.Executors.newCachedThreadPool(new com.google.android.gms.internal.ads.zzbbo());
            zzbbsVar.zzi = z;
            if (z) {
                zzbbsVar.zzd.submit(new com.google.android.gms.internal.ads.zzbbp(zzbbsVar));
            }
            zzbbsVar.zzd.execute(new com.google.android.gms.internal.ads.zzbbr(zzbbsVar));
            try {
                com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance();
                android.content.Context context2 = zzbbsVar.zza;
                googleApiAvailabilityLight.getApkVersion(context2);
                zzbbsVar.zzb = googleApiAvailabilityLight.isGooglePlayServicesAvailable(context2) == 0;
            } catch (java.lang.Throwable unused) {
            }
            if (zzbasVar != null) {
                zzbbsVar.zzm = zzbasVar;
            } else {
                zzbbsVar.zzp(0, true);
            }
            if (com.google.android.gms.internal.ads.zzbbv.zzd() && ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzel)).booleanValue()) {
                throw new java.lang.IllegalStateException("Task Context initialization must not be called from the UI thread.");
            }
            zzbaxVar = new com.google.android.gms.internal.ads.zzbax(null);
            zzbbsVar.zzf = zzbaxVar;
            try {
                try {
                    zzb = com.google.android.gms.internal.ads.zzazi.zzb("GpeoZNfYB0xbX4XrY9tptE+P6lGr6tGbtd6Fg+9sjdQ=", false);
                } catch (com.google.android.gms.internal.ads.zzbaw e) {
                    throw new com.google.android.gms.internal.ads.zzbbi(e);
                }
            } catch (java.lang.IllegalArgumentException e2) {
                throw new com.google.android.gms.internal.ads.zzbaw(zzbaxVar, e2);
            }
        } catch (com.google.android.gms.internal.ads.zzbbi unused2) {
        }
        if (zzb.length != 32) {
            throw new com.google.android.gms.internal.ads.zzbaw(zzbaxVar);
        }
        byte[] bArr = new byte[16];
        java.nio.ByteBuffer.wrap(zzb, 4, 16).get(bArr);
        for (int i = 0; i < 16; i++) {
            bArr[i] = (byte) (bArr[i] ^ 68);
        }
        zzbbsVar.zzg = bArr;
        try {
            try {
                android.content.Context context3 = zzbbsVar.zza;
                java.io.File cacheDir = context3.getCacheDir();
                if (cacheDir == null && (cacheDir = context3.getDir("dex", 0)) == null) {
                    throw new com.google.android.gms.internal.ads.zzbbi();
                }
                java.io.File file = new java.io.File(java.lang.String.format("%s/%s.jar", cacheDir, "1762298034389"));
                if (!file.exists()) {
                    byte[] zzb2 = zzbbsVar.zzf.zzb(zzbbsVar.zzg, "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");
                    file.createNewFile();
                    java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
                    if (android.os.Build.VERSION.SDK_INT >= 33) {
                        file.setReadOnly();
                    }
                    fileOutputStream.write(zzb2, 0, zzb2.length);
                    fileOutputStream.close();
                }
                zzbbsVar.zzu(cacheDir, "1762298034389");
                try {
                    try {
                        zzbbsVar.zze = new dalvik.system.DexClassLoader(file.getAbsolutePath(), cacheDir.getAbsolutePath(), null, context3.getClassLoader());
                        zzw(file);
                        zzbbsVar.zzt(cacheDir, "1762298034389");
                        zzx(java.lang.String.format("%s/%s.dex", cacheDir, "1762298034389"));
                        zzbbsVar.zzn = new com.google.android.gms.internal.ads.zzbaj(zzbbsVar);
                        zzbbsVar.zzp = true;
                        return zzbbsVar;
                    } catch (java.lang.SecurityException e3) {
                        throw new com.google.android.gms.internal.ads.zzbbi(e3);
                    }
                } catch (java.lang.Throwable th) {
                    zzw(file);
                    zzbbsVar.zzt(cacheDir, "1762298034389");
                    zzx(java.lang.String.format("%s/%s.dex", cacheDir, "1762298034389"));
                    throw th;
                }
            } catch (java.io.FileNotFoundException e4) {
                throw new com.google.android.gms.internal.ads.zzbbi(e4);
            } catch (java.io.IOException e5) {
                throw new com.google.android.gms.internal.ads.zzbbi(e5);
            }
        } catch (com.google.android.gms.internal.ads.zzbaw e6) {
            throw new com.google.android.gms.internal.ads.zzbbi(e6);
        } catch (java.lang.NullPointerException e7) {
            throw new com.google.android.gms.internal.ads.zzbbi(e7);
        }
    }

    private final void zzt(java.io.File file, java.lang.String str) {
        java.lang.Throwable th;
        java.io.FileOutputStream fileOutputStream;
        java.io.File file2 = new java.io.File(java.lang.String.format("%s/%s.tmp", file, "1762298034389"));
        if (file2.exists()) {
            return;
        }
        java.io.File file3 = new java.io.File(java.lang.String.format("%s/%s.dex", file, "1762298034389"));
        if (!file3.exists()) {
            return;
        }
        long length = file3.length();
        if (length <= 0) {
            return;
        }
        byte[] bArr = new byte[(int) length];
        java.io.FileInputStream fileInputStream = null;
        try {
            java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(file3);
            try {
                try {
                    if (fileInputStream2.read(bArr) <= 0) {
                        try {
                            fileInputStream2.close();
                        } catch (java.io.IOException unused) {
                        }
                        zzw(file3);
                        return;
                    }
                    java.lang.System.out.print("test");
                    java.lang.System.out.print("test");
                    java.lang.System.out.print("test");
                    com.google.android.gms.internal.ads.zzayr zzg = com.google.android.gms.internal.ads.zzays.zzg();
                    byte[] bytes = android.os.Build.VERSION.SDK.getBytes();
                    com.google.android.gms.internal.ads.zzida zzidaVar = com.google.android.gms.internal.ads.zzida.zza;
                    zzg.zzd(com.google.android.gms.internal.ads.zzida.zzt(bytes, 0, bytes.length));
                    byte[] bytes2 = "1762298034389".getBytes();
                    zzg.zzc(com.google.android.gms.internal.ads.zzida.zzt(bytes2, 0, bytes2.length));
                    byte[] bytes3 = this.zzf.zza(this.zzg, bArr).getBytes();
                    zzg.zza(com.google.android.gms.internal.ads.zzida.zzt(bytes3, 0, bytes3.length));
                    byte[] zze = com.google.android.gms.internal.ads.zzazo.zze(bytes3);
                    zzg.zzb(com.google.android.gms.internal.ads.zzida.zzt(zze, 0, zze.length));
                    file2.createNewFile();
                    fileOutputStream = new java.io.FileOutputStream(file2);
                    try {
                        byte[] zzaN = ((com.google.android.gms.internal.ads.zzays) zzg.zzbu()).zzaN();
                        fileOutputStream.write(zzaN, 0, zzaN.length);
                        fileOutputStream.close();
                        try {
                            fileInputStream2.close();
                        } catch (java.io.IOException unused2) {
                        }
                        try {
                            fileOutputStream.close();
                        } catch (java.io.IOException unused3) {
                        }
                        zzw(file3);
                    } catch (com.google.android.gms.internal.ads.zzbaw | java.io.IOException | java.security.NoSuchAlgorithmException unused4) {
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (java.io.IOException unused5) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (java.io.IOException unused6) {
                            }
                        }
                        zzw(file3);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (java.io.IOException unused7) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (java.io.IOException unused8) {
                            }
                        }
                        zzw(file3);
                        throw th;
                    }
                } catch (com.google.android.gms.internal.ads.zzbaw | java.io.IOException | java.security.NoSuchAlgorithmException unused9) {
                    fileOutputStream = null;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (com.google.android.gms.internal.ads.zzbaw | java.io.IOException | java.security.NoSuchAlgorithmException unused10) {
            fileOutputStream = null;
        } catch (java.lang.Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    private final boolean zzu(java.io.File file, java.lang.String str) {
        java.io.FileOutputStream fileOutputStream;
        java.io.File file2 = new java.io.File(java.lang.String.format("%s/%s.tmp", file, "1762298034389"));
        if (!file2.exists()) {
            return false;
        }
        java.io.File file3 = new java.io.File(java.lang.String.format("%s/%s.dex", file, "1762298034389"));
        if (!file3.exists()) {
            java.io.FileInputStream fileInputStream = null;
            try {
                long length = file2.length();
                if (length <= 0) {
                    zzw(file2);
                    return false;
                }
                byte[] bArr = new byte[(int) length];
                java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(file2);
                try {
                    try {
                        if (fileInputStream2.read(bArr) <= 0) {
                            android.util.Log.d(zzc, "Cannot read the cache data.");
                            zzw(file2);
                            try {
                                fileInputStream2.close();
                            } catch (java.io.IOException unused) {
                            }
                            return false;
                        }
                        try {
                            try {
                                com.google.android.gms.internal.ads.zzays zze = com.google.android.gms.internal.ads.zzays.zze(bArr, com.google.android.gms.internal.ads.zzido.zza());
                                if ("1762298034389".equals(new java.lang.String(zze.zzc().zzA())) && java.util.Arrays.equals(zze.zzb().zzA(), com.google.android.gms.internal.ads.zzazo.zze(zze.zza().zzA())) && java.util.Arrays.equals(zze.zzd().zzA(), android.os.Build.VERSION.SDK.getBytes())) {
                                    byte[] zzb = this.zzf.zzb(this.zzg, new java.lang.String(zze.zza().zzA()));
                                    file3.createNewFile();
                                    fileOutputStream = new java.io.FileOutputStream(file3);
                                    try {
                                        fileOutputStream.write(zzb, 0, zzb.length);
                                        try {
                                            fileInputStream2.close();
                                        } catch (java.io.IOException unused2) {
                                        }
                                        try {
                                            fileOutputStream.close();
                                        } catch (java.io.IOException unused3) {
                                        }
                                        return true;
                                    } catch (com.google.android.gms.internal.ads.zzbaw | java.io.IOException | java.security.NoSuchAlgorithmException unused4) {
                                        fileInputStream = fileInputStream2;
                                        if (fileInputStream != null) {
                                            try {
                                                fileInputStream.close();
                                            } catch (java.io.IOException unused5) {
                                            }
                                        }
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (java.io.IOException unused6) {
                                            }
                                        }
                                        return false;
                                    } catch (java.lang.Throwable th) {
                                        th = th;
                                        fileInputStream = fileInputStream2;
                                        if (fileInputStream != null) {
                                            try {
                                                fileInputStream.close();
                                            } catch (java.io.IOException unused7) {
                                            }
                                        }
                                        if (fileOutputStream == null) {
                                            throw th;
                                        }
                                        try {
                                            fileOutputStream.close();
                                            throw th;
                                        } catch (java.io.IOException unused8) {
                                            throw th;
                                        }
                                    }
                                }
                                zzw(file2);
                                try {
                                    fileInputStream2.close();
                                } catch (java.io.IOException unused9) {
                                }
                                return false;
                            } catch (java.lang.NullPointerException unused10) {
                                fileInputStream2.close();
                                return false;
                            }
                        } catch (java.io.IOException unused11) {
                            return false;
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        fileOutputStream = null;
                    }
                } catch (com.google.android.gms.internal.ads.zzbaw | java.io.IOException | java.security.NoSuchAlgorithmException unused12) {
                    fileOutputStream = null;
                }
            } catch (com.google.android.gms.internal.ads.zzbaw | java.io.IOException | java.security.NoSuchAlgorithmException unused13) {
                fileOutputStream = null;
            } catch (java.lang.Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzv, reason: merged with bridge method [inline-methods] */
    public final void zzr() {
        try {
            if (this.zzh == null && this.zzj) {
                com.google.android.gms.ads.identifier.AdvertisingIdClient advertisingIdClient = new com.google.android.gms.ads.identifier.AdvertisingIdClient(this.zza);
                advertisingIdClient.start();
                this.zzh = advertisingIdClient;
            }
        } catch (com.google.android.gms.common.GooglePlayServicesNotAvailableException | com.google.android.gms.common.GooglePlayServicesRepairableException | java.io.IOException unused) {
            this.zzh = null;
        }
    }

    private static final void zzw(java.io.File file) {
        if (file.exists()) {
            file.delete();
        } else {
            android.util.Log.d(zzc, java.lang.String.format("File %s not found. No need for deletion", file.getAbsolutePath()));
        }
    }

    private static final void zzx(java.lang.String str) {
        zzw(new java.io.File(str));
    }

    public final android.content.Context zzb() {
        return this.zza;
    }

    public final boolean zzc() {
        return this.zzp;
    }

    public final java.util.concurrent.ExecutorService zzd() {
        return this.zzd;
    }

    public final dalvik.system.DexClassLoader zze() {
        return this.zze;
    }

    public final com.google.android.gms.internal.ads.zzbax zzf() {
        return this.zzf;
    }

    public final byte[] zzg() {
        return this.zzg;
    }

    public final com.google.android.gms.internal.ads.zzbaj zzh() {
        return this.zzn;
    }

    public final boolean zzi() {
        return this.zzb;
    }

    public final boolean zzj() {
        return this.zzq.zza();
    }

    final com.google.android.gms.internal.ads.zzbbl zzk() {
        return this.zzq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.google.android.gms.internal.ads.zzaym zzl() {
        com.google.android.gms.internal.ads.zzbas zzbasVar = this.zzm;
        if (zzbasVar == null) {
            return this.zzk;
        }
        if (zzbasVar.zza() == null || !zzbasVar.zza().isDone()) {
            return com.google.android.gms.internal.ads.zzaym.zzk();
        }
        try {
            return (com.google.android.gms.internal.ads.zzaym) this.zzm.zza().get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            return com.google.android.gms.internal.ads.zzaym.zzk();
        }
    }

    public final java.util.concurrent.Future zzm() {
        com.google.android.gms.internal.ads.zzbas zzbasVar = this.zzm;
        return zzbasVar != null ? zzbasVar.zza() : this.zzl;
    }

    public final boolean zzn(java.lang.String str, java.lang.String str2, java.lang.Class... clsArr) {
        android.util.Pair pair = new android.util.Pair(str, str2);
        java.util.Map map = this.zzo;
        if (map.containsKey(pair)) {
            return false;
        }
        map.put(pair, new com.google.android.gms.internal.ads.zzbde(this, str, str2, clsArr));
        return true;
    }

    public final java.lang.reflect.Method zzo(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.zzbde zzbdeVar = (com.google.android.gms.internal.ads.zzbde) this.zzo.get(new android.util.Pair(str, str2));
        if (zzbdeVar == null) {
            return null;
        }
        return zzbdeVar.zza();
    }

    final void zzp(int i, boolean z) {
        if (this.zzb) {
            java.util.concurrent.Future<?> submit = this.zzd.submit(new com.google.android.gms.internal.ads.zzbbq(this, i, true));
            if (i == 0) {
                this.zzl = submit;
            }
        }
    }

    public final int zzq() {
        if (this.zzn != null) {
            return com.google.android.gms.internal.ads.zzbaj.zzd();
        }
        return Integer.MIN_VALUE;
    }

    final /* synthetic */ void zzs(com.google.android.gms.internal.ads.zzaym zzaymVar) {
        this.zzk = zzaymVar;
    }
}
