package d1;

import java.util.HashSet;

/* renamed from: d1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0952e {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f12353a = new HashSet();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0952e.class != obj.getClass()) {
            return false;
        }
        return this.f12353a.equals(((C0952e) obj).f12353a);
    }

    public final int hashCode() {
        return this.f12353a.hashCode();
    }
}
