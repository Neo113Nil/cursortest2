package B4;

import A1.C0042s;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public Executor f1118a;

    /* renamed from: b, reason: collision with root package name */
    public C0042s f1119b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || P.class != obj.getClass()) {
            return false;
        }
        return this.f1119b.equals(((P) obj).f1119b);
    }

    public final int hashCode() {
        return this.f1119b.hashCode();
    }
}
