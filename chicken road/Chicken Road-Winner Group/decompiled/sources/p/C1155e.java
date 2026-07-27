package p;

/* renamed from: p.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1155e implements Cloneable {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f10197e = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f10198a = false;

    /* renamed from: b, reason: collision with root package name */
    public long[] f10199b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f10200c;

    /* renamed from: d, reason: collision with root package name */
    public int f10201d;

    public C1155e() {
        int i3;
        int i4 = 4;
        while (true) {
            i3 = 80;
            if (i4 >= 32) {
                break;
            }
            int i5 = (1 << i4) - 12;
            if (80 <= i5) {
                i3 = i5;
                break;
            }
            i4++;
        }
        int i6 = i3 / 8;
        this.f10199b = new long[i6];
        this.f10200c = new Object[i6];
    }

    public final void a() {
        int i3 = this.f10201d;
        long[] jArr = this.f10199b;
        Object[] objArr = this.f10200c;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj = objArr[i5];
            if (obj != f10197e) {
                if (i5 != i4) {
                    jArr[i4] = jArr[i5];
                    objArr[i4] = obj;
                    objArr[i5] = null;
                }
                i4++;
            }
        }
        this.f10198a = false;
        this.f10201d = i4;
    }

    public final void b(long j3, Object obj) {
        int b3 = AbstractC1154d.b(this.f10199b, this.f10201d, j3);
        if (b3 >= 0) {
            this.f10200c[b3] = obj;
            return;
        }
        int i3 = ~b3;
        int i4 = this.f10201d;
        if (i3 < i4) {
            Object[] objArr = this.f10200c;
            if (objArr[i3] == f10197e) {
                this.f10199b[i3] = j3;
                objArr[i3] = obj;
                return;
            }
        }
        if (this.f10198a && i4 >= this.f10199b.length) {
            a();
            i3 = ~AbstractC1154d.b(this.f10199b, this.f10201d, j3);
        }
        int i5 = this.f10201d;
        if (i5 >= this.f10199b.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            long[] jArr = new long[i9];
            Object[] objArr2 = new Object[i9];
            long[] jArr2 = this.f10199b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f10200c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f10199b = jArr;
            this.f10200c = objArr2;
        }
        int i10 = this.f10201d - i3;
        if (i10 != 0) {
            long[] jArr3 = this.f10199b;
            int i11 = i3 + 1;
            System.arraycopy(jArr3, i3, jArr3, i11, i10);
            Object[] objArr4 = this.f10200c;
            System.arraycopy(objArr4, i3, objArr4, i11, this.f10201d - i3);
        }
        this.f10199b[i3] = j3;
        this.f10200c[i3] = obj;
        this.f10201d++;
    }

    public final Object clone() {
        try {
            C1155e c1155e = (C1155e) super.clone();
            c1155e.f10199b = (long[]) this.f10199b.clone();
            c1155e.f10200c = (Object[]) this.f10200c.clone();
            return c1155e;
        } catch (CloneNotSupportedException e3) {
            throw new AssertionError(e3);
        }
    }

    public final String toString() {
        if (this.f10198a) {
            a();
        }
        if (this.f10201d <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f10201d * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f10201d; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            if (this.f10198a) {
                a();
            }
            sb.append(this.f10199b[i3]);
            sb.append('=');
            if (this.f10198a) {
                a();
            }
            Object obj = this.f10200c[i3];
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
