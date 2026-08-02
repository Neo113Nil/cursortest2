package I1;

import r3.AbstractC2349a;

/* loaded from: classes.dex */
public final class i extends AbstractC2349a {

    /* renamed from: n, reason: collision with root package name */
    public final b f2590n;

    public i(b bVar) {
        kotlin.jvm.internal.l.f("latestEvent", bVar);
        this.f2590n = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && i.class == obj.getClass() && kotlin.jvm.internal.l.a(this.f2590n, ((i) obj).f2590n);
    }

    public final int hashCode() {
        return this.f2590n.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.f2590n + ", direction=-1)";
    }
}
