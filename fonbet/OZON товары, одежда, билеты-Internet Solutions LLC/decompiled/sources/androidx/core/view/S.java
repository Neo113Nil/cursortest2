package androidx.core.view;

import android.view.MotionEvent;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
final class S {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f42247a = new float[20];

    /* renamed from: b, reason: collision with root package name */
    private final long[] f42248b = new long[20];

    /* renamed from: c, reason: collision with root package name */
    private float f42249c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    private int f42250d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f42251e = 0;

    S() {
    }

    final void a(@NonNull MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        int i11 = this.f42250d;
        long[] jArr = this.f42248b;
        if (i11 != 0 && eventTime - jArr[this.f42251e] > 40) {
            this.f42250d = 0;
            this.f42249c = 0.0f;
        }
        int i12 = (this.f42251e + 1) % 20;
        this.f42251e = i12;
        int i13 = this.f42250d;
        if (i13 != 20) {
            this.f42250d = i13 + 1;
        }
        this.f42247a[i12] = motionEvent.getAxisValue(26);
        jArr[this.f42251e] = eventTime;
    }

    final void b() {
        long j11;
        float f7;
        int i11;
        int i12 = this.f42250d;
        float f11 = 0.0f;
        if (i12 >= 2) {
            int i13 = this.f42251e;
            int i14 = ((i13 + 20) - (i12 - 1)) % 20;
            long[] jArr = this.f42248b;
            long j12 = jArr[i13];
            while (true) {
                j11 = jArr[i14];
                if (j12 - j11 <= 100) {
                    break;
                }
                this.f42250d--;
                i14 = (i14 + 1) % 20;
            }
            int i15 = this.f42250d;
            if (i15 >= 2) {
                float[] fArr = this.f42247a;
                if (i15 == 2) {
                    int i16 = (i14 + 1) % 20;
                    if (j11 != jArr[i16]) {
                        f11 = fArr[i16] / (r3 - j11);
                    }
                } else {
                    int i17 = 0;
                    float f12 = 0.0f;
                    int i18 = 0;
                    while (true) {
                        if (i17 >= this.f42250d - 1) {
                            break;
                        }
                        int i19 = i17 + i14;
                        long j13 = jArr[i19 % 20];
                        int i21 = (i19 + 1) % 20;
                        if (jArr[i21] == j13) {
                            f7 = f11;
                            i11 = i17;
                        } else {
                            i18++;
                            f7 = f11;
                            i11 = i17;
                            float sqrt = (f12 < f11 ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f12) * 2.0f));
                            float f13 = fArr[i21] / (jArr[i21] - j13);
                            f12 += Math.abs(f13) * (f13 - sqrt);
                            if (i18 == 1) {
                                f12 *= 0.5f;
                            }
                        }
                        i17 = i11 + 1;
                        f11 = f7;
                    }
                    f11 = (f12 < f11 ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f12) * 2.0f));
                }
            }
        }
        float f14 = f11 * 1000;
        this.f42249c = f14;
        if (f14 < (-Math.abs(Float.MAX_VALUE))) {
            this.f42249c = -Math.abs(Float.MAX_VALUE);
        } else if (this.f42249c > Math.abs(Float.MAX_VALUE)) {
            this.f42249c = Math.abs(Float.MAX_VALUE);
        }
    }

    final float c(int i11) {
        if (i11 != 26) {
            return 0.0f;
        }
        return this.f42249c;
    }
}
