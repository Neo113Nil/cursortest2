package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class Rp {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f6836a;
    public final int b;

    public Rp(CoroutineScope coroutineScope, int i) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f6836a = coroutineScope;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rp)) {
            return false;
        }
        Rp rp = (Rp) obj;
        return Intrinsics.areEqual(this.f6836a, rp.f6836a) && this.b == rp.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f6836a.hashCode() * 31);
    }

    public final String toString() {
        return "ViewabilityTrackerConfig(coroutineScope=" + this.f6836a + ", impressionMinDuration=" + this.b + ")";
    }
}
