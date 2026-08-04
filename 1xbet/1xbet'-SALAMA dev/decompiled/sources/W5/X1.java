package W5;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class X1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f7094b;

    public X1(String str, Map map) {
        p113p3.f.k(str, "policyName");
        this.f7093a = str;
        p113p3.f.k(map, "rawConfigValue");
        this.f7094b = map;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof X1)) {
            return false;
        }
        X1 x1 = (X1) obj;
        return this.f7093a.equals(x1.f7093a) && this.f7094b.equals(x1.f7094b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7093a, this.f7094b});
    }

    public final String toString() {
        D3.j jVarU0 = p003a.a.u0(this);
        jVarU0.a(this.f7093a, "policyName");
        jVarU0.a(this.f7094b, "rawConfigValue");
        return jVarU0.toString();
    }
}
