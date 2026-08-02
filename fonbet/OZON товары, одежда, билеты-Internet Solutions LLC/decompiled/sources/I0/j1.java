package I0;

import Sc.C;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f11550a;

    /* renamed from: b, reason: collision with root package name */
    private final long f11551b;

    public j1(long j11, long j12) {
        this.f11550a = j11;
        this.f11551b = j12;
    }

    public final long a() {
        return this.f11551b;
    }

    public final long b() {
        return this.f11550a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return C7807Z.p(this.f11550a, j1Var.f11550a) && C7807Z.p(this.f11551b, j1Var.f11551b);
    }

    public final int hashCode() {
        int i11 = C7807Z.f72260n;
        C.Companion companion = Sc.C.INSTANCE;
        return Long.hashCode(this.f11551b) + (Long.hashCode(this.f11550a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionColors(selectionHandleColor=");
        Bi.a.e(this.f11550a, ", selectionBackgroundColor=", sb2);
        sb2.append((Object) C7807Z.v(this.f11551b));
        sb2.append(')');
        return sb2.toString();
    }
}
