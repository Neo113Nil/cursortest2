package androidx.compose.ui.draw;

import b0.c;
import b0.h;
import b0.o;
import h0.C1991e;
import i0.C2006k;
import kotlin.jvm.internal.l;
import n.AbstractC2107A;
import o0.C2195B;
import x0.C2623i;
import z0.AbstractC2749f;
import z0.Z;

/* loaded from: classes.dex */
final class PainterElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final C2195B f6908k;

    /* renamed from: l, reason: collision with root package name */
    public final C2006k f6909l;

    public PainterElement(C2195B c2195b, C2006k c2006k) {
        this.f6908k = c2195b;
        this.f6909l = c2006k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        if (!l.a(this.f6908k, painterElement.f6908k)) {
            return false;
        }
        h hVar = c.f7141o;
        if (!hVar.equals(hVar)) {
            return false;
        }
        Object obj2 = C2623i.f21001b;
        return obj2.equals(obj2) && Float.compare(1.0f, 1.0f) == 0 && l.a(this.f6909l, painterElement.f6909l);
    }

    public final int hashCode() {
        int n5 = AbstractC2107A.n(1.0f, (C2623i.f21001b.hashCode() + ((Float.floatToIntBits(0.0f) + (Float.floatToIntBits(0.0f) * 31) + (((this.f6908k.hashCode() * 31) + 1231) * 31)) * 31)) * 31, 31);
        C2006k c2006k = this.f6909l;
        return n5 + (c2006k == null ? 0 : c2006k.hashCode());
    }

    @Override // z0.Z
    public final o i() {
        f0.h hVar = new f0.h();
        hVar.f16934y = this.f6908k;
        hVar.f16935z = true;
        hVar.f16930A = c.f7141o;
        hVar.f16931B = C2623i.f21001b;
        hVar.f16932C = 1.0f;
        hVar.f16933D = this.f6909l;
        return hVar;
    }

    @Override // z0.Z
    public final void k(o oVar) {
        f0.h hVar = (f0.h) oVar;
        boolean z3 = hVar.f16935z;
        C2195B c2195b = this.f6908k;
        boolean z5 = (z3 && C1991e.a(hVar.f16934y.h(), c2195b.h())) ? false : true;
        hVar.f16934y = c2195b;
        hVar.f16935z = true;
        hVar.f16930A = c.f7141o;
        hVar.f16931B = C2623i.f21001b;
        hVar.f16932C = 1.0f;
        hVar.f16933D = this.f6909l;
        if (z5) {
            AbstractC2749f.n(hVar);
        }
        AbstractC2749f.m(hVar);
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f6908k + ", sizeToIntrinsics=true, alignment=" + c.f7141o + ", contentScale=" + C2623i.f21001b + ", alpha=1.0, colorFilter=" + this.f6909l + ')';
    }
}
