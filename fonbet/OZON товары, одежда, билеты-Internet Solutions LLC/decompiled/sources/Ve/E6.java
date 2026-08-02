package Ve;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class E6 extends Ki {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC7737t f28908a;

    /* JADX WARN: Multi-variable type inference failed */
    public E6(Function0 effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f28908a = (AbstractC7737t) effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof E6) && Intrinsics.d(this.f28908a, ((E6) obj).f28908a);
    }

    public final int hashCode() {
        return this.f28908a.hashCode();
    }

    public final String toString() {
        return "PerformCreateOtpSdkAction(effect=" + this.f28908a + ")";
    }
}
