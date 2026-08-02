package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Vn extends Ki {

    /* renamed from: a, reason: collision with root package name */
    public final String f30213a;

    public Vn(String formUrl) {
        Intrinsics.checkNotNullParameter(formUrl, "formUrl");
        this.f30213a = formUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Vn) && Intrinsics.d(this.f30213a, ((Vn) obj).f30213a);
    }

    public final int hashCode() {
        return this.f30213a.hashCode();
    }

    public final String toString() {
        return C.o0.c(new StringBuilder("CheckTDsBinding(formUrl="), this.f30213a, ")");
    }
}
