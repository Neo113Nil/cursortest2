package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzewp implements com.google.android.gms.internal.ads.zzfck {
    private final com.google.android.gms.internal.ads.zzhcg zza;
    private final android.content.Context zzb;

    zzewp(com.google.android.gms.internal.ads.zzhcg zzhcgVar, android.content.Context context) {
        this.zza = zzhcgVar;
        this.zzb = context;
    }

    private final android.content.Intent zzd() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED");
        return (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmu)).booleanValue() || android.os.Build.VERSION.SDK_INT < 33) ? this.zzb.registerReceiver(null, intentFilter) : this.zzb.registerReceiver(null, intentFilter, 4);
    }

    private static final boolean zze(android.content.Intent intent) {
        if (intent == null) {
            return false;
        }
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return this.zza.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzewo
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzewp.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 14;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzewq zzc() {
        double intExtra;
        boolean z;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zznx)).booleanValue()) {
            android.os.BatteryManager batteryManager = (android.os.BatteryManager) this.zzb.getSystemService("batterymanager");
            intExtra = batteryManager != null ? batteryManager.getIntProperty(4) / 100.0d : -1.0d;
            z = batteryManager != null ? batteryManager.isCharging() : zze(zzd());
        } else {
            android.content.Intent zzd = zzd();
            boolean zze = zze(zzd);
            intExtra = zzd != null ? zzd.getIntExtra(com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL, -1) / zzd.getIntExtra("scale", -1) : -1.0d;
            z = zze;
        }
        return new com.google.android.gms.internal.ads.zzewq(intExtra, z);
    }
}
