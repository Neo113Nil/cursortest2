package M2;

import java.util.Objects;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public Long f1913a;

    /* renamed from: b, reason: collision with root package name */
    public String f1914b;

    /* renamed from: c, reason: collision with root package name */
    public String f1915c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        return this.f1913a.equals(tVar.f1913a) && this.f1914b.equals(tVar.f1914b) && this.f1915c.equals(tVar.f1915c);
    }

    public final int hashCode() {
        return Objects.hash(this.f1913a, this.f1914b, this.f1915c);
    }
}
