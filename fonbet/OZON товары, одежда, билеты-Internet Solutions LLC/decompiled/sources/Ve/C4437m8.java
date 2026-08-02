package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.m8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4437m8 extends Lf.a {

    /* renamed from: b, reason: collision with root package name */
    public final String f31568b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4437m8(String phoneNumber) {
        super(6);
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.f31568b = phoneNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4437m8) && Intrinsics.d(this.f31568b, ((C4437m8) obj).f31568b);
    }

    public final int hashCode() {
        return this.f31568b.hashCode();
    }

    @Override // Lf.a
    public final String toString() {
        return C.o0.c(new StringBuilder("OnContinueButtonClickedEvent(phoneNumber="), this.f31568b, ")");
    }
}
