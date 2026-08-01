package com.ironsource.adqualitysdk.sdk.i;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ท, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0696 implements SensorEventListener {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ float[] f1890;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ float[] f1891;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ CopyOnWriteArrayList f1892;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ CopyOnWriteArrayList f1893;

    public C0696(CopyOnWriteArrayList copyOnWriteArrayList, CopyOnWriteArrayList copyOnWriteArrayList2, float[] fArr, float[] fArr2) {
        this.f1893 = copyOnWriteArrayList;
        this.f1892 = copyOnWriteArrayList2;
        this.f1891 = fArr;
        this.f1890 = fArr2;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            this.f1893.add((float[]) sensorEvent.values.clone());
            return;
        }
        if (type != 2) {
            if (type == 4) {
                this.f1892.add((float[]) sensorEvent.values.clone());
                return;
            } else {
                if (type != 6) {
                    return;
                }
                this.f1891[0] = sensorEvent.values[0];
                return;
            }
        }
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f1890;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = f3 * f3;
        fArr2[0] = (float) Math.sqrt(f4 + (f2 * f2) + (f * f));
    }
}
