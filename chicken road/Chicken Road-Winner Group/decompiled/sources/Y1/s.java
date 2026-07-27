package Y1;

import java.util.Objects;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public Long f1717a;

    /* renamed from: b, reason: collision with root package name */
    public C f1718b;

    /* renamed from: c, reason: collision with root package name */
    public Long f1719c;

    /* renamed from: d, reason: collision with root package name */
    public String f1720d;

    /* renamed from: e, reason: collision with root package name */
    public String f1721e;
    public String f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            if (this.f1717a.equals(sVar.f1717a) && this.f1718b.equals(sVar.f1718b) && this.f1719c.equals(sVar.f1719c) && this.f1720d.equals(sVar.f1720d) && this.f1721e.equals(sVar.f1721e) && this.f.equals(sVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1717a, this.f1718b, this.f1719c, this.f1720d, this.f1721e, this.f);
    }
}
