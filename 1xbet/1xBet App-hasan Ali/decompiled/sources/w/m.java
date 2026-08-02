package w;

import P.AbstractC0329z;
import P.C0305m0;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final C0305m0 f20478a = AbstractC0329z.t(j.f20476a);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            return kotlin.jvm.internal.l.a((l) ((m) obj).f20478a.getValue(), (l) this.f20478a.getValue());
        }
        return false;
    }

    public final int hashCode() {
        return ((l) this.f20478a.getValue()).hashCode();
    }

    public final String toString() {
        return "ContextMenuState(status=" + ((l) this.f20478a.getValue()) + ')';
    }
}
