package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Bl extends El {

    /* renamed from: a, reason: collision with root package name */
    public final String f6480a;
    public final AbstractC4277zl b;

    public Bl(String collectorId, AbstractC4277zl payload) {
        Intrinsics.checkNotNullParameter(collectorId, "collectorId");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f6480a = collectorId;
        this.b = payload;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bl)) {
            return false;
        }
        Bl bl = (Bl) obj;
        return Intrinsics.areEqual(this.f6480a, bl.f6480a) && Intrinsics.areEqual(this.b, bl.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6480a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(collectorId=" + this.f6480a + ", payload=" + this.b + ")";
    }
}
