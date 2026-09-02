package com.goldenboot.saga.zone;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class WindowGateway {
    public final int evictLayout;
    public final Object growPayload;

    public WindowGateway(int i, Object obj) {
        this.evictLayout = i;
        this.growPayload = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WindowGateway)) {
            return false;
        }
        WindowGateway windowGateway = (WindowGateway) obj;
        return this.evictLayout == windowGateway.evictLayout && Intrinsics.areEqual(this.growPayload, windowGateway.growPayload);
    }

    public final int evictLayout() {
        return this.evictLayout;
    }

    public final Object growPayload() {
        return this.growPayload;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.evictLayout) * 31;
        Object obj = this.growPayload;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.evictLayout + ", value=" + this.growPayload + ')';
    }
}
