package Ve;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Jr extends AbstractC4595rm {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.coroutines.jvm.internal.j f29320a;

    /* JADX WARN: Multi-variable type inference failed */
    public Jr(Function1 function1) {
        this.f29320a = (kotlin.coroutines.jvm.internal.j) function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Jr) && Intrinsics.d(this.f29320a, ((Jr) obj).f29320a);
    }

    public final int hashCode() {
        return this.f29320a.hashCode();
    }

    public final String toString() {
        return "NoInternetConnectionError(caller=" + this.f29320a + ")";
    }
}
