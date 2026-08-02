package V1;

import Sc.C;
import l1.AbstractC7799Q;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class c implements l {

    /* renamed from: a, reason: collision with root package name */
    private final long f27902a;

    public c(long j11) {
        this.f27902a = j11;
        if (j11 == 16) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }

    @Override // V1.l
    public final long a() {
        return this.f27902a;
    }

    @Override // V1.l
    public final AbstractC7799Q d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && C7807Z.p(this.f27902a, ((c) obj).f27902a);
    }

    @Override // V1.l
    public final float getAlpha() {
        return C7807Z.q(this.f27902a);
    }

    public final int hashCode() {
        int i11 = C7807Z.f72260n;
        C.Companion companion = C.INSTANCE;
        return Long.hashCode(this.f27902a);
    }

    @NotNull
    public final String toString() {
        return "ColorStyle(value=" + ((Object) C7807Z.v(this.f27902a)) + ')';
    }
}
