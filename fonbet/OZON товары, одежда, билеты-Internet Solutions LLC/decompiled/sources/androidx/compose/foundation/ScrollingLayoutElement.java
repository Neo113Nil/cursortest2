package androidx.compose.foundation;

import D1.AbstractC2794c0;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n0.d0;
import n0.g0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ScrollingLayoutElement;", "LD1/c0;", "Ln0/g0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScrollingLayoutElement extends AbstractC2794c0<g0> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d0 f38877a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f38878b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f38879c;

    public ScrollingLayoutElement(@NotNull d0 d0Var, boolean z11, boolean z12) {
        this.f38877a = d0Var;
        this.f38878b = z11;
        this.f38879c = z12;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final g0 getF41119a() {
        return new g0(this.f38877a, this.f38878b, this.f38879c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return Intrinsics.d(this.f38877a, scrollingLayoutElement.f38877a) && this.f38878b == scrollingLayoutElement.f38878b && this.f38879c == scrollingLayoutElement.f38879c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f38879c) + C3532b.a(this.f38877a.hashCode() * 31, 31, this.f38878b);
    }

    @Override // D1.AbstractC2794c0
    public final void update(g0 g0Var) {
        g0 g0Var2 = g0Var;
        g0Var2.M1(this.f38877a);
        g0Var2.L1(this.f38878b);
        g0Var2.N1(this.f38879c);
    }
}
