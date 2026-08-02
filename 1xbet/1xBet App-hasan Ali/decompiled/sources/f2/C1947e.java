package f2;

import java.util.HashSet;

/* renamed from: f2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1947e {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f16991a = new HashSet();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1947e.class != obj.getClass()) {
            return false;
        }
        return this.f16991a.equals(((C1947e) obj).f16991a);
    }

    public final int hashCode() {
        return this.f16991a.hashCode();
    }
}
