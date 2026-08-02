package S0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: S0.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3983s0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f25523a;

    public C3983s0(@NotNull String str) {
        this.f25523a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3983s0) && Intrinsics.d(this.f25523a, ((C3983s0) obj).f25523a);
    }

    public final int hashCode() {
        return this.f25523a.hashCode();
    }

    @NotNull
    public final String toString() {
        return B3.D.c(new StringBuilder("OpaqueKey(key="), this.f25523a, ')');
    }
}
