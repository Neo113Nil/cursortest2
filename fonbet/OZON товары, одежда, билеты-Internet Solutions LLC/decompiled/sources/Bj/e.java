package Bj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final g f3885a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f3886b;

    public e(@NotNull g key, @NotNull String srcValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(srcValue, "srcValue");
        this.f3885a = key;
        this.f3886b = srcValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f3885a == eVar.f3885a && Intrinsics.d(this.f3886b, eVar.f3886b);
    }

    public final int hashCode() {
        return this.f3886b.hashCode() + (this.f3885a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ValueFormat(key=" + this.f3885a + ", srcValue=" + this.f3886b + ")";
    }
}
