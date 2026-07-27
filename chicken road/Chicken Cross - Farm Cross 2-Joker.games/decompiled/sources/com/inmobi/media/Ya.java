package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ya extends AbstractC3565ab {

    /* renamed from: a, reason: collision with root package name */
    public final Vg f6969a;
    public final Vg b;

    public Ya(Vg ping, Vg evicted) {
        Intrinsics.checkNotNullParameter(ping, "ping");
        Intrinsics.checkNotNullParameter(evicted, "evicted");
        this.f6969a = ping;
        this.b = evicted;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ya)) {
            return false;
        }
        Ya ya = (Ya) obj;
        return Intrinsics.areEqual(this.f6969a, ya.f6969a) && Intrinsics.areEqual(this.b, ya.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6969a.hashCode() * 31);
    }

    public final String toString() {
        return "InsertedWithEviction(ping=" + this.f6969a + ", evicted=" + this.b + ")";
    }
}
