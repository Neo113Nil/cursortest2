package UZ;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    private final Rg.a f27473a;

    /* renamed from: b, reason: collision with root package name */
    private final XZ.d f27474b;

    public d(Rg.a aVar, XZ.d dVar) {
        this.f27473a = aVar;
        this.f27474b = dVar;
    }

    public final XZ.d a() {
        return this.f27474b;
    }

    public final Rg.a b() {
        return this.f27473a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f27473a, dVar.f27473a) && Intrinsics.d(this.f27474b, dVar.f27474b);
    }

    public final int hashCode() {
        Rg.a aVar = this.f27473a;
        int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        XZ.d dVar = this.f27474b;
        return hashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "TokenizedAnalyticsEvent(screen=" + this.f27473a + ", params=" + this.f27474b + ")";
    }
}
