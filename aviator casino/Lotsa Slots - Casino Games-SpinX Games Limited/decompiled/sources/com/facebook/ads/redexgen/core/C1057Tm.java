package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Tm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1057Tm implements android.hardware.SensorEventListener {
    public C1057Tm() {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(android.hardware.Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        float[] unused = com.facebook.ads.redexgen.core.C1058Tn.A0B = sensorEvent.values;
        com.facebook.ads.redexgen.core.C1058Tn.A05();
    }
}
