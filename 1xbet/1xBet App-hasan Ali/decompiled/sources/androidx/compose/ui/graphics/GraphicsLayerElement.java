package androidx.compose.ui.graphics;

import A.B;
import b0.o;
import i0.F;
import i0.J;
import i0.L;
import i0.N;
import i0.p;
import kotlin.jvm.internal.l;
import n.AbstractC2107A;
import z0.AbstractC2749f;
import z0.Z;
import z0.e0;

/* loaded from: classes.dex */
final class GraphicsLayerElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final float f6919k;

    /* renamed from: l, reason: collision with root package name */
    public final float f6920l;

    /* renamed from: m, reason: collision with root package name */
    public final float f6921m;

    /* renamed from: n, reason: collision with root package name */
    public final long f6922n;

    /* renamed from: o, reason: collision with root package name */
    public final J f6923o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f6924p;

    /* renamed from: q, reason: collision with root package name */
    public final long f6925q;

    /* renamed from: r, reason: collision with root package name */
    public final long f6926r;

    public GraphicsLayerElement(float f, float f5, float f6, long j5, J j6, boolean z3, long j7, long j8) {
        this.f6919k = f;
        this.f6920l = f5;
        this.f6921m = f6;
        this.f6922n = j5;
        this.f6923o = j6;
        this.f6924p = z3;
        this.f6925q = j7;
        this.f6926r = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        graphicsLayerElement.getClass();
        return Float.compare(1.0f, 1.0f) == 0 && Float.compare(1.0f, 1.0f) == 0 && Float.compare(this.f6919k, graphicsLayerElement.f6919k) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f6920l, graphicsLayerElement.f6920l) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f6921m, graphicsLayerElement.f6921m) == 0 && Float.compare(8.0f, 8.0f) == 0 && N.a(this.f6922n, graphicsLayerElement.f6922n) && l.a(this.f6923o, graphicsLayerElement.f6923o) && this.f6924p == graphicsLayerElement.f6924p && p.c(this.f6925q, graphicsLayerElement.f6925q) && p.c(this.f6926r, graphicsLayerElement.f6926r);
    }

    public final int hashCode() {
        int n5 = AbstractC2107A.n(8.0f, AbstractC2107A.n(this.f6921m, AbstractC2107A.n(0.0f, AbstractC2107A.n(0.0f, AbstractC2107A.n(this.f6920l, AbstractC2107A.n(0.0f, AbstractC2107A.n(0.0f, AbstractC2107A.n(this.f6919k, AbstractC2107A.n(1.0f, Float.floatToIntBits(1.0f) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = N.f17264c;
        long j5 = this.f6922n;
        return (((p.i(this.f6926r) + AbstractC2107A.o((((this.f6923o.hashCode() + ((((int) (j5 ^ (j5 >>> 32))) + n5) * 31)) * 31) + (this.f6924p ? 1231 : 1237)) * 961, 31, this.f6925q)) * 961) + 3) * 31;
    }

    @Override // z0.Z
    public final o i() {
        L l5 = new L();
        l5.f17260y = 1.0f;
        l5.f17261z = 1.0f;
        l5.f17251A = this.f6919k;
        l5.f17252B = this.f6920l;
        l5.f17253C = this.f6921m;
        l5.f17254D = 8.0f;
        l5.f17255E = this.f6922n;
        l5.f17256F = this.f6923o;
        l5.f17257G = this.f6924p;
        l5.f17258H = this.f6925q;
        l5.f17259I = this.f6926r;
        l5.J = 3;
        l5.K = new B(24, l5);
        return l5;
    }

    @Override // z0.Z
    public final void k(o oVar) {
        L l5 = (L) oVar;
        l5.f17260y = 1.0f;
        l5.f17261z = 1.0f;
        l5.f17251A = this.f6919k;
        l5.f17252B = this.f6920l;
        l5.f17253C = this.f6921m;
        l5.f17254D = 8.0f;
        l5.f17255E = this.f6922n;
        l5.f17256F = this.f6923o;
        l5.f17257G = this.f6924p;
        l5.f17258H = this.f6925q;
        l5.f17259I = this.f6926r;
        l5.J = 3;
        e0 e0Var = AbstractC2749f.t(l5, 2).f21813z;
        if (e0Var != null) {
            e0Var.h1(l5.K, true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=1.0, scaleY=1.0, alpha=");
        sb.append(this.f6919k);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f6920l);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.f6921m);
        sb.append(", cameraDistance=8.0, transformOrigin=");
        sb.append((Object) N.d(this.f6922n));
        sb.append(", shape=");
        sb.append(this.f6923o);
        sb.append(", clip=");
        sb.append(this.f6924p);
        sb.append(", renderEffect=null, ambientShadowColor=");
        AbstractC2107A.z(this.f6925q, sb, ", spotShadowColor=");
        sb.append((Object) p.j(this.f6926r));
        sb.append(", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) F.z(3));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
