package p122r;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Cloneable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f16014d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f16015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f16016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16017c;

    public m() {
        int i7;
        int i8 = 4;
        while (true) {
            i7 = 40;
            if (i8 >= 32) {
                break;
            }
            int i9 = (1 << i8) - 12;
            if (40 <= i9) {
                i7 = i9;
                break;
            }
            i8++;
        }
        int i10 = i7 / 4;
        this.f16015a = new int[i10];
        this.f16016b = new Object[i10];
    }

    public final void a(int i7, Object obj) {
        int i8 = this.f16017c;
        if (i8 != 0 && i7 <= this.f16015a[i8 - 1]) {
            c(i7, obj);
            return;
        }
        if (i8 >= this.f16015a.length) {
            int i9 = (i8 + 1) * 4;
            for (int i10 = 4; i10 < 32; i10++) {
                int i11 = (1 << i10) - 12;
                if (i9 <= i11) {
                    i9 = i11;
                    break;
                }
            }
            int i12 = i9 / 4;
            int[] iArr = new int[i12];
            Object[] objArr = new Object[i12];
            int[] iArr2 = this.f16015a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f16016b;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f16015a = iArr;
            this.f16016b = objArr;
        }
        this.f16015a[i8] = i7;
        this.f16016b[i8] = obj;
        this.f16017c = i8 + 1;
    }

    public final Object b(int i7, Integer num) {
        Object obj;
        int iA = e.a(this.f16015a, this.f16017c, i7);
        return (iA < 0 || (obj = this.f16016b[iA]) == f16014d) ? num : obj;
    }

    public final void c(int i7, Object obj) {
        int iA = e.a(this.f16015a, this.f16017c, i7);
        if (iA >= 0) {
            this.f16016b[iA] = obj;
            return;
        }
        int i8 = ~iA;
        int i9 = this.f16017c;
        if (i8 < i9) {
            Object[] objArr = this.f16016b;
            if (objArr[i8] == f16014d) {
                this.f16015a[i8] = i7;
                objArr[i8] = obj;
                return;
            }
        }
        if (i9 >= this.f16015a.length) {
            int i10 = (i9 + 1) * 4;
            for (int i11 = 4; i11 < 32; i11++) {
                int i12 = (1 << i11) - 12;
                if (i10 <= i12) {
                    i10 = i12;
                    break;
                }
            }
            int i13 = i10 / 4;
            int[] iArr = new int[i13];
            Object[] objArr2 = new Object[i13];
            int[] iArr2 = this.f16015a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f16016b;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f16015a = iArr;
            this.f16016b = objArr2;
        }
        int i14 = this.f16017c - i8;
        if (i14 != 0) {
            int[] iArr3 = this.f16015a;
            int i15 = i8 + 1;
            System.arraycopy(iArr3, i8, iArr3, i15, i14);
            Object[] objArr4 = this.f16016b;
            System.arraycopy(objArr4, i8, objArr4, i15, this.f16017c - i8);
        }
        this.f16015a[i8] = i7;
        this.f16016b[i8] = obj;
        this.f16017c++;
    }

    public final Object clone() {
        try {
            m mVar = (m) super.clone();
            mVar.f16015a = (int[]) this.f16015a.clone();
            mVar.f16016b = (Object[]) this.f16016b.clone();
            return mVar;
        } catch (CloneNotSupportedException e7) {
            throw new AssertionError(e7);
        }
    }

    public final String toString() {
        int i7 = this.f16017c;
        if (i7 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i7 * 28);
        sb.append('{');
        for (int i8 = 0; i8 < this.f16017c; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            sb.append(this.f16015a[i8]);
            sb.append('=');
            Object obj = this.f16016b[i8];
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
