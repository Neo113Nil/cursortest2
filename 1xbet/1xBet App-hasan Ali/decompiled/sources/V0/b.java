package V0;

import i0.F;
import i0.H;
import i4.InterfaceC2015a;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final H f5926a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5927b;

    public b(H h3, float f) {
        this.f5926a = h3;
        this.f5927b = f;
    }

    @Override // V0.o
    public final float a() {
        return this.f5927b;
    }

    @Override // V0.o
    public final long b() {
        int i = i0.p.f17294h;
        return i0.p.f17293g;
    }

    @Override // V0.o
    public final o c(InterfaceC2015a interfaceC2015a) {
        return !equals(n.f5949a) ? this : (o) interfaceC2015a.invoke();
    }

    @Override // V0.o
    public final F d() {
        return this.f5926a;
    }

    @Override // V0.o
    public final /* synthetic */ o e(o oVar) {
        return L1.a.a(this, oVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.l.a(this.f5926a, bVar.f5926a) && Float.compare(this.f5927b, bVar.f5927b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f5927b) + (this.f5926a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.f5926a);
        sb.append(", alpha=");
        return AbstractC2107A.s(sb, this.f5927b, ')');
    }
}
