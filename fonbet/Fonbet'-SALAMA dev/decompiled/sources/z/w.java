package z;

import java.util.LinkedHashMap;
import u.C1616e;

/* loaded from: classes.dex */
public final class w implements Comparable {

    /* renamed from: I, reason: collision with root package name */
    public static final String[] f18371I = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: a, reason: collision with root package name */
    public C1616e f18380a;

    /* renamed from: c, reason: collision with root package name */
    public float f18382c;

    /* renamed from: d, reason: collision with root package name */
    public float f18383d;

    /* renamed from: e, reason: collision with root package name */
    public float f18384e;

    /* renamed from: f, reason: collision with root package name */
    public float f18385f;

    /* renamed from: x, reason: collision with root package name */
    public float f18386x;

    /* renamed from: y, reason: collision with root package name */
    public float f18387y;

    /* renamed from: b, reason: collision with root package name */
    public int f18381b = 0;

    /* renamed from: z, reason: collision with root package name */
    public float f18388z = Float.NaN;

    /* renamed from: A, reason: collision with root package name */
    public int f18372A = -1;

    /* renamed from: B, reason: collision with root package name */
    public int f18373B = -1;

    /* renamed from: C, reason: collision with root package name */
    public float f18374C = Float.NaN;

    /* renamed from: D, reason: collision with root package name */
    public n f18375D = null;

    /* renamed from: E, reason: collision with root package name */
    public LinkedHashMap f18376E = new LinkedHashMap();

    /* renamed from: F, reason: collision with root package name */
    public int f18377F = 0;

    /* renamed from: G, reason: collision with root package name */
    public double[] f18378G = new double[18];

    /* renamed from: H, reason: collision with root package name */
    public double[] f18379H = new double[18];

    public static boolean b(float f7, float f8) {
        return (Float.isNaN(f7) || Float.isNaN(f8)) ? Float.isNaN(f7) != Float.isNaN(f8) : Math.abs(f7 - f8) > 1.0E-6f;
    }

    public static void h(float f7, float f8, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        for (int i7 = 0; i7 < iArr.length; i7++) {
            float f13 = (float) dArr[i7];
            double d7 = dArr2[i7];
            int i8 = iArr[i7];
            if (i8 == 1) {
                f9 = f13;
            } else if (i8 == 2) {
                f11 = f13;
            } else if (i8 == 3) {
                f10 = f13;
            } else if (i8 == 4) {
                f12 = f13;
            }
        }
        float f14 = f9 - ((0.0f * f10) / 2.0f);
        float f15 = f11 - ((0.0f * f12) / 2.0f);
        fArr[0] = (((f10 * 1.0f) + f14) * f7) + ((1.0f - f7) * f14) + 0.0f;
        fArr[1] = (((f12 * 1.0f) + f15) * f8) + ((1.0f - f8) * f15) + 0.0f;
    }

    public final void a(B.h hVar) {
        int e7;
        this.f18380a = C1616e.d(hVar.f800d.f876d);
        B.j jVar = hVar.f800d;
        this.f18372A = jVar.f877e;
        this.f18373B = jVar.f874b;
        this.f18388z = jVar.f880h;
        this.f18381b = jVar.f878f;
        this.f18374C = hVar.f801e.f808C;
        for (String str : hVar.f803g.keySet()) {
            B.a aVar = (B.a) hVar.f803g.get(str);
            if (aVar != null && (e7 = t.e.e(aVar.f694c)) != 4 && e7 != 5 && e7 != 7) {
                this.f18376E.put(str, aVar);
            }
        }
    }

    public final void c(double d7, int[] iArr, double[] dArr, float[] fArr, int i7) {
        float f7 = this.f18384e;
        float f8 = this.f18385f;
        float f9 = this.f18386x;
        float f10 = this.f18387y;
        for (int i8 = 0; i8 < iArr.length; i8++) {
            float f11 = (float) dArr[i8];
            int i9 = iArr[i8];
            if (i9 == 1) {
                f7 = f11;
            } else if (i9 == 2) {
                f8 = f11;
            } else if (i9 == 3) {
                f9 = f11;
            } else if (i9 == 4) {
                f10 = f11;
            }
        }
        n nVar = this.f18375D;
        if (nVar != null) {
            float[] fArr2 = new float[2];
            nVar.c(d7, fArr2, new float[2]);
            float f12 = fArr2[0];
            float f13 = fArr2[1];
            double d8 = f12;
            double d9 = f7;
            double d10 = f8;
            f7 = (float) (((Math.sin(d10) * d9) + d8) - (f9 / 2.0f));
            f8 = (float) ((f13 - (Math.cos(d10) * d9)) - (f10 / 2.0f));
        }
        fArr[i7] = (f9 / 2.0f) + f7 + 0.0f;
        fArr[i7 + 1] = (f10 / 2.0f) + f8 + 0.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.f18383d, ((w) obj).f18383d);
    }

    public final void d(String str, double[] dArr) {
        B.a aVar = (B.a) this.f18376E.get(str);
        if (aVar == null) {
            return;
        }
        int i7 = 0;
        if (aVar.c() == 1) {
            dArr[0] = aVar.a();
            return;
        }
        int c3 = aVar.c();
        aVar.b(new float[c3]);
        int i8 = 0;
        while (i7 < c3) {
            dArr[i8] = r1[i7];
            i7++;
            i8++;
        }
    }

    public final void f(float f7, float f8, float f9, float f10) {
        this.f18384e = f7;
        this.f18385f = f8;
        this.f18386x = f9;
        this.f18387y = f10;
    }

    public final void l(n nVar, w wVar) {
        double d7 = (((this.f18386x / 2.0f) + this.f18384e) - wVar.f18384e) - (wVar.f18386x / 2.0f);
        double d8 = (((this.f18387y / 2.0f) + this.f18385f) - wVar.f18385f) - (wVar.f18387y / 2.0f);
        this.f18375D = nVar;
        this.f18384e = (float) Math.hypot(d8, d7);
        if (Float.isNaN(this.f18374C)) {
            this.f18385f = (float) (Math.atan2(d8, d7) + 1.5707963267948966d);
        } else {
            this.f18385f = (float) Math.toRadians(this.f18374C);
        }
    }
}
