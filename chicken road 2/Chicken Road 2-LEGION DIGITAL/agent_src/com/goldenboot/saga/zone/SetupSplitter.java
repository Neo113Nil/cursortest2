package com.goldenboot.saga.zone;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class SetupSplitter {
    public int[] detachStream;
    public int evictLayout;
    public long[] growPayload = KeyboardGate.growPayload(16);
    public int[] injectMetric = new int[16];
    public int releaseHeader;

    public SetupSplitter() {
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        this.detachStream = iArr;
    }

    public final void applyTask(int i, int i2) {
        long[] jArr = this.growPayload;
        int[] iArr = this.injectMetric;
        int[] iArr2 = this.detachStream;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }

    public final void clipOrigin(int i) {
        int i2 = this.detachStream[i];
        applyTask(i2, this.evictLayout - 1);
        this.evictLayout--;
        updateTimer(i2);
        flushSample(i2);
        detachStream(i);
    }

    public final void detachStream(int i) {
        this.detachStream[i] = this.releaseHeader;
        this.releaseHeader = i;
    }

    public final int evictLayout(long j) {
        injectMetric(this.evictLayout + 1);
        int i = this.evictLayout;
        this.evictLayout = i + 1;
        int growPayload = growPayload();
        this.growPayload[i] = j;
        this.injectMetric[i] = growPayload;
        this.detachStream[growPayload] = i;
        updateTimer(i);
        return growPayload;
    }

    public final void flushSample(int i) {
        long[] jArr = this.growPayload;
        int i2 = this.evictLayout >> 1;
        while (i < i2) {
            int i3 = (i + 1) << 1;
            int i4 = i3 - 1;
            if (i3 >= this.evictLayout || Intrinsics.compare(jArr[i3], jArr[i4]) >= 0) {
                if (Intrinsics.compare(jArr[i4], jArr[i]) >= 0) {
                    return;
                }
                applyTask(i4, i);
                i = i4;
            } else {
                if (Intrinsics.compare(jArr[i3], jArr[i]) >= 0) {
                    return;
                }
                applyTask(i3, i);
                i = i3;
            }
        }
    }

    public final int growPayload() {
        int length = this.detachStream.length;
        if (this.releaseHeader >= length) {
            int i = length * 2;
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                iArr[i2] = i3;
                i2 = i3;
            }
            InsetsReader.peekRevision(this.detachStream, iArr, 0, 0, 0, 14, null);
            this.detachStream = iArr;
        }
        int i4 = this.releaseHeader;
        this.releaseHeader = this.detachStream[i4];
        return i4;
    }

    public final void injectMetric(int i) {
        int length = this.growPayload.length;
        if (i <= length) {
            return;
        }
        int i2 = length * 2;
        long[] growPayload = KeyboardGate.growPayload(i2);
        int[] iArr = new int[i2];
        InsetsReader.serializeOffset(this.growPayload, growPayload, 0, 0, 0, 12, null);
        InsetsReader.peekRevision(this.injectMetric, iArr, 0, 0, 0, 14, null);
        this.growPayload = growPayload;
        this.injectMetric = iArr;
    }

    public final long releaseHeader(long j) {
        return this.evictLayout > 0 ? this.growPayload[0] : j;
    }

    public final void updateTimer(int i) {
        long[] jArr = this.growPayload;
        long j = jArr[i];
        while (i > 0) {
            int i2 = ((i + 1) >> 1) - 1;
            if (Intrinsics.compare(jArr[i2], j) <= 0) {
                return;
            }
            applyTask(i2, i);
            i = i2;
        }
    }
}
