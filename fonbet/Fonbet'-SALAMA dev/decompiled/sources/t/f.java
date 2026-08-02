package t;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: C, reason: collision with root package name */
    public int f16251C;

    /* renamed from: a, reason: collision with root package name */
    public boolean f16252a;

    /* renamed from: e, reason: collision with root package name */
    public float f16256e;

    /* renamed from: b, reason: collision with root package name */
    public int f16253b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f16254c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f16255d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16257f = false;

    /* renamed from: x, reason: collision with root package name */
    public final float[] f16258x = new float[9];

    /* renamed from: y, reason: collision with root package name */
    public final float[] f16259y = new float[9];

    /* renamed from: z, reason: collision with root package name */
    public b[] f16260z = new b[16];

    /* renamed from: A, reason: collision with root package name */
    public int f16249A = 0;

    /* renamed from: B, reason: collision with root package name */
    public int f16250B = 0;

    public f(int i7) {
        this.f16251C = i7;
    }

    public final void a(b bVar) {
        int i7 = 0;
        while (true) {
            int i8 = this.f16249A;
            if (i7 >= i8) {
                b[] bVarArr = this.f16260z;
                if (i8 >= bVarArr.length) {
                    this.f16260z = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f16260z;
                int i9 = this.f16249A;
                bVarArr2[i9] = bVar;
                this.f16249A = i9 + 1;
                return;
            }
            if (this.f16260z[i7] == bVar) {
                return;
            } else {
                i7++;
            }
        }
    }

    public final void b(b bVar) {
        int i7 = this.f16249A;
        int i8 = 0;
        while (i8 < i7) {
            if (this.f16260z[i8] == bVar) {
                while (i8 < i7 - 1) {
                    b[] bVarArr = this.f16260z;
                    int i9 = i8 + 1;
                    bVarArr[i8] = bVarArr[i9];
                    i8 = i9;
                }
                this.f16249A--;
                return;
            }
            i8++;
        }
    }

    public final void c() {
        this.f16251C = 5;
        this.f16255d = 0;
        this.f16253b = -1;
        this.f16254c = -1;
        this.f16256e = 0.0f;
        this.f16257f = false;
        int i7 = this.f16249A;
        for (int i8 = 0; i8 < i7; i8++) {
            this.f16260z[i8] = null;
        }
        this.f16249A = 0;
        this.f16250B = 0;
        this.f16252a = false;
        Arrays.fill(this.f16259y, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f16253b - ((f) obj).f16253b;
    }

    public final void d(c cVar, float f7) {
        this.f16256e = f7;
        this.f16257f = true;
        int i7 = this.f16249A;
        this.f16254c = -1;
        for (int i8 = 0; i8 < i7; i8++) {
            this.f16260z[i8].h(cVar, this, false);
        }
        this.f16249A = 0;
    }

    public final void f(c cVar, b bVar) {
        int i7 = this.f16249A;
        for (int i8 = 0; i8 < i7; i8++) {
            this.f16260z[i8].i(cVar, bVar, false);
        }
        this.f16249A = 0;
    }

    public final String toString() {
        return "" + this.f16253b;
    }
}
