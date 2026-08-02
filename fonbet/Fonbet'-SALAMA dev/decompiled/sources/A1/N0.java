package A1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class N0 extends F0 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f179b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f180c;

    public N0() {
        this.f179b = false;
        this.f180c = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof N0)) {
            return false;
        }
        N0 n02 = (N0) obj;
        return this.f180c == n02.f180c && this.f179b == n02.f179b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f179b), Boolean.valueOf(this.f180c)});
    }

    public N0(boolean z4) {
        this.f179b = true;
        this.f180c = z4;
    }
}
