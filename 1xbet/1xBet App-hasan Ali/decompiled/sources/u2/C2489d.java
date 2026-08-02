package u2;

import n0.AbstractC2157b;

/* renamed from: u2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2489d extends AbstractC2490e {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC2157b f19991a;

    /* renamed from: b, reason: collision with root package name */
    public final E2.o f19992b;

    public C2489d(AbstractC2157b abstractC2157b, E2.o oVar) {
        this.f19991a = abstractC2157b;
        this.f19992b = oVar;
    }

    @Override // u2.AbstractC2490e
    public final AbstractC2157b a() {
        return this.f19991a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2489d)) {
            return false;
        }
        C2489d c2489d = (C2489d) obj;
        return kotlin.jvm.internal.l.a(this.f19991a, c2489d.f19991a) && kotlin.jvm.internal.l.a(this.f19992b, c2489d.f19992b);
    }

    public final int hashCode() {
        return this.f19992b.hashCode() + (this.f19991a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.f19991a + ", result=" + this.f19992b + ')';
    }
}
