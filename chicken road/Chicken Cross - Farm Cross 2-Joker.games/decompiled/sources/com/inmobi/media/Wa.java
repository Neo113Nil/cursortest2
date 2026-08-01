package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Wa extends AbstractC3565ab {

    /* renamed from: a, reason: collision with root package name */
    public final Vg f6929a;

    public Wa(Vg ping) {
        Intrinsics.checkNotNullParameter(ping, "ping");
        this.f6929a = ping;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Wa) && Intrinsics.areEqual(this.f6929a, ((Wa) obj).f6929a);
    }

    public final int hashCode() {
        return this.f6929a.hashCode();
    }

    public final String toString() {
        return "Duplicate(ping=" + this.f6929a + ")";
    }
}
