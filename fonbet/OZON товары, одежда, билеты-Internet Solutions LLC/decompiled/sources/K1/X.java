package K1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class X extends V {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f15018a;

    public X(@NotNull String str) {
        super(0);
        this.f15018a = str;
    }

    @NotNull
    public final String a() {
        return this.f15018a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof X) {
            return Intrinsics.d(this.f15018a, ((X) obj).f15018a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15018a.hashCode();
    }

    @NotNull
    public final String toString() {
        return B3.D.c(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f15018a, ')');
    }
}
