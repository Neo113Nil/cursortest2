package p049g5;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f13289b;

    public m(String str, Map map) {
        this.f13288a = str;
        this.f13289b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f13288a.equals(mVar.f13288a) && Objects.equals(this.f13289b, mVar.f13289b);
    }

    public final int hashCode() {
        return Objects.hash(this.f13288a, this.f13289b);
    }
}
