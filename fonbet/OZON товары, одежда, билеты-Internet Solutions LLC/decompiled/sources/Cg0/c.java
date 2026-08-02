package Cg0;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f4959a;

    public c(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f4959a = name;
    }

    @NotNull
    public final String a() {
        return this.f4959a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return Intrinsics.d(this.f4959a, ((c) obj).f4959a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4959a.hashCode();
    }

    @NotNull
    public final String toString() {
        return o0.c(new StringBuilder("PlaceholderTracking(name='"), this.f4959a, "')");
    }
}
