package androidx.compose.ui.graphics;

import b0.o;
import i0.C2007l;
import i4.c;
import z0.AbstractC2749f;
import z0.Z;
import z0.e0;

/* loaded from: classes.dex */
final class BlockGraphicsLayerElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final c f6918k;

    public BlockGraphicsLayerElement(c cVar) {
        this.f6918k = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BlockGraphicsLayerElement) {
            return this.f6918k == ((BlockGraphicsLayerElement) obj).f6918k;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6918k.hashCode();
    }

    @Override // z0.Z
    public final o i() {
        return new C2007l(this.f6918k);
    }

    @Override // z0.Z
    public final void k(o oVar) {
        C2007l c2007l = (C2007l) oVar;
        c2007l.f17286y = this.f6918k;
        e0 e0Var = AbstractC2749f.t(c2007l, 2).f21813z;
        if (e0Var != null) {
            e0Var.h1(c2007l.f17286y, true);
        }
    }
}
