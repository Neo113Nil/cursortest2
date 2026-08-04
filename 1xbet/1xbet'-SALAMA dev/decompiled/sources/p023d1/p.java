package p023d1;

import W5.AbstractC0486a1;
import p003a.a;

/* JADX INFO: loaded from: classes.dex */
public final class p extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f12375e;

    public p(Throwable th) {
        this.f12375e = th;
    }

    public final String toString() {
        return AbstractC0486a1.h("FAILURE (", this.f12375e.getMessage(), ")");
    }
}
