package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a1\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007H\u0080\b\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\u0004\u001a1\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007H\u0080\b\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001¢\u0006\u0004\b\f\u0010\n\"\u0014\u0010\u000f\u001a\u00020\r8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"", "message", "Lcom/goldenboot/saga/zone/DpadBuilder;", "injectMetric", "(Ljava/lang/String;)V", "", "value", "Lkotlin/Function0;", "lazyMessage", "growPayload", "(ZLcom/goldenboot/saga/zone/ElevationNode;)V", "detachStream", "evictLayout", "", "J", "DualFloatSignBit", "ui-unit"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavBarInitializer {
    public static final long evictLayout = -9223372034707292160L;

    public static final void detachStream(String str) {
        throw new IllegalStateException(str);
    }

    public static final void evictLayout(boolean z, ElevationNode elevationNode) {
        if (z) {
            return;
        }
        detachStream((String) elevationNode.invoke());
    }

    public static final void growPayload(boolean z, ElevationNode elevationNode) {
        if (z) {
            return;
        }
        injectMetric((String) elevationNode.invoke());
    }

    public static final void injectMetric(String str) {
        throw new IllegalArgumentException(str);
    }
}
