package com.goldenboot.saga.zone;

import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class LabelTransformer {
    public final Long clipOrigin;
    public final Long detachStream;
    public final boolean evictLayout;
    public final Long flushSample;
    public final boolean growPayload;
    public final LongPressArbitrator injectMetric;
    public final Long releaseHeader;
    public final Map updateTimer;

    public LabelTransformer(boolean z, boolean z2, LongPressArbitrator longPressArbitrator, Long l, Long l2, Long l3, Long l4, Map extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.evictLayout = z;
        this.growPayload = z2;
        this.injectMetric = longPressArbitrator;
        this.detachStream = l;
        this.releaseHeader = l2;
        this.clipOrigin = l3;
        this.flushSample = l4;
        this.updateTimer = AttrConductor.resetDelta(extras);
    }

    public final boolean detachStream() {
        return this.evictLayout;
    }

    public final Long evictLayout() {
        return this.clipOrigin;
    }

    public final Long growPayload() {
        return this.detachStream;
    }

    public final boolean injectMetric() {
        return this.growPayload;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.evictLayout) {
            arrayList.add("isRegularFile");
        }
        if (this.growPayload) {
            arrayList.add("isDirectory");
        }
        if (this.detachStream != null) {
            arrayList.add("byteCount=" + this.detachStream);
        }
        if (this.releaseHeader != null) {
            arrayList.add("createdAt=" + this.releaseHeader);
        }
        if (this.clipOrigin != null) {
            arrayList.add("lastModifiedAt=" + this.clipOrigin);
        }
        if (this.flushSample != null) {
            arrayList.add("lastAccessedAt=" + this.flushSample);
        }
        if (!this.updateTimer.isEmpty()) {
            arrayList.add("extras=" + this.updateTimer);
        }
        return CursorCollector.computeTarget(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }

    public /* synthetic */ LabelTransformer(boolean z, boolean z2, LongPressArbitrator longPressArbitrator, Long l, Long l2, Long l3, Long l4, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : longPressArbitrator, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : l3, (i & 64) != 0 ? null : l4, (i & ContentOperation.SpotShadowColor) != 0 ? AttrConductor.updateTimer() : map);
    }
}
