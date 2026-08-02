package androidx.compose.foundation.lazy.layout;

import B.A;
import B.O;
import b0.o;
import kotlin.jvm.internal.l;
import z0.Z;

/* loaded from: classes.dex */
final class TraversablePrefetchStateModifierElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final A f6877k;

    public TraversablePrefetchStateModifierElement(A a5) {
        this.f6877k = a5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && l.a(this.f6877k, ((TraversablePrefetchStateModifierElement) obj).f6877k);
    }

    public final int hashCode() {
        return this.f6877k.hashCode();
    }

    @Override // z0.Z
    public final o i() {
        O o5 = new O();
        o5.f657y = this.f6877k;
        return o5;
    }

    @Override // z0.Z
    public final void k(o oVar) {
        ((O) oVar).f657y = this.f6877k;
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f6877k + ')';
    }
}
