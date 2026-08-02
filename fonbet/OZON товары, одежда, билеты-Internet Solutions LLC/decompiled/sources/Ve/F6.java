package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class F6 extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    public final String f28972a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F6(String option) {
        super("Unknown option: ".concat(option));
        Intrinsics.checkNotNullParameter(option, "option");
        this.f28972a = option;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof F6) && Intrinsics.d(this.f28972a, ((F6) obj).f28972a);
    }

    public final int hashCode() {
        return this.f28972a.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return C.o0.c(new StringBuilder("UnknownFeatureOption(option="), this.f28972a, ")");
    }
}
