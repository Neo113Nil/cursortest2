package sg.bigo.ads.t0;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: sg.bigo.ads.t0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5478a implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5479b f13321a;

    public C5478a(C5479b c5479b) {
        this.f13321a = c5479b;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        Sensor sensor;
        if (sensorEvent == null || (sensor = sensorEvent.sensor) == null || sensorEvent.values.length < 3) {
            return;
        }
        int type = sensor.getType();
        if (type != 4) {
            if (type == 9 || type == 1) {
                this.f13321a.b.a(type, sensorEvent.values, new float[3]);
                return;
            }
            return;
        }
        float[] fArr = new float[3];
        C5479b c5479b = this.f13321a;
        if (c5479b.d != 0) {
            float f = (sensorEvent.timestamp - r4) * 1.0E-9f;
            float[] fArr2 = c5479b.e;
            float f2 = fArr2[0];
            float[] fArr3 = sensorEvent.values;
            float f3 = (fArr3[0] * f) + f2;
            fArr2[0] = f3;
            fArr2[1] = (fArr3[1] * f) + fArr2[1];
            fArr2[2] = (fArr3[2] * f) + fArr2[2];
            float abs = (float) Math.abs(Math.toDegrees(f3));
            float abs2 = (float) Math.abs(Math.toDegrees(this.f13321a.e[1]));
            float abs3 = (float) Math.abs(Math.toDegrees(this.f13321a.e[2]));
            fArr[0] = abs;
            fArr[1] = abs2;
            fArr[2] = abs3;
        }
        C5479b c5479b2 = this.f13321a;
        c5479b2.d = sensorEvent.timestamp;
        c5479b2.b.a(type, sensorEvent.values, fArr);
    }
}
