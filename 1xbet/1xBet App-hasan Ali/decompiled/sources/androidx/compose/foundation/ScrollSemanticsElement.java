package androidx.compose.foundation;

import b0.o;
import kotlin.jvm.internal.l;
import v.s0;
import v.v0;
import z0.Z;

/* loaded from: classes.dex */
final class ScrollSemanticsElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final v0 f6822k;

    public ScrollSemanticsElement(v0 v0Var) {
        this.f6822k = v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ScrollSemanticsElement) {
            return l.a(this.f6822k, ((ScrollSemanticsElement) obj).f6822k);
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f6822k.hashCode() * 31) + 1237) * 961) + 1231) * 31) + 1231;
    }

    @Override // z0.Z
    public final o i() {
        s0 s0Var = new s0();
        s0Var.f20302y = this.f6822k;
        s0Var.f20303z = true;
        return s0Var;
    }

    @Override // z0.Z
    public final void k(o oVar) {
        s0 s0Var = (s0) oVar;
        s0Var.f20302y = this.f6822k;
        s0Var.f20303z = true;
    }

    public final String toString() {
        return "ScrollSemanticsElement(state=" + this.f6822k + ", reverseScrolling=false, flingBehavior=null, isScrollable=true, isVertical=true)";
    }
}
