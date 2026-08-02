package l4;

import G4.l;
import java.util.Iterator;

/* renamed from: l4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2060b implements Iterable, j4.a {

    /* renamed from: k, reason: collision with root package name */
    public final int f17851k;

    /* renamed from: l, reason: collision with root package name */
    public final int f17852l;

    /* renamed from: m, reason: collision with root package name */
    public final int f17853m;

    public C2060b(int i, int i5, int i6) {
        if (i6 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i6 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f17851k = i;
        this.f17852l = l.A(i, i5, i6);
        this.f17853m = i6;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2060b)) {
            return false;
        }
        if (isEmpty() && ((C2060b) obj).isEmpty()) {
            return true;
        }
        C2060b c2060b = (C2060b) obj;
        return this.f17851k == c2060b.f17851k && this.f17852l == c2060b.f17852l && this.f17853m == c2060b.f17853m;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f17851k * 31) + this.f17852l) * 31) + this.f17853m;
    }

    public boolean isEmpty() {
        int i = this.f17853m;
        int i5 = this.f17852l;
        int i6 = this.f17851k;
        return i > 0 ? i6 > i5 : i6 < i5;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2061c(this.f17851k, this.f17852l, this.f17853m);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f17852l;
        int i5 = this.f17851k;
        int i6 = this.f17853m;
        if (i6 > 0) {
            sb = new StringBuilder();
            sb.append(i5);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i6);
        } else {
            sb = new StringBuilder();
            sb.append(i5);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i6);
        }
        return sb.toString();
    }
}
