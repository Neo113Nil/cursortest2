package O4;

import com.google.android.gms.common.internal.D;
import java.util.Arrays;
import w1.V0;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f5008a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return D.m(this.f5008a, ((b) obj).f5008a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5008a});
    }

    public final String toString() {
        V0 v02 = new V0(this);
        v02.j(this.f5008a, "token");
        return v02.toString();
    }
}
