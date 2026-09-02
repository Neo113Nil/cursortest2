package com.goldenboot.saga.zone;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class FeedbackAlerter {
    public final Object evictLayout;
    public final Object growPayload;

    public FeedbackAlerter(Object obj, Object obj2) {
        this.evictLayout = obj;
        this.growPayload = obj2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedbackAlerter)) {
            return false;
        }
        FeedbackAlerter feedbackAlerter = (FeedbackAlerter) obj;
        return Intrinsics.areEqual(this.evictLayout, feedbackAlerter.evictLayout) && Intrinsics.areEqual(this.growPayload, feedbackAlerter.growPayload);
    }

    public final int evictLayout(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public int hashCode() {
        return (evictLayout(this.evictLayout) * 31) + evictLayout(this.growPayload);
    }

    public String toString() {
        return "JoinedKey(left=" + this.evictLayout + ", right=" + this.growPayload + ')';
    }
}
