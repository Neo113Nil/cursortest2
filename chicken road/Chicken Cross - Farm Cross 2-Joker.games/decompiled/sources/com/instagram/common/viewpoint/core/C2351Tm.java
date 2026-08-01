package com.instagram.common.viewpoint.core;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: com.facebook.ads.redexgen.X.Tm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2351Tm implements SensorEventListener {
    public C2351Tm() {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] unused = C2352Tn.A0B = sensorEvent.values;
        C2352Tn.A05();
    }
}
