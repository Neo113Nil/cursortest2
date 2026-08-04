package A1;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class w0 implements InterfaceC0027k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w0 f605d = new w0(1.0f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f608c;

    public w0(float f7, float f8) {
        p151v2.a.f(f7 > 0.0f);
        p151v2.a.f(f8 > 0.0f);
        this.f606a = f7;
        this.f607b = f8;
        this.f608c = Math.round(f7 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w0.class != obj.getClass()) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.f606a == w0Var.f606a && this.f607b == w0Var.f607b;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f607b) + ((Float.floatToRawIntBits(this.f606a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f606a), Float.valueOf(this.f607b)};
        int i7 = p151v2.t.f17159a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
