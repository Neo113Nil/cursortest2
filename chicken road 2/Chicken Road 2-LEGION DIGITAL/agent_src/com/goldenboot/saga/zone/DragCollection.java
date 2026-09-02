package com.goldenboot.saga.zone;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class DragCollection extends LabelDemux {
    public int applyTask() {
        int growPayload = growPayload(16);
        if (growPayload != 0) {
            return releaseHeader(growPayload);
        }
        return 0;
    }

    public DragCollection clipOrigin(int i, ByteBuffer byteBuffer) {
        flushSample(i, byteBuffer);
        return this;
    }

    public int connectJob() {
        int growPayload = growPayload(4);
        if (growPayload != 0) {
            return this.growPayload.getInt(growPayload + this.evictLayout);
        }
        return 0;
    }

    public short drawField() {
        int growPayload = growPayload(14);
        if (growPayload != 0) {
            return this.growPayload.getShort(growPayload + this.evictLayout);
        }
        return (short) 0;
    }

    public void flushSample(int i, ByteBuffer byteBuffer) {
        injectMetric(i, byteBuffer);
    }

    public short peekRevision() {
        int growPayload = growPayload(8);
        if (growPayload != 0) {
            return this.growPayload.getShort(growPayload + this.evictLayout);
        }
        return (short) 0;
    }

    public boolean popBlueprint() {
        int growPayload = growPayload(6);
        return (growPayload == 0 || this.growPayload.get(growPayload + this.evictLayout) == 0) ? false : true;
    }

    public short serializeOffset() {
        int growPayload = growPayload(12);
        if (growPayload != 0) {
            return this.growPayload.getShort(growPayload + this.evictLayout);
        }
        return (short) 0;
    }

    public int updateTimer(int i) {
        int growPayload = growPayload(16);
        if (growPayload != 0) {
            return this.growPayload.getInt(detachStream(growPayload) + (i * 4));
        }
        return 0;
    }
}
