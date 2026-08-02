package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.ei, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4216ei extends AbstractC4245fi {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4733wg f30933a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4370k f30934b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f30935c;

    public C4216ei(InterfaceC4733wg mode, InterfaceC4370k interfaceC4370k) {
        boolean z11 = interfaceC4370k != null;
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f30933a = mode;
        this.f30934b = interfaceC4370k;
        this.f30935c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4216ei)) {
            return false;
        }
        C4216ei c4216ei = (C4216ei) obj;
        return Intrinsics.d(this.f30933a, c4216ei.f30933a) && Intrinsics.d(this.f30934b, c4216ei.f30934b) && this.f30935c == c4216ei.f30935c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f30933a.hashCode() * 31;
        InterfaceC4370k interfaceC4370k = this.f30934b;
        int hashCode2 = (hashCode + (interfaceC4370k == null ? 0 : interfaceC4370k.hashCode())) * 31;
        boolean z11 = this.f30935c;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return hashCode2 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AskForFullEmission(mode=");
        sb2.append(this.f30933a);
        sb2.append(", authResult=");
        sb2.append(this.f30934b);
        sb2.append(", isTokenRenewNeeded=");
        return Pk0.a.a(")", sb2, this.f30935c);
    }
}
