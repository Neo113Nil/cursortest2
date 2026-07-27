package f4;

/* renamed from: f4.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0436m implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final byte f5680a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.i.g(this.f5680a & 255, ((C0436m) obj).f5680a & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0436m) {
            return this.f5680a == ((C0436m) obj).f5680a;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f5680a);
    }

    public final String toString() {
        return String.valueOf(this.f5680a & 255);
    }
}
