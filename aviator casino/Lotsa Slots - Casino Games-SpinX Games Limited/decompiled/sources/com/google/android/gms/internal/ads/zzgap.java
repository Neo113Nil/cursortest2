package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzgap implements android.hardware.SensorEventListener {
    protected zzgap(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.zzgao.zza();
        com.google.android.gms.internal.ads.zzgan.zza();
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(android.hardware.Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        zzd(sensorEvent);
    }

    public abstract void zzd(android.hardware.SensorEvent sensorEvent);
}
