package Y1;

import java.util.Objects;

/* renamed from: Y1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0083g {

    /* renamed from: a, reason: collision with root package name */
    public String f1678a;

    /* renamed from: b, reason: collision with root package name */
    public String f1679b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0083g.class == obj.getClass()) {
            C0083g c0083g = (C0083g) obj;
            if (Objects.equals(this.f1678a, c0083g.f1678a) && Objects.equals(this.f1679b, c0083g.f1679b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1678a, this.f1679b);
    }
}
