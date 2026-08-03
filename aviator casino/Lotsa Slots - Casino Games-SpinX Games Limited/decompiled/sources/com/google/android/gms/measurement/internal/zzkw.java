package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzkw implements java.lang.Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ android.net.Uri zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ java.lang.String zzd;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzkx zze;

    zzkw(com.google.android.gms.measurement.internal.zzkx zzkxVar, boolean z, android.net.Uri uri, java.lang.String str, java.lang.String str2) {
        this.zza = z;
        this.zzb = uri;
        this.zzc = str;
        this.zzd = str2;
        java.util.Objects.requireNonNull(zzkxVar);
        this.zze = zzkxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e7 A[Catch: RuntimeException -> 0x0161, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x0161, blocks: (B:19:0x00c1, B:20:0x00d5, B:21:0x00e0, B:26:0x00e7, B:30:0x0107, B:32:0x011f, B:34:0x0111, B:35:0x0123, B:37:0x0129, B:39:0x012f, B:41:0x0135, B:43:0x013b, B:45:0x0143, B:47:0x014b, B:49:0x0151, B:52:0x0155), top: B:18:0x00c1 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        com.google.android.gms.measurement.internal.zzkx zzkxVar;
        com.google.android.gms.measurement.internal.zzkx zzkxVar2;
        android.os.Bundle zzi;
        android.os.Bundle zzi2;
        com.google.android.gms.measurement.internal.zzkx zzkxVar3 = this.zze;
        com.google.android.gms.measurement.internal.zzli zzliVar = zzkxVar3.zza;
        zzliVar.zzg();
        java.lang.String str = this.zzd;
        android.net.Uri uri = this.zzb;
        try {
            com.google.android.gms.measurement.internal.zzib zzibVar = zzliVar.zzu;
            com.google.android.gms.measurement.internal.zzpo zzk = zzibVar.zzk();
            if (!android.text.TextUtils.isEmpty(str)) {
                if (!str.contains("gclid")) {
                    try {
                        if (!str.contains("gbraid") && !str.contains("utm_campaign") && !str.contains("utm_source") && !str.contains("utm_medium") && !str.contains("utm_id") && !str.contains("dclid") && !str.contains("srsltid") && !str.contains("sfmc_id")) {
                            zzk.zzu.zzaV().zzj().zza("Activity created with data 'referrer' without required params");
                        }
                    } catch (java.lang.RuntimeException e) {
                        e = e;
                        zzkxVar2 = zzkxVar3;
                        zzkxVar2.zza.zzu.zzaV().zzb().zzb("Throwable caught in handleReferrerForOnActivityCreated", e);
                        return;
                    }
                }
                java.lang.String.valueOf(str);
                zzi = zzk.zzi(android.net.Uri.parse("https://google.com/search?".concat(java.lang.String.valueOf(str))));
                if (zzi != null) {
                    zzi.putString("_cis", com.adjust.sdk.Constants.REFERRER);
                }
                java.lang.String str2 = this.zzc;
                if (!this.zza && (zzi2 = zzibVar.zzk().zzi(uri)) != null) {
                    zzi2.putString("_cis", "intent");
                    if (!zzi2.containsKey("gclid") && zzi != null) {
                        if (zzi.containsKey("gclid")) {
                            zzkxVar = zzkxVar3;
                            try {
                                zzi2.putString("_cer", java.lang.String.format("gclid=%s", zzi.getString("gclid")));
                                zzliVar.zzF(str2, com.google.firebase.messaging.Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, zzi2);
                                zzliVar.zzb.zzb(str2, zzi2);
                            } catch (java.lang.RuntimeException e2) {
                                e = e2;
                                zzkxVar2 = zzkxVar;
                                zzkxVar2.zza.zzu.zzaV().zzb().zzb("Throwable caught in handleReferrerForOnActivityCreated", e);
                                return;
                            }
                        }
                    }
                    zzliVar.zzF(str2, com.google.firebase.messaging.Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, zzi2);
                    zzliVar.zzb.zzb(str2, zzi2);
                }
                if (android.text.TextUtils.isEmpty(str)) {
                    zzibVar.zzaV().zzj().zzb("Activity created with referrer", str);
                    if (zzibVar.zzc().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzaG)) {
                        if (zzi != null) {
                            zzliVar.zzF(str2, com.google.firebase.messaging.Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, zzi);
                            zzliVar.zzb.zzb(str2, zzi);
                        } else {
                            zzibVar.zzaV().zzj().zzb("Referrer does not contain valid parameters", str);
                        }
                        zzliVar.zzK("auto", "_ldl", null, true);
                        return;
                    }
                    if (!str.contains("gclid") || (!str.contains("utm_campaign") && !str.contains("utm_source") && !str.contains("utm_medium") && !str.contains("utm_term") && !str.contains("utm_content"))) {
                        zzibVar.zzaV().zzj().zza("Activity created with data 'referrer' without required params");
                        return;
                    } else {
                        if (android.text.TextUtils.isEmpty(str)) {
                            return;
                        }
                        zzliVar.zzK("auto", "_ldl", str, true);
                        return;
                    }
                }
                return;
            }
            zzi = null;
            java.lang.String str22 = this.zzc;
            if (!this.zza) {
            }
            if (android.text.TextUtils.isEmpty(str)) {
            }
        } catch (java.lang.RuntimeException e3) {
            e = e3;
            zzkxVar = zzkxVar3;
        }
    }
}
