package n1;

import java.util.Objects;

/* renamed from: n1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2164e {

    /* renamed from: a, reason: collision with root package name */
    public final String f18428a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18429b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18430c;

    public C2164e(int i, int i5, String str) {
        this.f18428a = str;
        this.f18429b = i;
        this.f18430c = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2164e)) {
            return false;
        }
        C2164e c2164e = (C2164e) obj;
        return Objects.equals(this.f18428a, c2164e.f18428a) && this.f18429b == c2164e.f18429b && this.f18430c == c2164e.f18430c;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.f18429b);
        Integer valueOf2 = Integer.valueOf(this.f18430c);
        Float valueOf3 = Float.valueOf(1.0f);
        return Objects.hash(this.f18428a, valueOf, valueOf2, valueOf3, 0, 0, 0, valueOf3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayShapeCompat{ spec=");
        String str = this.f18428a;
        sb.append(str != null ? Integer.valueOf(str.hashCode()) : "null");
        sb.append(" displayWidth=");
        sb.append(this.f18429b);
        sb.append(" displayHeight=");
        return L1.a.o(sb, this.f18430c, " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}");
    }
}
