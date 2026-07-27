package y4;

/* renamed from: y4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1574c extends C1572a {

    /* renamed from: d, reason: collision with root package name */
    public static final C1574c f12446d = new C1574c(1, 0, 1);

    @Override // y4.C1572a
    public final boolean equals(Object obj) {
        if (obj instanceof C1574c) {
            if (!isEmpty() || !((C1574c) obj).isEmpty()) {
                C1574c c1574c = (C1574c) obj;
                if (this.f12439a == c1574c.f12439a) {
                    if (this.f12440b == c1574c.f12440b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // y4.C1572a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f12439a * 31) + this.f12440b;
    }

    @Override // y4.C1572a
    public final boolean isEmpty() {
        return this.f12439a > this.f12440b;
    }

    @Override // y4.C1572a
    public final String toString() {
        return this.f12439a + ".." + this.f12440b;
    }
}
