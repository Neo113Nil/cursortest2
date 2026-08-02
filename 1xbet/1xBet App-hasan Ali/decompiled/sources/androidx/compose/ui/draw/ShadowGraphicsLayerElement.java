package androidx.compose.ui.draw;

import A.B;
import W0.f;
import b0.o;
import i0.C2007l;
import i0.J;
import i0.p;
import kotlin.jvm.internal.l;
import n.AbstractC2107A;
import w.i;
import z0.AbstractC2749f;
import z0.Z;
import z0.e0;

/* loaded from: classes.dex */
public final class ShadowGraphicsLayerElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final J f6910k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f6911l;

    /* renamed from: m, reason: collision with root package name */
    public final long f6912m;

    /* renamed from: n, reason: collision with root package name */
    public final long f6913n;

    public ShadowGraphicsLayerElement(J j5, boolean z3, long j6, long j7) {
        float f = i.f20465a;
        this.f6910k = j5;
        this.f6911l = z3;
        this.f6912m = j6;
        this.f6913n = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        shadowGraphicsLayerElement.getClass();
        float f = i.f20468d;
        return f.a(f, f) && l.a(this.f6910k, shadowGraphicsLayerElement.f6910k) && this.f6911l == shadowGraphicsLayerElement.f6911l && p.c(this.f6912m, shadowGraphicsLayerElement.f6912m) && p.c(this.f6913n, shadowGraphicsLayerElement.f6913n);
    }

    public final int hashCode() {
        return p.i(this.f6913n) + AbstractC2107A.o((((this.f6910k.hashCode() + (Float.floatToIntBits(i.f20468d) * 31)) * 31) + (this.f6911l ? 1231 : 1237)) * 31, 31, this.f6912m);
    }

    @Override // z0.Z
    public final o i() {
        return new C2007l(new B(23, this));
    }

    @Override // z0.Z
    public final void k(o oVar) {
        C2007l c2007l = (C2007l) oVar;
        c2007l.f17286y = new B(23, this);
        e0 e0Var = AbstractC2749f.t(c2007l, 2).f21813z;
        if (e0Var != null) {
            e0Var.h1(c2007l.f17286y, true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) f.b(i.f20468d));
        sb.append(", shape=");
        sb.append(this.f6910k);
        sb.append(", clip=");
        sb.append(this.f6911l);
        sb.append(", ambientColor=");
        AbstractC2107A.z(this.f6912m, sb, ", spotColor=");
        sb.append((Object) p.j(this.f6913n));
        sb.append(')');
        return sb.toString();
    }
}
