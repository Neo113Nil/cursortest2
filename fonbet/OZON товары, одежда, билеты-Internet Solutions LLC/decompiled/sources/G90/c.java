package G90;

import G.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final c f9804d = new c("", "", false);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f9805a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f9806b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9807c;

    public c(@NotNull String enableFeatures, @NotNull String json, boolean z11) {
        Intrinsics.checkNotNullParameter(enableFeatures, "enableFeatures");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f9805a = enableFeatures;
        this.f9806b = json;
        this.f9807c = z11;
    }

    @NotNull
    public final String b() {
        return this.f9805a;
    }

    public final boolean c() {
        return this.f9807c;
    }

    @NotNull
    public final String d() {
        return this.f9806b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f9805a, cVar.f9805a) && Intrinsics.d(this.f9806b, cVar.f9806b) && this.f9807c == cVar.f9807c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9807c) + g.a(this.f9805a.hashCode() * 31, 31, this.f9806b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TestingFeaturesV1UIState(enableFeatures=");
        sb2.append(this.f9805a);
        sb2.append(", json=");
        sb2.append(this.f9806b);
        sb2.append(", hasChanges=");
        return Pk0.a.a(")", sb2, this.f9807c);
    }
}
