package S90;

import G.g;
import P4.f;
import java.util.Set;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Set<a> f26061a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f26062b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f26063c;

    /* renamed from: d, reason: collision with root package name */
    private final long f26064d;

    static {
        new b(M.f71699a, "", "", 0L);
    }

    public b(Set<a> set, @NotNull String networkPath, @NotNull String applicationName, long j11) {
        Intrinsics.checkNotNullParameter(networkPath, "networkPath");
        Intrinsics.checkNotNullParameter(applicationName, "applicationName");
        this.f26061a = set;
        this.f26062b = networkPath;
        this.f26063c = applicationName;
        this.f26064d = j11;
    }

    @NotNull
    public final String a() {
        return this.f26063c;
    }

    public final long b() {
        return this.f26064d;
    }

    @NotNull
    public final String c() {
        return this.f26062b;
    }

    public final Set<a> d() {
        return this.f26061a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f26061a, bVar.f26061a) && Intrinsics.d(this.f26062b, bVar.f26062b) && Intrinsics.d(this.f26063c, bVar.f26063c) && this.f26064d == bVar.f26064d;
    }

    public final int hashCode() {
        Set<a> set = this.f26061a;
        return Long.hashCode(this.f26064d) + g.a(g.a((set == null ? 0 : set.hashCode()) * 31, 31, this.f26062b), 31, this.f26063c);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FeatureFlagsConfig(overrideDefaultFeatures=");
        sb2.append(this.f26061a);
        sb2.append(", networkPath=");
        sb2.append(this.f26062b);
        sb2.append(", applicationName=");
        sb2.append(this.f26063c);
        sb2.append(", applicationVersion=");
        return f.a(this.f26064d, ")", sb2);
    }
}
