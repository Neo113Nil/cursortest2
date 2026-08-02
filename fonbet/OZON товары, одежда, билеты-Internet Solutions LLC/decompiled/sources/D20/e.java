package D20;

import T7.E;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f5609a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f5610b;

    public e(@NotNull String artifact, @NotNull List<b> locales) {
        Intrinsics.checkNotNullParameter(artifact, "artifact");
        Intrinsics.checkNotNullParameter(locales, "locales");
        this.f5609a = artifact;
        this.f5610b = locales;
    }

    @NotNull
    public final String a() {
        return this.f5609a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<D20.b>] */
    @NotNull
    public final List<b> b() {
        return this.f5610b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f5609a, eVar.f5609a) && Intrinsics.d(this.f5610b, eVar.f5610b);
    }

    public final int hashCode() {
        return this.f5610b.hashCode() + (this.f5609a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocalizationSourceRaw(artifact=");
        sb2.append(this.f5609a);
        sb2.append(", locales=");
        return E.c(this.f5610b, ")", sb2);
    }
}
