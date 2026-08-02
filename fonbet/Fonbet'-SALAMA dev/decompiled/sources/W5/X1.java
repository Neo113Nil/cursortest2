package W5;

import a.AbstractC0603a;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes2.dex */
public final class X1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7093a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f7094b;

    public X1(String str, Map map) {
        p3.f.k(str, "policyName");
        this.f7093a = str;
        p3.f.k(map, "rawConfigValue");
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
        D3.j u02 = AbstractC0603a.u0(this);
        u02.a(this.f7093a, "policyName");
        u02.a(this.f7094b, "rawConfigValue");
        return u02.toString();
    }
}
