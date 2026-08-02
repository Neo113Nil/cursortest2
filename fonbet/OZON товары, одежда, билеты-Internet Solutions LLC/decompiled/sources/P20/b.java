package P20;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f21698a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21699b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f21700c;

    public b(@NotNull String name, int i11) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f21698a = name;
        this.f21699b = i11;
        this.f21700c = P4.f.b("toString(...)");
    }

    @NotNull
    public final String a() {
        return this.f21700c;
    }

    @NotNull
    public final String b() {
        return this.f21698a;
    }

    public final int c() {
        return this.f21699b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f21698a, bVar.f21698a) && this.f21699b == bVar.f21699b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21699b) + (this.f21698a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocalizationSourceVo(name=");
        sb2.append(this.f21698a);
        sb2.append(", resourceCount=");
        return K00.b.e(this.f21699b, ")", sb2);
    }
}
