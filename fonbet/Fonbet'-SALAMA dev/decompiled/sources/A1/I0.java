package A1;

import java.util.Arrays;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class I0 extends F0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f105b;

    /* renamed from: c, reason: collision with root package name */
    public final float f106c;

    public I0(int i7) {
        AbstractC1664a.e("maxStars must be a positive integer", i7 > 0);
        this.f105b = i7;
        this.f106c = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof I0)) {
            return false;
        }
        I0 i02 = (I0) obj;
        return this.f105b == i02.f105b && this.f106c == i02.f106c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f105b), Float.valueOf(this.f106c)});
    }

    public I0(int i7, float f7) {
        boolean z4 = false;
        AbstractC1664a.e("maxStars must be a positive integer", i7 > 0);
        if (f7 >= 0.0f && f7 <= i7) {
            z4 = true;
        }
        AbstractC1664a.e("starRating is out of range [0, maxStars]", z4);
        this.f105b = i7;
        this.f106c = f7;
    }
}
