package z6;

/* loaded from: classes2.dex */
public final class c extends a {
    static {
        new c((char) 1, (char) 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (t6.h.f(r2.f18527a, r2.f18528b) > 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            char c3 = this.f18527a;
            char c4 = this.f18528b;
            if (t6.h.f(c3, c4) > 0) {
                c cVar = (c) obj;
            }
            c cVar2 = (c) obj;
            if (c3 == cVar2.f18527a && c4 == cVar2.f18528b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        char c3 = this.f18527a;
        char c4 = this.f18528b;
        if (t6.h.f(c3, c4) > 0) {
            return -1;
        }
        return (c3 * 31) + c4;
    }

    public final String toString() {
        return this.f18527a + ".." + this.f18528b;
    }
}
