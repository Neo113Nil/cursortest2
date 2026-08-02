package androidx.compose.foundation.lazy.layout;

import D1.AbstractC2794c0;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;
import x0.InterfaceC10585N;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;", "LD1/c0;", "Landroidx/compose/foundation/lazy/layout/q;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class LazyLayoutSemanticsModifier extends AbstractC2794c0<q> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.n f39600a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC10585N f39601b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final EnumC9142v f39602c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f39603d;

    public LazyLayoutSemanticsModifier(@NotNull kotlin.reflect.n nVar, @NotNull InterfaceC10585N interfaceC10585N, @NotNull EnumC9142v enumC9142v, boolean z11) {
        this.f39600a = nVar;
        this.f39601b = interfaceC10585N;
        this.f39602c = enumC9142v;
        this.f39603d = z11;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final q getF41119a() {
        return new q(this.f39600a, this.f39601b, this.f39602c, this.f39603d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.f39600a == lazyLayoutSemanticsModifier.f39600a && Intrinsics.d(this.f39601b, lazyLayoutSemanticsModifier.f39601b) && this.f39602c == lazyLayoutSemanticsModifier.f39602c && this.f39603d == lazyLayoutSemanticsModifier.f39603d;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + C3532b.a((this.f39602c.hashCode() + ((this.f39601b.hashCode() + (this.f39600a.hashCode() * 31)) * 31)) * 31, 31, this.f39603d);
    }

    @Override // D1.AbstractC2794c0
    public final void update(q qVar) {
        qVar.K1(this.f39600a, this.f39601b, this.f39602c, this.f39603d);
    }
}
