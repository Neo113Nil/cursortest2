package r;

/* loaded from: classes.dex */
public final class f implements Cloneable {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f15984e = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f15985a = false;

    /* renamed from: b, reason: collision with root package name */
    public long[] f15986b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f15987c;

    /* renamed from: d, reason: collision with root package name */
    public int f15988d;

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
        this.f15986b = new long[i10];
        this.f15987c = new Object[i10];
    }

    public final void a() {
        int i7 = this.f15988d;
        Object[] objArr = this.f15987c;
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = null;
        }
        this.f15988d = 0;
        this.f15985a = false;
    }

    public final void b() {
        int i7 = this.f15988d;
        long[] jArr = this.f15986b;
        Object[] objArr = this.f15987c;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            Object obj = objArr[i9];
            if (obj != f15984e) {
                if (i9 != i8) {
                    jArr[i8] = jArr[i9];
                    objArr[i8] = obj;
                    objArr[i9] = null;
                }
                i8++;
            }
        }
        this.f15985a = false;
        this.f15988d = i8;
    }

    public final Object c(long j, Long l7) {
        Object obj;
        int b7 = e.b(this.f15986b, this.f15988d, j);
        return (b7 < 0 || (obj = this.f15987c[b7]) == f15984e) ? l7 : obj;
    }

    public final Object clone() {
        try {
            f fVar = (f) super.clone();
            fVar.f15986b = (long[]) this.f15986b.clone();
            fVar.f15987c = (Object[]) this.f15987c.clone();
            return fVar;
        } catch (CloneNotSupportedException e7) {
            throw new AssertionError(e7);
        }
    }

    public final void d(long j, Object obj) {
        int b7 = e.b(this.f15986b, this.f15988d, j);
        if (b7 >= 0) {
            this.f15987c[b7] = obj;
            return;
        }
        int i7 = ~b7;
        int i8 = this.f15988d;
        if (i7 < i8) {
            Object[] objArr = this.f15987c;
            if (objArr[i7] == f15984e) {
                this.f15986b[i7] = j;
                objArr[i7] = obj;
                return;
            }
        }
        if (this.f15985a && i8 >= this.f15986b.length) {
            b();
            i7 = ~e.b(this.f15986b, this.f15988d, j);
        }
        int i9 = this.f15988d;
        if (i9 >= this.f15986b.length) {
            int i10 = (i9 + 1) * 8;
            int i11 = 4;
            while (true) {
                if (i11 >= 32) {
                    break;
                }
                int i12 = (1 << i11) - 12;
                if (i10 <= i12) {
                    i10 = i12;
                    break;
                }
                i11++;
            }
            int i13 = i10 / 8;
            long[] jArr = new long[i13];
            Object[] objArr2 = new Object[i13];
            long[] jArr2 = this.f15986b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f15987c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f15986b = jArr;
            this.f15987c = objArr2;
        }
        int i14 = this.f15988d - i7;
        if (i14 != 0) {
            long[] jArr3 = this.f15986b;
            int i15 = i7 + 1;
            System.arraycopy(jArr3, i7, jArr3, i15, i14);
            Object[] objArr4 = this.f15987c;
            System.arraycopy(objArr4, i7, objArr4, i15, this.f15988d - i7);
        }
        this.f15986b[i7] = j;
        this.f15987c[i7] = obj;
        this.f15988d++;
    }

    public final int e() {
        if (this.f15985a) {
            b();
        }
        return this.f15988d;
    }

    public final Object f(int i7) {
        if (this.f15985a) {
            b();
        }
        return this.f15987c[i7];
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f15988d * 28);
        sb.append('{');
        for (int i7 = 0; i7 < this.f15988d; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            if (this.f15985a) {
                b();
            }
            sb.append(this.f15986b[i7]);
            sb.append('=');
            Object f7 = f(i7);
            if (f7 != this) {
                sb.append(f7);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
