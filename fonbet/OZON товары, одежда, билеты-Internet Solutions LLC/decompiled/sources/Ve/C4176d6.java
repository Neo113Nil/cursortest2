package Ve;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.d6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4176d6 extends Ki {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC7737t f30856a;

    /* JADX WARN: Multi-variable type inference failed */
    public C4176d6(Function0 effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f30856a = (AbstractC7737t) effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4176d6) && Intrinsics.d(this.f30856a, ((C4176d6) obj).f30856a);
    }

    public final int hashCode() {
        return this.f30856a.hashCode();
    }

    public final String toString() {
        return "PerformConfirmOtpCodeAction(effect=" + this.f30856a + ")";
    }
}
