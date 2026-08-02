package Fb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final b f9239a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9240b;

    public c(@NotNull b info, int i11) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.f9239a = info;
        this.f9240b = i11;
    }

    public static c a(c cVar, b info) {
        Intrinsics.checkNotNullParameter(info, "info");
        return new c(info, cVar.f9240b);
    }

    @NotNull
    public final b b() {
        return this.f9239a;
    }

    public final int c() {
        return this.f9240b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f9239a, cVar.f9239a) && this.f9240b == cVar.f9240b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9240b) + (this.f9239a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "SilentAuthInfoWithProviderWeight(info=" + this.f9239a + ", providerWeight=" + this.f9240b + ")";
    }
}
