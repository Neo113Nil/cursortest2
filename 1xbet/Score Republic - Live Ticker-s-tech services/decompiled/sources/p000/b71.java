package p000;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class b71 {

    /* JADX INFO: renamed from: a */
    public final String f746a;

    /* JADX INFO: renamed from: b */
    public final Map f747b;

    public b71(String str, Map map) {
        a90.m127k(str, "policyName");
        this.f746a = str;
        a90.m127k(map, "rawConfigValue");
        this.f747b = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b71) {
            b71 b71Var = (b71) obj;
            if (this.f746a.equals(b71Var.f746a) && this.f747b.equals(b71Var.f747b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f746a, this.f747b});
    }

    public final String toString() {
        C0809vn c0809vnM5362k = wm1.m5362k(this);
        c0809vnM5362k.m5172c(this.f746a, "policyName");
        c0809vnM5362k.m5172c(this.f747b, "rawConfigValue");
        return c0809vnM5362k.toString();
    }
}
