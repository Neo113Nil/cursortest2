package P00;

import T7.E;
import java.util.Map;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final a f21443d = new a(U.c(), U.c(), U.c());

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f21444a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f21445b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f21446c;

    public a(@NotNull Map<Long, RZ.c> widgetsAnalyticsState, @NotNull Map<Long, RZ.b> pageAnalyticsState, @NotNull Map<Long, ? extends Map<String, String>> trackingTokenAliases) {
        Intrinsics.checkNotNullParameter(widgetsAnalyticsState, "widgetsAnalyticsState");
        Intrinsics.checkNotNullParameter(pageAnalyticsState, "pageAnalyticsState");
        Intrinsics.checkNotNullParameter(trackingTokenAliases, "trackingTokenAliases");
        this.f21444a = widgetsAnalyticsState;
        this.f21445b = pageAnalyticsState;
        this.f21446c = trackingTokenAliases;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.Long, RZ.b>] */
    @NotNull
    public final Map<Long, RZ.b> b() {
        return this.f21445b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.Long, java.util.Map<java.lang.String, java.lang.String>>] */
    @NotNull
    public final Map<Long, Map<String, String>> c() {
        return this.f21446c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.Long, RZ.c>] */
    @NotNull
    public final Map<Long, RZ.c> d() {
        return this.f21444a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f21444a.equals(aVar.f21444a) && this.f21445b.equals(aVar.f21445b) && this.f21446c.equals(aVar.f21446c);
    }

    public final int hashCode() {
        return this.f21446c.hashCode() + H00.a.c(this.f21444a.hashCode() * 31, 31, this.f21445b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnalyticsInfo(widgetsAnalyticsState=");
        sb2.append(this.f21444a);
        sb2.append(", pageAnalyticsState=");
        sb2.append(this.f21445b);
        sb2.append(", trackingTokenAliases=");
        return E.c(this.f21446c, ")", sb2);
    }
}
