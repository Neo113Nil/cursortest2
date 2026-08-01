package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Za extends AbstractC3565ab {

    /* renamed from: a, reason: collision with root package name */
    public final Vg f6989a;

    public Za(Vg ping) {
        Intrinsics.checkNotNullParameter(ping, "ping");
        this.f6989a = ping;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Za) && Intrinsics.areEqual(this.f6989a, ((Za) obj).f6989a);
    }

    public final int hashCode() {
        return this.f6989a.hashCode();
    }

    public final String toString() {
        return "Rejected(ping=" + this.f6989a + ")";
    }
}
