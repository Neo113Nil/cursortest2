package p122r;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Cloneable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f15990e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15991a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f15992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f15993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15994d;

    public f() {
        int i7;
        int i8 = 4;
        while (true) {
            i7 = 80;
            if (i8 >= 32) {
                break;
            }
            int i9 = (1 << i8) - 12;
            if (80 <= i9) {
                i7 = i9;
                break;
            }
            i8++;
        }
        int i10 = i7 / 8;
        this.f15992b = new long[i10];
        this.f15993c = new Object[i10];
    }

    public final void a() {
        int i7 = this.f15994d;
        Object[] objArr = this.f15993c;
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = null;
        }
        this.f15994d = 0;
        this.f15991a = false;
    }

    public final void b() {
        int i7 = this.f15994d;
        long[] jArr = this.f15992b;
        Object[] objArr = this.f15993c;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            Object obj = objArr[i9];
            if (obj != f15990e) {
                if (i9 != i8) {
                    jArr[i8] = jArr[i9];
                    objArr[i8] = obj;
                    objArr[i9] = null;
                }
                i8++;
            }
        }
        this.f15991a = false;
        this.f15994d = i8;
    }

    public final Object c(long j, Long l7) {
        Object obj;
        int iB = e.b(this.f15992b, this.f15994d, j);
        return (iB < 0 || (obj = this.f15993c[iB]) == f15990e) ? l7 : obj;
    }

    public final Object clone() {
        try {
            f fVar = (f) super.clone();
            fVar.f15992b = (long[]) this.f15992b.clone();
            fVar.f15993c = (Object[]) this.f15993c.clone();
            return fVar;
        } catch (CloneNotSupportedException e7) {
            throw new AssertionError(e7);
        }
    }

    public final void d(long j, Object obj) {
        int iB = e.b(this.f15992b, this.f15994d, j);
        if (iB >= 0) {
            this.f15993c[iB] = obj;
            return;
        }
        int i7 = ~iB;
        int i8 = this.f15994d;
        if (i7 < i8) {
            Object[] objArr = this.f15993c;
            if (objArr[i7] == f15990e) {
                this.f15992b[i7] = j;
                objArr[i7] = obj;
                return;
            }
        }
        if (this.f15991a && i8 >= this.f15992b.length) {
            b();
            i7 = ~e.b(this.f15992b, this.f15994d, j);
        }
        int i9 = this.f15994d;
        if (i9 >= this.f15992b.length) {
            int i10 = (i9 + 1) * 8;
            for (int i11 = 4; i11 < 32; i11++) {
                int i12 = (1 << i11) - 12;
                if (i10 <= i12) {
                    i10 = i12;
                    break;
                }
            }
            int i13 = i10 / 8;
            long[] jArr = new long[i13];
            Object[] objArr2 = new Object[i13];
            long[] jArr2 = this.f15992b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f15993c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f15992b = jArr;
            this.f15993c = objArr2;
        }
        int i14 = this.f15994d - i7;
        if (i14 != 0) {
            long[] jArr3 = this.f15992b;
            int i15 = i7 + 1;
            System.arraycopy(jArr3, i7, jArr3, i15, i14);
            Object[] objArr4 = this.f15993c;
            System.arraycopy(objArr4, i7, objArr4, i15, this.f15994d - i7);
        }
        this.f15992b[i7] = j;
        this.f15993c[i7] = obj;
        this.f15994d++;
    }

    public final int e() {
        if (this.f15991a) {
            b();
        }
        return this.f15994d;
    }

    public final Object f(int i7) {
        if (this.f15991a) {
            b();
        }
        return this.f15993c[i7];
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f15994d * 28);
        sb.append('{');
        for (int i7 = 0; i7 < this.f15994d; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            if (this.f15991a) {
                b();
            }
            sb.append(this.f15992b[i7]);
            sb.append('=');
            Object objF = f(i7);
            if (objF != this) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
