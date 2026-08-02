package J0;

import Sc.C;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class O1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f12920a;

    public O1() {
        long j11;
        j11 = C7807Z.f72259m;
        this.f12920a = j11;
    }

    public final long a() {
        return this.f12920a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof O1) {
            return C7807Z.p(this.f12920a, ((O1) obj).f12920a);
        }
        return false;
    }

    public final int hashCode() {
        int i11 = C7807Z.f72260n;
        C.Companion companion = Sc.C.INSTANCE;
        return Long.hashCode(this.f12920a) * 31;
    }

    @NotNull
    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) C7807Z.v(this.f12920a)) + ", rippleAlpha=null)";
    }
}
