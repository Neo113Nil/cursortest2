package Y1;

import java.util.Objects;

/* renamed from: Y1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0084h {

    /* renamed from: a, reason: collision with root package name */
    public n f1680a;

    /* renamed from: b, reason: collision with root package name */
    public String f1681b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0084h.class == obj.getClass()) {
            C0084h c0084h = (C0084h) obj;
            if (this.f1680a.equals(c0084h.f1680a) && this.f1681b.equals(c0084h.f1681b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1680a, this.f1681b);
    }
}
