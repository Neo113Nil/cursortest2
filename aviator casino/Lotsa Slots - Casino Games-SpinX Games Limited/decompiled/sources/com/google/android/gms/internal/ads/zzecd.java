package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzecd extends com.google.android.gms.internal.ads.zzgap {

    @javax.annotation.Nullable
    private final android.hardware.SensorManager zza;

    @javax.annotation.Nullable
    private final android.hardware.Sensor zzb;
    private float zzc;
    private java.lang.Float zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzecc zzi;
    private boolean zzj;

    zzecd(android.content.Context context) {
        super("FlickDetector", "ads");
        this.zzc = 0.0f;
        this.zzd = java.lang.Float.valueOf(0.0f);
        this.zze = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        this.zzf = 0;
        this.zzg = false;
        this.zzh = false;
        this.zzi = null;
        this.zzj = false;
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) context.getSystemService("sensor");
        this.zza = sensorManager;
        if (sensorManager != null) {
            this.zzb = sensorManager.getDefaultSensor(4);
        } else {
            this.zzb = null;
        }
    }

    public final void zza(com.google.android.gms.internal.ads.zzecc zzeccVar) {
        this.zzi = zzeccVar;
    }

    public final void zzb() {
        android.hardware.SensorManager sensorManager;
        android.hardware.Sensor sensor;
        synchronized (this) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkx)).booleanValue()) {
                if (!this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.zzj = true;
                    com.google.android.gms.ads.internal.util.zze.zza("Listening for flick gestures.");
                }
                if (this.zza == null || this.zzb == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Flick detection failed to initialize. Failed to obtain gyroscope.");
                }
            }
        }
    }

    public final void zzc() {
        android.hardware.SensorManager sensorManager;
        android.hardware.Sensor sensor;
        synchronized (this) {
            if (this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                sensorManager.unregisterListener(this, sensor);
                this.zzj = false;
                com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for flick gestures.");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final void zzd(android.hardware.SensorEvent sensorEvent) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkx)).booleanValue()) {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            if (this.zze + ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkz)).intValue() < currentTimeMillis) {
                this.zzf = 0;
                this.zze = currentTimeMillis;
                this.zzg = false;
                this.zzh = false;
                this.zzc = this.zzd.floatValue();
            }
            java.lang.Float valueOf = java.lang.Float.valueOf(this.zzd.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.zzd = valueOf;
            float floatValue = valueOf.floatValue();
            float f = this.zzc;
            com.google.android.gms.internal.ads.zzbih zzbihVar = com.google.android.gms.internal.ads.zzbiq.zzky;
            if (floatValue > f + ((java.lang.Float) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).floatValue()) {
                this.zzc = this.zzd.floatValue();
                this.zzh = true;
            } else if (this.zzd.floatValue() < this.zzc - ((java.lang.Float) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).floatValue()) {
                this.zzc = this.zzd.floatValue();
                this.zzg = true;
            }
            if (this.zzd.isInfinite()) {
                this.zzd = java.lang.Float.valueOf(0.0f);
                this.zzc = 0.0f;
            }
            if (this.zzg && this.zzh) {
                com.google.android.gms.ads.internal.util.zze.zza("Flick detected.");
                this.zze = currentTimeMillis;
                int i = this.zzf + 1;
                this.zzf = i;
                this.zzg = false;
                this.zzh = false;
                com.google.android.gms.internal.ads.zzecc zzeccVar = this.zzi;
                if (zzeccVar != null) {
                    if (i == ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkA)).intValue()) {
                        com.google.android.gms.internal.ads.zzecr zzecrVar = (com.google.android.gms.internal.ads.zzecr) zzeccVar;
                        zzecrVar.zzo(new com.google.android.gms.internal.ads.zzecp(zzecrVar), com.google.android.gms.internal.ads.zzecq.GESTURE);
                    }
                }
            }
        }
    }
}
