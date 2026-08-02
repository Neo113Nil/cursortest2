package E2;

import X3.w;
import java.util.Map;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final p f1483b = new p(w.f6091k);

    /* renamed from: a, reason: collision with root package name */
    public final Map f1484a;

    public p(Map map) {
        this.f1484a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return kotlin.jvm.internal.l.a(this.f1484a, ((p) obj).f1484a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1484a.hashCode();
    }

    public final String toString() {
        return "Tags(tags=" + this.f1484a + ')';
    }
}
