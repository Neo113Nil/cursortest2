package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Wm extends Ki {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4733wg f30295a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4370k f30296b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f30297c;

    public Wm(InterfaceC4733wg mode, InterfaceC4370k interfaceC4370k, boolean z11) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f30295a = mode;
        this.f30296b = interfaceC4370k;
        this.f30297c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Wm)) {
            return false;
        }
        Wm wm = (Wm) obj;
        return Intrinsics.d(this.f30295a, wm.f30295a) && Intrinsics.d(this.f30296b, wm.f30296b) && this.f30297c == wm.f30297c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f30295a.hashCode() * 31;
        InterfaceC4370k interfaceC4370k = this.f30296b;
        int hashCode2 = (hashCode + (interfaceC4370k == null ? 0 : interfaceC4370k.hashCode())) * 31;
        boolean z11 = this.f30297c;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return hashCode2 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AskForFullEmission(mode=");
        sb2.append(this.f30295a);
        sb2.append(", authResult=");
        sb2.append(this.f30296b);
        sb2.append(", isTokenRenewNeeded=");
        return Pk0.a.a(")", sb2, this.f30297c);
    }
}
