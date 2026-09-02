package com.goldenboot.saga.zone;

import java.util.Arrays;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class StackCollector {
    public final RuntimeStage evictLayout;

    public StackCollector(long[] jArr) {
        RuntimeStage runtimeStage;
        if (jArr != null) {
            long[] copyOf = Arrays.copyOf(jArr, jArr.length);
            runtimeStage = new RuntimeStage(copyOf.length);
            runtimeStage.releaseHeader(runtimeStage.growPayload, copyOf);
        } else {
            runtimeStage = new RuntimeStage(0, 1, null);
        }
        this.evictLayout = runtimeStage;
    }

    public final void evictLayout(long j) {
        this.evictLayout.detachStream(j);
    }

    public final long[] growPayload() {
        RuntimeStage runtimeStage = this.evictLayout;
        int i = runtimeStage.growPayload;
        if (i == 0) {
            return null;
        }
        long[] jArr = new long[i];
        long[] jArr2 = runtimeStage.evictLayout;
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = jArr2[i2];
        }
        return jArr;
    }
}
