package com.goldenboot.saga.zone;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class BoxRestore {
    public final long evictLayout;
    public final StackSyncer growPayload;

    public /* synthetic */ BoxRestore(long j, StackSyncer stackSyncer, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, stackSyncer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoxRestore)) {
            return false;
        }
        BoxRestore boxRestore = (BoxRestore) obj;
        return ContainerSource.drawScope(this.evictLayout, boxRestore.evictLayout) && Intrinsics.areEqual(this.growPayload, boxRestore.growPayload);
    }

    public final long evictLayout() {
        return this.evictLayout;
    }

    public final StackSyncer growPayload() {
        return this.growPayload;
    }

    public int hashCode() {
        int unlockMessage = ContainerSource.unlockMessage(this.evictLayout) * 31;
        StackSyncer stackSyncer = this.growPayload;
        return unlockMessage + (stackSyncer != null ? stackSyncer.hashCode() : 0);
    }

    public String toString() {
        return "RippleConfiguration(color=" + ((Object) ContainerSource.bindBody(this.evictLayout)) + ", rippleAlpha=" + this.growPayload + ')';
    }

    public BoxRestore(long j, StackSyncer stackSyncer) {
        this.evictLayout = j;
        this.growPayload = stackSyncer;
    }

    public /* synthetic */ BoxRestore(long j, StackSyncer stackSyncer, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ContainerSource.INSTANCE.purgeNode() : j, (i & 2) != 0 ? null : stackSyncer, null);
    }
}
