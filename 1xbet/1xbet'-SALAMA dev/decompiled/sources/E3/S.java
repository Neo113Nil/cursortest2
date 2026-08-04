package E3;

/* JADX INFO: loaded from: classes2.dex */
public final class S extends B {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Object[] f2019y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final S f2020z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f2021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f2022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f2023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f2024f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final transient int f2025x;

    static {
        Object[] objArr = new Object[0];
        f2019y = objArr;
        f2020z = new S(objArr, 0, objArr, 0, 0);
    }

    public S(Object[] objArr, int i7, Object[] objArr2, int i8, int i9) {
        this.f2021c = objArr;
        this.f2022d = i7;
        this.f2023e = objArr2;
        this.f2024f = i8;
        this.f2025x = i9;
    }

    @Override // E3.AbstractC0162u
    public final boolean A() {
        return false;
    }

    @Override // E3.B
    public final AbstractC0167z E() {
        return AbstractC0167z.B(this.f2025x, this.f2021c);
    }

    @Override // E3.B
    /* JADX INFO: renamed from: F */
    public final a0 iterator() {
        return l().listIterator(0);
    }

    @Override // E3.AbstractC0162u, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f2023e;
            if (objArr.length != 0) {
                int iK = AbstractC0158p.k(obj.hashCode());
                while (true) {
                    int i7 = iK & this.f2024f;
                    Object obj2 = objArr[i7];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iK = i7 + 1;
                }
            }
        }
        return false;
    }

    @Override // E3.B, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f2022d;
    }

    @Override // E3.AbstractC0162u
    public final int m(int i7, Object[] objArr) {
        Object[] objArr2 = this.f2021c;
        int i8 = this.f2025x;
        System.arraycopy(objArr2, 0, objArr, i7, i8);
        return i7 + i8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2025x;
    }

    @Override // E3.AbstractC0162u
    public final Object[] t() {
        return this.f2021c;
    }

    @Override // E3.AbstractC0162u
    public final int y() {
        return this.f2025x;
    }

    @Override // E3.AbstractC0162u
    public final int z() {
        return 0;
    }
}
