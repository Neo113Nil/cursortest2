package I4;

import java.util.HashSet;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final f f3666b = new f(new HashSet());

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f3667a;

    public f(HashSet hashSet) {
        this.f3667a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        return this.f3667a.equals(((f) obj).f3667a);
    }

    public final int hashCode() {
        return this.f3667a.hashCode();
    }

    public final String toString() {
        return "FieldMask{mask=" + this.f3667a.toString() + "}";
    }
}
