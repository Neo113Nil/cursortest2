package f2;

import r0.AbstractC2346c;

/* loaded from: classes.dex */
public final class o extends AbstractC2346c {
    public final Throwable i;

    public o(Throwable th) {
        this.i = th;
    }

    public final String toString() {
        return L1.a.n("FAILURE (", this.i.getMessage(), ")");
    }
}
