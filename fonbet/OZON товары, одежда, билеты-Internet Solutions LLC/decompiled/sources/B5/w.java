package B5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class w<V> {

    /* renamed from: a, reason: collision with root package name */
    private final V f2811a;

    /* renamed from: b, reason: collision with root package name */
    private final Throwable f2812b;

    public w(V v11) {
        this.f2811a = v11;
        this.f2812b = null;
    }

    public final Throwable a() {
        return this.f2812b;
    }

    public final V b() {
        return this.f2811a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        V v11 = this.f2811a;
        if (v11 != null && v11.equals(wVar.f2811a)) {
            return true;
        }
        Throwable th2 = this.f2812b;
        if (th2 == null || wVar.f2812b == null) {
            return false;
        }
        return th2.toString().equals(th2.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2811a, this.f2812b});
    }

    public w(Throwable th2) {
        this.f2812b = th2;
        this.f2811a = null;
    }
}
