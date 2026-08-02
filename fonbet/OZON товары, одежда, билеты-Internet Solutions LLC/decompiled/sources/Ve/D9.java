package Ve;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class D9 extends Wj {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.coroutines.jvm.internal.j f28844a;

    /* JADX WARN: Multi-variable type inference failed */
    public D9(Function1 function1) {
        this.f28844a = (kotlin.coroutines.jvm.internal.j) function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof D9) && Intrinsics.d(this.f28844a, ((D9) obj).f28844a);
    }

    public final int hashCode() {
        return this.f28844a.hashCode();
    }

    public final String toString() {
        return "NoInternetConnectionError(caller=" + this.f28844a + ")";
    }
}
