package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Tl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1056Tl implements android.hardware.SensorEventListener {
    public C1056Tl() {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(android.hardware.Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        float[] unused = com.facebook.ads.redexgen.core.C1058Tn.A0A = sensorEvent.values;
        com.facebook.ads.redexgen.core.C1058Tn.A06();
    }
}
