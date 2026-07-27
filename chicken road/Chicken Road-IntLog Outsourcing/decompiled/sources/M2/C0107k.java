package M2;

import java.util.Objects;

/* renamed from: M2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0107k {

    /* renamed from: a, reason: collision with root package name */
    public String f1878a;

    /* renamed from: b, reason: collision with root package name */
    public String f1879b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0107k.class != obj.getClass()) {
            return false;
        }
        C0107k c0107k = (C0107k) obj;
        return Objects.equals(this.f1878a, c0107k.f1878a) && Objects.equals(this.f1879b, c0107k.f1879b);
    }

    public final int hashCode() {
        return Objects.hash(this.f1878a, this.f1879b);
    }
}
