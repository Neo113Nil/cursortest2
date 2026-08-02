package u2;

import n0.AbstractC2157b;

/* renamed from: u2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2488c extends AbstractC2490e {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC2157b f19990a;

    public C2488c(AbstractC2157b abstractC2157b) {
        this.f19990a = abstractC2157b;
    }

    @Override // u2.AbstractC2490e
    public final AbstractC2157b a() {
        return this.f19990a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2488c) && kotlin.jvm.internal.l.a(this.f19990a, ((C2488c) obj).f19990a);
    }

    public final int hashCode() {
        AbstractC2157b abstractC2157b = this.f19990a;
        if (abstractC2157b == null) {
            return 0;
        }
        return abstractC2157b.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.f19990a + ')';
    }
}
