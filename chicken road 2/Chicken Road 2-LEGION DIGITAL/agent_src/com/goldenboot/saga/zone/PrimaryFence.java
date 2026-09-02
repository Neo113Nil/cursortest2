package com.goldenboot.saga.zone;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class PrimaryFence {
    public int evictLayout;

    public PrimaryFence(int i) {
        this.evictLayout = i;
    }

    public final int evictLayout() {
        return this.evictLayout;
    }

    public final void growPayload(int i) {
        this.evictLayout = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IntRef(element = ");
        sb.append(this.evictLayout);
        sb.append(")@");
        String num = Integer.toString(hashCode(), InitBeacon.evictLayout(16));
        Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
        sb.append(num);
        return sb.toString();
    }

    public /* synthetic */ PrimaryFence(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
