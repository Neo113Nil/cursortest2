package com.amplitude.android;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q {
    public final r a;
    public final k b;

    public q() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.areEqual(this.a, qVar.a) && Intrinsics.areEqual(this.b, qVar.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b.a) + (Boolean.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "InteractionsOptions(rageClick=" + this.a + ", deadClick=" + this.b + ')';
    }

    public q(int i) {
        r rageClick = new r(0);
        k deadClick = new k(0);
        Intrinsics.checkNotNullParameter(rageClick, "rageClick");
        Intrinsics.checkNotNullParameter(deadClick, "deadClick");
        this.a = rageClick;
        this.b = deadClick;
    }
}
