package M3;

import android.opengl.Matrix;
import m3.C8055H;

/* loaded from: classes8.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f17291a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    private final float[] f17292b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    private final C8055H<float[]> f17293c = new C8055H<>();

    /* renamed from: d, reason: collision with root package name */
    private boolean f17294d;

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f7 = fArr2[10];
        float f11 = fArr2[8];
        float sqrt = (float) Math.sqrt((f11 * f11) + (f7 * f7));
        float f12 = fArr2[10] / sqrt;
        fArr[0] = f12;
        float f13 = fArr2[8];
        fArr[2] = f13 / sqrt;
        fArr[8] = (-f13) / sqrt;
        fArr[10] = f12;
    }

    public final void b(long j11, float[] fArr) {
        float[] g10 = this.f17293c.g(j11);
        if (g10 == null) {
            return;
        }
        float f7 = g10[0];
        float f11 = -g10[1];
        float f12 = -g10[2];
        float length = Matrix.length(f7, f11, f12);
        float[] fArr2 = this.f17292b;
        if (length != 0.0f) {
            Matrix.setRotateM(fArr2, 0, (float) Math.toDegrees(length), f7 / length, f11 / length, f12 / length);
        } else {
            Matrix.setIdentityM(fArr2, 0);
        }
        boolean z11 = this.f17294d;
        float[] fArr3 = this.f17291a;
        if (!z11) {
            a(fArr3, fArr2);
            this.f17294d = true;
        }
        Matrix.multiplyMM(fArr, 0, fArr3, 0, fArr2, 0);
    }

    public final void c() {
        this.f17293c.b();
        this.f17294d = false;
    }

    public final void d(long j11, float[] fArr) {
        this.f17293c.a(j11, fArr);
    }
}
