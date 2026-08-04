package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class zzemq implements zzesh {
    private final zzgbn zza;
    private final Context zzb;

    public zzemq(zzgbn zzgbnVar, Context context) {
        this.zza = zzgbnVar;
        this.zzb = context;
    }

    public static zzemr zzc(zzemq zzemqVar) {
        double intExtra;
        boolean zIsCharging;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlY)).booleanValue()) {
            BatteryManager batteryManager = (BatteryManager) zzemqVar.zzb.getSystemService("batterymanager");
            intExtra = batteryManager != null ? ((double) batteryManager.getIntProperty(4)) / 100.0d : -1.0d;
            zIsCharging = batteryManager != null ? batteryManager.isCharging() : zze(zzemqVar.zzd());
        } else {
            Intent intentZzd = zzemqVar.zzd();
            boolean zZze = zze(intentZzd);
            intExtra = intentZzd != null ? ((double) intentZzd.getIntExtra("level", -1)) / ((double) intentZzd.getIntExtra("scale", -1)) : -1.0d;
            zIsCharging = zZze;
        }
        return new zzemr(intExtra, zIsCharging);
    }

    private final Intent zzd() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        return (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkY)).booleanValue() || Build.VERSION.SDK_INT < 33) ? this.zzb.registerReceiver(null, intentFilter) : this.zzb.registerReceiver(null, intentFilter, 4);
    }

    private static final boolean zze(Intent intent) {
        if (intent == null) {
            return false;
        }
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 14;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzemp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzemq.zzc(this.zza);
            }
        });
    }
}
