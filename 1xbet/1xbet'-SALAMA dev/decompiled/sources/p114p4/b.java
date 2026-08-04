package p114p4;

import B4.V;
import p120q4.c;
import p155w1.C1013m0;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1013m0 f15700b = new C1013m0(21);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final V f15701c = new V(22);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f15702d = new c(Boolean.TRUE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f15703e = new c(Boolean.FALSE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f15704a;

    public b() {
        this.f15704a = c.f15860d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f15704a.equals(((b) obj).f15704a);
    }

    public final int hashCode() {
        return this.f15704a.hashCode();
    }

    public final String toString() {
        return "{PruneForest:" + this.f15704a.toString() + "}";
    }

    public b(c cVar) {
        this.f15704a = cVar;
    }
}
