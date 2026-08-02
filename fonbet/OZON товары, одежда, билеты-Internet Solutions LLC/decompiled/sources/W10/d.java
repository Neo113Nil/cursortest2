package W10;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final l20.d f33197a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f33198b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final c f33199c;

    public d(@NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.f33197a = info;
        String d11 = info.d();
        String j11 = info.c().j();
        T00.a b11 = info.b();
        this.f33199c = new c(d11, j11, b11 != null ? b11.g() : null);
    }

    public final boolean a() {
        return this.f33198b;
    }

    @NotNull
    public final c b() {
        return this.f33199c;
    }

    public final boolean c() {
        return this.f33197a.e();
    }

    public final void d() {
        this.f33198b = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.composer.ui.widget.analytics.TrackingDataHolder");
        return Intrinsics.d(this.f33197a, ((d) obj).f33197a);
    }

    public final int hashCode() {
        return this.f33197a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "TrackingDataHolder(info=" + this.f33197a + ", tracked=" + this.f33198b + ", trackingData=" + this.f33199c + ")";
    }
}
