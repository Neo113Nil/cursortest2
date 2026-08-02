package g5;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f13282a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f13283b;

    public m(String str, Map map) {
        this.f13282a = str;
        this.f13283b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f13282a.equals(mVar.f13282a) && Objects.equals(this.f13283b, mVar.f13283b);
    }

    public final int hashCode() {
        return Objects.hash(this.f13282a, this.f13283b);
    }
}
