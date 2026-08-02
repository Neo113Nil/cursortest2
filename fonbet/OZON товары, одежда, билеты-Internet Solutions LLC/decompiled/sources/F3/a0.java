package F3;

import android.util.SparseArray;

/* loaded from: classes.dex */
final class a0<V> {

    /* renamed from: c, reason: collision with root package name */
    private final S f8623c;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<V> f8622b = new SparseArray<>();

    /* renamed from: a, reason: collision with root package name */
    private int f8621a = -1;

    public a0(S s11) {
        this.f8623c = s11;
    }

    public final void a(int i11, V v11) {
        int i12 = this.f8621a;
        SparseArray<V> sparseArray = this.f8622b;
        if (i12 == -1) {
            G10.a.h(sparseArray.size() == 0);
            this.f8621a = 0;
        }
        if (sparseArray.size() > 0) {
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            G10.a.c(i11 >= keyAt);
            if (keyAt == i11) {
                this.f8623c.accept(sparseArray.valueAt(sparseArray.size() - 1));
            }
        }
        sparseArray.append(i11, v11);
    }

    public final void b() {
        int i11 = 0;
        while (true) {
            SparseArray<V> sparseArray = this.f8622b;
            if (i11 >= sparseArray.size()) {
                this.f8621a = -1;
                sparseArray.clear();
                return;
            } else {
                this.f8623c.accept(sparseArray.valueAt(i11));
                i11++;
            }
        }
    }

    public final void c(int i11) {
        SparseArray<V> sparseArray = this.f8622b;
        for (int size = sparseArray.size() - 1; size >= 0 && i11 < sparseArray.keyAt(size); size--) {
            this.f8623c.accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        this.f8621a = sparseArray.size() > 0 ? Math.min(this.f8621a, sparseArray.size() - 1) : -1;
    }

    public final void d(int i11) {
        int i12 = 0;
        while (true) {
            SparseArray<V> sparseArray = this.f8622b;
            if (i12 >= sparseArray.size() - 1) {
                return;
            }
            int i13 = i12 + 1;
            if (i11 < sparseArray.keyAt(i13)) {
                return;
            }
            this.f8623c.accept(sparseArray.valueAt(i12));
            sparseArray.removeAt(i12);
            int i14 = this.f8621a;
            if (i14 > 0) {
                this.f8621a = i14 - 1;
            }
            i12 = i13;
        }
    }

    public final V e(int i11) {
        SparseArray<V> sparseArray;
        if (this.f8621a == -1) {
            this.f8621a = 0;
        }
        while (true) {
            int i12 = this.f8621a;
            sparseArray = this.f8622b;
            if (i12 <= 0 || i11 >= sparseArray.keyAt(i12)) {
                break;
            }
            this.f8621a--;
        }
        while (this.f8621a < sparseArray.size() - 1 && i11 >= sparseArray.keyAt(this.f8621a + 1)) {
            this.f8621a++;
        }
        return sparseArray.valueAt(this.f8621a);
    }

    public final V f() {
        return this.f8622b.valueAt(r0.size() - 1);
    }

    public final boolean g() {
        return this.f8622b.size() == 0;
    }
}
