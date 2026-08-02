package B1;

import org.jetbrains.annotations.NotNull;

/* renamed from: B1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2549s implements InterfaceC2547p {
    @Override // B1.InterfaceC2547p
    public final long a(long j11, long j12) {
        return t0.a(1.0f, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2549s)) {
            return false;
        }
        ((C2549s) obj).getClass();
        return Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f);
    }

    @NotNull
    public final String toString() {
        return "FixedScale(value=1.0)";
    }
}
