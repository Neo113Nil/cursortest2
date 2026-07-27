package r;

/* renamed from: r.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1402l implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f11714d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public int[] f11715a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f11716b;

    /* renamed from: c, reason: collision with root package name */
    public int f11717c;

    public final void a(int i2, Object obj) {
        int i3 = this.f11717c;
        if (i3 == 0 || i2 > this.f11715a[i3 - 1]) {
            if (i3 >= this.f11715a.length) {
                int i6 = (i3 + 1) * 4;
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
                int i9 = i6 / 4;
                int[] iArr = new int[i9];
                Object[] objArr = new Object[i9];
                int[] iArr2 = this.f11715a;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f11716b;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f11715a = iArr;
                this.f11716b = objArr;
            }
            this.f11715a[i3] = i2;
            this.f11716b[i3] = obj;
            this.f11717c = i3 + 1;
            return;
        }
        int a6 = AbstractC1394d.a(this.f11717c, i2, this.f11715a);
        if (a6 >= 0) {
            this.f11716b[a6] = obj;
            return;
        }
        int i10 = ~a6;
        int i11 = this.f11717c;
        if (i10 < i11) {
            Object[] objArr3 = this.f11716b;
            if (objArr3[i10] == f11714d) {
                this.f11715a[i10] = i2;
                objArr3[i10] = obj;
                return;
            }
        }
        if (i11 >= this.f11715a.length) {
            int i12 = (i11 + 1) * 4;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 4;
            int[] iArr3 = new int[i15];
            Object[] objArr4 = new Object[i15];
            int[] iArr4 = this.f11715a;
            System.arraycopy(iArr4, 0, iArr3, 0, iArr4.length);
            Object[] objArr5 = this.f11716b;
            System.arraycopy(objArr5, 0, objArr4, 0, objArr5.length);
            this.f11715a = iArr3;
            this.f11716b = objArr4;
        }
        int i16 = this.f11717c - i10;
        if (i16 != 0) {
            int[] iArr5 = this.f11715a;
            int i17 = i10 + 1;
            System.arraycopy(iArr5, i10, iArr5, i17, i16);
            Object[] objArr6 = this.f11716b;
            System.arraycopy(objArr6, i10, objArr6, i17, this.f11717c - i10);
        }
        this.f11715a[i10] = i2;
        this.f11716b[i10] = obj;
        this.f11717c++;
    }

    public final Object clone() {
        try {
            C1402l c1402l = (C1402l) super.clone();
            c1402l.f11715a = (int[]) this.f11715a.clone();
            c1402l.f11716b = (Object[]) this.f11716b.clone();
            return c1402l;
        } catch (CloneNotSupportedException e3) {
            throw new AssertionError(e3);
        }
    }

    public final String toString() {
        int i2 = this.f11717c;
        if (i2 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i2 * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f11717c; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.f11715a[i3]);
            sb.append('=');
            Object obj = this.f11716b[i3];
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
