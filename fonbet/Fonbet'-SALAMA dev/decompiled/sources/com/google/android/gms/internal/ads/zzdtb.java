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
public final class zzdtb extends zzfpt {
    private final SensorManager zza;
    private final Sensor zzb;
    private float zzc;
    private Float zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private zzdta zzi;
    private boolean zzj;

    public zzdtb(Context context) {
        super("FlickDetector", "ads");
        this.zzc = 0.0f;
        this.zzd = Float.valueOf(0.0f);
        o.f1952C.j.getClass();
        this.zze = System.currentTimeMillis();
        this.zzf = 0;
        this.zzg = false;
        this.zzh = false;
        this.zzi = null;
        this.zzj = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.zza = sensorManager;
        if (sensorManager != null) {
            this.zzb = sensorManager.getDefaultSensor(4);
        } else {
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    public final void zza(SensorEvent sensorEvent) {
        zzbbp zzbbpVar = zzbby.zzjd;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            o.f1952C.j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.zze;
            zzbbp zzbbpVar2 = zzbby.zzjf;
            zzbbw zzbbwVar = c0254t.f2726c;
            if (j + ((Integer) zzbbwVar.zzb(zzbbpVar2)).intValue() < currentTimeMillis) {
                this.zzf = 0;
                this.zze = currentTimeMillis;
                this.zzg = false;
                this.zzh = false;
                this.zzc = this.zzd.floatValue();
            }
            float floatValue = this.zzd.floatValue() + (sensorEvent.values[1] * 4.0f);
            this.zzd = Float.valueOf(floatValue);
            float f7 = this.zzc;
            zzbbp zzbbpVar3 = zzbby.zzje;
            if (floatValue > ((Float) zzbbwVar.zzb(zzbbpVar3)).floatValue() + f7) {
                this.zzc = this.zzd.floatValue();
                this.zzh = true;
            } else if (this.zzd.floatValue() < this.zzc - ((Float) zzbbwVar.zzb(zzbbpVar3)).floatValue()) {
                this.zzc = this.zzd.floatValue();
                this.zzg = true;
            }
            if (this.zzd.isInfinite()) {
                this.zzd = Float.valueOf(0.0f);
                this.zzc = 0.0f;
            }
            if (this.zzg && this.zzh) {
                J.k("Flick detected.");
                this.zze = currentTimeMillis;
                int i7 = this.zzf + 1;
                this.zzf = i7;
                this.zzg = false;
                this.zzh = false;
                zzdta zzdtaVar = this.zzi;
                if (zzdtaVar == null || i7 != ((Integer) zzbbwVar.zzb(zzbby.zzjg)).intValue()) {
                    return;
                }
                zzdtp zzdtpVar = (zzdtp) zzdtaVar;
                zzdtpVar.zzh(new zzdtn(zzdtpVar), zzdto.GESTURE);
            }
        }
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                    sensorManager.unregisterListener(this, sensor);
                    this.zzj = false;
                    J.k("Stopped listening for flick gestures.");
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
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzjd)).booleanValue()) {
                    if (!this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.zzj = true;
                        J.k("Listening for flick gestures.");
                    }
                    if (this.zza == null || this.zzb == null) {
                        int i7 = J.f3546b;
                        j.g("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzd(zzdta zzdtaVar) {
        this.zzi = zzdtaVar;
    }
}
