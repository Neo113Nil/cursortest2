package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Xa extends AbstractC3565ab {

    /* renamed from: a, reason: collision with root package name */
    public final Vg f6947a;

    public Xa(Vg ping) {
        Intrinsics.checkNotNullParameter(ping, "ping");
        this.f6947a = ping;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Xa) && Intrinsics.areEqual(this.f6947a, ((Xa) obj).f6947a);
    }

    public final int hashCode() {
        return this.f6947a.hashCode();
    }

    public final String toString() {
        return "Inserted(ping=" + this.f6947a + ")";
    }
}
