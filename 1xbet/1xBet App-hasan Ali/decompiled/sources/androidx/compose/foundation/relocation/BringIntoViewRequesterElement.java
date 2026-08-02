package androidx.compose.foundation.relocation;

import C.c;
import C.d;
import b0.o;
import kotlin.jvm.internal.l;
import z0.Z;

/* loaded from: classes.dex */
final class BringIntoViewRequesterElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final c f6889k;

    public BringIntoViewRequesterElement(c cVar) {
        this.f6889k = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BringIntoViewRequesterElement) {
            return l.a(this.f6889k, ((BringIntoViewRequesterElement) obj).f6889k);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6889k.hashCode();
    }

    @Override // z0.Z
    public final o i() {
        d dVar = new d();
        dVar.f781y = this.f6889k;
        return dVar;
    }

    @Override // z0.Z
    public final void k(o oVar) {
        d dVar = (d) oVar;
        c cVar = dVar.f781y;
        if (cVar != null) {
            cVar.f780a.k(dVar);
        }
        c cVar2 = this.f6889k;
        if (cVar2 != null) {
            cVar2.f780a.c(dVar);
        }
        dVar.f781y = cVar2;
    }
}
