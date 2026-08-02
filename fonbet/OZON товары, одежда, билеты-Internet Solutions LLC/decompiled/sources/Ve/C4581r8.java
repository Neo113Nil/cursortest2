package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.r8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4581r8 extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    public final String f31959a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4581r8(String state) {
        super("Wrong Outcome state: " + state);
        Intrinsics.checkNotNullParameter(state, "state");
        this.f31959a = state;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4581r8) && Intrinsics.d(this.f31959a, ((C4581r8) obj).f31959a);
    }

    public final int hashCode() {
        return this.f31959a.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return C.o0.c(new StringBuilder("WrongOutcomeState(state="), this.f31959a, ")");
    }
}
