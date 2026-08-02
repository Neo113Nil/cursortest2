package i0;

import n.AbstractC2107A;
import x0.P;
import x0.Q;
import x0.Z;
import z0.AbstractC2739O;
import z0.InterfaceC2765w;
import z0.v0;

/* loaded from: classes.dex */
public final class L extends b0.o implements InterfaceC2765w, v0 {

    /* renamed from: A, reason: collision with root package name */
    public float f17251A;

    /* renamed from: B, reason: collision with root package name */
    public float f17252B;

    /* renamed from: C, reason: collision with root package name */
    public float f17253C;

    /* renamed from: D, reason: collision with root package name */
    public float f17254D;

    /* renamed from: E, reason: collision with root package name */
    public long f17255E;

    /* renamed from: F, reason: collision with root package name */
    public J f17256F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f17257G;

    /* renamed from: H, reason: collision with root package name */
    public long f17258H;

    /* renamed from: I, reason: collision with root package name */
    public long f17259I;
    public int J;
    public A.B K;

    /* renamed from: y, reason: collision with root package name */
    public float f17260y;

    /* renamed from: z, reason: collision with root package name */
    public float f17261z;

    @Override // z0.v0
    public final /* synthetic */ boolean X() {
        return false;
    }

    @Override // z0.v0
    public final /* synthetic */ boolean Z() {
        return false;
    }

    @Override // z0.InterfaceC2765w
    public final /* synthetic */ int a(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return AbstractC2107A.c(this, abstractC2739O, n5, i);
    }

    @Override // z0.InterfaceC2765w
    public final /* synthetic */ int b(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return AbstractC2107A.f(this, abstractC2739O, n5, i);
    }

    @Override // z0.InterfaceC2765w
    public final /* synthetic */ int e(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return AbstractC2107A.i(this, abstractC2739O, n5, i);
    }

    @Override // z0.InterfaceC2765w
    public final P f(Q q5, x0.N n5, long j5) {
        Z e3 = n5.e(j5);
        return q5.i(e3.f20973k, e3.f20974l, X3.w.f6091k, new K(0, e3, this));
    }

    @Override // z0.InterfaceC2765w
    public final /* synthetic */ int h(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return AbstractC2107A.l(this, abstractC2739O, n5, i);
    }

    @Override // z0.v0
    public final boolean j() {
        return false;
    }

    @Override // b0.o
    public final boolean l0() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.f17260y);
        sb.append(", scaleY=");
        sb.append(this.f17261z);
        sb.append(", alpha = ");
        sb.append(this.f17251A);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f17252B);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.f17253C);
        sb.append(", cameraDistance=");
        sb.append(this.f17254D);
        sb.append(", transformOrigin=");
        sb.append((Object) N.d(this.f17255E));
        sb.append(", shape=");
        sb.append(this.f17256F);
        sb.append(", clip=");
        sb.append(this.f17257G);
        sb.append(", renderEffect=null, ambientShadowColor=");
        AbstractC2107A.z(this.f17258H, sb, ", spotShadowColor=");
        AbstractC2107A.z(this.f17259I, sb, ", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) F.z(this.J));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }

    @Override // z0.v0
    public final void j0(H0.j jVar) {
    }
}
