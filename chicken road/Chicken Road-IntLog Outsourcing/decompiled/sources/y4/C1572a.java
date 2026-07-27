package y4;

import B0.f;
import java.util.Iterator;
import u4.InterfaceC1481a;

/* renamed from: y4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1572a implements Iterable, InterfaceC1481a {

    /* renamed from: a, reason: collision with root package name */
    public final int f12439a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12440b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12441c;

    public C1572a(int i2, int i3, int i6) {
        if (i6 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i6 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f12439a = i2;
        this.f12440b = f.w(i2, i3, i6);
        this.f12441c = i6;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1572a) {
            if (!isEmpty() || !((C1572a) obj).isEmpty()) {
                C1572a c1572a = (C1572a) obj;
                if (this.f12439a != c1572a.f12439a || this.f12440b != c1572a.f12440b || this.f12441c != c1572a.f12441c) {
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
        return (((this.f12439a * 31) + this.f12440b) * 31) + this.f12441c;
    }

    public boolean isEmpty() {
        int i2 = this.f12441c;
        int i3 = this.f12440b;
        int i6 = this.f12439a;
        if (i2 > 0) {
            if (i6 <= i3) {
                return false;
            }
        } else if (i6 >= i3) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1573b(this.f12439a, this.f12440b, this.f12441c);
    }

    public String toString() {
        StringBuilder sb;
        int i2 = this.f12440b;
        int i3 = this.f12439a;
        int i6 = this.f12441c;
        if (i6 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i2);
            sb.append(" step ");
            sb.append(i6);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i2);
            sb.append(" step ");
            sb.append(-i6);
        }
        return sb.toString();
    }
}
