package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.am, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4105am implements InterfaceC4370k {

    /* renamed from: a, reason: collision with root package name */
    public final String f30684a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f30685b;

    public C4105am(String str, boolean z11, int i11) {
        this.f30684a = (i11 & 2) != 0 ? null : str;
        this.f30685b = z11;
    }

    @Override // Ve.InterfaceC4370k
    public final boolean a() {
        return this.f30685b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4105am)) {
            return false;
        }
        C4105am c4105am = (C4105am) obj;
        c4105am.getClass();
        return Intrinsics.d(this.f30684a, c4105am.f30684a) && this.f30685b == c4105am.f30685b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.f30684a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z11 = this.f30685b;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return hashCode + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BiometricAuthResult(authData=null, error=");
        sb2.append(this.f30684a);
        sb2.append(", isAuthSuccess=");
        return Pk0.a.a(")", sb2, this.f30685b);
    }
}
