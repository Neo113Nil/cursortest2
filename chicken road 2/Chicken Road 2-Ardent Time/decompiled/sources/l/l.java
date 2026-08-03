package l;

/* loaded from: classes.dex */
public final class l implements java.lang.Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.Object f8009d = new java.lang.Object();

    /* renamed from: a, reason: collision with root package name */
    public int[] f8010a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Object[] f8011b;

    /* renamed from: c, reason: collision with root package name */
    public int f8012c;

    public final void a(int i2, java.lang.Object obj) {
        int i3 = this.f8012c;
        if (i3 == 0 || i2 > this.f8010a[i3 - 1]) {
            if (i3 >= this.f8010a.length) {
                int i4 = (i3 + 1) * 4;
                int i5 = 4;
                while (true) {
                    if (i5 >= 32) {
                        break;
                    }
                    int i6 = (1 << i5) - 12;
                    if (i4 <= i6) {
                        i4 = i6;
                        break;
                    }
                    i5++;
                }
                int i7 = i4 / 4;
                int[] iArr = new int[i7];
                java.lang.Object[] objArr = new java.lang.Object[i7];
                int[] iArr2 = this.f8010a;
                java.lang.System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                java.lang.Object[] objArr2 = this.f8011b;
                java.lang.System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f8010a = iArr;
                this.f8011b = objArr;
            }
            this.f8010a[i3] = i2;
            this.f8011b[i3] = obj;
            this.f8012c = i3 + 1;
            return;
        }
        int a2 = l.d.a(this.f8012c, i2, this.f8010a);
        if (a2 >= 0) {
            this.f8011b[a2] = obj;
            return;
        }
        int i8 = ~a2;
        int i9 = this.f8012c;
        if (i8 < i9) {
            java.lang.Object[] objArr3 = this.f8011b;
            if (objArr3[i8] == f8009d) {
                this.f8010a[i8] = i2;
                objArr3[i8] = obj;
                return;
            }
        }
        if (i9 >= this.f8010a.length) {
            int i10 = (i9 + 1) * 4;
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
            int i13 = i10 / 4;
            int[] iArr3 = new int[i13];
            java.lang.Object[] objArr4 = new java.lang.Object[i13];
            int[] iArr4 = this.f8010a;
            java.lang.System.arraycopy(iArr4, 0, iArr3, 0, iArr4.length);
            java.lang.Object[] objArr5 = this.f8011b;
            java.lang.System.arraycopy(objArr5, 0, objArr4, 0, objArr5.length);
            this.f8010a = iArr3;
            this.f8011b = objArr4;
        }
        int i14 = this.f8012c - i8;
        if (i14 != 0) {
            int[] iArr5 = this.f8010a;
            int i15 = i8 + 1;
            java.lang.System.arraycopy(iArr5, i8, iArr5, i15, i14);
            java.lang.Object[] objArr6 = this.f8011b;
            java.lang.System.arraycopy(objArr6, i8, objArr6, i15, this.f8012c - i8);
        }
        this.f8010a[i8] = i2;
        this.f8011b[i8] = obj;
        this.f8012c++;
    }

    public final java.lang.Object clone() {
        try {
            l.l lVar = (l.l) super.clone();
            lVar.f8010a = (int[]) this.f8010a.clone();
            lVar.f8011b = (java.lang.Object[]) this.f8011b.clone();
            return lVar;
        } catch (java.lang.CloneNotSupportedException e2) {
            throw new java.lang.AssertionError(e2);
        }
    }

    public final java.lang.String toString() {
        int i2 = this.f8012c;
        if (i2 <= 0) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(i2 * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f8012c; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.f8010a[i3]);
            sb.append('=');
            java.lang.Object obj = this.f8011b[i3];
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
