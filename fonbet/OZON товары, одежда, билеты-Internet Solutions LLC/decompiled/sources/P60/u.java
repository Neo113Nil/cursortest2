package P60;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f21929a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21930b;

    public /* synthetic */ u(String str) {
        this(str, null);
    }

    @NotNull
    public final String a() {
        return this.f21929a;
    }

    public final String b() {
        return this.f21930b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.f21929a, uVar.f21929a) && Intrinsics.d(this.f21930b, uVar.f21930b);
    }

    public final int hashCode() {
        int hashCode = this.f21929a.hashCode() * 31;
        String str = this.f21930b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Pattern(host=");
        sb2.append(this.f21929a);
        sb2.append(", path=");
        return o0.c(sb2, this.f21930b, ")");
    }

    public u(@NotNull String host, String str) {
        Intrinsics.checkNotNullParameter(host, "host");
        this.f21929a = host;
        this.f21930b = str;
    }
}
