package Qj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Qj0.u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3900u extends AbstractC3880a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f23709a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3900u(@NotNull String layoutVersion) {
        super(0);
        Intrinsics.checkNotNullParameter(layoutVersion, "layoutVersion");
        this.f23709a = layoutVersion;
    }

    @NotNull
    public final String a() {
        return this.f23709a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3900u) && Intrinsics.d(this.f23709a, ((C3900u) obj).f23709a);
    }

    public final int hashCode() {
        return this.f23709a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C.o0.c(new StringBuilder("LayoutVersion(layoutVersion="), this.f23709a, ")");
    }
}
