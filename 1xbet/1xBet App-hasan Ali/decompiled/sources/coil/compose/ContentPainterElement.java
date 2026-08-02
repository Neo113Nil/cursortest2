package coil.compose;

import b0.d;
import b0.o;
import h0.C1991e;
import kotlin.jvm.internal.l;
import n.AbstractC2107A;
import u2.C2497l;
import u2.s;
import x0.InterfaceC2624j;
import z0.AbstractC2749f;
import z0.Z;

/* loaded from: classes.dex */
public final class ContentPainterElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final C2497l f7410k;

    /* renamed from: l, reason: collision with root package name */
    public final d f7411l;

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC2624j f7412m;

    /* renamed from: n, reason: collision with root package name */
    public final float f7413n;

    public ContentPainterElement(C2497l c2497l, d dVar, InterfaceC2624j interfaceC2624j, float f) {
        this.f7410k = c2497l;
        this.f7411l = dVar;
        this.f7412m = interfaceC2624j;
        this.f7413n = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPainterElement)) {
            return false;
        }
        ContentPainterElement contentPainterElement = (ContentPainterElement) obj;
        return l.a(this.f7410k, contentPainterElement.f7410k) && l.a(this.f7411l, contentPainterElement.f7411l) && l.a(this.f7412m, contentPainterElement.f7412m) && Float.compare(this.f7413n, contentPainterElement.f7413n) == 0;
    }

    public final int hashCode() {
        return AbstractC2107A.n(this.f7413n, (this.f7412m.hashCode() + ((this.f7411l.hashCode() + (this.f7410k.hashCode() * 31)) * 31)) * 31, 31);
    }

    @Override // z0.Z
    public final o i() {
        s sVar = new s();
        sVar.f20034y = this.f7410k;
        sVar.f20035z = this.f7411l;
        sVar.f20032A = this.f7412m;
        sVar.f20033B = this.f7413n;
        return sVar;
    }

    @Override // z0.Z
    public final void k(o oVar) {
        s sVar = (s) oVar;
        long h3 = sVar.f20034y.h();
        C2497l c2497l = this.f7410k;
        boolean a5 = C1991e.a(h3, c2497l.h());
        sVar.f20034y = c2497l;
        sVar.f20035z = this.f7411l;
        sVar.f20032A = this.f7412m;
        sVar.f20033B = this.f7413n;
        if (!a5) {
            AbstractC2749f.n(sVar);
        }
        AbstractC2749f.m(sVar);
    }

    public final String toString() {
        return "ContentPainterElement(painter=" + this.f7410k + ", alignment=" + this.f7411l + ", contentScale=" + this.f7412m + ", alpha=" + this.f7413n + ", colorFilter=null)";
    }
}
