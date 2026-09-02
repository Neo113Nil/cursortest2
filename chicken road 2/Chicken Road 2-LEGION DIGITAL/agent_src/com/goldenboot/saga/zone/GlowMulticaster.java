package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.TimelineUpgrade;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class GlowMulticaster {
    public static final CursorKeeper evictLayout(CursorKeeper cursorKeeper, int i, RailAssembler railAssembler) {
        if (i < 0 && i != -2 && i != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i).toString());
        }
        if (i == -1 && railAssembler != RailAssembler.reduceScope) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i == -1) {
            railAssembler = RailAssembler.notifyMessage;
            i = 0;
        }
        int i2 = i;
        RailAssembler railAssembler2 = railAssembler;
        return cursorKeeper instanceof TimelineUpgrade ? TimelineUpgrade.ActivityMutator.evictLayout((TimelineUpgrade) cursorKeeper, null, i2, railAssembler2, 1, null) : new SwipeCallback(cursorKeeper, null, i2, railAssembler2, 2, null);
    }

    public static /* synthetic */ CursorKeeper growPayload(CursorKeeper cursorKeeper, int i, RailAssembler railAssembler, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        if ((i2 & 2) != 0) {
            railAssembler = RailAssembler.reduceScope;
        }
        return RailParser.injectMetric(cursorKeeper, i, railAssembler);
    }

    public static final CursorKeeper injectMetric(CursorKeeper cursorKeeper) {
        CursorKeeper growPayload;
        growPayload = growPayload(cursorKeeper, -1, null, 2, null);
        return growPayload;
    }
}
