package androidx.compose.ui;

import B1.U;
import B1.W;
import B1.Y;
import B1.m0;
import D1.E;
import F3.G;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class f extends e.c implements E {

    /* renamed from: a, reason: collision with root package name */
    private float f40360a;

    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f40361b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f40362c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m0 m0Var, f fVar) {
            super(1);
            this.f40361b = m0Var;
            this.f40362c = fVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            aVar.d(this.f40361b, 0, 0, this.f40362c.I1());
            return Unit.f71690a;
        }
    }

    public f(float f7) {
        this.f40360a = f7;
    }

    @Override // D1.E
    @NotNull
    public final W D(@NotNull Y y11, @NotNull U u11, long j11) {
        W z02;
        m0 a02 = u11.a0(j11);
        z02 = y11.z0(a02.u0(), a02.l0(), kotlin.collections.U.c(), new a(a02, this));
        return z02;
    }

    public final float I1() {
        return this.f40360a;
    }

    public final void J1(float f7) {
        this.f40360a = f7;
    }

    @NotNull
    public final String toString() {
        return G.a(new StringBuilder("ZIndexModifier(zIndex="), this.f40360a, ')');
    }
}
