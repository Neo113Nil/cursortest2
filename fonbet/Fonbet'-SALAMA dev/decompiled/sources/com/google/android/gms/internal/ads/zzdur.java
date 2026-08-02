package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import J2.j;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* loaded from: classes.dex */
public final class zzdur extends zzfpt {
    private final Context zza;
    private SensorManager zzb;
    private Sensor zzc;
    private long zzd;
    private int zze;
    private zzduq zzf;
    private boolean zzg;

    public zzdur(Context context) {
        super("ShakeDetector", "ads");
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    public final void zza(SensorEvent sensorEvent) {
        zzbbp zzbbpVar = zzbby.zziY;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f7 = fArr[0] / 9.80665f;
            float f8 = fArr[1] / 9.80665f;
            float f9 = fArr[2] / 9.80665f;
            float f10 = f9 * f9;
            float sqrt = (float) Math.sqrt(f10 + (f8 * f8) + (f7 * f7));
            zzbbp zzbbpVar2 = zzbby.zziZ;
            zzbbw zzbbwVar = c0254t.f2726c;
            if (sqrt >= ((Float) zzbbwVar.zzb(zzbbpVar2)).floatValue()) {
                o.f1952C.j.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (this.zzd + ((Integer) zzbbwVar.zzb(zzbby.zzja)).intValue() <= currentTimeMillis) {
                    if (this.zzd + ((Integer) zzbbwVar.zzb(zzbby.zzjb)).intValue() < currentTimeMillis) {
                        this.zze = 0;
                    }
                    J.k("Shake detected.");
                    this.zzd = currentTimeMillis;
                    int i7 = this.zze + 1;
                    this.zze = i7;
                    zzduq zzduqVar = this.zzf;
                    if (zzduqVar == null || i7 != ((Integer) zzbbwVar.zzb(zzbby.zzjc)).intValue()) {
                        return;
                    }
                    zzdtp zzdtpVar = (zzdtp) zzduqVar;
                    zzdtpVar.zzh(new zzdtm(zzdtpVar), zzdto.GESTURE);
                }
            }
        }
    }

    public final void zzb() {
        synchronized (this) {
            try {
                if (this.zzg) {
                    SensorManager sensorManager = this.zzb;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(this, this.zzc);
                        J.k("Stopped listening for shake gestures.");
                    }
                    this.zzg = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zziY)).booleanValue()) {
                    if (this.zzb == null) {
                        SensorManager sensorManager2 = (SensorManager) this.zza.getSystemService("sensor");
                        this.zzb = sensorManager2;
                        if (sensorManager2 == null) {
                            int i7 = J.f3546b;
                            j.g("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.zzc = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.zzg && (sensorManager = this.zzb) != null && (sensor = this.zzc) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        o.f1952C.j.getClass();
                        this.zzd = System.currentTimeMillis() - ((Integer) r1.f2726c.zzb(zzbby.zzja)).intValue();
                        this.zzg = true;
                        J.k("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzd(zzduq zzduqVar) {
        this.zzf = zzduqVar;
    }
}
