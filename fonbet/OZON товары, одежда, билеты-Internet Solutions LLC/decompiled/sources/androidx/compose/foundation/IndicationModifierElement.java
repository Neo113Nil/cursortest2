package androidx.compose.foundation;

import D1.AbstractC2794c0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n0.InterfaceC8369J;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/IndicationModifierElement;", "LD1/c0;", "Landroidx/compose/foundation/w;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class IndicationModifierElement extends AbstractC2794c0<w> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final t0.q f38862a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC8369J f38863b;

    public IndicationModifierElement(@NotNull t0.q qVar, @NotNull InterfaceC8369J interfaceC8369J) {
        this.f38862a = qVar;
        this.f38863b = interfaceC8369J;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final w getF41119a() {
        return new w(this.f38863b.b(this.f38862a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return Intrinsics.d(this.f38862a, indicationModifierElement.f38862a) && Intrinsics.d(this.f38863b, indicationModifierElement.f38863b);
    }

    public final int hashCode() {
        return this.f38863b.hashCode() + (this.f38862a.hashCode() * 31);
    }

    @Override // D1.AbstractC2794c0
    public final void update(w wVar) {
        wVar.N1(this.f38863b.b(this.f38862a));
    }
}
