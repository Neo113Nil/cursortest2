package M3;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* loaded from: classes8.dex */
final class d implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f17295a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    private final float[] f17296b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    private final float[] f17297c = new float[16];

    /* renamed from: d, reason: collision with root package name */
    private final float[] f17298d = new float[3];

    /* renamed from: e, reason: collision with root package name */
    private final Display f17299e;

    /* renamed from: f, reason: collision with root package name */
    private final a[] f17300f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f17301g;

    public interface a {
        void a(float f7, float[] fArr);
    }

    public d(Display display, a... aVarArr) {
        this.f17299e = display;
        this.f17300f = aVarArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i11) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i11;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f17295a;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f17299e.getRotation();
        float[] fArr3 = this.f17296b;
        if (rotation != 0) {
            int i12 = 129;
            if (rotation != 1) {
                i11 = 130;
                if (rotation != 2) {
                    if (rotation != 3) {
                        throw new IllegalStateException();
                    }
                    i12 = 130;
                    i11 = 1;
                }
            } else {
                i11 = 129;
                i12 = 2;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i12, i11, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.f17298d;
        SensorManager.getOrientation(fArr3, fArr4);
        float f7 = fArr4[2];
        Matrix.rotateM(fArr2, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        boolean z11 = this.f17301g;
        float[] fArr5 = this.f17297c;
        if (!z11) {
            c.a(fArr5, fArr2);
            this.f17301g = true;
        }
        System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr5, 0);
        a[] aVarArr = this.f17300f;
        for (int i13 = 0; i13 < 2; i13++) {
            aVarArr[i13].a(f7, fArr2);
        }
    }
}
