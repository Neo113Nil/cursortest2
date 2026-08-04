package p136t;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f16257C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16258a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f16262e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16259b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16260c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16261d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16263f = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float[] f16264x = new float[9];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final float[] f16265y = new float[9];

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public b[] f16266z = new b[16];

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f16255A = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f16256B = 0;

    public f(int i7) {
        this.f16257C = i7;
    }

    public final void a(b bVar) {
        int i7 = 0;
        while (true) {
            int i8 = this.f16255A;
            if (i7 >= i8) {
                b[] bVarArr = this.f16266z;
                if (i8 >= bVarArr.length) {
                    this.f16266z = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f16266z;
                int i9 = this.f16255A;
                bVarArr2[i9] = bVar;
                this.f16255A = i9 + 1;
                return;
            }
            if (this.f16266z[i7] == bVar) {
                return;
            } else {
                i7++;
            }
        }
    }

    public final void b(b bVar) {
        int i7 = this.f16255A;
        int i8 = 0;
        while (i8 < i7) {
            if (this.f16266z[i8] == bVar) {
                while (i8 < i7 - 1) {
                    b[] bVarArr = this.f16266z;
                    int i9 = i8 + 1;
                    bVarArr[i8] = bVarArr[i9];
                    i8 = i9;
                }
                this.f16255A--;
                return;
            }
            i8++;
        }
    }

    public final void c() {
        this.f16257C = 5;
        this.f16261d = 0;
        this.f16259b = -1;
        this.f16260c = -1;
        this.f16262e = 0.0f;
        this.f16263f = false;
        int i7 = this.f16255A;
        for (int i8 = 0; i8 < i7; i8++) {
            this.f16266z[i8] = null;
        }
        this.f16255A = 0;
        this.f16256B = 0;
        this.f16258a = false;
        Arrays.fill(this.f16265y, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f16259b - ((f) obj).f16259b;
    }

    public final void d(c cVar, float f7) {
        this.f16262e = f7;
        this.f16263f = true;
        int i7 = this.f16255A;
        this.f16260c = -1;
        for (int i8 = 0; i8 < i7; i8++) {
            this.f16266z[i8].h(cVar, this, false);
        }
        this.f16255A = 0;
    }

    public final void f(c cVar, b bVar) {
        int i7 = this.f16255A;
        for (int i8 = 0; i8 < i7; i8++) {
            this.f16266z[i8].i(cVar, bVar, false);
        }
        this.f16255A = 0;
    }

    public final String toString() {
        return "" + this.f16259b;
    }
}
