package O20;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f19873a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f19874b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f19875c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f19876d;

    public b(@NotNull String key, @NotNull String defaultValue, boolean z11) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        this.f19873a = key;
        this.f19874b = defaultValue;
        this.f19875c = z11;
        this.f19876d = P4.f.b("toString(...)");
    }

    @NotNull
    public final String a() {
        return this.f19874b;
    }

    @NotNull
    public final String b() {
        return this.f19876d;
    }

    @NotNull
    public final String c() {
        return this.f19873a;
    }

    public final boolean d() {
        return this.f19875c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f19873a, bVar.f19873a) && Intrinsics.d(this.f19874b, bVar.f19874b) && this.f19875c == bVar.f19875c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19875c) + G.g.a(this.f19873a.hashCode() * 31, 31, this.f19874b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResourceItemVo(key=");
        sb2.append(this.f19873a);
        sb2.append(", defaultValue=");
        sb2.append(this.f19874b);
        sb2.append(", translatable=");
        return Pk0.a.a(")", sb2, this.f19875c);
    }
}
