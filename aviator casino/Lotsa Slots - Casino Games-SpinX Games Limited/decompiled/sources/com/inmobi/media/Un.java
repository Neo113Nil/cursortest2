package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Un {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.CoroutineScope f5004a;
    public final int b;

    public Un(kotlinx.coroutines.CoroutineScope coroutineScope, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f5004a = coroutineScope;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.Un)) {
            return false;
        }
        com.inmobi.media.Un un = (com.inmobi.media.Un) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5004a, un.f5004a) && this.b == un.b;
    }

    public final int hashCode() {
        return this.b + (this.f5004a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "ViewabilityTrackerConfig(coroutineScope=" + this.f5004a + ", impressionMinDuration=" + this.b + ")";
    }
}
