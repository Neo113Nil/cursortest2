package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class be0 implements Iterable, sg0 {

    /* JADX INFO: renamed from: j */
    public final int f839j;

    /* JADX INFO: renamed from: k */
    public final int f840k;

    /* JADX INFO: renamed from: l */
    public final int f841l;

    static {
        new be0(1, 0, 1);
    }

    public be0(int i, int i2, int i3) {
        if (i3 == 0) {
            C0270h1.m2190f("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            C0270h1.m2190f("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.f839j = i;
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                int i5 = i % i3;
                int i6 = ((i4 < 0 ? i4 + i3 : i4) - (i5 < 0 ? i5 + i3 : i5)) % i3;
                i2 -= i6 < 0 ? i6 + i3 : i6;
            }
        } else {
            if (i3 >= 0) {
                C0270h1.m2190f("Step is zero.");
                throw null;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                int i9 = i2 % i7;
                int i10 = ((i8 < 0 ? i8 + i7 : i8) - (i9 < 0 ? i9 + i7 : i9)) % i7;
                i2 += i10 < 0 ? i10 + i7 : i10;
            }
        }
        this.f840k = i2;
        this.f841l = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof be0)) {
            return false;
        }
        if (isEmpty() && ((be0) obj).isEmpty()) {
            return true;
        }
        be0 be0Var = (be0) obj;
        return this.f839j == be0Var.f839j && this.f840k == be0Var.f840k;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f839j * 31) + this.f840k;
    }

    public final boolean isEmpty() {
        return this.f839j > this.f840k;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ae0(this.f839j, this.f840k, this.f841l);
    }

    public final String toString() {
        return this.f839j + ".." + this.f840k;
    }
}
