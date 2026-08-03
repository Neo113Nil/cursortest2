package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbcg extends com.google.android.gms.internal.ads.zzbdf {
    private static final com.google.android.gms.internal.ads.zzbdg zzh = new com.google.android.gms.internal.ads.zzbdg();
    private final com.google.android.gms.internal.ads.zzaxf zzi;
    private final android.content.Context zzj;
    private final com.google.android.gms.internal.ads.zzazm zzk;

    public zzbcg(com.google.android.gms.internal.ads.zzbbs zzbbsVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzaxm zzaxmVar, int i, int i2, android.content.Context context, com.google.android.gms.internal.ads.zzawy zzawyVar, com.google.android.gms.internal.ads.zzaxf zzaxfVar, com.google.android.gms.internal.ads.zzazm zzazmVar) {
        super(zzbbsVar, "Y4Si1UCd8xFA1yCw6ohazV+GUSwhVa9ffV9ZnN++nWMAkqLsgU7cmmd4wBpbGVgj", "1k+Az7ZOHMkdpE7lGA2cF/gUEsamDqjjLqQDV0dmR3A=", zzaxmVar, i, 27);
        this.zzj = context;
        this.zzi = zzaxfVar;
        this.zzk = zzazmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final com.google.android.gms.internal.ads.zzazj zzc() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        java.lang.String str;
        com.google.android.gms.internal.ads.zzbih zzbihVar = com.google.android.gms.internal.ads.zzbiq.zzdE;
        int zzb = (((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).intValue() <= 0 || ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).intValue() >= this.zzi.zzb()) ? this.zzi.zzb() : ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).intValue();
        com.google.android.gms.internal.ads.zzazj zzazjVar = new com.google.android.gms.internal.ads.zzazj((java.lang.String) this.zze.invoke(null, this.zzj, false, ""));
        com.google.android.gms.internal.ads.zzazm zzazmVar = this.zzk;
        if (zzazmVar != null && zzazmVar.zza() != null) {
            try {
                str = (java.lang.String) zzazmVar.zza().get(zzb, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException unused) {
            }
            zzazjVar.zza = str;
            return zzazjVar;
        }
        str = androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST;
        zzazjVar.zza = str;
        return zzazjVar;
    }

    private final java.lang.String zzd() {
        try {
            com.google.android.gms.internal.ads.zzbbs zzbbsVar = this.zza;
            if (zzbbsVar.zzm() != null) {
                zzbbsVar.zzm().get();
            }
            com.google.android.gms.internal.ads.zzaym zzl = zzbbsVar.zzl();
            if (zzl == null || !zzl.zza()) {
                return null;
            }
            return zzl.zzb();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        int i;
        com.google.android.gms.internal.ads.zzazj zzazjVar;
        com.google.android.gms.internal.ads.zzazj zzazjVar2;
        com.google.android.gms.internal.ads.zzbdg zzbdgVar = zzh;
        android.content.Context context = this.zzj;
        java.util.concurrent.atomic.AtomicReference zza = zzbdgVar.zza(context.getPackageName());
        synchronized (zza) {
            com.google.android.gms.internal.ads.zzazj zzazjVar3 = (com.google.android.gms.internal.ads.zzazj) zza.get();
            if (zzazjVar3 == null || com.google.android.gms.internal.ads.zzbbv.zzc(zzazjVar3.zza) || zzazjVar3.zza.equals(androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST) || zzazjVar3.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (com.google.android.gms.internal.ads.zzbbv.zzc(null)) {
                    (!com.google.android.gms.internal.ads.zzbbv.zzc(null) ? false : false).booleanValue();
                    i = 3;
                } else {
                    i = 5;
                }
                if (this.zzk != null) {
                    zzazjVar = zzc();
                } else {
                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(i == 3 && !this.zzi.zza());
                    java.lang.Boolean bool = (java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdq);
                    java.lang.String zzb = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdp)).booleanValue() ? zzb() : null;
                    if (bool.booleanValue() && this.zza.zzi() && com.google.android.gms.internal.ads.zzbbv.zzc(zzb)) {
                        zzb = zzd();
                    }
                    com.google.android.gms.internal.ads.zzazj zzazjVar4 = new com.google.android.gms.internal.ads.zzazj((java.lang.String) this.zze.invoke(null, context, valueOf, zzb));
                    java.lang.String str = zzazjVar4.zza;
                    if (com.google.android.gms.internal.ads.zzbbv.zzc(str) || str.equals(androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST)) {
                        int i2 = i - 1;
                        if (i2 == 3) {
                            java.lang.String zzd = zzd();
                            if (!com.google.android.gms.internal.ads.zzbbv.zzc(zzd)) {
                                zzazjVar4.zza = zzd;
                            }
                        } else if (i2 == 4) {
                            throw null;
                        }
                    }
                    zzazjVar = zzazjVar4;
                }
                zza.set(zzazjVar);
            }
            zzazjVar2 = (com.google.android.gms.internal.ads.zzazj) zza.get();
        }
        com.google.android.gms.internal.ads.zzaxm zzaxmVar = this.zzd;
        synchronized (zzaxmVar) {
            if (zzazjVar2 != null) {
                zzaxmVar.zzo(zzazjVar2.zza);
                zzaxmVar.zzu(zzazjVar2.zzb);
                zzaxmVar.zzt(zzazjVar2.zzc);
                zzaxmVar.zzD(zzazjVar2.zzd);
                zzaxmVar.zzE(zzazjVar2.zze);
            }
        }
    }

    protected final java.lang.String zzb() {
        try {
            java.security.cert.CertificateFactory certificateFactory = java.security.cert.CertificateFactory.getInstance(com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            byte[] zzb = com.google.android.gms.internal.ads.zzbbv.zzb((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdr));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new java.io.ByteArrayInputStream(zzb)));
            if (!android.os.Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new java.io.ByteArrayInputStream(com.google.android.gms.internal.ads.zzbbv.zzb((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzds)))));
            }
            android.content.Context context = this.zzj;
            return com.google.android.gms.internal.ads.zzbdi.zza(context, context.getPackageName(), arrayList, this.zza.zzd());
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.InterruptedException | java.lang.NoClassDefFoundError | java.security.cert.CertificateEncodingException | java.security.cert.CertificateException | java.util.concurrent.ExecutionException unused) {
            return null;
        }
    }
}
