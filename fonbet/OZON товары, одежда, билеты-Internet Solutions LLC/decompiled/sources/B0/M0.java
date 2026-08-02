package B0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class M0 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final M0 f1437b = new M0(null, 63);

    /* renamed from: a, reason: collision with root package name */
    private final Function1<L0, Unit> f1438a;

    public M0() {
        this(null, 63);
    }

    public final Function1<L0, Unit> b() {
        return this.f1438a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof M0) {
            return this.f1438a == ((M0) obj).f1438a;
        }
        return false;
    }

    public final int hashCode() {
        Function1<L0, Unit> function1 = this.f1438a;
        return (function1 != null ? function1.hashCode() : 0) * 28629151;
    }

    public M0(Function1 function1, int i11) {
        this.f1438a = (i11 & 1) != 0 ? null : function1;
    }
}
