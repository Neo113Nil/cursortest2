package androidx.compose.foundation.lazy.layout;

import D1.AbstractC2794c0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/TraversablePrefetchStateModifierElement;", "LD1/c0;", "Landroidx/compose/foundation/lazy/layout/v;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class TraversablePrefetchStateModifierElement extends AbstractC2794c0<v> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final o f39604a;

    public TraversablePrefetchStateModifierElement(@NotNull o oVar) {
        this.f39604a = oVar;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final v getF41119a() {
        return new v(this.f39604a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && Intrinsics.d(this.f39604a, ((TraversablePrefetchStateModifierElement) obj).f39604a);
    }

    public final int hashCode() {
        return this.f39604a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f39604a + ')';
    }

    @Override // D1.AbstractC2794c0
    public final void update(v vVar) {
        vVar.J1(this.f39604a);
    }
}
