package androidx.compose.foundation;

import b0.o;
import kotlin.jvm.internal.l;
import v.v0;
import v.x0;
import z0.Z;

/* loaded from: classes.dex */
public final class ScrollingLayoutElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final v0 f6823k;

    public ScrollingLayoutElement(v0 v0Var) {
        this.f6823k = v0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ScrollingLayoutElement) {
            return l.a(this.f6823k, ((ScrollingLayoutElement) obj).f6823k);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f6823k.hashCode() * 31) + 1237) * 31) + 1231;
    }

    @Override // z0.Z
    public final o i() {
        x0 x0Var = new x0();
        x0Var.f20329y = this.f6823k;
        x0Var.f20330z = true;
        return x0Var;
    }

    @Override // z0.Z
    public final void k(o oVar) {
        x0 x0Var = (x0) oVar;
        x0Var.f20329y = this.f6823k;
        x0Var.f20330z = true;
    }
}
