package p4;

import B4.V;
import w1.C1722m0;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final C1722m0 f15694b = new C1722m0(21);

    /* renamed from: c, reason: collision with root package name */
    public static final V f15695c = new V(22);

    /* renamed from: d, reason: collision with root package name */
    public static final q4.c f15696d = new q4.c(Boolean.TRUE);

    /* renamed from: e, reason: collision with root package name */
    public static final q4.c f15697e = new q4.c(Boolean.FALSE);

    /* renamed from: a, reason: collision with root package name */
    public final q4.c f15698a;

    public b() {
        this.f15698a = q4.c.f15854d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f15698a.equals(((b) obj).f15698a);
    }

    public final int hashCode() {
        return this.f15698a.hashCode();
    }

    public final String toString() {
        return "{PruneForest:" + this.f15698a.toString() + "}";
    }

    public b(q4.c cVar) {
        this.f15698a = cVar;
    }
}
