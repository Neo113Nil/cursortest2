package l;

/* loaded from: classes.dex */
public final class e implements java.lang.Cloneable {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.Object f7980e = new java.lang.Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f7981a = false;

    /* renamed from: b, reason: collision with root package name */
    public long[] f7982b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Object[] f7983c;

    /* renamed from: d, reason: collision with root package name */
    public int f7984d;

    public e() {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 80;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (80 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.f7982b = new long[i5];
        this.f7983c = new java.lang.Object[i5];
    }

    public final void a() {
        int i2 = this.f7984d;
        long[] jArr = this.f7982b;
        java.lang.Object[] objArr = this.f7983c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            java.lang.Object obj = objArr[i4];
            if (obj != f7980e) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f7981a = false;
        this.f7984d = i3;
    }

    public final void b(long j2, java.lang.Object obj) {
        int b2 = l.d.b(this.f7982b, this.f7984d, j2);
        if (b2 >= 0) {
            this.f7983c[b2] = obj;
            return;
        }
        int i2 = ~b2;
        int i3 = this.f7984d;
        if (i2 < i3) {
            java.lang.Object[] objArr = this.f7983c;
            if (objArr[i2] == f7980e) {
                this.f7982b[i2] = j2;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f7981a && i3 >= this.f7982b.length) {
            a();
            i2 = ~l.d.b(this.f7982b, this.f7984d, j2);
        }
        int i4 = this.f7984d;
        if (i4 >= this.f7982b.length) {
            int i5 = (i4 + 1) * 8;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 8;
            long[] jArr = new long[i8];
            java.lang.Object[] objArr2 = new java.lang.Object[i8];
            long[] jArr2 = this.f7982b;
            java.lang.System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            java.lang.Object[] objArr3 = this.f7983c;
            java.lang.System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f7982b = jArr;
            this.f7983c = objArr2;
        }
        int i9 = this.f7984d - i2;
        if (i9 != 0) {
            long[] jArr3 = this.f7982b;
            int i10 = i2 + 1;
            java.lang.System.arraycopy(jArr3, i2, jArr3, i10, i9);
            java.lang.Object[] objArr4 = this.f7983c;
            java.lang.System.arraycopy(objArr4, i2, objArr4, i10, this.f7984d - i2);
        }
        this.f7982b[i2] = j2;
        this.f7983c[i2] = obj;
        this.f7984d++;
    }

    public final java.lang.Object clone() {
        try {
            l.e eVar = (l.e) super.clone();
            eVar.f7982b = (long[]) this.f7982b.clone();
            eVar.f7983c = (java.lang.Object[]) this.f7983c.clone();
            return eVar;
        } catch (java.lang.CloneNotSupportedException e2) {
            throw new java.lang.AssertionError(e2);
        }
    }

    public final java.lang.String toString() {
        if (this.f7981a) {
            a();
        }
        if (this.f7984d <= 0) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.f7984d * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f7984d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            if (this.f7981a) {
                a();
            }
            sb.append(this.f7982b[i2]);
            sb.append('=');
            if (this.f7981a) {
                a();
            }
            java.lang.Object obj = this.f7983c[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
