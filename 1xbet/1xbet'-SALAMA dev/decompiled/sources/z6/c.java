package z6;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends a {
    static {
        new c((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            char c3 = this.f18533a;
            char c4 = this.f18534b;
            if (t6.h.f(c3, c4) > 0) {
                c cVar = (c) obj;
                if (t6.h.f(cVar.f18533a, cVar.f18534b) <= 0) {
                }
                return true;
            }
            c cVar2 = (c) obj;
            if (c3 == cVar2.f18533a && c4 == cVar2.f18534b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        char c3 = this.f18533a;
        char c4 = this.f18534b;
        if (t6.h.f(c3, c4) > 0) {
            return -1;
        }
        return (c3 * 31) + c4;
    }

    public final String toString() {
        return this.f18533a + ".." + this.f18534b;
    }
}
