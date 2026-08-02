package P0;

import Sc.C;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;

/* renamed from: P0.b1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3722b1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f20979a;

    public C3722b1() {
        long j11;
        j11 = C7807Z.f72259m;
        this.f20979a = j11;
    }

    public final long a() {
        return this.f20979a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3722b1) {
            return C7807Z.p(this.f20979a, ((C3722b1) obj).f20979a);
        }
        return false;
    }

    public final int hashCode() {
        int i11 = C7807Z.f72260n;
        C.Companion companion = Sc.C.INSTANCE;
        return Long.hashCode(this.f20979a) * 31;
    }

    @NotNull
    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) C7807Z.v(this.f20979a)) + ", rippleAlpha=null)";
    }
}
