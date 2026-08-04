package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
final class zzcat extends zzfpt {
    private final SensorManager zza;
    private final Object zzb;
    private final Display zzc;
    private final float[] zzd;
    private final float[] zze;
    private float[] zzf;
    private Handler zzg;
    private zzcas zzh;

    public zzcat(Context context) {
        super("OrientationMonitor", "ads");
        this.zza = (SensorManager) context.getSystemService("sensor");
        this.zzc = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        this.zzd = new float[9];
        this.zze = new float[9];
        this.zzb = new Object();
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    public final void zza(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.zzb) {
            try {
                if (this.zzf == null) {
                    this.zzf = new float[9];
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        SensorManager.getRotationMatrixFromVector(this.zzd, fArr);
        int rotation = this.zzc.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(this.zzd, 2, 129, this.zze);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(this.zzd, 129, 130, this.zze);
        } else if (rotation != 3) {
            System.arraycopy(this.zzd, 0, this.zze, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(this.zzd, 130, 1, this.zze);
        }
        float[] fArr2 = this.zze;
        float f7 = fArr2[1];
        fArr2[1] = fArr2[3];
        fArr2[3] = f7;
        float f8 = fArr2[2];
        fArr2[2] = fArr2[6];
        fArr2[6] = f8;
        float f9 = fArr2[5];
        fArr2[5] = fArr2[7];
        fArr2[7] = f9;
        synchronized (this.zzb) {
            System.arraycopy(this.zze, 0, this.zzf, 0, 9);
        }
        zzcas zzcasVar = this.zzh;
        if (zzcasVar != null) {
            zzcasVar.zza();
        }
    }

    public final void zzb(zzcas zzcasVar) {
        this.zzh = zzcasVar;
    }

    public final void zzc() {
        if (this.zzg != null) {
            return;
        }
        Sensor defaultSensor = this.zza.getDefaultSensor(11);
        if (defaultSensor == null) {
            int i7 = J.f3546b;
            j.d("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
        handlerThread.start();
        zzfpq zzfpqVar = new zzfpq(handlerThread.getLooper());
        this.zzg = zzfpqVar;
        if (this.zza.registerListener(this, defaultSensor, 0, zzfpqVar)) {
            return;
        }
        int i8 = J.f3546b;
        j.d("SensorManager.registerListener failed.");
        zzd();
    }

    public final void zzd() {
        if (this.zzg == null) {
            return;
        }
        this.zza.unregisterListener(this);
        this.zzg.post(new zzcar(this));
        this.zzg = null;
    }

    public final boolean zze(float[] fArr) {
        synchronized (this.zzb) {
            try {
                float[] fArr2 = this.zzf;
                if (fArr2 == null) {
                    return false;
                }
                System.arraycopy(fArr2, 0, fArr, 0, 9);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
