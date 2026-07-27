package s2;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: d, reason: collision with root package name */
    public static final c f10350d = new c(1, 0, 1);

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        if (this.f10343a == cVar.f10343a) {
            return this.f10344b == cVar.f10344b;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f10343a * 31) + this.f10344b;
    }

    public final boolean isEmpty() {
        return this.f10343a > this.f10344b;
    }

    public final String toString() {
        return this.f10343a + ".." + this.f10344b;
    }
}
