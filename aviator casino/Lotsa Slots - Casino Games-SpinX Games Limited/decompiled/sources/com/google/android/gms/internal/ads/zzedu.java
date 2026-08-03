package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzedu extends com.google.android.gms.internal.ads.zzgap {
    private final android.content.Context zza;

    @javax.annotation.Nullable
    private android.hardware.SensorManager zzb;
    private android.hardware.Sensor zzc;
    private long zzd;
    private int zze;
    private com.google.android.gms.internal.ads.zzedt zzf;
    private boolean zzg;

    zzedu(android.content.Context context) {
        super("ShakeDetector", "ads");
        this.zza = context;
    }

    public final void zza(com.google.android.gms.internal.ads.zzedt zzedtVar) {
        this.zzf = zzedtVar;
    }

    public final void zzb() {
        android.hardware.SensorManager sensorManager;
        android.hardware.Sensor sensor;
        synchronized (this) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzks)).booleanValue()) {
                if (this.zzb == null) {
                    android.hardware.SensorManager sensorManager2 = (android.hardware.SensorManager) this.zza.getSystemService("sensor");
                    this.zzb = sensorManager2;
                    if (sensorManager2 == null) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Shake detection failed to initialize. Failed to obtain accelerometer.");
                        return;
                    }
                    this.zzc = sensorManager2.getDefaultSensor(1);
                }
                if (!this.zzg && (sensorManager = this.zzb) != null && (sensor = this.zzc) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.zzd = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzku)).intValue();
                    this.zzg = true;
                    com.google.android.gms.ads.internal.util.zze.zza("Listening for shake gestures.");
                }
            }
        }
    }

    public final void zzc() {
        synchronized (this) {
            if (this.zzg) {
                android.hardware.SensorManager sensorManager = this.zzb;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(this, this.zzc);
                    com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for shake gestures.");
                }
                this.zzg = false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final void zzd(android.hardware.SensorEvent sensorEvent) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzks)).booleanValue()) {
            float f = sensorEvent.values[0] / 9.80665f;
            float f2 = sensorEvent.values[1] / 9.80665f;
            float f3 = sensorEvent.values[2] / 9.80665f;
            if (((float) java.lang.Math.sqrt((f * f) + (f2 * f2) + (f3 * f3))) >= ((java.lang.Float) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkt)).floatValue()) {
                long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
                if (this.zzd + ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzku)).intValue() <= currentTimeMillis) {
                    if (this.zzd + ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkv)).intValue() < currentTimeMillis) {
                        this.zze = 0;
                    }
                    com.google.android.gms.ads.internal.util.zze.zza("Shake detected.");
                    this.zzd = currentTimeMillis;
                    int i = this.zze + 1;
                    this.zze = i;
                    com.google.android.gms.internal.ads.zzedt zzedtVar = this.zzf;
                    if (zzedtVar != null) {
                        if (i == ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkw)).intValue()) {
                            com.google.android.gms.internal.ads.zzecr zzecrVar = (com.google.android.gms.internal.ads.zzecr) zzedtVar;
                            zzecrVar.zzo(new com.google.android.gms.internal.ads.zzeco(zzecrVar), com.google.android.gms.internal.ads.zzecq.GESTURE);
                        }
                    }
                }
            }
        }
    }
}
