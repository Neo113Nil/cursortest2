package B4;

import java.util.List;
import java.util.Objects;

/* renamed from: B4.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0081z extends B {

    /* renamed from: a, reason: collision with root package name */
    public final List f1198a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1199b;

    public C0081z(int i7, List list) {
        this.f1198a = list;
        this.f1199b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0081z.class != obj.getClass()) {
            return false;
        }
        C0081z c0081z = (C0081z) obj;
        return this.f1199b == c0081z.f1199b && Objects.equals(this.f1198a, c0081z.f1198a);
    }

    public final int hashCode() {
        List list = this.f1198a;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        int i7 = this.f1199b;
        return hashCode + (i7 != 0 ? t.e.e(i7) : 0);
    }
}
