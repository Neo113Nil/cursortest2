package v1;

/* renamed from: v1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1002c extends v1.C1000a {

    /* renamed from: d, reason: collision with root package name */
    public static final v1.C1002c f8394d = new v1.C1002c(1, 0, 1);

    @Override // v1.C1000a
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof v1.C1002c) {
            if (!isEmpty() || !((v1.C1002c) obj).isEmpty()) {
                v1.C1002c c1002c = (v1.C1002c) obj;
                if (this.f8387a == c1002c.f8387a) {
                    if (this.f8388b == c1002c.f8388b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // v1.C1000a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f8387a * 31) + this.f8388b;
    }

    @Override // v1.C1000a
    public final boolean isEmpty() {
        return this.f8387a > this.f8388b;
    }

    @Override // v1.C1000a
    public final java.lang.String toString() {
        return this.f8387a + ".." + this.f8388b;
    }
}
