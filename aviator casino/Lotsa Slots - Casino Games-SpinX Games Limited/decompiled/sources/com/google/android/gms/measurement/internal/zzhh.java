package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzhh implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzbq zza;
    final /* synthetic */ android.content.ServiceConnection zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzhi zzc;

    zzhh(com.google.android.gms.measurement.internal.zzhi zzhiVar, com.google.android.gms.internal.measurement.zzbq zzbqVar, android.content.ServiceConnection serviceConnection) {
        this.zza = zzbqVar;
        this.zzb = serviceConnection;
        java.util.Objects.requireNonNull(zzhiVar);
        this.zzc = zzhiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Bundle bundle;
        com.google.android.gms.measurement.internal.zzhi zzhiVar = this.zzc;
        com.google.android.gms.measurement.internal.zzhj zzhjVar = zzhiVar.zza;
        com.google.android.gms.measurement.internal.zzib zzibVar = zzhjVar.zza;
        zzibVar.zzaW().zzg();
        android.os.Bundle bundle2 = new android.os.Bundle();
        java.lang.String zza = zzhiVar.zza();
        bundle2.putString("package_name", zza);
        try {
            bundle = this.zza.zze(bundle2);
        } catch (java.lang.Exception e) {
            zzhjVar.zza.zzaV().zzb().zzb("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        if (bundle == null) {
            zzibVar.zzaV().zzb().zza("Install Referrer Service returned a null response");
            bundle = null;
        }
        com.google.android.gms.measurement.internal.zzib zzibVar2 = zzhjVar.zza;
        zzibVar2.zzaW().zzg();
        com.google.android.gms.measurement.internal.zzib.zzL();
        if (bundle != null) {
            long j = bundle.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j == 0) {
                zzibVar2.zzaV().zze().zza("Service response is missing Install Referrer install timestamp");
            } else {
                java.lang.String string = bundle.getString(com.adjust.sdk.Constants.INSTALL_REFERRER);
                if (string == null || string.isEmpty()) {
                    zzibVar2.zzaV().zzb().zza("No referrer defined in Install Referrer response");
                } else {
                    zzibVar2.zzaV().zzk().zzb("InstallReferrer API result", string);
                    android.os.Bundle zzi = zzibVar2.zzk().zzi(android.net.Uri.parse("?".concat(string)));
                    if (zzi == null) {
                        zzibVar2.zzaV().zzb().zza("No campaign params defined in Install Referrer result");
                    } else {
                        java.util.List asList = java.util.Arrays.asList(((java.lang.String) com.google.android.gms.measurement.internal.zzfx.zzbh.zzb(null)).split(","));
                        java.util.Iterator<java.lang.String> it = zzi.keySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (asList.contains(it.next())) {
                                long j2 = bundle.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000;
                                if (j2 > 0) {
                                    zzi.putLong("click_timestamp", j2);
                                }
                            }
                        }
                        if (j == zzibVar2.zzd().zzd.zza()) {
                            zzibVar2.zzaV().zzk().zza("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (zzibVar2.zzB()) {
                            zzibVar2.zzd().zzd.zzb(j);
                            zzibVar2.zzaV().zzk().zzb("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            zzi.putString("_cis", "referrer API v2");
                            zzibVar2.zzj().zzI("auto", com.google.firebase.messaging.Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, zzi, zza);
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.stats.ConnectionTracker.getInstance().unbindService(zzibVar2.zzaY(), this.zzb);
    }
}
