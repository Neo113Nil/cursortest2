package v1;

/* renamed from: v1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1000a implements java.lang.Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final int f8387a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8388b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8389c;

    public C1000a(int i2, int i3, int i4) {
        if (i4 == 0) {
            throw new java.lang.IllegalArgumentException("Step must be non-zero.");
        }
        if (i4 == Integer.MIN_VALUE) {
            throw new java.lang.IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f8387a = i2;
        this.f8388b = a.AbstractC0059a.r(i2, i3, i4);
        this.f8389c = i4;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof v1.C1000a) {
            if (!isEmpty() || !((v1.C1000a) obj).isEmpty()) {
                v1.C1000a c1000a = (v1.C1000a) obj;
                if (this.f8387a != c1000a.f8387a || this.f8388b != c1000a.f8388b || this.f8389c != c1000a.f8389c) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f8387a * 31) + this.f8388b) * 31) + this.f8389c;
    }

    public boolean isEmpty() {
        int i2 = this.f8389c;
        int i3 = this.f8388b;
        int i4 = this.f8387a;
        if (i2 > 0) {
            if (i4 <= i3) {
                return false;
            }
        } else if (i4 >= i3) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new v1.C1001b(this.f8387a, this.f8388b, this.f8389c);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb;
        int i2 = this.f8388b;
        int i3 = this.f8387a;
        int i4 = this.f8389c;
        if (i4 > 0) {
            sb = new java.lang.StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i2);
            sb.append(" step ");
            sb.append(i4);
        } else {
            sb = new java.lang.StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i2);
            sb.append(" step ");
            sb.append(-i4);
        }
        return sb.toString();
    }
}
