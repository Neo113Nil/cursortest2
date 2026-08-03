package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfqj implements java.lang.Runnable {
    public static java.lang.Boolean zzb;
    private final android.content.Context zze;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzf;
    private int zzi;
    private final com.google.android.gms.internal.ads.zzdwz zzj;
    private final java.util.List zzk;
    private final com.google.android.gms.internal.ads.zzcng zzl;
    private final com.google.android.gms.internal.ads.zzcbl zzn;
    public static final java.lang.Object zza = new java.lang.Object();
    private static final java.lang.Object zzc = new java.lang.Object();
    private static final java.lang.Object zzd = new java.lang.Object();
    private final com.google.android.gms.internal.ads.zzfqn zzg = com.google.android.gms.internal.ads.zzfqq.zzb();
    private java.lang.String zzh = "";
    private boolean zzm = false;

    public zzfqj(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzdwz zzdwzVar, com.google.android.gms.internal.ads.zzein zzeinVar, com.google.android.gms.internal.ads.zzcbl zzcblVar, com.google.android.gms.internal.ads.zzcng zzcngVar) {
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzj = zzdwzVar;
        this.zzn = zzcblVar;
        this.zzl = zzcngVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzke)).booleanValue()) {
            this.zzk = com.google.android.gms.ads.internal.util.zzs.zzj();
        } else {
            this.zzk = com.google.android.gms.internal.ads.zzgwm.zzi();
        }
    }

    public static boolean zza() {
        boolean booleanValue;
        synchronized (zza) {
            if (zzb == null) {
                if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzb.zze()).booleanValue()) {
                    zzb = java.lang.Boolean.valueOf(java.lang.Math.random() < ((java.lang.Double) com.google.android.gms.internal.ads.zzbkj.zza.zze()).doubleValue());
                } else {
                    zzb = false;
                }
            }
            booleanValue = zzb.booleanValue();
        }
        return booleanValue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] zzaN;
        if (zza()) {
            java.lang.Object obj = zzc;
            synchronized (obj) {
                if (this.zzg.zza() == 0) {
                    return;
                }
                try {
                    synchronized (obj) {
                        com.google.android.gms.internal.ads.zzfqn zzfqnVar = this.zzg;
                        zzaN = ((com.google.android.gms.internal.ads.zzfqq) zzfqnVar.zzbu()).zzaN();
                        zzfqnVar.zzc();
                    }
                    com.google.android.gms.internal.ads.zzeik zzeikVar = new com.google.android.gms.internal.ads.zzeik((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjY), 60000, new java.util.HashMap(), zzaN, com.unity3d.ads.gatewayclient.CommonGatewayClient.HEADER_PROTOBUF, false);
                    com.google.android.gms.internal.ads.zzeik zzeikVar2 = zzeikVar;
                    new com.google.android.gms.internal.ads.zzeim(this.zze, this.zzf.afmaVersion, this.zzn, android.os.Binder.getCallingUid(), null).zza(zzeikVar);
                } catch (java.lang.Exception e) {
                    if ((e instanceof com.google.android.gms.internal.ads.zzeed) && ((com.google.android.gms.internal.ads.zzeed) e).zza() == 3) {
                        return;
                    }
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "CuiMonitor.sendCuiPing");
                }
            }
        }
    }

    public final void zzb(final com.google.android.gms.internal.ads.zzfpz zzfpzVar) {
        com.google.android.gms.internal.ads.zzcfr.zza.zza(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfqi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzfqj.this.zzc(zzfpzVar);
            }
        });
    }

    final /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzfpz zzfpzVar) {
        synchronized (zzd) {
            if (!this.zzm) {
                this.zzm = true;
                if (zza()) {
                    try {
                        com.google.android.gms.ads.internal.zzt.zzc();
                        this.zzh = com.google.android.gms.ads.internal.util.zzs.zzr(this.zze);
                    } catch (android.os.RemoteException | java.lang.RuntimeException e) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "CuiMonitor.gettingAppIdFromManifest");
                    }
                    this.zzi = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze);
                    int intValue = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjZ)).intValue();
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zznq)).booleanValue()) {
                        long j = intValue;
                        com.google.android.gms.internal.ads.zzcfr.zzd.scheduleWithFixedDelay(this, j, j, java.util.concurrent.TimeUnit.MILLISECONDS);
                    } else {
                        long j2 = intValue;
                        com.google.android.gms.internal.ads.zzcfr.zzd.scheduleAtFixedRate(this, j2, j2, java.util.concurrent.TimeUnit.MILLISECONDS);
                    }
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkf)).booleanValue()) {
                        this.zzl.zza();
                    }
                }
            }
        }
        if (zza() && zzfpzVar != null) {
            synchronized (zzc) {
                com.google.android.gms.internal.ads.zzfqn zzfqnVar = this.zzg;
                if (zzfqnVar.zza() >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzka)).intValue()) {
                    return;
                }
                com.google.android.gms.internal.ads.zzfqk zza2 = com.google.android.gms.internal.ads.zzfqm.zza();
                zza2.zzv(zzfpzVar.zzm());
                zza2.zza(zzfpzVar.zzb());
                zza2.zzb(zzfpzVar.zza());
                zza2.zzw(3);
                zza2.zzd(this.zzf.afmaVersion);
                zza2.zze(this.zzh);
                zza2.zzf(android.os.Build.VERSION.RELEASE);
                zza2.zzg(android.os.Build.VERSION.SDK_INT);
                zza2.zzx(zzfpzVar.zzo());
                zza2.zzi(zzfpzVar.zzc());
                zza2.zzj(this.zzi);
                zza2.zzy(zzfpzVar.zzn());
                zza2.zzk(zzfpzVar.zzd());
                zza2.zzl(zzfpzVar.zze());
                zza2.zzm(zzfpzVar.zzf());
                zza2.zzn(this.zzj.zzd(zzfpzVar.zzf()));
                zza2.zzo(zzfpzVar.zzg());
                zza2.zzs(zzfpzVar.zzh());
                zza2.zzr(zzfpzVar.zzk());
                zza2.zzp(zzfpzVar.zzi());
                zza2.zzq(zzfpzVar.zzj());
                zza2.zzc(zzfpzVar.zzl());
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzke)).booleanValue()) {
                    zza2.zzh(this.zzk);
                }
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkf)).booleanValue()) {
                    com.google.android.gms.internal.ads.zzcng zzcngVar = this.zzl;
                    com.google.android.gms.internal.ads.zziht zzd2 = zzcngVar.zzd();
                    java.lang.String zzc2 = zzcngVar.zzc();
                    if (zzd2 != null) {
                        zza2.zzt(zzd2);
                    }
                    if (zzc2 != null) {
                        zza2.zzu(zzc2);
                    }
                }
                com.google.android.gms.internal.ads.zzfqo zza3 = com.google.android.gms.internal.ads.zzfqp.zza();
                zza3.zza(zza2);
                zzfqnVar.zzb(zza3);
            }
        }
    }
}
