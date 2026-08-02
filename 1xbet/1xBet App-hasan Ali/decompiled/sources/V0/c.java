package V0;

import i0.F;
import i4.InterfaceC2015a;

/* loaded from: classes.dex */
public final class c implements o {

    /* renamed from: a, reason: collision with root package name */
    public final long f5928a;

    public c(long j5) {
        this.f5928a = j5;
        if (j5 != 16) {
            return;
        }
        Q0.a.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // V0.o
    public final float a() {
        return i0.p.d(this.f5928a);
    }

    @Override // V0.o
    public final long b() {
        return this.f5928a;
    }

    @Override // V0.o
    public final o c(InterfaceC2015a interfaceC2015a) {
        return !equals(n.f5949a) ? this : (o) interfaceC2015a.invoke();
    }

    @Override // V0.o
    public final F d() {
        return null;
    }

    @Override // V0.o
    public final /* synthetic */ o e(o oVar) {
        return L1.a.a(this, oVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && i0.p.c(this.f5928a, ((c) obj).f5928a);
    }

    public final int hashCode() {
        return i0.p.i(this.f5928a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) i0.p.j(this.f5928a)) + ')';
    }
}
