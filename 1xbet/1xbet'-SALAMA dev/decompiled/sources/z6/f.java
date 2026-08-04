package z6;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f18547d = new f(1, 0, 1);

    @Override // z6.d
    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (!isEmpty() || !((f) obj).isEmpty()) {
                f fVar = (f) obj;
                if (this.f18540a == fVar.f18540a) {
                    if (this.f18541b == fVar.f18541b) {
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
        return (this.f18540a * 31) + this.f18541b;
    }

    @Override // z6.d
    public final boolean isEmpty() {
        return this.f18540a > this.f18541b;
    }

    @Override // z6.d
    public final String toString() {
        return this.f18540a + ".." + this.f18541b;
    }
}
