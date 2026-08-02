package z6;

/* loaded from: classes2.dex */
public final class f extends d {

    /* renamed from: d, reason: collision with root package name */
    public static final f f18541d = new f(1, 0, 1);

    @Override // z6.d
    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (!isEmpty() || !((f) obj).isEmpty()) {
                f fVar = (f) obj;
                if (this.f18534a == fVar.f18534a) {
                    if (this.f18535b == fVar.f18535b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // z6.d
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f18534a * 31) + this.f18535b;
    }

    @Override // z6.d
    public final boolean isEmpty() {
        return this.f18534a > this.f18535b;
    }

    @Override // z6.d
    public final String toString() {
        return this.f18534a + ".." + this.f18535b;
    }
}
