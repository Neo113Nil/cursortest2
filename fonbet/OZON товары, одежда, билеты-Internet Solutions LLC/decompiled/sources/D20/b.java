package D20;

import T7.E;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f5599a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f5600b;

    public b(@NotNull String code, @NotNull List<d> resources) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f5599a = code;
        this.f5600b = resources;
    }

    @NotNull
    public final String a() {
        return this.f5599a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<D20.d>] */
    @NotNull
    public final List<d> b() {
        return this.f5600b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f5599a, bVar.f5599a) && Intrinsics.d(this.f5600b, bVar.f5600b);
    }

    public final int hashCode() {
        return this.f5600b.hashCode() + (this.f5599a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocalizationLocaleRaw(code=");
        sb2.append(this.f5599a);
        sb2.append(", resources=");
        return E.c(this.f5600b, ")", sb2);
    }
}
