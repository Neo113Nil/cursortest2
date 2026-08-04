package p169z;

import B.a;
import B.h;
import B.j;
import java.util.LinkedHashMap;
import p143u.e;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Comparable {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final String[] f18377I = {"position", "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f18386a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f18388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f18389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f18390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f18391f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f18392x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f18393y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18387b = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f18394z = Float.NaN;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f18378A = -1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f18379B = -1;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f18380C = Float.NaN;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public n f18381D = null;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public LinkedHashMap f18382E = new LinkedHashMap();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f18383F = 0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public double[] f18384G = new double[18];

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public double[] f18385H = new double[18];

    public static boolean b(float f7, float f8) {
        if (Float.isNaN(f7) || Float.isNaN(f8)) {
            return Float.isNaN(f7) != Float.isNaN(f8);
        }
        return Math.abs(f7 - f8) > 1.0E-6f;
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

    public final void a(h hVar) {
        int iE;
        this.f18386a = e.d(hVar.f800d.f876d);
        j jVar = hVar.f800d;
        this.f18378A = jVar.f877e;
        this.f18379B = jVar.f874b;
        this.f18394z = jVar.f880h;
        this.f18387b = jVar.f878f;
        this.f18380C = hVar.f801e.f808C;
        for (String str : hVar.f803g.keySet()) {
            a aVar = (a) hVar.f803g.get(str);
            if (aVar != null && (iE = p136t.e.e(aVar.f694c)) != 4 && iE != 5 && iE != 7) {
                this.f18382E.put(str, aVar);
            }
        }
    }

    public final void c(double d7, int[] iArr, double[] dArr, float[] fArr, int i7) {
        float fSin = this.f18390e;
        float fCos = this.f18391f;
        float f7 = this.f18392x;
        float f8 = this.f18393y;
        for (int i8 = 0; i8 < iArr.length; i8++) {
            float f9 = (float) dArr[i8];
            int i9 = iArr[i8];
            if (i9 == 1) {
                fSin = f9;
            } else if (i9 == 2) {
                fCos = f9;
            } else if (i9 == 3) {
                f7 = f9;
            } else if (i9 == 4) {
                f8 = f9;
            }
        }
        n nVar = this.f18381D;
        if (nVar != null) {
            float[] fArr2 = new float[2];
            nVar.c(d7, fArr2, new float[2]);
            float f10 = fArr2[0];
            float f11 = fArr2[1];
            double d8 = f10;
            double d9 = fSin;
            double d10 = fCos;
            fSin = (float) (((Math.sin(d10) * d9) + d8) - ((double) (f7 / 2.0f)));
            fCos = (float) ((((double) f11) - (Math.cos(d10) * d9)) - ((double) (f8 / 2.0f)));
        }
        fArr[i7] = (f7 / 2.0f) + fSin + 0.0f;
        fArr[i7 + 1] = (f8 / 2.0f) + fCos + 0.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.f18389d, ((w) obj).f18389d);
    }

    public final void d(String str, double[] dArr) {
        a aVar = (a) this.f18382E.get(str);
        if (aVar == null) {
            return;
        }
        int i7 = 0;
        if (aVar.c() == 1) {
            dArr[0] = aVar.a();
            return;
        }
        int iC = aVar.c();
        float[] fArr = new float[iC];
        aVar.b(fArr);
        int i8 = 0;
        while (i7 < iC) {
            dArr[i8] = fArr[i7];
            i7++;
            i8++;
        }
    }

    public final void f(float f7, float f8, float f9, float f10) {
        this.f18390e = f7;
        this.f18391f = f8;
        this.f18392x = f9;
        this.f18393y = f10;
    }

    public final void l(n nVar, w wVar) {
        double d7 = (((this.f18392x / 2.0f) + this.f18390e) - wVar.f18390e) - (wVar.f18392x / 2.0f);
        double d8 = (((this.f18393y / 2.0f) + this.f18391f) - wVar.f18391f) - (wVar.f18393y / 2.0f);
        this.f18381D = nVar;
        this.f18390e = (float) Math.hypot(d8, d7);
        if (Float.isNaN(this.f18380C)) {
            this.f18391f = (float) (Math.atan2(d8, d7) + 1.5707963267948966d);
        } else {
            this.f18391f = (float) Math.toRadians(this.f18380C);
        }
    }
}
