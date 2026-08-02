package u;

import java.util.Arrays;
import l3.C2054a;

/* renamed from: u.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2471s {

    /* renamed from: s, reason: collision with root package name */
    public static float[] f19914s;

    /* renamed from: a, reason: collision with root package name */
    public final float f19915a;

    /* renamed from: b, reason: collision with root package name */
    public final float f19916b;

    /* renamed from: c, reason: collision with root package name */
    public final float f19917c;

    /* renamed from: d, reason: collision with root package name */
    public final float f19918d;

    /* renamed from: e, reason: collision with root package name */
    public final float f19919e;
    public final float f;

    /* renamed from: g, reason: collision with root package name */
    public final float f19920g;

    /* renamed from: h, reason: collision with root package name */
    public float f19921h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f19922j;

    /* renamed from: k, reason: collision with root package name */
    public final float f19923k;

    /* renamed from: l, reason: collision with root package name */
    public final float f19924l;

    /* renamed from: m, reason: collision with root package name */
    public final float f19925m;

    /* renamed from: n, reason: collision with root package name */
    public final float f19926n;

    /* renamed from: o, reason: collision with root package name */
    public final float f19927o;

    /* renamed from: p, reason: collision with root package name */
    public final float f19928p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f19929q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f19930r;

    public C2471s(int i, float f, float f5, float f6, float f7, float f8, float f9) {
        boolean z3;
        float f10;
        float f11;
        float f12 = f6;
        this.f19915a = f;
        this.f19916b = f5;
        this.f19917c = f12;
        this.f19918d = f7;
        this.f19919e = f8;
        this.f = f9;
        float f13 = f8 - f12;
        float f14 = f9 - f7;
        int i5 = 1;
        float f15 = 0.0f;
        boolean z5 = i == 1 || (i == 4 ? f14 > 0.0f : !(i != 5 || f14 >= 0.0f));
        this.f19929q = z5;
        float f16 = f5 - f;
        float f17 = 1 / f16;
        this.f19923k = f17;
        boolean z6 = 3 == i;
        if (z6 || Math.abs(f13) < 0.001f || Math.abs(f14) < 0.001f) {
            float hypot = (float) Math.hypot(f14, f13);
            this.f19920g = hypot;
            this.f19928p = hypot * f17;
            this.f19926n = f13 / f16;
            this.f19927o = f14 / f16;
            this.f19922j = new float[101];
            this.f19924l = Float.NaN;
            this.f19925m = Float.NaN;
            z3 = true;
        } else {
            this.f19922j = new float[101];
            this.f19924l = (z5 ? -1 : 1) * f13;
            this.f19925m = f14 * (z5 ? 1 : -1);
            this.f19926n = z5 ? f8 : f12;
            this.f19927o = z5 ? f7 : f9;
            float f18 = f7 - f9;
            int length = C2054a.h().length;
            float f19 = 0.0f;
            float f20 = 0.0f;
            float f21 = 0.0f;
            int i6 = 0;
            while (i6 < length) {
                int i7 = i5;
                float f22 = f15;
                double radians = (float) Math.toRadians((i6 * 90.0d) / (C2054a.h().length - i7));
                float sin = ((float) Math.sin(radians)) * f13;
                float cos = ((float) Math.cos(radians)) * f18;
                if (i6 > 0) {
                    f10 = f18;
                    f11 = sin;
                    f19 += (float) Math.hypot(sin - f20, cos - f21);
                    C2054a.h()[i6] = f19;
                } else {
                    f10 = f18;
                    f11 = sin;
                }
                i6++;
                f18 = f10;
                f20 = f11;
                f21 = cos;
                i5 = i7;
                f15 = f22;
            }
            int i8 = i5;
            float f23 = f15;
            this.f19920g = f19;
            int length2 = C2054a.h().length;
            for (int i9 = 0; i9 < length2; i9++) {
                float[] h3 = C2054a.h();
                h3[i9] = h3[i9] / f19;
            }
            float[] fArr = this.f19922j;
            int length3 = fArr.length;
            for (int i10 = 0; i10 < length3; i10++) {
                float length4 = i10 / (fArr.length - i8);
                float[] h4 = C2054a.h();
                int binarySearch = Arrays.binarySearch(h4, 0, h4.length, length4);
                if (binarySearch >= 0) {
                    fArr[i10] = binarySearch / (C2054a.h().length - i8);
                } else if (binarySearch == -1) {
                    fArr[i10] = f23;
                } else {
                    int i11 = -binarySearch;
                    int i12 = i11 - 2;
                    fArr[i10] = (((length4 - C2054a.h()[i12]) / (C2054a.h()[i11 - i8] - C2054a.h()[i12])) + i12) / (C2054a.h().length - i8);
                }
            }
            this.f19928p = this.f19920g * this.f19923k;
            z3 = z6;
        }
        this.f19930r = z3;
    }

    public final float a() {
        float f = this.f19924l * this.i;
        float hypot = this.f19928p / ((float) Math.hypot(f, (-this.f19925m) * this.f19921h));
        return this.f19929q ? (-f) * hypot : f * hypot;
    }

    public final float b() {
        float f = this.f19924l * this.i;
        float f5 = (-this.f19925m) * this.f19921h;
        float hypot = this.f19928p / ((float) Math.hypot(f, f5));
        return this.f19929q ? (-f5) * hypot : f5 * hypot;
    }

    public final void c(float f) {
        float f5 = (this.f19929q ? this.f19916b - f : f - this.f19915a) * this.f19923k;
        float f6 = 0.0f;
        if (f5 > 0.0f) {
            f6 = 1.0f;
            if (f5 < 1.0f) {
                float[] fArr = this.f19922j;
                float length = f5 * (fArr.length - 1);
                int i = (int) length;
                float f7 = fArr[i];
                f6 = ((fArr[i + 1] - f7) * (length - i)) + f7;
            }
        }
        double d5 = f6 * 1.5707964f;
        this.f19921h = (float) Math.sin(d5);
        this.i = (float) Math.cos(d5);
    }
}
