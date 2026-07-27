package M2;

import java.util.Objects;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public String f1888a;

    /* renamed from: b, reason: collision with root package name */
    public H f1889b;

    /* renamed from: c, reason: collision with root package name */
    public String f1890c;

    /* renamed from: d, reason: collision with root package name */
    public String f1891d;

    /* renamed from: e, reason: collision with root package name */
    public String f1892e;

    /* renamed from: f, reason: collision with root package name */
    public String f1893f;

    /* renamed from: g, reason: collision with root package name */
    public String f1894g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        return this.f1888a.equals(pVar.f1888a) && this.f1889b.equals(pVar.f1889b) && Objects.equals(this.f1890c, pVar.f1890c) && Objects.equals(this.f1891d, pVar.f1891d) && Objects.equals(this.f1892e, pVar.f1892e) && Objects.equals(this.f1893f, pVar.f1893f) && Objects.equals(this.f1894g, pVar.f1894g);
    }

    public final int hashCode() {
        return Objects.hash(this.f1888a, this.f1889b, this.f1890c, this.f1891d, this.f1892e, this.f1893f, this.f1894g);
    }
}
