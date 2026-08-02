package androidx.compose.ui.draw;

import b0.o;
import f0.C1938b;
import i4.c;
import z0.Z;

/* loaded from: classes.dex */
final class DrawWithCacheElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final c f6906k;

    public DrawWithCacheElement(c cVar) {
        this.f6906k = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawWithCacheElement) {
            return this.f6906k == ((DrawWithCacheElement) obj).f6906k;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6906k.hashCode();
    }

    @Override // z0.Z
    public final o i() {
        return new C1938b(new f0.c(), this.f6906k);
    }

    @Override // z0.Z
    public final void k(o oVar) {
        C1938b c1938b = (C1938b) oVar;
        c1938b.f16920A = this.f6906k;
        c1938b.y0();
    }
}
