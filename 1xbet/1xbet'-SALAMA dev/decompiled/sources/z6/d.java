package z6;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class d implements Iterable, u6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18542c;

    public d(int i7, int i8, int i9) {
        if (i9 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i9 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f18540a = i7;
        this.f18541b = p113p3.f.N(i7, i8, i9);
        this.f18542c = i9;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            if (!isEmpty() || !((d) obj).isEmpty()) {
                d dVar = (d) obj;
                if (this.f18540a != dVar.f18540a || this.f18541b != dVar.f18541b || this.f18542c != dVar.f18542c) {
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
        return (((this.f18540a * 31) + this.f18541b) * 31) + this.f18542c;
    }

    public boolean isEmpty() {
        int i7 = this.f18542c;
        int i8 = this.f18541b;
        int i9 = this.f18540a;
        if (i7 > 0) {
            if (i9 <= i8) {
                return false;
            }
        } else if (i9 >= i8) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new e(this.f18540a, this.f18541b, this.f18542c);
    }

    public String toString() {
        StringBuilder sb;
        int i7 = this.f18541b;
        int i8 = this.f18540a;
        int i9 = this.f18542c;
        if (i9 > 0) {
            sb = new StringBuilder();
            sb.append(i8);
            sb.append("..");
            sb.append(i7);
            sb.append(" step ");
            sb.append(i9);
        } else {
            sb = new StringBuilder();
            sb.append(i8);
            sb.append(" downTo ");
            sb.append(i7);
            sb.append(" step ");
            sb.append(-i9);
        }
        return sb.toString();
    }
}
