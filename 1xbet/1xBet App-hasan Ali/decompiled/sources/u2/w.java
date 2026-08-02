package u2;

import x0.InterfaceC2624j;
import z.InterfaceC2714p;

/* loaded from: classes.dex */
public final class w implements InterfaceC2714p {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2714p f20047a;

    /* renamed from: b, reason: collision with root package name */
    public final C2497l f20048b;

    /* renamed from: c, reason: collision with root package name */
    public final b0.d f20049c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2624j f20050d;

    public w(InterfaceC2714p interfaceC2714p, C2497l c2497l, b0.d dVar, InterfaceC2624j interfaceC2624j) {
        this.f20047a = interfaceC2714p;
        this.f20048b = c2497l;
        this.f20049c = dVar;
        this.f20050d = interfaceC2624j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return kotlin.jvm.internal.l.a(this.f20047a, wVar.f20047a) && this.f20048b.equals(wVar.f20048b) && kotlin.jvm.internal.l.a(this.f20049c, wVar.f20049c) && kotlin.jvm.internal.l.a(this.f20050d, wVar.f20050d) && Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(1.0f) + ((this.f20050d.hashCode() + ((this.f20049c.hashCode() + ((this.f20048b.hashCode() + (this.f20047a.hashCode() * 31)) * 961)) * 31)) * 31)) * 961) + 1231;
    }

    public final String toString() {
        return "RealSubcomposeAsyncImageScope(parentScope=" + this.f20047a + ", painter=" + this.f20048b + ", contentDescription=null, alignment=" + this.f20049c + ", contentScale=" + this.f20050d + ", alpha=1.0, colorFilter=null, clipToBounds=true)";
    }
}
