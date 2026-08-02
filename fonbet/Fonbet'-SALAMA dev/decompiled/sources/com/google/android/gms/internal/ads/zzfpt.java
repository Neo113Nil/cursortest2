package com.google.android.gms.internal.ads;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* loaded from: classes.dex */
public abstract class zzfpt implements SensorEventListener {
    public zzfpt(String str, String str2) {
        zzfps.zza();
        zzfpr.zza();
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        zza(sensorEvent);
    }

    public abstract void zza(SensorEvent sensorEvent);
}
