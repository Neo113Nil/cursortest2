package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Mg {

    /* renamed from: a, reason: collision with root package name */
    public final String f29475a;

    public Mg(String str) {
        this.f29475a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Mg) && Intrinsics.d(this.f29475a, ((Mg) obj).f29475a);
    }

    public final int hashCode() {
        String str = this.f29475a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return C.o0.c(new StringBuilder("ClientData(bankLogo="), this.f29475a, ")");
    }
}
