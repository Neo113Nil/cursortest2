package androidx.compose.foundation.layout;

import b0.h;
import b0.o;
import z.C2707i;
import z0.Z;

/* loaded from: classes.dex */
final class BoxChildDataElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final h f6844k;

    public BoxChildDataElement(h hVar) {
        this.f6844k = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        return boxChildDataElement != null && this.f6844k.equals(boxChildDataElement.f6844k);
    }

    public final int hashCode() {
        return (this.f6844k.hashCode() * 31) + 1237;
    }

    @Override // z0.Z
    public final o i() {
        C2707i c2707i = new C2707i();
        c2707i.f21539y = this.f6844k;
        return c2707i;
    }

    @Override // z0.Z
    public final void k(o oVar) {
        ((C2707i) oVar).f21539y = this.f6844k;
    }
}
