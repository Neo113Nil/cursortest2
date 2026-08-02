package androidx.compose.foundation.layout;

import b0.o;
import u.AbstractC2462i;
import z.C2677A;
import z0.Z;

/* loaded from: classes.dex */
final class IntrinsicWidthElement extends Z {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null) != null;
    }

    public final int hashCode() {
        return (AbstractC2462i.b(2) * 31) + 1231;
    }

    @Override // z0.Z
    public final o i() {
        C2677A c2677a = new C2677A();
        c2677a.f21462y = 2;
        c2677a.f21463z = true;
        return c2677a;
    }

    @Override // z0.Z
    public final void k(o oVar) {
        C2677A c2677a = (C2677A) oVar;
        c2677a.f21462y = 2;
        c2677a.f21463z = true;
    }
}
