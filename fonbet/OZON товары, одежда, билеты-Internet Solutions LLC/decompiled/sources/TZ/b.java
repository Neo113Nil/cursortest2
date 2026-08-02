package TZ;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b implements UZ.a {

    /* renamed from: a, reason: collision with root package name */
    private final Rg.a f26951a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final g f26952b;

    public b(Rg.a aVar, @NotNull g params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f26951a = aVar;
        this.f26952b = params;
    }

    @NotNull
    public final g a() {
        return this.f26952b;
    }

    public final Rg.a b() {
        return this.f26951a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f26951a, bVar.f26951a) && Intrinsics.d(this.f26952b, bVar.f26952b);
    }

    public final int hashCode() {
        Rg.a aVar = this.f26951a;
        return this.f26952b.hashCode() + ((aVar == null ? 0 : aVar.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        return "ErrorAnalyticsEvent(screen=" + this.f26951a + ", params=" + this.f26952b + ")";
    }
}
