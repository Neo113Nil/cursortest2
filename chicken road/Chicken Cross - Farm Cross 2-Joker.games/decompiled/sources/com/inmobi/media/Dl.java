package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Dl extends El {

    /* renamed from: a, reason: collision with root package name */
    public final String f6517a;

    public Dl(String collectorId) {
        Intrinsics.checkNotNullParameter(collectorId, "collectorId");
        this.f6517a = collectorId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Dl) && Intrinsics.areEqual(this.f6517a, ((Dl) obj).f6517a);
    }

    public final int hashCode() {
        return this.f6517a.hashCode();
    }

    public final String toString() {
        return "NoContent(collectorId=" + this.f6517a + ")";
    }
}
