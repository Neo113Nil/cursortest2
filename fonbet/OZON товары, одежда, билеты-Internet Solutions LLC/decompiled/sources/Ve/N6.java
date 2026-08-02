package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class N6 extends Wj {

    /* renamed from: a, reason: collision with root package name */
    public final String f29530a;

    public N6(String str) {
        this.f29530a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof N6) && Intrinsics.d(this.f29530a, ((N6) obj).f29530a);
    }

    public final int hashCode() {
        String str = this.f29530a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return C.o0.c(new StringBuilder("EmptyPaymentAccountError(message="), this.f29530a, ")");
    }
}
