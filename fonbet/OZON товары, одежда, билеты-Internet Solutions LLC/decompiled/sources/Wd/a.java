package Wd;

import ce.l;
import java.util.List;
import je.K0;
import je.N;
import je.Y;
import je.o0;
import je.s0;
import je.y0;
import ke.h;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import ne.InterfaceC8581c;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a extends Y implements InterfaceC8581c {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final y0 f33506b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final c f33507c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f33508d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final o0 f33509e;

    public a(@NotNull y0 typeProjection, @NotNull c constructor, boolean z11, @NotNull o0 attributes) {
        Intrinsics.checkNotNullParameter(typeProjection, "typeProjection");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f33506b = typeProjection;
        this.f33507c = constructor;
        this.f33508d = z11;
        this.f33509e = attributes;
    }

    @Override // je.N
    @NotNull
    public final List<y0> F0() {
        return K.f71697a;
    }

    @Override // je.N
    @NotNull
    public final o0 G0() {
        return this.f33509e;
    }

    @Override // je.N
    public final s0 H0() {
        return this.f33507c;
    }

    @Override // je.N
    public final boolean I0() {
        return this.f33508d;
    }

    @Override // je.N
    /* renamed from: J0 */
    public final N M0(h kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        y0 c11 = this.f33506b.c(kotlinTypeRefiner);
        Intrinsics.checkNotNullExpressionValue(c11, "refine(...)");
        return new a(c11, this.f33507c, this.f33508d, this.f33509e);
    }

    @Override // je.Y, je.K0
    public final K0 L0(boolean z11) {
        if (z11 == this.f33508d) {
            return this;
        }
        return new a(this.f33506b, this.f33507c, z11, this.f33509e);
    }

    @Override // je.K0
    public final K0 M0(h kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        y0 c11 = this.f33506b.c(kotlinTypeRefiner);
        Intrinsics.checkNotNullExpressionValue(c11, "refine(...)");
        return new a(c11, this.f33507c, this.f33508d, this.f33509e);
    }

    @Override // je.Y
    /* renamed from: O0 */
    public final Y L0(boolean z11) {
        if (z11 == this.f33508d) {
            return this;
        }
        return new a(this.f33506b, this.f33507c, z11, this.f33509e);
    }

    @Override // je.Y
    @NotNull
    /* renamed from: P0 */
    public final Y N0(@NotNull o0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new a(this.f33506b, this.f33507c, this.f33508d, newAttributes);
    }

    @Override // je.N
    @NotNull
    public final l p() {
        return le.l.a(le.h.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // je.Y
    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Captured(");
        sb2.append(this.f33506b);
        sb2.append(')');
        sb2.append(this.f33508d ? "?" : "");
        return sb2.toString();
    }
}
