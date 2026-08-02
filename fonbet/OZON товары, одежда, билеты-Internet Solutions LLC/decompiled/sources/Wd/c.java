package Wd;

import java.util.Collection;
import java.util.List;
import je.L0;
import je.N;
import je.y0;
import ke.o;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qd.m;
import td.InterfaceC9842h;
import td.i0;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final y0 f33510a;

    /* renamed from: b, reason: collision with root package name */
    private o f33511b;

    public c(@NotNull y0 projection) {
        Intrinsics.checkNotNullParameter(projection, "projection");
        this.f33510a = projection;
        projection.b();
        L0 l02 = L0.INVARIANT;
    }

    public final o b() {
        return this.f33511b;
    }

    public final void c(o oVar) {
        this.f33511b = oVar;
    }

    @Override // je.s0
    @NotNull
    public final List<i0> getParameters() {
        return K.f71697a;
    }

    @Override // Wd.b
    @NotNull
    public final y0 getProjection() {
        return this.f33510a;
    }

    @Override // je.s0
    @NotNull
    public final m n() {
        m n11 = this.f33510a.getType().H0().n();
        Intrinsics.checkNotNullExpressionValue(n11, "getBuiltIns(...)");
        return n11;
    }

    @Override // je.s0
    @NotNull
    public final Collection<N> o() {
        y0 y0Var = this.f33510a;
        N type = y0Var.b() == L0.OUT_VARIANCE ? y0Var.getType() : n().C();
        Intrinsics.f(type);
        return C7714v.a0(type);
    }

    @Override // je.s0
    public final /* bridge */ /* synthetic */ InterfaceC9842h p() {
        return null;
    }

    @Override // je.s0
    public final boolean q() {
        return false;
    }

    @NotNull
    public final String toString() {
        return "CapturedTypeConstructor(" + this.f33510a + ')';
    }
}
