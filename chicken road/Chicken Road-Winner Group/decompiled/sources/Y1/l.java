package Y1;

import java.util.Objects;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public String f1688a;

    /* renamed from: b, reason: collision with root package name */
    public D f1689b;

    /* renamed from: c, reason: collision with root package name */
    public String f1690c;

    /* renamed from: d, reason: collision with root package name */
    public String f1691d;

    /* renamed from: e, reason: collision with root package name */
    public String f1692e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public String f1693g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f1688a.equals(lVar.f1688a) && this.f1689b.equals(lVar.f1689b) && Objects.equals(this.f1690c, lVar.f1690c) && Objects.equals(this.f1691d, lVar.f1691d) && Objects.equals(this.f1692e, lVar.f1692e) && Objects.equals(this.f, lVar.f) && Objects.equals(this.f1693g, lVar.f1693g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1688a, this.f1689b, this.f1690c, this.f1691d, this.f1692e, this.f, this.f1693g);
    }
}
