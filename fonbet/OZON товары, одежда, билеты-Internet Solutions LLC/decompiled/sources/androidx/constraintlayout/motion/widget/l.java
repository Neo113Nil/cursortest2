package androidx.constraintlayout.motion.widget;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.d;
import h2.C6785c;
import java.util.LinkedHashMap;

/* loaded from: classes8.dex */
final class l implements Comparable<l> {

    /* renamed from: r, reason: collision with root package name */
    static String[] f41458r = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: a, reason: collision with root package name */
    C6785c f41459a;

    /* renamed from: c, reason: collision with root package name */
    float f41461c;

    /* renamed from: d, reason: collision with root package name */
    float f41462d;

    /* renamed from: e, reason: collision with root package name */
    float f41463e;

    /* renamed from: f, reason: collision with root package name */
    float f41464f;

    /* renamed from: g, reason: collision with root package name */
    float f41465g;

    /* renamed from: h, reason: collision with root package name */
    float f41466h;

    /* renamed from: b, reason: collision with root package name */
    int f41460b = 0;

    /* renamed from: i, reason: collision with root package name */
    float f41467i = Float.NaN;

    /* renamed from: j, reason: collision with root package name */
    int f41468j = -1;

    /* renamed from: k, reason: collision with root package name */
    int f41469k = -1;

    /* renamed from: l, reason: collision with root package name */
    float f41470l = Float.NaN;

    /* renamed from: m, reason: collision with root package name */
    k f41471m = null;

    /* renamed from: n, reason: collision with root package name */
    LinkedHashMap<String, androidx.constraintlayout.widget.a> f41472n = new LinkedHashMap<>();

    /* renamed from: o, reason: collision with root package name */
    int f41473o = 0;

    /* renamed from: p, reason: collision with root package name */
    double[] f41474p = new double[18];

    /* renamed from: q, reason: collision with root package name */
    double[] f41475q = new double[18];

    private static boolean b(float f7, float f11) {
        return (Float.isNaN(f7) || Float.isNaN(f11)) ? Float.isNaN(f7) != Float.isNaN(f11) : Math.abs(f7 - f11) > 1.0E-6f;
    }

    static void f(float f7, float f11, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f16 = (float) dArr[i11];
            double d11 = dArr2[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                f12 = f16;
            } else if (i12 == 2) {
                f14 = f16;
            } else if (i12 == 3) {
                f13 = f16;
            } else if (i12 == 4) {
                f15 = f16;
            }
        }
        float f17 = f12 - ((0.0f * f13) / 2.0f);
        float f18 = f14 - ((0.0f * f15) / 2.0f);
        fArr[0] = (((f13 * 1.0f) + f17) * f7) + ((1.0f - f7) * f17) + 0.0f;
        fArr[1] = (((f15 * 1.0f) + f18) * f11) + ((1.0f - f11) * f18) + 0.0f;
    }

    public final void a(d.a aVar) {
        this.f41459a = C6785c.c(aVar.f41710d.f41800d);
        d.c cVar = aVar.f41710d;
        this.f41468j = cVar.f41801e;
        this.f41469k = cVar.f41798b;
        this.f41467i = cVar.f41804h;
        this.f41460b = cVar.f41802f;
        int i11 = cVar.f41799c;
        float f7 = aVar.f41709c.f41814e;
        this.f41470l = aVar.f41711e.f41730C;
        for (String str : aVar.f41713g.keySet()) {
            androidx.constraintlayout.widget.a aVar2 = aVar.f41713g.get(str);
            if (aVar2 != null && aVar2.f()) {
                this.f41472n.put(str, aVar2);
            }
        }
    }

    final void c(l lVar, boolean[] zArr, boolean z11) {
        boolean b11 = b(this.f41463e, lVar.f41463e);
        boolean b12 = b(this.f41464f, lVar.f41464f);
        zArr[0] = zArr[0] | b(this.f41462d, lVar.f41462d);
        boolean z12 = z11 | b11 | b12;
        zArr[1] = zArr[1] | z12;
        zArr[2] = z12 | zArr[2];
        zArr[3] = zArr[3] | b(this.f41465g, lVar.f41465g);
        zArr[4] = b(this.f41466h, lVar.f41466h) | zArr[4];
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NonNull l lVar) {
        return Float.compare(this.f41462d, lVar.f41462d);
    }

    final void d(double d11, int[] iArr, double[] dArr, float[] fArr, int i11) {
        float f7 = this.f41463e;
        float f11 = this.f41464f;
        float f12 = this.f41465g;
        float f13 = this.f41466h;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            float f14 = (float) dArr[i12];
            int i13 = iArr[i12];
            if (i13 == 1) {
                f7 = f14;
            } else if (i13 == 2) {
                f11 = f14;
            } else if (i13 == 3) {
                f12 = f14;
            } else if (i13 == 4) {
                f13 = f14;
            }
        }
        k kVar = this.f41471m;
        if (kVar != null) {
            float[] fArr2 = new float[2];
            kVar.i(d11, fArr2, new float[2]);
            float f15 = fArr2[0];
            float f16 = fArr2[1];
            double d12 = f15;
            double d13 = f7;
            double d14 = f11;
            f7 = (float) (((Math.sin(d14) * d13) + d12) - (f12 / 2.0f));
            f11 = (float) ((f16 - (Math.cos(d14) * d13)) - (f13 / 2.0f));
        }
        fArr[i11] = (f12 / 2.0f) + f7 + 0.0f;
        fArr[i11 + 1] = (f13 / 2.0f) + f11 + 0.0f;
    }

    final void e(float f7, float f11, float f12, float f13) {
        this.f41463e = f7;
        this.f41464f = f11;
        this.f41465g = f12;
        this.f41466h = f13;
    }

    public final void g(k kVar, l lVar) {
        double d11 = (((this.f41465g / 2.0f) + this.f41463e) - lVar.f41463e) - (lVar.f41465g / 2.0f);
        double d12 = (((this.f41466h / 2.0f) + this.f41464f) - lVar.f41464f) - (lVar.f41466h / 2.0f);
        this.f41471m = kVar;
        this.f41463e = (float) Math.hypot(d12, d11);
        if (Float.isNaN(this.f41470l)) {
            this.f41464f = (float) (Math.atan2(d12, d11) + 1.5707963267948966d);
        } else {
            this.f41464f = (float) Math.toRadians(this.f41470l);
        }
    }
}
