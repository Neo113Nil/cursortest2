package com.google.android.gms.internal.ads;

import java.util.Locale;

/* loaded from: classes.dex */
public final class Y7 {

    /* renamed from: d, reason: collision with root package name */
    public static final Y7 f12279d = new Y7(1.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f12280a;

    /* renamed from: b, reason: collision with root package name */
    public final float f12281b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12282c;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public Y7(float f, float f5) {
        AbstractC1668us.S(f > 0.0f);
        AbstractC1668us.S(f5 > 0.0f);
        this.f12280a = f;
        this.f12281b = f5;
        this.f12282c = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Y7.class == obj.getClass()) {
            Y7 y7 = (Y7) obj;
            if (this.f12280a == y7.f12280a && this.f12281b == y7.f12281b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f12281b) + ((Float.floatToRawIntBits(this.f12280a) + 527) * 31);
    }

    public final String toString() {
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f12280a), Float.valueOf(this.f12281b));
    }
}
