package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzchk extends com.google.android.gms.internal.ads.zzgap {
    private final android.hardware.SensorManager zza;
    private final java.lang.Object zzb;
    private final android.view.Display zzc;
    private final float[] zzd;
    private final float[] zze;
    private float[] zzf;
    private android.os.Handler zzg;
    private com.google.android.gms.internal.ads.zzchj zzh;

    zzchk(android.content.Context context) {
        super("OrientationMonitor", "ads");
        this.zza = (android.hardware.SensorManager) context.getSystemService("sensor");
        this.zzc = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
        this.zzd = new float[9];
        this.zze = new float[9];
        this.zzb = new java.lang.Object();
    }

    final void zza() {
        if (this.zzg != null) {
            return;
        }
        android.hardware.SensorManager sensorManager = this.zza;
        android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(11);
        if (defaultSensor == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("OrientationMonitor");
        handlerThread.start();
        com.google.android.gms.internal.ads.zzgam zzgamVar = new com.google.android.gms.internal.ads.zzgam(handlerThread.getLooper());
        this.zzg = zzgamVar;
        if (sensorManager.registerListener(this, defaultSensor, 0, zzgamVar)) {
            return;
        }
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("SensorManager.registerListener failed.");
        zzb();
    }

    final void zzb() {
        if (this.zzg == null) {
            return;
        }
        this.zza.unregisterListener(this);
        this.zzg.post(new com.google.android.gms.internal.ads.zzchi(this));
        this.zzg = null;
    }

    final void zzc(com.google.android.gms.internal.ads.zzchj zzchjVar) {
        this.zzh = zzchjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final void zzd(android.hardware.SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.zzb) {
            if (this.zzf == null) {
                this.zzf = new float[9];
            }
        }
        float[] fArr2 = this.zzd;
        android.hardware.SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.zzc.getRotation();
        if (rotation == 1) {
            android.hardware.SensorManager.remapCoordinateSystem(fArr2, 2, 129, this.zze);
        } else if (rotation == 2) {
            android.hardware.SensorManager.remapCoordinateSystem(fArr2, 129, 130, this.zze);
        } else if (rotation != 3) {
            java.lang.System.arraycopy(fArr2, 0, this.zze, 0, 9);
        } else {
            android.hardware.SensorManager.remapCoordinateSystem(fArr2, 130, 1, this.zze);
        }
        float[] fArr3 = this.zze;
        float f = fArr3[1];
        fArr3[1] = fArr3[3];
        fArr3[3] = f;
        float f2 = fArr3[2];
        fArr3[2] = fArr3[6];
        fArr3[6] = f2;
        float f3 = fArr3[5];
        fArr3[5] = fArr3[7];
        fArr3[7] = f3;
        synchronized (this.zzb) {
            java.lang.System.arraycopy(fArr3, 0, this.zzf, 0, 9);
        }
        com.google.android.gms.internal.ads.zzchj zzchjVar = this.zzh;
        if (zzchjVar != null) {
            zzchjVar.zza();
        }
    }

    final boolean zze(float[] fArr) {
        synchronized (this.zzb) {
            float[] fArr2 = this.zzf;
            if (fArr2 == null) {
                return false;
            }
            java.lang.System.arraycopy(fArr2, 0, fArr, 0, 9);
            return true;
        }
    }
}
