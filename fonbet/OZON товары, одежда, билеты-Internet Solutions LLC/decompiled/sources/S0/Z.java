package S0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    private final Object f25326a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f25327b;

    public Z(Object obj, Object obj2) {
        this.f25326a = obj;
        this.f25327b = obj2;
    }

    public final Object a() {
        return this.f25326a;
    }

    public final Object b() {
        return this.f25327b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z11 = (Z) obj;
        return Intrinsics.d(this.f25326a, z11.f25326a) && Intrinsics.d(this.f25327b, z11.f25327b);
    }

    public final int hashCode() {
        Object obj = this.f25326a;
        int i11 = 0;
        int ordinal = (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f25327b;
        if (obj2 instanceof Enum) {
            i11 = ((Enum) obj2).ordinal();
        } else if (obj2 != null) {
            i11 = obj2.hashCode();
        }
        return ordinal + i11;
    }

    @NotNull
    public final String toString() {
        return "JoinedKey(left=" + this.f25326a + ", right=" + this.f25327b + ')';
    }
}
