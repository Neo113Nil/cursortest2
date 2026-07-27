package r;

/* renamed from: r.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1395e implements Cloneable {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f11685e = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f11686a = false;

    /* renamed from: b, reason: collision with root package name */
    public long[] f11687b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f11688c;

    /* renamed from: d, reason: collision with root package name */
    public int f11689d;

    public C1395e() {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 80;
            if (i3 >= 32) {
                break;
            }
            int i6 = (1 << i3) - 12;
            if (80 <= i6) {
                i2 = i6;
                break;
            }
            i3++;
        }
        int i7 = i2 / 8;
        this.f11687b = new long[i7];
        this.f11688c = new Object[i7];
    }

    public final void a() {
        int i2 = this.f11689d;
        long[] jArr = this.f11687b;
        Object[] objArr = this.f11688c;
        int i3 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            Object obj = objArr[i6];
            if (obj != f11685e) {
                if (i6 != i3) {
                    jArr[i3] = jArr[i6];
                    objArr[i3] = obj;
                    objArr[i6] = null;
                }
                i3++;
            }
        }
        this.f11686a = false;
        this.f11689d = i3;
    }

    public final void b(long j2, Object obj) {
        int b6 = AbstractC1394d.b(this.f11687b, this.f11689d, j2);
        if (b6 >= 0) {
            this.f11688c[b6] = obj;
            return;
        }
        int i2 = ~b6;
        int i3 = this.f11689d;
        if (i2 < i3) {
            Object[] objArr = this.f11688c;
            if (objArr[i2] == f11685e) {
                this.f11687b[i2] = j2;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f11686a && i3 >= this.f11687b.length) {
            a();
            i2 = ~AbstractC1394d.b(this.f11687b, this.f11689d, j2);
        }
        int i6 = this.f11689d;
        if (i6 >= this.f11687b.length) {
            int i7 = (i6 + 1) * 8;
            int i8 = 4;
            while (true) {
                if (i8 >= 32) {
                    break;
                }
                int i9 = (1 << i8) - 12;
                if (i7 <= i9) {
                    i7 = i9;
                    break;
                }
                i8++;
            }
            int i10 = i7 / 8;
            long[] jArr = new long[i10];
            Object[] objArr2 = new Object[i10];
            long[] jArr2 = this.f11687b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f11688c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f11687b = jArr;
            this.f11688c = objArr2;
        }
        int i11 = this.f11689d - i2;
        if (i11 != 0) {
            long[] jArr3 = this.f11687b;
            int i12 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i12, i11);
            Object[] objArr4 = this.f11688c;
            System.arraycopy(objArr4, i2, objArr4, i12, this.f11689d - i2);
        }
        this.f11687b[i2] = j2;
        this.f11688c[i2] = obj;
        this.f11689d++;
    }

    public final Object clone() {
        try {
            C1395e c1395e = (C1395e) super.clone();
            c1395e.f11687b = (long[]) this.f11687b.clone();
            c1395e.f11688c = (Object[]) this.f11688c.clone();
            return c1395e;
        } catch (CloneNotSupportedException e3) {
            throw new AssertionError(e3);
        }
    }

    public final String toString() {
        if (this.f11686a) {
            a();
        }
        if (this.f11689d <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f11689d * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f11689d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            if (this.f11686a) {
                a();
            }
            sb.append(this.f11687b[i2]);
            sb.append('=');
            if (this.f11686a) {
                a();
            }
            Object obj = this.f11688c[i2];
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
