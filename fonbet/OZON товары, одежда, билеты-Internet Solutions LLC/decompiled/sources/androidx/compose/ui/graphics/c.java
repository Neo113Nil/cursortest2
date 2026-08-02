package androidx.compose.ui.graphics;

import B1.U;
import B1.W;
import B1.Y;
import B1.m0;
import D1.AbstractC2810k0;
import D1.C2809k;
import D1.E;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.InterfaceC7825i0;
import l1.J0;
import l1.N0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class c extends e.c implements E {

    /* renamed from: a, reason: collision with root package name */
    private float f40432a;

    /* renamed from: b, reason: collision with root package name */
    private float f40433b;

    /* renamed from: c, reason: collision with root package name */
    private float f40434c;

    /* renamed from: d, reason: collision with root package name */
    private float f40435d;

    /* renamed from: e, reason: collision with root package name */
    private float f40436e;

    /* renamed from: f, reason: collision with root package name */
    private float f40437f;

    /* renamed from: g, reason: collision with root package name */
    private float f40438g;

    /* renamed from: h, reason: collision with root package name */
    private long f40439h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private J0 f40440i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f40441j;

    /* renamed from: k, reason: collision with root package name */
    private long f40442k;

    /* renamed from: l, reason: collision with root package name */
    private long f40443l;

    /* renamed from: m, reason: collision with root package name */
    private int f40444m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private Function1<? super InterfaceC7825i0, Unit> f40445n = new b(this);

    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f40446b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f40447c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m0 m0Var, c cVar) {
            super(1);
            this.f40446b = m0Var;
            this.f40447c = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            m0.a.o(aVar, this.f40446b, 0, 0, this.f40447c.f40445n, 4);
            return Unit.f71690a;
        }
    }

    public c(float f7, float f11, float f12, float f13, float f14, float f15, float f16, long j11, J0 j02, boolean z11, long j12, long j13, int i11) {
        this.f40432a = f7;
        this.f40433b = f11;
        this.f40434c = f12;
        this.f40435d = f13;
        this.f40436e = f14;
        this.f40437f = f15;
        this.f40438g = f16;
        this.f40439h = j11;
        this.f40440i = j02;
        this.f40441j = z11;
        this.f40442k = j12;
        this.f40443l = j13;
        this.f40444m = i11;
    }

    @Override // D1.E
    @NotNull
    public final W D(@NotNull Y y11, @NotNull U u11, long j11) {
        W z02;
        m0 a02 = u11.a0(j11);
        z02 = y11.z0(a02.u0(), a02.l0(), kotlin.collections.U.c(), new a(a02, this));
        return z02;
    }

    public final void H(long j11) {
        this.f40442k = j11;
    }

    public final void J(long j11) {
        this.f40443l = j11;
    }

    public final long J1() {
        return this.f40442k;
    }

    public final float K1() {
        return this.f40438g;
    }

    public final boolean L1() {
        return this.f40441j;
    }

    public final int M1() {
        return this.f40444m;
    }

    public final float N1() {
        return this.f40437f;
    }

    public final float O1() {
        return this.f40432a;
    }

    public final float P1() {
        return this.f40433b;
    }

    public final float Q1() {
        return this.f40436e;
    }

    public final long R1() {
        return this.f40443l;
    }

    public final long S1() {
        return this.f40439h;
    }

    public final float T1() {
        return this.f40435d;
    }

    public final void U1() {
        AbstractC2810k0 f22 = C2809k.d(this, 2).f2();
        if (f22 != null) {
            f22.M2(this.f40445n, true);
        }
    }

    public final void c(float f7) {
        this.f40435d = f7;
    }

    public final void d(float f7) {
        this.f40438g = f7;
    }

    public final void g0(long j11) {
        this.f40439h = j11;
    }

    public final float getAlpha() {
        return this.f40434c;
    }

    @NotNull
    public final J0 getShape() {
        return this.f40440i;
    }

    @Override // androidx.compose.ui.e.c
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    public final void h(float f7) {
        this.f40437f = f7;
    }

    public final void j(float f7) {
        this.f40432a = f7;
    }

    public final void k(float f7) {
        this.f40433b = f7;
    }

    public final void q(int i11) {
        this.f40444m = i11;
    }

    public final void setAlpha(float f7) {
        this.f40434c = f7;
    }

    public final void setShape(@NotNull J0 j02) {
        this.f40440i = j02;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb2.append(this.f40432a);
        sb2.append(", scaleY=");
        sb2.append(this.f40433b);
        sb2.append(", alpha = ");
        sb2.append(this.f40434c);
        sb2.append(", translationX=0.0, translationY=");
        sb2.append(this.f40435d);
        sb2.append(", shadowElevation=");
        sb2.append(this.f40436e);
        sb2.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb2.append(this.f40437f);
        sb2.append(", cameraDistance=");
        sb2.append(this.f40438g);
        sb2.append(", transformOrigin=");
        sb2.append((Object) N0.f(this.f40439h));
        sb2.append(", shape=");
        sb2.append(this.f40440i);
        sb2.append(", clip=");
        sb2.append(this.f40441j);
        sb2.append(", renderEffect=null, ambientShadowColor=");
        Bi.a.e(this.f40442k, ", spotShadowColor=", sb2);
        Bi.a.e(this.f40443l, ", compositingStrategy=", sb2);
        sb2.append((Object) ("CompositingStrategy(value=" + this.f40444m + ')'));
        sb2.append(')');
        return sb2.toString();
    }

    public final void x(boolean z11) {
        this.f40441j = z11;
    }

    public final void z(float f7) {
        this.f40436e = f7;
    }
}
