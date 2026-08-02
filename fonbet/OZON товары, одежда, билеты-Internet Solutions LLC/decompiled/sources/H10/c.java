package H10;

import i10.InterfaceC6995a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class c implements InterfaceC6995a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f10504a;

    /* renamed from: b, reason: collision with root package name */
    private final E10.a f10505b;

    public c(boolean z11, E10.a aVar) {
        this.f10504a = z11;
        this.f10505b = aVar;
    }

    public static c a(c cVar) {
        return new c(false, cVar.f10505b);
    }

    public final E10.a b() {
        return this.f10505b;
    }

    public final boolean c() {
        return this.f10504a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f10504a == cVar.f10504a && Intrinsics.d(this.f10505b, cVar.f10505b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f10504a) * 31;
        E10.a aVar = this.f10505b;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    @NotNull
    public final String toString() {
        return "RecyclerAdditionalState(isRefreshOrFirstLoad=" + this.f10504a + ", prefetchDepth=" + this.f10505b + ")";
    }
}
