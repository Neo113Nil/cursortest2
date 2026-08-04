package A1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends F0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f567b;

    public u0() {
        this.f567b = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u0) {
            return this.f567b == ((u0) obj).f567b;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f567b)});
    }

    public u0(float f7) {
        p151v2.a.e("percent must be in the range of [0, 100]", f7 >= 0.0f && f7 <= 100.0f);
        this.f567b = f7;
    }
}
