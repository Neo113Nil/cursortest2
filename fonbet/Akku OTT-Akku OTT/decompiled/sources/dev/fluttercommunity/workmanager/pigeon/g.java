package dev.fluttercommunity.workmanager.pigeon;

import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class g {
    public static final a Companion = new a();
    public final long a;

    public static final class a {
    }

    public g(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return o.a(CollectionsKt.listOf(Long.valueOf(this.a)), CollectionsKt.listOf(Long.valueOf(((g) obj).a)));
    }

    public final int hashCode() {
        return CollectionsKt.listOf(Long.valueOf(this.a)).hashCode();
    }

    public final String toString() {
        return "InitializeRequest(callbackHandle=" + this.a + ')';
    }
}
