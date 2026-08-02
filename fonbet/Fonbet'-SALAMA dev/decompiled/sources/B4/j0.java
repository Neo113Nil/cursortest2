package B4;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final double[] f1167a;

    public j0(double[] dArr) {
        this.f1167a = (double[]) dArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j0.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f1167a, ((j0) obj).f1167a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1167a);
    }
}
