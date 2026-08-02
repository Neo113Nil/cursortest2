package Ve;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Pq implements Sr {

    /* renamed from: a, reason: collision with root package name */
    public final int f29740a;

    /* renamed from: b, reason: collision with root package name */
    public final List f29741b;

    public Pq(int i11, List args) {
        Intrinsics.checkNotNullParameter(args, "args");
        this.f29740a = i11;
        this.f29741b = args;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pq)) {
            return false;
        }
        Pq pq = (Pq) obj;
        return this.f29740a == pq.f29740a && Intrinsics.d(this.f29741b, pq.f29741b);
    }

    public final int hashCode() {
        return this.f29741b.hashCode() + (Integer.hashCode(this.f29740a) * 31);
    }

    public final String toString() {
        return "Resource(resId=" + this.f29740a + ", args=" + this.f29741b + ")";
    }
}
