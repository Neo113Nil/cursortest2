package E3;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class U extends K implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final K f2027a;

    public U(K k7) {
        this.f2027a = k7;
    }

    @Override // E3.K
    public final K a() {
        return this.f2027a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f2027a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof U) {
            return this.f2027a.equals(((U) obj).f2027a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f2027a.hashCode();
    }

    public final String toString() {
        return this.f2027a + ".reverse()";
    }
}
