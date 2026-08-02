package P;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4402a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4403b;

    public U(Object obj, Object obj2) {
        this.f4402a = obj;
        this.f4403b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u5 = (U) obj;
        return kotlin.jvm.internal.l.a(this.f4402a, u5.f4402a) && kotlin.jvm.internal.l.a(this.f4403b, u5.f4403b);
    }

    public final int hashCode() {
        Object obj = this.f4402a;
        int ordinal = (obj instanceof Enum ? ((Enum) obj).ordinal() : obj.hashCode()) * 31;
        Object obj2 = this.f4403b;
        return (obj2 instanceof Enum ? ((Enum) obj2).ordinal() : obj2 != null ? obj2.hashCode() : 0) + ordinal;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f4402a + ", right=" + this.f4403b + ')';
    }
}
