package u2;

import n0.AbstractC2157b;

/* renamed from: u2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2487b extends AbstractC2490e {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC2157b f19988a;

    /* renamed from: b, reason: collision with root package name */
    public final E2.e f19989b;

    public C2487b(AbstractC2157b abstractC2157b, E2.e eVar) {
        this.f19988a = abstractC2157b;
        this.f19989b = eVar;
    }

    @Override // u2.AbstractC2490e
    public final AbstractC2157b a() {
        return this.f19988a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2487b)) {
            return false;
        }
        C2487b c2487b = (C2487b) obj;
        return kotlin.jvm.internal.l.a(this.f19988a, c2487b.f19988a) && kotlin.jvm.internal.l.a(this.f19989b, c2487b.f19989b);
    }

    public final int hashCode() {
        AbstractC2157b abstractC2157b = this.f19988a;
        return this.f19989b.hashCode() + ((abstractC2157b == null ? 0 : abstractC2157b.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.f19988a + ", result=" + this.f19989b + ')';
    }
}
