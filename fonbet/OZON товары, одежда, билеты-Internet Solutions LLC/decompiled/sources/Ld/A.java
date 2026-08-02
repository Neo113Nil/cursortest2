package Ld;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.e0;

/* loaded from: classes.dex */
public final class A implements he.v {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final y f16737b;

    public A(@NotNull y binaryClass, @NotNull he.u abiStability) {
        Intrinsics.checkNotNullParameter(binaryClass, "binaryClass");
        Intrinsics.checkNotNullParameter(abiStability, "abiStability");
        this.f16737b = binaryClass;
    }

    @Override // td.d0
    @NotNull
    public final void b() {
        e0 NO_SOURCE_FILE = e0.f99393a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
    }

    @NotNull
    public final y c() {
        return this.f16737b;
    }

    @NotNull
    public final String toString() {
        return A.class.getSimpleName() + ": " + this.f16737b;
    }
}
