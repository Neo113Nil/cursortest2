package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Ij extends AbstractC4245fi {

    /* renamed from: a, reason: collision with root package name */
    public final String f29239a;

    public Ij(String formUrl) {
        Intrinsics.checkNotNullParameter(formUrl, "formUrl");
        this.f29239a = formUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Ij) && Intrinsics.d(this.f29239a, ((Ij) obj).f29239a);
    }

    public final int hashCode() {
        return this.f29239a.hashCode();
    }

    public final String toString() {
        return C.o0.c(new StringBuilder("CheckTDsBinding(formUrl="), this.f29239a, ")");
    }
}
