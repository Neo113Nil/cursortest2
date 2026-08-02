package a10;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: a10.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4919g {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final C4919g f36200c = new C4919g(0.0d, null);

    /* renamed from: a, reason: collision with root package name */
    private final double f36201a;

    /* renamed from: b, reason: collision with root package name */
    private final a f36202b;

    /* renamed from: a10.g$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final double f36203a;

        public a(double d11) {
            this.f36203a = d11;
        }

        public final double a() {
            return this.f36203a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Double.compare(this.f36203a, ((a) obj).f36203a) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f36203a);
        }

        @NotNull
        public final String toString() {
            return "MergeTime(time=" + this.f36203a + ")";
        }
    }

    public C4919g(double d11, a aVar) {
        this.f36201a = d11;
        this.f36202b = aVar;
    }

    public final a b() {
        return this.f36202b;
    }

    public final double c() {
        return this.f36201a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4919g)) {
            return false;
        }
        C4919g c4919g = (C4919g) obj;
        return Double.compare(this.f36201a, c4919g.f36201a) == 0 && Intrinsics.d(this.f36202b, c4919g.f36202b);
    }

    public final int hashCode() {
        int hashCode = Double.hashCode(this.f36201a) * 31;
        a aVar = this.f36202b;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    @NotNull
    public final String toString() {
        return "RedirectMetrics(time=" + this.f36201a + ", merge=" + this.f36202b + ")";
    }
}
