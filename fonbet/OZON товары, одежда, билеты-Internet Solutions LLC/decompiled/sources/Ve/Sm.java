package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Sm extends AbstractC4245fi {

    /* renamed from: a, reason: collision with root package name */
    public final String f29991a;

    public Sm(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f29991a = description;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Sm) && Intrinsics.d(this.f29991a, ((Sm) obj).f29991a);
    }

    public final int hashCode() {
        return this.f29991a.hashCode();
    }

    public final String toString() {
        return C.o0.c(new StringBuilder("Exception(description="), this.f29991a, ")");
    }
}
