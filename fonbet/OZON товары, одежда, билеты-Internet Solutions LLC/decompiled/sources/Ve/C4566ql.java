package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.ql, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4566ql extends E {

    /* renamed from: a, reason: collision with root package name */
    public final int f31882a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31883b;

    public C4566ql(int i11, String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f31882a = i11;
        this.f31883b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4566ql)) {
            return false;
        }
        C4566ql c4566ql = (C4566ql) obj;
        return this.f31882a == c4566ql.f31882a && Intrinsics.d(this.f31883b, c4566ql.f31883b);
    }

    public final int hashCode() {
        return this.f31883b.hashCode() + (Integer.hashCode(this.f31882a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OpenAgreementConditionsClickedEvent(index=");
        sb2.append(this.f31882a);
        sb2.append(", uri=");
        return C.o0.c(sb2, this.f31883b, ")");
    }
}
