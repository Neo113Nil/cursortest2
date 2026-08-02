package F2;

import a.AbstractC0444a;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final h f1535c;

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0444a f1536a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0444a f1537b;

    static {
        b bVar = b.f;
        f1535c = new h(bVar, bVar);
    }

    public h(AbstractC0444a abstractC0444a, AbstractC0444a abstractC0444a2) {
        this.f1536a = abstractC0444a;
        this.f1537b = abstractC0444a2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f1536a, hVar.f1536a) && l.a(this.f1537b, hVar.f1537b);
    }

    public final int hashCode() {
        return this.f1537b.hashCode() + (this.f1536a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f1536a + ", height=" + this.f1537b + ')';
    }
}
