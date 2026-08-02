package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class U2 implements InterfaceC4370k {

    /* renamed from: a, reason: collision with root package name */
    public final V8 f30091a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30092b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f30093c;

    public U2(V8 v82, String str, boolean z11, int i11) {
        v82 = (i11 & 1) != 0 ? null : v82;
        str = (i11 & 2) != 0 ? null : str;
        this.f30091a = v82;
        this.f30092b = str;
        this.f30093c = z11;
    }

    @Override // Ve.InterfaceC4370k
    public final boolean a() {
        return this.f30093c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U2)) {
            return false;
        }
        U2 u22 = (U2) obj;
        return Intrinsics.d(this.f30091a, u22.f30091a) && Intrinsics.d(this.f30092b, u22.f30092b) && this.f30093c == u22.f30093c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        V8 v82 = this.f30091a;
        int hashCode = (v82 == null ? 0 : v82.hashCode()) * 31;
        String str = this.f30092b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        boolean z11 = this.f30093c;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return hashCode2 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BankAuthResult(authData=");
        sb2.append(this.f30091a);
        sb2.append(", error=");
        sb2.append(this.f30092b);
        sb2.append(", isAuthSuccess=");
        return Pk0.a.a(")", sb2, this.f30093c);
    }
}
