package f4;

/* renamed from: f4.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0438o implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f5682a;

    public /* synthetic */ C0438o(int i2) {
        this.f5682a = i2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return kotlin.jvm.internal.i.g(this.f5682a ^ Integer.MIN_VALUE, ((C0438o) obj).f5682a ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0438o) {
            return this.f5682a == ((C0438o) obj).f5682a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5682a);
    }

    public final String toString() {
        return String.valueOf(this.f5682a & 4294967295L);
    }
}
