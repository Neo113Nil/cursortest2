package X0;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: d, reason: collision with root package name */
    public static final c f516d = new c(1, 0, 1);

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f509a == cVar.f509a) {
                    if (this.f510b == cVar.f510b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f509a * 31) + this.f510b;
    }

    public final boolean isEmpty() {
        return this.f509a > this.f510b;
    }

    public final String toString() {
        return this.f509a + ".." + this.f510b;
    }
}
