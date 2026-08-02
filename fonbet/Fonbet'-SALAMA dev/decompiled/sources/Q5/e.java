package Q5;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f5848a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f5849b;

    /* renamed from: c, reason: collision with root package name */
    public Map f5850c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f5848a.equals(eVar.f5848a) && this.f5849b.equals(eVar.f5849b) && this.f5850c.equals(eVar.f5850c);
    }

    public final int hashCode() {
        return Objects.hash(this.f5848a, this.f5849b, this.f5850c);
    }
}
