package p;

/* renamed from: p.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1162l implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f10225d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public int[] f10226a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f10227b;

    /* renamed from: c, reason: collision with root package name */
    public int f10228c;

    public final void a(int i3, Object obj) {
        int i4 = this.f10228c;
        if (i4 == 0 || i3 > this.f10226a[i4 - 1]) {
            if (i4 >= this.f10226a.length) {
                int i5 = (i4 + 1) * 4;
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
                int i8 = i5 / 4;
                int[] iArr = new int[i8];
                Object[] objArr = new Object[i8];
                int[] iArr2 = this.f10226a;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f10227b;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f10226a = iArr;
                this.f10227b = objArr;
            }
            this.f10226a[i4] = i3;
            this.f10227b[i4] = obj;
            this.f10228c = i4 + 1;
            return;
        }
        int a3 = AbstractC1154d.a(this.f10228c, i3, this.f10226a);
        if (a3 >= 0) {
            this.f10227b[a3] = obj;
            return;
        }
        int i9 = ~a3;
        int i10 = this.f10228c;
        if (i9 < i10) {
            Object[] objArr3 = this.f10227b;
            if (objArr3[i9] == f10225d) {
                this.f10226a[i9] = i3;
                objArr3[i9] = obj;
                return;
            }
        }
        if (i10 >= this.f10226a.length) {
            int i11 = (i10 + 1) * 4;
            int i12 = 4;
            while (true) {
                if (i12 >= 32) {
                    break;
                }
                int i13 = (1 << i12) - 12;
                if (i11 <= i13) {
                    i11 = i13;
                    break;
                }
                i12++;
            }
            int i14 = i11 / 4;
            int[] iArr3 = new int[i14];
            Object[] objArr4 = new Object[i14];
            int[] iArr4 = this.f10226a;
            System.arraycopy(iArr4, 0, iArr3, 0, iArr4.length);
            Object[] objArr5 = this.f10227b;
            System.arraycopy(objArr5, 0, objArr4, 0, objArr5.length);
            this.f10226a = iArr3;
            this.f10227b = objArr4;
        }
        int i15 = this.f10228c - i9;
        if (i15 != 0) {
            int[] iArr5 = this.f10226a;
            int i16 = i9 + 1;
            System.arraycopy(iArr5, i9, iArr5, i16, i15);
            Object[] objArr6 = this.f10227b;
            System.arraycopy(objArr6, i9, objArr6, i16, this.f10228c - i9);
        }
        this.f10226a[i9] = i3;
        this.f10227b[i9] = obj;
        this.f10228c++;
    }

    public final Object clone() {
        try {
            C1162l c1162l = (C1162l) super.clone();
            c1162l.f10226a = (int[]) this.f10226a.clone();
            c1162l.f10227b = (Object[]) this.f10227b.clone();
            return c1162l;
        } catch (CloneNotSupportedException e3) {
            throw new AssertionError(e3);
        }
    }

    public final String toString() {
        int i3 = this.f10228c;
        if (i3 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i3 * 28);
        sb.append('{');
        for (int i4 = 0; i4 < this.f10228c; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(this.f10226a[i4]);
            sb.append('=');
            Object obj = this.f10227b[i4];
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
