package Bl0;

import ed.InterfaceC6346b;
import kotlin.jvm.internal.Intrinsics;

@InterfaceC6346b
/* loaded from: classes4.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public final String f3954a;

    public final boolean equals(Object obj) {
        if (obj instanceof Y) {
            return Intrinsics.d(this.f3954a, ((Y) obj).f3954a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3954a.hashCode();
    }

    public final String toString() {
        return B3.D.c(new StringBuilder("MetricsEventUuid(value="), this.f3954a, ')');
    }
}
